package com.shinhan.day13;

import java.io.*;
import java.util.*;

import lombok.*;

@Data
@AllArgsConstructor
@Builder
@RequiredArgsConstructor
class Score implements Serializable {
	final String name;
	final int java;
	final int db;
	final int web;

	static String major = "컴공"; // 직렬화에서 제외됨
	String gender;
	transient String hobby; // 직렬화에서 제외됨
}

//Modifier(활용방법, 접근권한)
//접근권한: public > protected > 생략 > private
//활용방법: static, final, synchronized,abstract

public class IOTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		f12();
	}

	private static void f12() {
		File f1 = new File("src/com/shinhan/day12/Button.java");
		File f2 = new File("src/com/shinhan/day12");
		System.out.println(f1.exists()?"파일존재":"파일없음");
		System.out.println(f2.exists()?"폴더존재":"폴더없음");
		System.out.println(f1.isDirectory()?"폴더맞음":"폴더아님");
		
		File[] arr = f2.listFiles();
		Arrays.stream(arr).forEach(f->System.out.println(f.getAbsolutePath()));
	}

	private static void f11() throws IOException, ClassNotFoundException {
		// ScoreClass가 여러개 있다. (List), 저장하고 다시 읽어서 출력
		FileOutputStream fos = new FileOutputStream("List.data");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		List<Score> scoreList = List.of(
				Score.builder().name("홍길동").java(100).db(90).web(80).gender("남자").hobby("운동").build(),
				Score.builder().name("대현").java(80).db(90).web(70).gender("남자").hobby("운동").build());
		oos.writeObject(scoreList);
		oos.close();
		fos.close();

		FileInputStream fis = new FileInputStream("List.data");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List score = (List) ois.readObject();
		System.out.println(score);
	}

	private static void f10() throws IOException, ClassNotFoundException {
		FileOutputStream fw = new FileOutputStream("score.data");
		ObjectOutputStream oos = new ObjectOutputStream(fw);
		Score score = Score.builder().name("홍길동").java(100).db(90).web(80).gender("남자").hobby("운동").build();
		oos.writeObject(score);
		oos.close();
		fw.close();

		FileInputStream fis = new FileInputStream("score.data");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Score score2 = (Score) ois.readObject();
		System.out.println(score);
		System.out.println(score2);
	}

	private static void f9() throws IOException {
		FileOutputStream fos = new FileOutputStream("aa.data");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.write(97);
		dos.writeChar('a');
		dos.writeBoolean(false);
		dos.writeDouble(3.14);
		dos.writeUTF("문자");
		dos.close();
		fos.close();

		FileInputStream fis = new FileInputStream("aa.data");
		DataInputStream dis = new DataInputStream(fis);
		int i = dis.read();
		char ch = dis.readChar();
		boolean bl = dis.readBoolean();
		double db = dis.readDouble();
		String st = dis.readUTF();
		System.out.println(i);
		System.out.println(ch);
		System.out.println(bl == true ? "참" : "거짓");
		System.out.println(db);
		System.out.println(st);
		dis.close();
		fis.close();
	}

	private static void f8() throws IOException {
		FileReader fr = new FileReader("src/com/shinhan/day13/data.txt");
		BufferedReader br = new BufferedReader(fr);
		br.readLine();
		String line;
		List<Score> data = new Vector();
		while ((line = br.readLine()) != null) {
			String[] arr = line.split("/");
			Score score = Score.builder().name(arr[0]).java(Integer.parseInt(arr[1])).db(Integer.parseInt(arr[2]))
					.web(Integer.parseInt(arr[3])).build();
			data.add(score);
		}
		br.close();
		fr.close();
		data.stream().forEach(dt -> System.out.println(dt));
	}

	private static void f7() throws IOException {
		FileReader fr = new FileReader("src/com/shinhan/day13/data.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		line = br.readLine();
		System.out.println(line.replace("/", "\t") + "\t총점");
		while ((line = br.readLine()) != null) {
			int total = 0;
			String[] arr = line.split("/");
			for (int i = 1; i < arr.length; i++) {
				total += Integer.parseInt(arr[i]);
			}
			System.out.println(line.replace("/", "\t") + "\t" + total);
		}

		br.close();
		fr.close();

	}

	private static void f6() throws IOException {
		FileWriter fw = new FileWriter("cc.txt");
		fw.write("문자출력 1\n");
		fw.write("문자출력 2\n");
		fw.write("문자출력 3\n");
		fw.close();

		FileReader fr = new FileReader("cc.txt");

	}

	private static void f5() {
		try (FileOutputStream fos = new FileOutputStream("aa.txt")) {
			fos.write(97);
			fos.write(98);
			fos.write(99);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// fos.close();

		try (FileInputStream fis = new FileInputStream("aa.txt")) {
			int i;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void f4() throws IOException {
		// 출력(모니터, 파일, 네트워크프로그램)
		OutputStream os = System.out; // 상위(OutputStream) <- 하위(PrintStream)
		os.write(97);
		os.flush();

		PrintStream ps = System.out;
		ps.println("문자를 출력함");
	}

	private static void f3() {
		try (FileReader fr = new FileReader("src/com/shinhan/day12/Button.java")) {
			int data;
			while ((data = fr.read()) != -1) {
				System.out.print((char) data);
			}

		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지않음");
		} catch (IOException e1) {
			System.out.println(e1.getMessage());
		} finally {
			System.out.println("작업 END");
		}
	}

	private static void f2() throws IOException {
		FileInputStream fi = new FileInputStream("src/com/shinhan/day12/Button.java");
		// 보조스트림(Stream(1byte) -> Reader(2byte))
		InputStreamReader ir = new InputStreamReader(fi);
		int i;

		while ((i = ir.read()) != -1) { // -1은 End Of File(EOF)
			System.out.print((char) i);
		}

		ir.close();
		fi.close(); // 자원반납
	}

	private static void f1() throws IOException {
		// 입력 Stream: 키보드, File, 프로그램(네트워크)
		System.out.print("입력>>");
		InputStream is = System.in;
		int i;
		byte[] arr = new byte[10];
		i = is.read(arr);
		System.out.println("크기: " + i);
		System.out.println(Arrays.toString(arr));
		String data = new String(arr);
		System.out.println(data);
	}
}
