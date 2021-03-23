package javaTest;

import java.util.Scanner;

public class Ex2 {
//지페단위별 반환돼는 숫자 구하기 ,자판기 프로그램 잔돈 프로그램 
	public static void main(String[] args) { //배열 방식
		int [] coin = {50000,10000,1000,500,10,1};
		Scanner s = new Scanner(System.in);
		System.out.println("금액을 입력하세요");
		int num = s.nextInt();
		for(int i =0; i<coin.length; i++) {
			System.out.println(coin[i]+"원"+num/coin[i]+"개");
			num%=coin[i];
		}
		s.close();

	}

}
