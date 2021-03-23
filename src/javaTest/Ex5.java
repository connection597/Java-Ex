package javaTest;

import java.util.Scanner;

//369게임을 간단히 작성
// 1~99까지 정수를 입력받고 3,6,9중 하나가 있는 경우 박수짝 , 두개의 경우 박수 짝짝를 출력하는 프로그램작성
public class Ex5 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("정수 1~99까지의 정수를 입력하시요");
		int num =s.nextInt();
		
		if(num !=0 && num>=1 &&num<=99) {
			int a,b;
			a= num/10;
			b = num%10;
			
			if((a ==3||a==6||a==9) && (b==3||b==6||b==9)) { //두개의 경우
				    System.out.println("박수 짝짝");
			}else if((a ==3||a==6||a==9) || (b==3||b==6||b==9)) { //하나의 경우
					System.out.println("박수 짝");
				}
		else { 
					System.out.println("숫자의 범위가 벗어났습니다"); //범위가 아닐경우
				}
			}s.close();
	
	}
}


