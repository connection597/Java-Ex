package javaTest;

import java.util.Scanner;

public class Ex1 {
//2자리 정수를 입력받고 심의 자리와 1의 자리같은지 판별하여 출력하는 프로그램을 작성하라
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("2자리 정수를 입력(10~99)");
		int num = s.nextInt();
		if(num>=10&& num<100) { // 2자리 정수인지 판별
		       if(num/10==num%10) { // 10자리와 1의 자리 같은지 아닌지 판별
			        System.out.println("yes! 10자리와 1의 자리가 같습니다");
		        }else {
			          System.out.println("no! 10의 자리와 1의 자리가 다릅니다");
		         }
	    }else {
		System.out.println("2자리 정수가 아닙니다");
			
		}s.close();

	}

}
