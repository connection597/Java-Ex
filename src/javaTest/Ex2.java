package javaTest;

import java.util.Scanner;

public class Ex2 {
//��������� ��ȯ�Ŵ� ���� ���ϱ� ,���Ǳ� ���α׷� �ܵ� ���α׷� 
	public static void main(String[] args) { //�迭 ���
		int [] coin = {50000,10000,1000,500,10,1};
		Scanner s = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��ϼ���");
		int num = s.nextInt();
		for(int i =0; i<coin.length; i++) {
			System.out.println(coin[i]+"��"+num/coin[i]+"��");
			num%=coin[i];
		}
		s.close();

	}

}
