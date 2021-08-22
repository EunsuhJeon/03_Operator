package com.kh.operator;

import java.util.Scanner;

public class D_Comparison {

	/*
	 * * 비교연산자/ 관계연산자 (이항연산자)
	 * 		두 값을 비교하는 연산자
	 * 		비교연산자는 조건을 만족하면 true, 만족하지 않으면 false를 반환
	 * 		즉, 비교연산 결과는 논리값!
	 *  
	 *  대소비교연산자: <, >, <=,  >=
	 *  동등비교연산자: ==(일치), !=(불일치)
	 */
	
	public void method1() {
		
		// int a =10, b = 25; <== 가능하긴 하나 권장하지 않는다.
		int a = 10;
		int b = 25;
		
		System.out.println("a == b: " + (a == b)); //false
		System.out.println("a <= b: " + (a <= b)); //true
		
		boolean result = a > b;
		System.out.println("result: " + result); //false
		
		// 산술연산 + 비교연산 << 산술연산이 비교연산보다 우선순위가 높다
		System.out.println(a * 2 > b / 5); //true
		System.out.println((a * 2) > (b / 5)); // 이렇게 작성하는 것이 가독성이 좋음
		
		System.out.println("a가 짝수인가: " + (a % 2 == 0));
		System.out.println("a가 홀수인가: " + (a % 2 != 0));
		System.out.println("a가 홀수인가: " + (a % 2 == 1));
		System.out.println("a가 홀수인가: " + !(a % 2 == 0));
		
		// 2로 나눴을 때의 나머지가 0일 경우 == 2로 나누어떨어진다는 의미 == 짝수
		// 			    나머지가 1일 경우 == 2로 나누어떨어지지 않음 == 홀수
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수: ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수: ");
		int num2 = sc.nextInt();
		
		System.out.println("첫번째가 두번째보다 큽니까?: " + (num1 > num2));
		System.out.println("첫번째가 짝수입니까?: " + (num1 % 2 == 0));
		
		// (특이케이스) 숫자와 문자 간의 비교 가능!
		System.out.println(num2 < 'A');
		// 'A'~'Z' 			65~90까지의 숫자로 연달아 나열되어 있음.
		
		
		
		
	}
	
	
	
	
}
