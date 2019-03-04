/*==========================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - 반복문 (while문) 실습
==========================================*/

// ○ 실습 문제
// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 소수인지 아닌지를 반펼하여
// 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 임의의 정수 입력 : 10
// 10 → 소수 아님

// 임의의 정수 입력 : 11
// 11 → 소수 아님

// ※ 소수 : 1 또는 자기자신의 값 이외의 어떤 수로도 나눌 수 없는 값.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test050 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 주요 변수 선언 및 초기화
		int a;			//-- 사용자 입력값을 담을 변수
		
		// 연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		int n = 1;		//-- 사용자의 입력값을 대상으로
						//   나눗셈 연산을 수행할 변수(1씩 증가 예정)
		
		while(n <= a) {
			n++;											// 1부터 1씩 커짐

			if(a == 1) {
				System.out.println(a + "→ 소수 아님");		// 1을 입력 했을 경우
				break;
			}
			if(a == n) {
				System.out.println(a + "→ 소수");			// 입력한 값이 n값과 같을 경우
				break;
			}
			if(a%n == 0) {
				System.out.println(a + "→ 소수 아님");		// while문이 돌아가면서 나머지가 0이 나올 경우
				break;
			}
		}

		/*
		int n = 2;

		boolean flag = true;		//-- 소수이다. (check)
		
		while (n<a) {
			if(a%n == 0) {
				flag = false;		//-- 소수가 아니다.
				break;
			}

			n++;
		}

		// 결과 출력(출력 전에 수행해야 할 추가 확인 → 1인지 여부에 대한 확인)
		// 소수이다 && 1이 아니다.
		// → 최종적인 결론으로 소수이다.
		// 그렇지 않으면 
		// → 최종적인 결론으로 소수가 아니다.

		if (flag == true && num!=1) 
			System.out.printf("%d → 소수\n", a);
		else 
			System.out.printf("%d → 소수가 아님\n", a);
		*/
	
		
	}
}

// 실행 결과
/*
임의의 정수 입력 : 10
10→ 소수 아님
계속하려면 아무 키나 누르십시오 . . .
*/
/*
임의의 정수 입력 : 11
11→ 소수
계속하려면 아무 키나 누르십시오 . . .
*/