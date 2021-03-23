package javaTest;

import java.util.Scanner;

//정수 3개를 입력받고 3개중 중간크기 수를 출력하라
public class Ex3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b,c;
		System.out.println("정수 3개 입력");
		a= s.nextInt();
		b= s.nextInt();
		c= s.nextInt();
		if(a<b && b<c) {System.out.println("중간값은"+b+"입니다");}
		if(b<a && a<c) {System.out.println("중간값은"+a+"입니다");}
		else {System.out.println("중간값은"+c+"입니다");}
		s.close();
	}

}
