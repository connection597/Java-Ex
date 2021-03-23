package javaTest;

import java.util.Scanner;

public class Ex4 {
//삼각형 변의 길이를 나타낸느 정수 3개 입력받고 3개 의 수로 삼각형을 만들수 있는지 판별
	// 삼각형이 될려면 두변의 합이 다른 한변의 합보다 커야 함
	public static void main(String[] args) {
	     Scanner s= new Scanner (System.in);
	     System.out.println("정수 3개 입력하세요");
	     int num1= s.nextInt();
	     int num2= s.nextInt();
	     int num3= s.nextInt();
	     if((num1+num2)<num3 || ((num1+num3)<num2 || (num2+num3)<num1))
	    	 System.out.println("삼각혀잉 만들수 없습니다");
	     else
	    	System.out.println("삼각형이 됩니다");
	     s.close();
	}

}
