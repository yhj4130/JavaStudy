/*==========================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - if문 실습
==========================================*/

// ○ 실습 문제
// 사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
// 다음과 같은 형태로 출력하는 프로그램을 구현한다.

// 실행 예)
// 이름 입력 : 윤희진
// 국어 점수 : 90
// 영어 점수 : 80
// 수학 점수 : 70

// >> 당신의 이름은 윤희진입니다.
// >> 국어 점수는 90,
// >> 영어 점수는 80,
// >> 수학 점수는 70,
// >> 총점은 240이고, 평균은 80입니다.
// >> 등급은 B입니다.
// 계속하려면 아무 키나 누르십시오 . . .

// ※ 등급은 평균 점수를 기준으로 처리한다.

// 80 <= avg < 90 (x) → avg >= 9 && avg < 90
// 90 ~ 100점 : A	80 ~ 89점 : B
// 70 ~ 79점 : C	60 ~ 69점 : D
// 60점 미만 : F

// 단, BufferedReader의 readLine() 메소드를 통해 입력받을 수 있도록 하며, 
// printf() 메소드를 통해 출력할 수 있도록 한다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test031 {

	public static void main(String[] args) throws IOException {
		
		String strName, grade;		// 이름, 등급	char grade
		int kor, eng, math, total;	// 국어, 영어, 수학, 총점
		double avg;					// 평균	

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("이름 입력 : ");
		strName = br.readLine();

		System.out.print("국어 점수 : ");
		kor = Integer.parseInt(br.readLine());

		System.out.print("영어 점수 : ");
		eng = Integer.parseInt(br.readLine());

		System.out.print("수학 점수 : ");
		math = Integer.parseInt(br.readLine());

		total = kor + eng + math;		// 총점 계산
		avg = total / 3.0;				// 평균 계산
		

		if (avg >= 90)
			grade = "A";
		else if (avg >= 80)
			grade = "B";
		else if (avg >= 70)
			grade = "C";
		else if (avg >= 60)
			grade = "D";
		else
			grade = "F";
		
		/*
		grade = "F";			// F로 미리 지정 	
		if (avg >= 90)
			grade = "A";
		else if (avg >= 80)
			grade = "B";
		else if (avg >= 70)
			grade = "C";
		else if (avg >= 60)
			grade = "D";				// 마지막에 꼭 esle를 쓰지 않아도 된다.
		*/

		System.out.printf("%n당신의 이름은 %s입니다.%n", strName);
		System.out.printf(">> 국어 점수는 %d,%n", kor);
		System.out.printf(">> 영어 점수는 %d,%n", eng);
		System.out.printf(">> 수학 점수는 %d,%n", math);
		System.out.printf(">> 총점은 %d이고, 평균은 %.1f입니다.%n", total, avg);
		System.out.printf(">> 등급은 %s 입니다.%n", grade);		// char - %c

	}
}

// 실행 결과
/*
이름 입력 : 김경환
국어 점수 : 90
영어 점수 : 80
수학 점수 : 70

당신의 이름은 김경환입니다.
>> 국어 점수는 90,
>> 영어 점수는 80,
>> 수학 점수는 70,
>> 총점은 240이고, 평균은 80입니다.
>> 등급은 B 입니다.
계속하려면 아무 키나 누르십시오 . . .
*/