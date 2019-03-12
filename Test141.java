/*=======================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Random 클래스
=======================================*/

/*
○ java.util.Random 클래스는

   여러 형태의 난수를 발생시켜 제공하는 클래스이다.
   Math 클래스의 정적 메소드인 random() 메소드도 난수를 제공하는 메소드이지만
   0.0 ~ 1.0 사이의 실수 형태만 발생하게 되므로
   필요한 여러 형태의 난수를 만들어내기 위해서는 추가전인 연산들을 수행해야 한다.
   그래서 자바는 여러 형태의 난수를 발생시켜주는
   전용 클래스인 Random 클래스를 별도로 제공하고 있다.
*/

// 로또 번호 생성기 (난수 발생 프로그램)

// 프로그램이 실행되면 기본적으로 로또를 5게임 수행하는 프로그램을 구현한다.

// 실행 예)
// 2 39 40 41 42 45
// 1 2 8 16 28 42
// 4 9 10 13 14 28
// 20 24 31 33 37 41
// 5 7 8 11 36 40
// 계속하려면 아무 키나 누르십시오...

import java.util.Random;
import java.util.Arrays;

class Lotto {

	// 배열 변수 선언 및 메모리 할당 → 로또 번호를 담아둘 배열방 6개
	private int[] num = new int[6];

	// getter
	public int[] getNum() {
		return num;
	}

	// 6개의 난수를 발생시키는 메소드 정의
	public void start() {
		
		int cnt = 0;
		Random rd = new Random();
		int n;
		
		jump:
		while (cnt<6)	// cnt → 0 1 2 3 4 5
		{
			n = rd.nextInt(45)+1;	// 1 ~ 45
			for (int i=0; i<cnt; i++)
			{
				if(num[i] == n)	// num[1] 10	
					continue jump;
			}
			num[cnt++] = n;
		}
		sorting();
	}

	// 정렬 메소드
	private void sorting() {

		Arrays.sort(num);
	}
}

public class Test141 {

	public static void main(String[] args) {
		
		// Lotto 클래스 인스턴스 생성
		Lotto lotto = new Lotto();

		// 기본 5게임
		for (int i=1; i<=5; i++)
		{
			lotto.start();

			// 결과 출력
			for (int n : lotto.getNum())
				System.out.printf("%4d", n);
			System.out.println();
		}

		/*
		Random rd = new Random();

		int[][] num = new int[5][6];

		for (int i=0; i<num.length; i++)
		{
			for (int j=0; j<num[i].length; j++)
			{	
				num[i][j] = rd.nextInt(45)+1;
				for (int k=0; k<j; k++)
				{
					if (num[i][j]==num[i][k])
					{
						i--;
						break;
					}
				}
			
			}
		}

		for (int i=0; i<num.length; i++)
		{
			for (int j=0; j<num[i].length; j++)
			{	
				for (int k=0; k<j; k++)
				{
					if (num[i][j] < num[i][k])
					{
						num[i][j] = num[i][j] ^ num[i][k];
						num[i][k] = num[i][k] ^ num[i][j];
						num[i][j] = num[i][j] ^ num[i][k];
					}
				}
			}
		}

		for (int i=0; i<5; i++)
		{
			for (int j=0; j<6; j++)
				System.out.printf("%3d", num[i][j]);
			System.out.println();
		}
		System.out.println();
		*/
	}
}


// 실행 결과
/*
   1   5   9  13  16  17
  13  17  21  22  26  31
  23  29  31  34  40  45
   4  11  13  22  27  37
  16  18  20  28  34  37
계속하려면 아무 키나 누르십시오 . . .
*/