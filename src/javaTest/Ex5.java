package javaTest;

import java.util.Scanner;

//369������ ������ �ۼ�
// 1~99���� ������ �Է¹ް� 3,6,9�� �ϳ��� �ִ� ��� �ڼ�¦ , �ΰ��� ��� �ڼ� ¦¦�� ����ϴ� ���α׷��ۼ�
public class Ex5 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("���� 1~99������ ������ �Է��Ͻÿ�");
		int num =s.nextInt();
		
		if(num !=0 && num>=1 &&num<=99) {
			int a,b;
			a= num/10;
			b = num%10;
			
			if((a ==3||a==6||a==9) && (b==3||b==6||b==9)) { //�ΰ��� ���
				    System.out.println("�ڼ� ¦¦");
			}else if((a ==3||a==6||a==9) || (b==3||b==6||b==9)) { //�ϳ��� ���
					System.out.println("�ڼ� ¦");
				}
		else { 
					System.out.println("������ ������ ������ϴ�"); //������ �ƴҰ��
				}
			}s.close();
	
	}
}


