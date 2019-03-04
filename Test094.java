/*================================
  ■■■ 클래스와 인스턴스 ■■■
  - 클래스와 인스턴스 활용
================================*/

// ○ 실습 문제
// 1 ~ 3 사이의 정수 형태의 난수를 발생시켜
// 가위, 바위, 보 게임 프로그램을 구현한다.
// 단, 클래스의 개념을 활용하여 처리할 수 있도록 한다.
// 또한, 배열을 활용하여 처리할 수 있도록 한다.

// 기준 데이터 → 1 : 가위, 2 : 바위, 3 : 보

// 실행 예)
// 1:가위 2:바위 3:보 중 입력(1~3) : 4
// 1:가위 2:바위 3:보 중 입력(1~3) : -12
// 1:가위 2:바위 3:보 중 입력(1~3) : 2
// - 유저   : 바위
// - 컴퓨터 : 보
// >> 승부최종결과 : 컴퓨터가 이겼습니다.
// 계속하려면 아무 키나 누르십시오...

import java.util.Scanner;
import java.util.Random;


public class Test094 {

	String[] mod = {"가위", "바위", "보"};

	int user;
	int com;
	
	public void write() {

		Scanner sc = new Scanner(System.in);
	
		do
		{
			System.out.print("1:가위 2:바위 3:보 중 입력(1~3) : ");
			user = sc.nextInt();
		}
		while (user<1 || user>3);
	}

	public void print() {
	
		System.out.printf("- 유저   : %s\n", mod[user-1]);

		Random rd = new Random();
		 
		com = rd.nextInt(3)+1;		// 1 2 3

		System.out.printf("- 컴퓨터 : %s\n", mod[com-1]);
		
	}

	public void game() {

		if (user==com)
			System.out.println(">> 승부최종결과 : 무승부 입니다.");

		else if (user==1&&com==3 || user==2&&com==1 || user==3&&com==2)
			System.out.println(">> 승부최종결과 : 본인이 이겼습니다.");

		else
			System.out.println(">> 승부최종결과 : 컴퓨터가 이겼습니다.");
		
	}
	
	public static void main(String[] args) {
		
		
		Test094 ob = new Test094();

		ob.write();
		ob.print();
		ob.game();
	}
}



// 실행 결과
/*
1:가위 2:바위 3:보 중 입력(1~3) : 4
1:가위 2:바위 3:보 중 입력(1~3) : 1
- 유저   : 가위
- 컴퓨터 : 바위
>> 승부최종결과 : 컴퓨터가 이겼습니다.
계속하려면 아무 키나 누르십시오 . . .
*/
/*
1:가위 2:바위 3:보 중 입력(1~3) : 2
- 유저   : 바위
- 컴퓨터 : 바위
>> 승부최종결과 : 무승부 입니다.
계속하려면 아무 키나 누르십시오 . . .
*/
/*
1:가위 2:바위 3:보 중 입력(1~3) : 3
- 유저   : 보
- 컴퓨터 : 바위
>> 승부최종결과 : 본인이 이겼습니다.
계속하려면 아무 키나 누르십시오 . . .
*/

/*
class RpsGame
{
	int user;
	int com;

	private void runCom() {

		Random rd = new Random();
		 
		com = rd.nextInt(3)+1;		// 1 2 3
	}

	public void input() {

		runCom();

		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("1:가위 2:바위 3:보 중 입력(1~3) : ");
			user = sc.nextInt();
		}
		while (user<1 || user>3);
	}

	public void middleCalc() {

		String[] str = {"가위", "바위", "보"};

		System.out.printf("- 유저   : " + str[user-1]);
		System.out.printf("- 컴퓨터 : " + str[com-1]);
	}

	public String resultCalc() {

		String result = "무승부";

		if ((user==1&&com==3) || (user==2&&com==1) || (user==3&&com==2))
			result = "당신이 승리했습니다.";
		if ((user==1&&com==2) || (user==2&&com==3) || (user==3&&com==1))
			result = "컴퓨터가 승리했습니다.";

		return result;
	}

	public void print(String result) {

		System.out.println(">> 승부최종결과 : " + result);
	}

	public static void main(String[] args) {

		RpsGame rg = new RpsGame();

		rg.input();
		rg.middleCalc();
		String result = rg.resultCalc();
		rg.print(result);
	
	}
}
*/