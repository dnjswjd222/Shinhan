package com.shinhan.day09.lab34567;

public class Money {
	int amount;
    public Money(int amount) {
        this.amount = amount;
    }
    public Money add(Money money) {
        return new Money(this.amount+money.amount);
    }
    public Money minus(Money money) {
        return new Money(this.amount-money.amount);
    }
    public Money multiply(Money money) {
        return new Money(this.amount*money.amount);
    }
    public Money devide(Money money) {
        return new Money(this.amount/money.amount);
    }
    public boolean equals(Object object) {
        if(object instanceof Money m) {
            if(m.amount == this.amount) {
                return true;
            }
        }return false;
    }
    public static void main(String[] args){
        Money five  = new Money(5);
        Money two   = new Money(2);
        Money three = new Money(3);
        Money ten   = new Money(10);

        if(five.equals(two.add(three))
                && three.equals(five.minus(two))
                && ten.equals(five.multiply(two))
                && two.equals(ten.devide(five)) )  {
            System.out.println("Money Class 구현을 완료 하였습니다.");
        }
    }
}