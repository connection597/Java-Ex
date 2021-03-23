package javaTest;

import java.util.Scanner;
//원화값을 달러로 바꾸는 프로그램 작성하기
public class Ex0 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("원화를 입력하세요(단위 원)");
		int num= s.nextInt();
		double dollar = num/1100;
		System.out.println(num +"원은 $"+dollar+"입니다");
		s.close();

	}


	}

