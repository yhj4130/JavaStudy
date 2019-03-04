/*==========================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - if ~ else문 실습
==========================================*/

// ○ 실습 문제
// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 2의 배수인지, 3의 배수인지
// 2와 3의 배수인지, 2와 3의 배수가 아닌지 판별하여
// 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 임의의 정수 입력 : 8
// >> 8 → 2의 배수
// 계속하려면 아무 키나 누르세요...

// 임의의 정수 입력 : 9
// >> 8 → 3의 배수
// 계속하려면 아무 키나 누르세요...

// 임의의 정수 입력 : 6
// >> 8 → 2와 3의 배수
// 계속하려면 아무 키나 누르세요...

// 임의의 정수 입력 : 11
// >> 8 → 2와 3의 배수가 아니다.
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test035 {

	public static void main(String[] args) throws IOException{

		int i;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("임의의 정수 입력 : ");
		i = Integer.parseInt(br.readLine());
		
		/*
		if (i%2==0 && i%3==0) {
			System.out.printf(">> %d → 2와 3의 배수\n", i);
		}
		else if (i%2!=0 && i%3!=0) {
			System.out.printf(">> %d → 2와 3의 배수가 아니다.\n", i);
		}
		else if (i%2==0) {
			System.out.printf(">> %d → 2의 배수\n", i);
		}
		else if (i%3==0) {
			System.out.printf(">> %d → 3의 배수\n", i);
		}
		else 
			System.out.printf(">> 판별이 불가능한 상황");
		*/
		// ※ 위와 같은 상황에서는 2와 3의 배수라는(공통배수) 조건식에는
		//	  만족하는 데이터가 분기될 수 없는 상황이다. check

		if (i%2==0 && i%3==0) {
			System.out.printf(">> %d → 2와 3의 배수\n", i);
		}
		else if (i%2==0) {
			System.out.printf(">> %d → 2의 배수\n", i);
		}
		else if (i%3==0) {
			System.out.printf(">> %d → 3의 배수\n", i);
		}
		else if (i%2!=0 && i%3!=0) {
			System.out.printf(">> %d → 2와 3의 배수가 아니다.\n", i);
		}
		else 
			System.out.printf(">> 판별이 불가능한 상황");
	}
}

// 실행 결과
/*
임의의 정수 입력 : 4
>> 4 → 2의 배수
계속하려면 아무 키나 누르십시오 . . .
*/
/*
임의의 정수 입력 : 15
>> 15 → 3의 배수
계속하려면 아무 키나 누르십시오 . . .
*/
/*
임의의 정수 입력 : 24
>> 24 → 2와 3의 배수
계속하려면 아무 키나 누르십시오 . . .
*/
/*
임의의 정수 입력 : 31
>> 31 → 2와 3의 배수가 아니다.
계속하려면 아무 키나 누르십시오 . . .
*/