package com.kh.operator;

import java.util.Scanner;

public class D_Comparison {

	/*
	 * * �񱳿�����/ ���迬���� (���׿�����)
	 * 		�� ���� ���ϴ� ������
	 * 		�񱳿����ڴ� ������ �����ϸ� true, �������� ������ false�� ��ȯ
	 * 		��, �񱳿��� ����� ����!
	 *  
	 *  ��Һ񱳿�����: <, >, <=,  >=
	 *  ����񱳿�����: ==(��ġ), !=(����ġ)
	 */
	
	public void method1() {
		
		// int a =10, b = 25; <== �����ϱ� �ϳ� �������� �ʴ´�.
		int a = 10;
		int b = 25;
		
		System.out.println("a == b: " + (a == b)); //false
		System.out.println("a <= b: " + (a <= b)); //true
		
		boolean result = a > b;
		System.out.println("result: " + result); //false
		
		// ������� + �񱳿��� << ��������� �񱳿��꺸�� �켱������ ����
		System.out.println(a * 2 > b / 5); //true
		System.out.println((a * 2) > (b / 5)); // �̷��� �ۼ��ϴ� ���� �������� ����
		
		System.out.println("a�� ¦���ΰ�: " + (a % 2 == 0));
		System.out.println("a�� Ȧ���ΰ�: " + (a % 2 != 0));
		System.out.println("a�� Ȧ���ΰ�: " + (a % 2 == 1));
		System.out.println("a�� Ȧ���ΰ�: " + !(a % 2 == 0));
		
		// 2�� ������ ���� �������� 0�� ��� == 2�� ����������ٴ� �ǹ� == ¦��
		// 			    �������� 1�� ��� == 2�� ����������� ���� == Ȧ��
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ����: ");
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° ����: ");
		int num2 = sc.nextInt();
		
		System.out.println("ù��°�� �ι�°���� Ů�ϱ�?: " + (num1 > num2));
		System.out.println("ù��°�� ¦���Դϱ�?: " + (num1 % 2 == 0));
		
		// (Ư�����̽�) ���ڿ� ���� ���� �� ����!
		System.out.println(num2 < 'A');
		// 'A'~'Z' 			65~90������ ���ڷ� ���޾� �����Ǿ� ����.
		
		
		
		
	}
	
	
	
	
}
