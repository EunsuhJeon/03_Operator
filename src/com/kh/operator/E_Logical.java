package com.kh.operator;

import java.util.Scanner;

public class E_Logical {

	/*
	 * * 논리연산자 (이항연산자)
	 *	  두 개의 논리값을 연산해주는 연산자
	 *	  논리연산한 결과마저도 논리값임!
	 *
	 *	  논리값 && 논리값: 왼쪽, 오른쪽 둘다 true일 경우 결과값은 true
	 *	  				둘 중 하나라도 false일 경우 결과값은 false
	 *	  논리값 || 논리값: 왼쪽, 오른쪽 둘 중 하나라도 true일 경우 결과값은 true
	 */
	
	public void method1() {
		
		// 사용자가 입력한 정수값이 1부터 100 사이의 값인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력: ");
		int num = sc.nextInt();
		
		boolean result = (1 <= num) && (100 >= num); //num 값이 1이상 "이고" 100 이하일 경우
		// && 의미: ~이고, 그리고, ~하면서
		
		System.out.println("사용자가 입력한 값이 1이상 100이하입니까?: " + result);
		
		// &&: 두 개의 조건이 모두 true여야 && 연산의 결과값이 최종적으로 true
		// &&: 둘 중의 하나라도 false일 경우 && 연산의 결과값이 최종적으로 false
		
	}
	
	public void method2() {
		
		// 사용자가 입력한 문자값이 영어 대문자인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 하나 입력: ");
		char ch = sc.nextLine().charAt(0);
		
		// 첫번째 방법
		//boolean result = (65 <= ch) && (90 >= ch);
		// 두번째 방법
		boolean result = (ch>='A') && (ch <='Z');
		
		System.out.println("사용자가 입력한 값이 대문자입니까?: " + result);
		
	}
	
	public void method3() {
		
		// 사용자가 입력한 성별이 여자인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성별 (M/F) :");
		char gender = sc.nextLine().charAt(0);
		
		boolean result = (gender == 'F') || (gender =='f');
		// || 의미: ~이거나, 또는 
		
		System.out.println("사용자가 여자입니까?: " + result);
		// ||: 두 개의 조건 중 하나라도 true가 있다면 ||연산의 결과갑은 true
		//	     두 개의 조건 모두 false일 경우 || 연산의 결과값이 false
		
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("종료하시려면 y를 입력하세요: ");
		char ch = sc.nextLine().charAt(0);
		
		boolean result = (ch == 'y') || (ch == 'Y');
		
		System.out.println("사용자가 입력한 값이 y 또는 Y입니까?: " + result);
		
	}
	
	/*
	 *  &&: 두 개의 조건이 모두 true여야만 결과값이 true.(AND: ~이고, 그리고, 이면서, 뿐만 아니라)
	 *  true && true => true
	 *  true && false => false
	 *  false && true => false
	 *  false && false => false
	 *  
	 *  ** &&연산자를 기준으로 앞의 결과가 false일 경우 뒤의 조건은 굳이 실행하지 않음!!
	 *  
	 *  ||: 두 개의 조건 중 하나라도 true라면 결과값이 true임(OR: 또는, ~이거나)
	 *  true && true => true
	 *  true && false => true
	 *  false && true => true
	 *  false && false => false
	 * 
	 *  ** ||연산자를 기준으로 앞의 결과가 true일 경우 뒤의 조건은 굳이 실행하지 않음!!
	 *  
	 */
	
	public void method5() {
		
		int num = 10;
		boolean result1 = (num<5) && (++num>0);
		
		System.out.println("result1: " + result1); //false
		System.out.println("&&연산 후의 num: " + num); //num=10
		
		int num2 = 10;
		boolean result2 = (num2 < 20) || (++num2 >0);
		
		System.out.println("result2: " + result2); //true
		System.out.println("&&연산 후의 num: " + num); //num2=10
		
		boolean result3 = true || (++num2 >0); // Dead code (절대 실행될 일 없는 코드)
		
	}
	
}
