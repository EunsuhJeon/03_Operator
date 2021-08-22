package com.kh.operator;

public class F_Compound {

	/*
	 * * 복합대입 연산자
	 * 	: 산술연산자와 대입연산자가 결합되어 있는 형태
	 * 		연산처리 속도가 빨라지므로 사용하는걸 권장함!
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
		
		System.out.println("최초의 num값: " + num);
		
		num = num + 3;  // 기존의 변수에 새로운 값을 대입할 때는 자료형을 쓰면 안됨
		System.out.println("3 증가시킨 num: " + num);
		
		num += 3;
		System.out.println("또 3 증가시킨 num: " + num); // 위 방법보다 연산처리속도가 빠름
		
		num -= 5;
		System.out.println("5 감소시킨 num: " + num);
		
		num *= 6;
		System.out.println("6배 증가시킨 num: " + num);
		
		num /= 2;
		System.out.println("2배 감소시킨 num: " + num);
		
		num %= 4;
		System.out.println("최종 num: " + num);
		
		String str = "Hello";
		//str = str + "World"; // "HelloWorld" // 문자에는 +만 가능
		str += "World";
		System.out.println(str);
		
		
		
		
	}
}
