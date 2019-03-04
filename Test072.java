/*================================
  ■■■ 클래스와 인스턴스 ■■■ 
================================*/

// ○실습 문제
// 사용자로부터 임의의 정수를 입력받아
// 1부터 입력받은 수 까지의합을 연산하여
// 결과값을 출력하는 프로그램을 구현한다.

// 단, 클래스와 인스턴스의 개념을 활용하여 처리할 수 있도록 한다.
// 또한, 입력 처리 과정에서 BufferedReader 의 readLine()을 사용하며,
// 입력 데이터가 1보다 작거나 1000보다 큰 경우
// 다시 입력받을 수 있는 처리를 포함하여 프로그램을 구성할 수 있도록 한다.

// 실행 예)
// 임의의 정수 입력(1~1000) : 1002
// 임의의 정수 입력(1~1000) : -20
// 임의의 정수 입력(1~1000) : 100
// >> 1~ 100까지의 합: 5050
// 계속하려면 아무 키나 누르세요

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Hap
{
	// 주요 변수 선언
	int n;
	BufferedReader br;	// ①전역변수자리에서 이 존재를 알려줘야할때는 이렇게 분리한다.

	//입력 메소드 정의
	void input() throws IOException
	{
		br = new BufferedReader(new InputStreamReader (System.in));	// ②짧고 일회용성일땐 여기에 버퍼를 다 써도 된다.

		do
		{
			System.out.print("임의의 정수 입력(1~1000) : ");
			n = Integer.parseInt(br.readLine());
		}while(n<1 || n>1000);
		
	}

	//연산 처리 메소드 정의
	int calResult()
	{	
		int sum = 0; 
		for (int i=1; i<=n; i++)
			sum += i;
		return sum;
	}

	//결과 출력 메소드 정의
	void print(int b)
	{
		System.out.printf(">> 1 ~ %d까지의 합 : %d\n", n, b);
	}
}


//main() 메소드를 포함하고 있는 외부 클래스

public class Test072
{
	public static void main(String[] args) throws IOException
	{
		//Hap클래스 인스턴스 생성
		Hap ha = new Hap();
	
		//생성한 인스턴스를 통해 입력 메소드 호출 → throws IOException 처리
		ha.input();

		//생성한 인스턴스를 통해 연산 메소드 호출 → int형 결과값 반환 →받아낼수 있도록 처리
		int s = ha.calResult();

		//생성한 인스턴스를 통해 출력 메소드 호출 → 매개변수 전달
		ha.print(s);
	}
}


//실행결과
/*
임의의 정수 입력(1~1000) : 500
1~500까지의 합 : 125250
계속하려면 아무 키나 누르십시오 . . .
*/
