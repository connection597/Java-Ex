package javaTest;

import java.util.Scanner;

public class Ex4 {
//�ﰢ�� ���� ���̸� ��Ÿ���� ���� 3�� �Է¹ް� 3�� �� ���� �ﰢ���� ����� �ִ��� �Ǻ�
	// �ﰢ���� �ɷ��� �κ��� ���� �ٸ� �Ѻ��� �պ��� Ŀ�� ��
	public static void main(String[] args) {
	     Scanner s= new Scanner (System.in);
	     System.out.println("���� 3�� �Է��ϼ���");
	     int num1= s.nextInt();
	     int num2= s.nextInt();
	     int num3= s.nextInt();
	     if((num1+num2)<num3 || ((num1+num3)<num2 || (num2+num3)<num1))
	    	 System.out.println("�ﰢ���� ����� �����ϴ�");
	     else
	    	System.out.println("�ﰢ���� �˴ϴ�");
	     s.close();
	}

}
