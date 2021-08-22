package com.kh.practice.example;

import java.util.Scanner;

public class OperatorPractice {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수: ");
		int num = sc.nextInt();
		
		String result = (num >= 0 ? "양수다" : "양수가 아니다");
		System.out.print(result);
		
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수: ");
		int num = sc.nextInt();
		
		String result = (num > 0 ? "양수다" : num<0 ? "음수다" : "0이다");
		System.out.print(result);
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수: ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0 ? "짝수다" : "홀수다");
		System.out.print(result);
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("인원수: ");
		int num1 = sc.nextInt();
		
		System.out.print("사탕 개수: ");
		int num2 = sc.nextInt();
		
		int result1 = (num2 / num1);
		int result2 = (num2 % num1);
		
		System.out.println("1인당 사탕 개수: " + result1);
		System.out.println("남는 사탕 개수: " + result2);
		
		//선생님 풀이
		System.out.println("1인당 사탕 개수: " + result2 / result1);
		System.out.println("1인당 사탕 개수: " + result2 % result1);
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("이름: ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만): ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만): ");
		int classs = sc.nextInt(); // 선생님은 ClassNum 이라고 작성하셨음.
		
		System.out.print("번호(숫자만): ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별(M/F): ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("성적(소숫점 아래 둘째 자리까지): ");
		double score = sc.nextDouble();
		
		String result = (gender == 'F' ? "여학생" : "남학생");
		
		System.out.println(grade + "학년 " + classs + "반 " + num + "번 " + name + result + "의 성적은 " + score + "이다." );
		
		//선생님 풀이
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다." , grade, classs, num, name, result, score);
				
	}
	
	public void practice6() {

		Scanner sc = new Scanner(System.in);

		System.out.print("나이: ");
		int age = sc.nextInt();
		
		String result = (age <=13 ? "어린이" : age >19 ? "성인" : "청소년");
		//선생님 풀이
		//String result = (age <=13 ? "어린이" : age <= 19 ? "청소년" : "성인");
		System.out.println(result);
		
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어: ");
		int kor = sc.nextInt();
		
		System.out.print("영어: ");
		int eng = sc.nextInt();
		
		System.out.print("수학: ");
		int math = sc.nextInt();
		
		int sum = (kor + eng + math);
		int ave = sum / 3; //선생님은 avg로 표기하심.
		String result = (kor >=40 && eng >= 40 && math >=40 && ave>=60) ? "합격" : "불합격";
		
		System.out.println("합계: " + sum);
		System.out.println("평균: " + ave);
		System.out.println(result);
		
		//선생님 풀이
		System.out.println((kor >=40 && eng >= 40 && math >=40 && ave>=60) ? "합격" : "불합격" );
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(-포함) : ");
		char num = sc.nextLine().charAt(7);
		
		String result = (num == '2' || num == '4') ? "여자" : "남자";
		
		System.out.println(result);	
		
		
		//선생님 풀이
		System.out.print("주민번호를 입력하세요(-포함) : ");
		String str = sc.nextLine(); // "800915-2345612"
									//  0123456789....
		char gender = str.charAt(7);
		
		String result2 = (gender == '1' || gender == '3') ? "남자" : "여자";
		
		System.out.println(result2);	
		
	}
	
	// 내가 푼 방법도 좋은 방법이라고 하셨음!!	
}
