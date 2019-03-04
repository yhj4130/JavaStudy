/*==========================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - switch문 실습
==========================================*/

// ○ 실습 문제
// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산의 처리 결과를 출력하는 프로그램을 구현한다.
// 단, switch 문을 활용하여 처리할 수 있도록 하며
// 연산 결과는 편의상 정수 형태로 처리하도록 한다.

// 실행 예)
// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 28
// 연산자 입력(+ - * /) : +

// >> 10 + 28 = 28
// 계속하려면 아무키나 누르십시오...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test042 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b;

		char op;

		System.out.print("첫 번째 정수 입력 :    ");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("두 번째 정수 입력 :    ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();

		switch(op) {
			case 43 : System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));break;
			case 45 : System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));break;
			case 42 : System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));break;
			case 47 : System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));break;
			default : return;		//-- 메소드 종료 → main() 메소드 종료 → 프로그램 종료

			// case 상수1 : 문자1; [break;] 원래는 이런 구조 였으나 case에 상수 외의 문자도 사용 가능하게 됨
		
			// ※ 『return』 : 1. 값의 반환
			//				   2. 메소드 종료

		}
	}
}

// 실행 결과
/*
첫 번째 정수 입력 :    10
두 번째 정수 입력 :    28
연산자 입력(+ - * /) : +

>> 10 + 28 = 38
계속하려면 아무 키나 누르십시오 . . .
*/
/*
첫 번째 정수 입력 :    38
두 번째 정수 입력 :    9
연산자 입력(+ - * /) : -

>> 38 - 9 = 29
계속하려면 아무 키나 누르십시오 . . .
*/
/*
첫 번째 정수 입력 :    77
두 번째 정수 입력 :    4
연산자 입력(+ - * /) : *

>> 77 * 4 = 308
계속하려면 아무 키나 누르십시오 . . .
*/
/*
첫 번째 정수 입력 :    45
두 번째 정수 입력 :    5
연산자 입력(+ - * /) : /

>> 45 / 5 = 9
계속하려면 아무 키나 누르십시오 . . .
*/