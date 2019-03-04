/*==========================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - if ~ else문 실습
==========================================*/

// ○ 실습 문제
// 사용자로부터 임의의 정수 세 개를 입력받아
// 작은 수 에서 큰 수 순으로 출력하는 프로그램을 구현한다.
// 단, 입력 데이터를 한번에 처리할 수 있도록 구성하며
// 『xor』 연산자를 활용하여 스왑 처리를 할 수 있고록 한다.

// 실행 예)
// 임의의 세 정수 입력(공백 구분) : 160 80 214

// >> 정렬 결과 : 80 160 214

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
import java.util.Scanner;

public class Test037 {

	public static void main(String[] args) {
	
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc = new Scanner(System.in);

		int a, b, c;

		System.out.print("임의의 세 정수 입력(공백 구분) : ");

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (a>b)		// ① 첫 번째 정수가 두 번째 정수보다 크다면
		{
			// 두 정수의 자리를 바꾼다.
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;
		}
		if (b>c)		// ② 두 번째 정수가 세 번째 정수보다 크다면
		{
			// 두 정수의 자리를 바꾼다.0 
			b = b ^ c;
			c = c ^ b;
			b = b ^ c;
		}
		if (a>b)		// ③ 첫 번째 정수가 두 번째 정수보다 크다면
		{
			// 두 정수의 자리를 바꾼다.
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;
		}
		
		System.out.printf("\n>> 정렬결과 : %d %d %d\n", a, b, c);

	}
}

// 실행 결과
/*
임의의 세 정수 입력(공백 구분) : 47 8 109

>> 정렬결과 : 8 47 109
계속하려면 아무 키나 누르십시오 . . .
*/