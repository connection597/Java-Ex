package javaTest;

import java.util.Scanner;

//���� 3���� �Է¹ް� 3���� �߰�ũ�� ���� ����϶�
public class Ex3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b,c;
		System.out.println("���� 3�� �Է�");
		a= s.nextInt();
		b= s.nextInt();
		c= s.nextInt();
		if(a<b && b<c) {System.out.println("�߰�����"+b+"�Դϴ�");}
		if(b<a && a<c) {System.out.println("�߰�����"+a+"�Դϴ�");}
		else {System.out.println("�߰�����"+c+"�Դϴ�");}
		s.close();
	}

}
