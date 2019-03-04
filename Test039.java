/*==========================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - if ~ else문 실습
==========================================*/

// ○ 과제
// 사용자로부터 알파벳 한 문자를 입력받아 이를 판별하여
// 소문자를 입력받았을 경우 대문자로 변환하고
// 대문자를 입력받았을 경우 소문자로 변환하는
// 프로그램을 구현한다.
// 단, 입력은 『System.in.read()』 메소드를 활용할 수 있도록 한다.

// 실행 예)
// 알파벳 한 문자 입력 : A
// >> a
// 계속하려면 아무키나 누르십시오...

// 알파벳 한 문자 입력 : c
// >> C
// 계속하려면 아무키나 누르십시오...

// 알파벳 한 문자 입력 : 6
// >> 입력 오류
// 계속하려면 아무키나 누르십시오...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test039 {

	public static void main(String[] args) throws IOException {
		
		char alpa;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("알파벳 한 문자 입력 : ");
		alpa = (char)System.in.read();		//-->> (char)로 형변환하여 읽어오기

		if(alpa>='A' && alpa<='Z') {
			System.out.println(">> "+(char)(alpa+32));		//-->> 대문자 범위 설정 후 소문자로 변환
		}
		else if(alpa>='a' && alpa<='z') {
			System.out.println(">> "+(char)(alpa-32));		//-->> 소문자 범위 설정 후 대문자로 변환
		}
		else 
			System.out.println("입력 오류!!");				//-->> 위의 두 조건 모두 해당이 안 될 경우
	}
}

// 실행 결과
/*
알파벳 한 문자 입력 : a
>> A
계속하려면 아무 키나 누르십시오 . . .
*/
/*
알파벳 한 문자 입력 : F
>> f
계속하려면 아무 키나 누르십시오 . . .
*/
/*
알파벳 한 문자 입력 : 2
입력 오류!!
계속하려면 아무 키나 누르십시오 . . .
*/