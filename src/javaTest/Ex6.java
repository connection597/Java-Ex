package javaTest;

import java.util.Scanner;

public class Ex6 {
//100,100과 200,200의 두점으로 이루어진 사각형이 있을때 정수 x,y값을 입력받고 점(x,y)가 직사각형
//	안에 있는지 판별하는 프로그램 을 작성해라
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("점 (x,y)의 좌표를 입력하시오");
		int x = s.nextInt();
		int y = s.nextInt();
		if ((100<=x && x<=200)&&(100 <= y && y<=200))
			System.out.println("사각형 안에 점이 있습니다");
		else System.out.println("사각형 안에 점이 없습니다");
		s.close();
	}

}
