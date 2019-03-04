/*==========================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - 반복문 (while문) 실습
==========================================*/

// 1/2 + 2/3 + 3/4 + ... + 9/10

// 실행 예)
// 연산 결과 : 

public class Test048 {
		
		public static void main(String[] args) {
		
			// ○ 주요 변수 선언 및 초기화
			int n=1;		//-- 1부터 1씩 증가하게 될 변수
			double sum = 0;	//-- 누적합을 담을 번수(실수 형태)
			
			// ○ 연산 및 처리(반복문 구성)
			while(n <= 9){
				
				// 증감식 구성 → 최종적으로 반복문의 조건을 무너뜨리게 되는 열쇠
				sum += n/(n+1.0);
				n++;

				//-- 정수 기반의 나눗셈 연산은 몫을 반환하기 때문에
				//	 실수 기반의 연산을 수행할 수 있도록 만들기 위해
				//	 나눗셈 연산자를 중심으로 피 연산자중 하나를
				//   실수 형태로 만들어주는 것이 중요하다.
			}
			
			// ○ 결과 출력
			System.out.printf("연산 결과 : %f\n", sum);
		}
}

// 실행 결과
/*
연산 결과 : 7.071031746031746
계속하려면 아무 키나 누르십시오 . . .
*/