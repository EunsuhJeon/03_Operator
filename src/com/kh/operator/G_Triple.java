package com.kh.operator;

import java.util.Scanner;

public class G_Triple {

	/*
	 * * ���� ������ (�׸� 3���� ������ �������ִ� ������)
	 * 
	 * [ǥ����]
	 *  ���ǽ� ? ���ǽ��� ���� ��� ������ ����� : ���ǽ��� ������ ��� ������ �����
	 *  
	 *  �� ��, ���ǽ��� �ݵ�� true�Ǵ� false�� �������� �ۼ��ؾ���
	 *  �ַ� ��, �������ڸ� ���� �ۼ��Ұ�.
	 */
	public void method1() {
		// �Է¹��� �������� ������� �ƴ��� �Ǻ��� �� ���
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է�: ");
		int num = sc.nextInt();
		
		//���1.
		//String result = num > 0 ? "����̴�." : "����� �ƴϴ�.";
		// xx�� xxxx.
		//System.out.println(num + "�� " + result);
		
		//���2.
		System.out.println(num + "�� " + (num <=0 ? "����� �ƴϴ�." : "����̴�."));	
		
	}

	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է�: ");
		int num = sc.nextInt();
		
		//String result = num % 2 == 0 ? "¦���̴�." : "Ȧ���̴�.";
		String result = num % 2 == 1 ? "Ȧ���̴�." : "¦���̴�.";
		
		System.out.println(num + "�� " + result);
		
	}
	
	public void method3() {
		
		// ����ڿ��� �����ǻ� ���� �Է¹��� �� �Ǻ��ؼ� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Ͻ÷��� Y�� �Է����ּ���.: ");
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch == 'y' || ch == 'Y') ? "���α׷��� �����մϴ�." : "��� �����մϴ�.";
		// ���ǽ��� ��ȣ�� �����ָ� ������ ������.
		System.out.print(result);
	}
	
	public void method4() {
		
		// �Է¹��� ���ڰ��� ���� �ҹ������� �ƴ��� �Ǻ� �� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է�: ");
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch >= 'a' && ch <= 'z') ? "�ҹ����̴�." : "�ҹ��ڰ� �ƴϴ�";
		System.out.print(result);
		
	}
	
	public void method5() {
		// ����ڰ� �Է��� �������� �������, ��������, 0������ ��Ȯ�� �Ǻ��� �� ���
		// ��ø
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է�: ");
		int num = sc.nextInt();
		
		String result = (num > 0 ? "����̴�." : (num < 0 ? "�����̴�." : "0�̴�."));
		System.out.print(result);
			
	}
	
	public void method6() {
		
		// ����ڿ��� �� ���� ������ �Է¹ް�
		// + �Ǵ� -�� �Է¹޾� �׿� �´� �������� ������ֱ�
		// ��, + �Ǵ� - ���� �ٸ� ���ڸ� �Է����� ��� "�߸� �Է��߽��ϴ�" ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ����: ");
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° ����: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("������ �Է�(+/-): ");
		char op = sc.nextLine().charAt(0);
		
		String result = (op == '+' ? (num1 + num2 + ""): (op == '-' ? (num1 - num2 + "") : "�߸� �Է��߽��ϴ�."));
		
		System.out.print("���: " + result);
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
