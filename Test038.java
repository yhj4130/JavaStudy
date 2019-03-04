/*==========================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - if ~ else문 실습
==========================================*/

// ○ 과제
// 사용자로부터 알파벳 한 문자를 입력받아
// 이를 판별하여 입력받은 알파벳이 모음일 경우만
// 결과를 출력하는 프로그램을 구현한다.
// 단, 대소문자를 모두 적용할 수 있도록 처리한다.
// 또한, 알파벳 이외의 문자가 입력되었을 경우
// 입력 오류에 대한 내용을 사용자에게 안내해 줄 수 있도록 한다.

// 실행 예)
// 알파벳 한 문자 입력 : A
// >> 모음 
// 계속하려면 아무 키나 누르십시오...

// 알파벳 한 문자 입력 : e
// >> 모음 
// 계속하려면 아무 키나 누르십시오...

// 알파벳 한 문자 입력 : B
// 계속하려면 아무 키나 누르십시오...

// 알파벳 한 문자 입력 : 1
// >> 입력 오류
// 계속하려면 아무 키나 누르십시오...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test038 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char alpa;

		System.out.print("알파벳 한 문자 입력 : ");
		alpa = (char)System.in.read();			// (char)로 형변환

		if(alpa == 'a'| alpa == 'A') {
			System.out.println(">> 모음");
		}
		else if(alpa == 'i'| alpa == 'I') {
			System.out.println(">> 모음");
		}
		else if(alpa == 'e'| alpa == 'E') {
			System.out.println(">> 모음");
		}
		else if(alpa == 'o'| alpa == 'O') {
			System.out.println(">> 모음");
		}
		else if(alpa == 'u'| alpa == 'U') {
			System.out.println(">> 모음");				//-->> 모음 먼저 필터
		}
		else if(alpa >= 65 && alpa <= 90) {
			System.out.println("");
		}
		else if(alpa >= 97 && alpa <= 122) {			//-->> 나머지 자음 조건 설정
			System.out.println("");
		}
		else
			System.out.println(">> 입력 오류");			//-->> 그 외 입력
		
		
	}
}

// 실행 결과
/*
알파벳 한 문자 입력 : e
>> 모음
계속하려면 아무 키나 누르십시오 . . .
*/
/*
알파벳 한 문자 입력 : i
>> 모음
계속하려면 아무 키나 누르십시오 . . .
*/
/*
알파벳 한 문자 입력 : g

계속하려면 아무 키나 누르십시오 . . .
*/
/*
알파벳 한 문자 입력 : 1
>> 입력 오류
계속하려면 아무 키나 누르십시오 . . .
*/