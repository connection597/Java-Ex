package javaTest;

import java.util.Scanner;

public class Ex1 {
//2�ڸ� ������ �Է¹ް� ���� �ڸ��� 1�� �ڸ������� �Ǻ��Ͽ� ����ϴ� ���α׷��� �ۼ��϶�
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("2�ڸ� ������ �Է�(10~99)");
		int num = s.nextInt();
		if(num>=10&& num<100) { // 2�ڸ� �������� �Ǻ�
		       if(num/10==num%10) { // 10�ڸ��� 1�� �ڸ� ������ �ƴ��� �Ǻ�
			        System.out.println("yes! 10�ڸ��� 1�� �ڸ��� �����ϴ�");
		        }else {
			          System.out.println("no! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�");
		         }
	    }else {
		System.out.println("2�ڸ� ������ �ƴմϴ�");
			
		}s.close();

	}

}
