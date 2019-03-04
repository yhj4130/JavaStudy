/*================================
  ■■■ 클래스와 인스턴스 ■■■
  - 클래스 설계 실습
================================*/

// ○실습 문제
// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 사칙 연산을 수행하는 프로그램을 구현한다.
// 단, 클래스와 인스턴스의 개념을 활용하여 작성 할 수 있도록 한다.

// 실행 예)
// 임의의 두 정수 입력(공백 구분) : 10 5
// 임의의 연산자 입력(+ - * /)	 :+
// >> 10 + 5 = 15
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	// 주요 속성 구성
	int a, b;	//-- 사용자로부터 입력받은 두 정수를 담아둘 변수
	char ch;

	// 메소드 정의(기능 : 입력)
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.print("임의의 연산자 입력(+ - * /)	 :");
		ch =(char)System.in.read();
	
	}

	// 메소드 정의(기능 : 연산)
	double cal()
	{
		double result = 0;
		switch (ch)
		{
			case '+' : result = a + b; break;
			case '-' : result = a - b; break;
			case '*' : result = a * b; break;
			case '/' : result = a / b; break;
		}		
		return result;
	}

	// 메소드 정의(기능:출력)
	void print(double k)
	{	
		System.out.printf(">>%d %c %d = %.1f\n", a, ch, b, k);

	}
}


public class Test073
{
	public static void main(String[] args) throws IOException
	{
		//Calculate 클래스 기반의 인스턴트 생성
		Calculate ob = new Calculate();

		ob.input();
		double result = ob.cal();
		ob.print(result);
	}
}


//실행 결과
/*
임의의 두 정수 입력(공백 구분) : 5 6
임의의 연산자 입력(+ - * /)      :+
>>5 + 6 = 11
계속하려면 아무 키나 누르십시오 . . .
*/
