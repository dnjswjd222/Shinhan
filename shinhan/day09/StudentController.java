package com.shinhan.day09;

/*
 * MVC2 모델
 * Controller(C): 사용자와 소통 (요청과 응답)
 * Service(Model): 업무로직 (요청 처리한다.)
 * DAO(Model): DB에 업무 (CRUD작업: insert, select, update, delete)
 * DTO(Model): Data Transfer 하기 위한 설계
 * View(V): display
 */

public class StudentController {

	public static void main(String[] args) {
		
		StudentDAO dao = new StudentDAO();
		StudentService service = new StudentService(dao);
		
		StudentDTO[] arr = service.findAll();
		StudentView.print(arr);
		
		StudentView.print(service.findById("12345"));
	}
}
