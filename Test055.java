/*==========================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - 반복문 (do ~ while문) 실습
==========================================*/ 

// ○ 실습 문제
// 사용자로부터 여러 개의 정수를 입력받아
// 그 합을 계산하여 결과를 출력해주는 프로그램을 구현한다.
// 단 사용자가 『- 1』을 입력 시
// 입력받는 행위를 중지하고
// 그동안 입력받아둔 정수들의 합을 출력할 수 있도록 구현한다.
// 입력받는 과정은 Scanner 인스턴스를 생성하여 처리한다.

// 실행 예) 
// 1번째 정수 입력(-1 종료) : 10
// 2번째 정수 입력(-1 종료) : 10
// 3번째 정수 입력(-1 종료) : 5
// 4번째 정수 입력(-1 종료) : -1

// >> 현재까지 입력된 정수의 합 : 25
// 계속하려면 아무 키나 누르십시오...

import java.util.Scanner;

public class Test055 {

	public static void main(String[] args) {
		
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		// ○ 주요 변수 선언
		int n;				//-- 외부로부터 사용자 입력값을 담아둘 변수
		int i = 1;			//-- 몇 번째 입력값인지를 담아둘 변수
		int sum = 1;		//-- 누적합을 담을 변수
		
		// ○ 연산 및 처리
		do
		{
			System.out.print(i+"번째 정수 입력(-1 종료) : ");
			n = sc.nextInt();

			sum += n;

			i++;

		}
		while (n != -1);
		
		// ○ 결과 출력
		System.out.println("\n>> 현재까지 입력된 정수의 합 : " + sum);
	}
}

// 실행 결과
/*
1번째 정수 입력(-1 종료) : 10
2번째 정수 입력(-1 종료) : 10
3번째 정수 입력(-1 종료) : 5
4번째 정수 입력(-1 종료) : 8
5번째 정수 입력(-1 종료) : 9
6번째 정수 입력(-1 종료) : -1

>> 현재까지 입력된 정수의 합 : 42
계속하려면 아무 키나 누르십시오 . . .
*/