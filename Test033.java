/*==========================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - if ~ else문 실습
==========================================*/

// ○ 과제(2019-02-18)
// 사용자로부터 임의의 연도를 입력받아
// 입력받은 여녿가 윤년인지 평년인지 판별하여
// 결과를 출력하는 프로그램을 구현한다.
// 단, if ~ else 조건문을 활용할 수 있도록 한다.

// 실행 예)
// 임의의 연도 입력 : 2000
// 2000 → 윤년
// 계속하려면 아무 키나 누르십시오...

// 임의의 연도 입력 : 2012
// 2012 → 윤년
// 계속하려면 아무키나 누르십시오...

// 임의의 연도 입력 : 2018
// 2018 → 평년
// 계속하려면 아무키나 누르십시오...

// 임의의 연도 입력 : 2019
// 2019 → 평년
// 계속하려면 아무키나 누르십시오.

// ※ 윤년의 판별 조건
// 연도가 4의 배수이면서 100의 배수가 아니거나
// 400의 배수이면 윤년
// 그렇지 않으면 평년

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033 {

	public static void main(String[] args) throws IOException {
		
		// BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// ○ 주요 변수 선언
		int year;											//-- 사용자로부터 입력받은 임의의 연도(데이터)를 담을 변수		
		
		// ○ 연산 및 처리
		// ·사용자에게 안내 메세지 출력
		System.out.print("임의의 연도 입력 : ");

		// ·사용자가 입력한 값을 변환한 후 변수에 담아내기
		year = Integer.parseInt(br.readLine());
		
		// 결과 출력
		// if ~ else 문 이용

		
		if(year%4==0 && year%100!=0 || year%400==0) {		// 입력한 year값은 4로 나누었을 때 나머지가 0이여야하며 100으로 나누었을 때 0이면 안되거나 → &&(AND 연산자)
															// 400으로 나누었을 때 나머지가 0인 경우 → ||(OR 연산자)
			System.out.println(year+" → 윤년");			// 입력한 값(연도)이 if문의 조건에 맞을 경우 해당 결과 출력
		}
		else 
		{
			System.out.println(year+" →평년");				// 입력한 값(연도)이 if문의 조건에 맞지 않을 경우 해당 결과 출력
		}
		
		
		/*
		if(year%400==0) {
			System.out.println(year+" → 윤년");
		}
		else if(year%4==0 && year%100!=0) {
			System.out.println(year+" → 윤년");
		}
		else
			System.out.println(year+" →평년");
		*/
		
		


	}
}

// 실행 결과
/*
임의의 연도 입력 : 2000
2000 → 윤년
계속하려면 아무 키나 누르십시오 . . .
*/
/*
임의의 연도 입력 : 2012
2012 → 윤년
계속하려면 아무 키나 누르십시오 . . .
*/
/*
임의의 연도 입력 : 2018
2018 →평년
계속하려면 아무 키나 누르십시오 . . .
*/
/*
임의의 연도 입력 : 2019
2019 →평년
계속하려면 아무 키나 누르십시오 . . .
*/