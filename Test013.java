/*===================================
  ■■■ 자바 기본 프로그래밍 ■■■
  - 변수와 자료형
  - 자바의 기본 입출력
====================================*/

// 삼각형의 밑변의 길이와 높이를 사용자로부터 입력받아
// 삼각형의 넓이를 구하는 프로그램을 구현한다.

// 실행 예)
// ■ 삼각형의 넓이 구하기 ■
// - 삼각형의 밑변 입력 :
// - 삼각형의 높이 입력 :

// >> 밑변이 x, 높이가 x인 삼각형이 넓이 : xxx
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013 {

	public static void main(String[] args) throws IOException {
		
		// 외부로부터 데이터를 입력받도록 처리하기 위해서
		// BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 주요 변수 선언
		int a, b;	// int underLength, height;		밑변, 높이

		double c;  // double area;	 삼각형의 넓이

		
		// 연산 및 처리
		// ① 사용자에게 안내 메세지 출력
		System.out.println("■ 삼각형의 넓이 구하기 ■");
		System.out.print("- 삼각형의 밑변 입력 : ");

		// ② 사용자가 입력한 데이터를 정수 형태로 변환한 수
		// 변수 underLength에 담아내기
		a = Integer.parseInt(br.readLine());	//underLength = Integer.parseInt(br.readLine());
		
		// ③ 다시 사용자에게 안내 메세지 출력
		System.out.print("- 삼각형의 높이 입력 : ");

		// ④ 사용자가 입력한 데이터를 정수 형태로 변환한 후
		//	  변수 height에 담아내기
		b = Integer.parseInt(br.readLine());	//height = Integer.parseInt(br.readLine());

		// ⑤ 삼각형의 넓이를 구하는 연산 처리
		c = a * b / 2.0;	// area = underLength * height / 2.0;
		//-- 실수 자료형이 결과값으로 나오는 과정에서
		//   실수 기반의 연산이 필요한 상황이다.
		//   정수형 『2』가 아닌 실수형 『2.0』으로 나눗셈 연산을 수행하게 되면 
		//   이 연산은 실수 기반으로 처리된다.

		// 결과 출력
		System.out.println();	//개행
		System.out.printf(">> 밑변이 %d, 높이가 %d인 삼각형이 넓이 : %.1f\n", a, b, c);		// \n. %n 둘 다 가능
		// System.out.printf(">> 밑변이 %d, 높이가 %d인 삼각형이 넓이 : %.1f\n", underLength, height, area);

	}
}

// 실행 결과
/*
■ 삼각형의 넓이 구하기 ■
삼각형의 밑변 입력 : 3
삼각형의 높이 입력 : 5

>> 밑변이 3, 높이가 5인 삼각형이 넓이 : 7.5
계속하려면 아무 키나 누르십시오 . . .
*/