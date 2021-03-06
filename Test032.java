/*==========================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - if ~ else문 실습
==========================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test032 {

		public static void main(String[] args) throws IOException {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int n;

			//System.out.print("임의의 정수 입력 : ");
			//n = Integer.parseInt(br.readLine());
			
			// X
			/*
			if (n%2==0)
			{
				System.out.println(n + " → 짝수");		// 0이 짝수라는 결과가 출력된다.
			}
		    esle if (n==0)
		    {
				System.out.println(n + " → 영");
		    }
			else
			{
				System.out.println(n + " → 홀수");
			}
			*/
			
			// X
			/*
			if (n%2!=0)
			{
				System.out.println(n + " → 홀수");
			}
			else if (n%2==0)
			{
				System.out.println(n + " → 짝수");		// 0이 짝수라는 결과가 출력된다.
			}
		    else if (n==0)
		    {
				System.out.println(n + " → 영");
		    }
			*/
			
			// O
			/*
			if (n==0)
			{
				System.out.println(n + " → 영");		// 먼저 0인지 판단
			}
			else if (n%2==0)
			{
				System.out.println(n + " → 짝수");
			}
			else if (n%2!=0)
			{
				System.out.println(n + " → 홀수");
			}
			else 
			{
				System.out.println("판정 불가능한 상황");
			}
			*/

			System.out.print("아이스크림 종류 선택(1.딸기, 2포도) : ");
			n = Integer.parseInt(br.readLine());
			
			/*
			if (n==1)
			{
				System.out.println("딸기 아이스크림 선택~!!!");
			}
			else 
			{
				System.out.println("포도 아이스크림 선택~!!!");		//1, 2 번 외의 숫자 입력시 포도만 나옴
			}
			*/

			if (n==1)
			{
				System.out.println("딸기 아이스크림 선택~!!!");
			}
			else if (n==2)
			{
				System.out.println("포도 아이스크림 선택~!!!");	
			}
			else
			{
				System.out.println("판정 불가 ~!!!");
			}
		
		}
}