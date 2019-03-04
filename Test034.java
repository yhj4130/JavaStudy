/*==========================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - if ~ else문 실습
==========================================*/

// ○ 실습 문제
// 임의의 두 정수와 연산자를 입력받아
// 해당 연산자의 처리 결과를 출력하는 프로그램을 작성한다.
// 단, if 조건문을 활용하여 처리할 수 있도록 하며,
// 연산 결과는 편의상 정수 형태로 처리될 수 있도록 한다.

// 실행 예)
// 첫 번째 정수 입력	 : 10
// 두 번째 정수 입력	 : 14
// 연산자 입력 (+ - * /) : +

// >> 10 + 14 = 24
// 계속하려면 아무키나 누르십시오...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test034 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b;
		String n;

		System.out.print("첫 번째 정수 입력     : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력     : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("연산자 입력 (+ - * /) : ");
		n = br.readLine();

		if (n.equals("+"))
		{
			System.out.printf("%n>> %d + %d = %d%n", a, b, a+b);
		}
		else if (n.equals("-"))
		{
			System.out.printf("%n>> %d - %d = %d%n", a, b, a-b);
		}
		else if (n.equals("*"))
		{
			System.out.printf("%n>> %d * %d = %d%n", a, b, a*b);
		}
		else if (n.equals("/"))
		{
			System.out.printf("%n>> %d / %d = %d%n", a, b, a/b);
		}
		else
		{
			System.out.println("입력 과정에 오류가 존재합니다.");
		}
	

		// 방식 ①
		/*
		int a, b;
		char op;

		System.out.print("첫 번째 정수 입력     : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력     : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("연산자 입력 (+ - * /) : ");
		op = (char)System.in.read();

		if (op == '+')
		{
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
		}
		else if (op == '-')
		{
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
		}
		else if (op == '*')
		{
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
		}
		else if (op == '/')
		{
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
		}
		else
		{
			System.out.println("입력 과정에 오류가 존재합니다.");
		}
		*/

		// 방식 ②
		/*
		int a, b, op;

		System.out.print("첫 번째 정수 입력     : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력     : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("연산자 입력 (+ - * /) : ");
		op = System.in.read();			// int형

		// 테스트 확인
		//System.out.println("op : " + op);
		//-- + → op : 43
		//-- - → op : 45
		//-- * → op : 42
		//-- / → op : 47

		if (op == 43)	// '+'
		{
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
		}
		else if (op == 45)	// '-'
		{
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
		}
		else if (op == 42)	// '*'
		{
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
		}
		else if (op == 47)	// '/'
		{
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
		}
		else
		{
			System.out.println("입력 과정에 오류가 존재합니다.");
		}
		*/

		// 방식 ③
		/*
		int a, b, result=0;		// else 필요 x
		char op;

		System.out.print("첫 번째 정수 입력     : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력     : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("연산자 입력 (+ - * /) : ");
		op = (char)System.in.read();

		if (op == '+')
			result = a + b;
		else if (op == '-')
			result = a - b;
		else if (op == '*')
			result = a * b;
		else if (op == '/')
			result = a / b;

		System.out.printf("\n>> %d %c %d = %d\n", a, op, b, result);
		*/

	}
}

// 실행 결과
/*
첫 번째 정수 입력     : 10
두 번째 정수 입력     : 14
연산자 입력 (+ - * /) : +

>> 10 + 14 = 24
계속하려면 아무 키나 누르십시오 . . .
*/
/*
첫 번째 정수 입력     : 80
두 번째 정수 입력     : 44
연산자 입력 (+ - * /) : -

>> 80 - 44 = 36
계속하려면 아무 키나 누르십시오 . . .
*/
/*
첫 번째 정수 입력     : 7
두 번째 정수 입력     : 8
연산자 입력 (+ - * /) : *

>> 7 * 8 = 56
계속하려면 아무 키나 누르십시오 . . .
*/
/*
첫 번째 정수 입력     : 90
두 번째 정수 입력     : 10
연산자 입력 (+ - * /) : /

>> 90 / 10 = 9
계속하려면 아무 키나 누르십시오 . . .
*/