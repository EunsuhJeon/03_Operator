package com.kh.practice.example;

import java.util.Scanner;

public class OperatorPractice {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����: ");
		int num = sc.nextInt();
		
		String result = (num >= 0 ? "�����" : "����� �ƴϴ�");
		System.out.print(result);
		
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("����: ");
		int num = sc.nextInt();
		
		String result = (num > 0 ? "�����" : num<0 ? "������" : "0�̴�");
		System.out.print(result);
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("����: ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0 ? "¦����" : "Ȧ����");
		System.out.print(result);
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("�ο���: ");
		int num1 = sc.nextInt();
		
		System.out.print("���� ����: ");
		int num2 = sc.nextInt();
		
		int result1 = (num2 / num1);
		int result2 = (num2 % num1);
		
		System.out.println("1�δ� ���� ����: " + result1);
		System.out.println("���� ���� ����: " + result2);
		
		//������ Ǯ��
		System.out.println("1�δ� ���� ����: " + result2 / result1);
		System.out.println("1�δ� ���� ����: " + result2 % result1);
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("�̸�: ");
		String name = sc.nextLine();
		
		System.out.print("�г�(���ڸ�): ");
		int grade = sc.nextInt();
		
		System.out.print("��(���ڸ�): ");
		int classs = sc.nextInt(); // �������� ClassNum �̶�� �ۼ��ϼ���.
		
		System.out.print("��ȣ(���ڸ�): ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("����(M/F): ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("����(�Ҽ��� �Ʒ� ��° �ڸ�����): ");
		double score = sc.nextDouble();
		
		String result = (gender == 'F' ? "���л�" : "���л�");
		
		System.out.println(grade + "�г� " + classs + "�� " + num + "�� " + name + result + "�� ������ " + score + "�̴�." );
		
		//������ Ǯ��
		System.out.printf("%d�г� %d�� %d�� %s %s�� ������ %.2f�̴�." , grade, classs, num, name, result, score);
				
	}
	
	public void practice6() {

		Scanner sc = new Scanner(System.in);

		System.out.print("����: ");
		int age = sc.nextInt();
		
		String result = (age <=13 ? "���" : age >19 ? "����" : "û�ҳ�");
		//������ Ǯ��
		//String result = (age <=13 ? "���" : age <= 19 ? "û�ҳ�" : "����");
		System.out.println(result);
		
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����: ");
		int kor = sc.nextInt();
		
		System.out.print("����: ");
		int eng = sc.nextInt();
		
		System.out.print("����: ");
		int math = sc.nextInt();
		
		int sum = (kor + eng + math);
		int ave = sum / 3; //�������� avg�� ǥ���Ͻ�.
		String result = (kor >=40 && eng >= 40 && math >=40 && ave>=60) ? "�հ�" : "���հ�";
		
		System.out.println("�հ�: " + sum);
		System.out.println("���: " + ave);
		System.out.println(result);
		
		//������ Ǯ��
		System.out.println((kor >=40 && eng >= 40 && math >=40 && ave>=60) ? "�հ�" : "���հ�" );
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(-����) : ");
		char num = sc.nextLine().charAt(7);
		
		String result = (num == '2' || num == '4') ? "����" : "����";
		
		System.out.println(result);	
		
		
		//������ Ǯ��
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(-����) : ");
		String str = sc.nextLine(); // "800915-2345612"
									//  0123456789....
		char gender = str.charAt(7);
		
		String result2 = (gender == '1' || gender == '3') ? "����" : "����";
		
		System.out.println(result2);	
		
	}
	
	// ���� Ǭ ����� ���� ����̶�� �ϼ���!!	
}
