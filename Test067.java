/*============================================
  ■■■ 메소드 재귀호출 (재귀 메소드) ■■■
  - return
============================================*/

public class Test067 {

	public static void main(String[] args) {

		showHi(3);
	}

	public static void showHi(int cnt) {
		
		System.out.println("Hi~!");
		
		// showHi(c--);		그대로 3이 출력 showHi(3) → showHi(--c) 로 변경
		
		// showHi(--c);		1만큼 감소하다가 0 -1 -2 로 출력

		if (cnt==1)			// 1인지 검토하기 전에 코딩되었기 때문 → 위치 변경
			return;			// 메소드 종료

		showHi(--cnt);
		
	}

}

// 실행 결과
/*
Hi~!
Hi~!
Hi~!
계속하려면 아무 키나 누르십시오 . . .
*/