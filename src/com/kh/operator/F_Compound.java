package com.kh.operator;

public class F_Compound {

	/*
	 * * ���մ��� ������
	 * 	: ��������ڿ� ���Կ����ڰ� ���յǾ� �ִ� ����
	 * 		����ó�� �ӵ��� �������Ƿ� ����ϴ°� ������!
	 * 	+=, -=, *=, /=, %=
	 * 
	 * a = a + 3;	=> a += 3;
	 * a = a - 3;	=> a -= 3;
	 * a = a * 3;	=> a *= 3;
	 * a = a / 3;  	=> a /= 3;
	 * a = a % 3; 	=> a %= 3;
	 */
	
	public void method1() {
		int num = 12;
		
		System.out.println("������ num��: " + num);
		
		num = num + 3;  // ������ ������ ���ο� ���� ������ ���� �ڷ����� ���� �ȵ�
		System.out.println("3 ������Ų num: " + num);
		
		num += 3;
		System.out.println("�� 3 ������Ų num: " + num); // �� ������� ����ó���ӵ��� ����
		
		num -= 5;
		System.out.println("5 ���ҽ�Ų num: " + num);
		
		num *= 6;
		System.out.println("6�� ������Ų num: " + num);
		
		num /= 2;
		System.out.println("2�� ���ҽ�Ų num: " + num);
		
		num %= 4;
		System.out.println("���� num: " + num);
		
		String str = "Hello";
		//str = str + "World"; // "HelloWorld" // ���ڿ��� +�� ����
		str += "World";
		System.out.println(str);
		
		
		
		
	}
}
