package javaTest;

import java.util.Scanner;

public class Ex6 {
//100,100�� 200,200�� �������� �̷���� �簢���� ������ ���� x,y���� �Է¹ް� ��(x,y)�� ���簢��
//	�ȿ� �ִ��� �Ǻ��ϴ� ���α׷� �� �ۼ��ض�
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�� (x,y)�� ��ǥ�� �Է��Ͻÿ�");
		int x = s.nextInt();
		int y = s.nextInt();
		if ((100<=x && x<=200)&&(100 <= y && y<=200))
			System.out.println("�簢�� �ȿ� ���� �ֽ��ϴ�");
		else System.out.println("�簢�� �ȿ� ���� �����ϴ�");
		s.close();
	}

}
