/*===================
  ■■■ 배열 ■■■
  - 배열의 복사
===================*/

// ○ 실습 문제
// 임의의 배열(a, b)에 들어있는 숫자들의 합집합을 출력하는 프로그램을 구현한다.
// 단, 중복이 제거된 상태의 합집합을 출력할 수 있도록 한다.
// 또한, 배열 복사 개념을 적용시켜 처리할 수 있도록 한다.

// ex) 임의의 두 배열
// int[] a = {2, 3, 7, 10, 11}
// int[] b = {3, 6, 10, 14}

// 실행 예)
// 첫 번째 배열 요소를 입력하세요(공백 구분) :
// 두 번째 배열 요소를 입력하세요(공백 구분) :
// 2 3 7 10 11 6 14
// 계속하려면 아무 키나 누르십시오...

import java.util.Scanner;

/*
public class Test099 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[5];
		int[] b = new int[5];

		int c = 0;

		System.out.print("첫 번째 배열 요소를 입력하세요(공백 구분) : ");
		for (int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
			//System.out.printf("%d", a[i]);
		}

		System.out.print("두 번째 배열 요소를 입력하세요(공백 구분) : ");
		for (int i=0; i<b.length; i++)
		{
			b[i] = sc.nextInt();
			//System.out.printf("%d", b[i]);
		}

		System.out.println();

		for (int i=0; i<a.length; i++)
		{
			System.out.printf("%d", a[i]);
		}
		for (int i=0; i<b.length; i++)
		{
			boolean flag = false;

			for (int j=0; j<a.length; j++)
			{
				if (b[i] == a[i])
				{
					flag = true;
					break;
				}
			}

			if (!flag)
			{
				System.out.printf("%4d", b[i]);
			}
		}
		System.out.println();
	}
}
*/

public class Test099 {

	public static void main(String[] args) {

		// 임의의 두 배열
		int[] a = {2, 3, 7, 10, 11};
		int[] b = {3, 6, 10, 14};

		// 방법 ①
		/*
		// - 집합 a 의 전체 요소 출력
		for (int i=0; i<a.length; i++)
			System.out.printf("%3d", a[i]);

		// - 집합 b의 요소 출력
		// 단, 집합 b는 집합 a의 요소와 중복되는 데이터를
		// 제거하면서 출력
		for (int i=0; i<b.length; i++)		// 4회전
		{
			boolean flag = false;

			for (int j=0; j<a.length; j++)	// 5회전
			{
				if (b[i] == a[j])
				{
					flag = true;			//-- 중복 확인
					break;					//-- 멈춘다. 그리고 빠져나간다.(j관련 반복문 탈출)
				}
			}
			
			if (flag)						// flag가 true라면
				continue;					//-- 뒷부분 무시하고 계속

			System.out.printf("%3d", b[i]);	//-- 뒷부분
		}
		System.out.println();				// 개행
		*/


		// 방법 ②
		// - 임시 배열을 만들고 
		int[] temp = new int[a.length + b.length];		// 배열의 길이 수정 불가(가변 x)

		// - 만들어진 임시 배열에 중복되지 않은 배열 요소를 채운 다음
		int n;	//-- 변수 선언 위치 중요
		for (n=0; n<a.length; n++)
			temp[n] = a[n];		

		for (int k=0; k<b.length; k++)
		{
			boolean flag = false;

			for (int m=0; m<a.length; m++)	
			{
				if (b[k] == a[m])
				{
					flag = true;			
					break;					
				}
			}
			
			if (flag)						
				continue;
			
			temp[n] = b[k];
			n++;
		}

		// - 그렇게 구성된 임시 배열을 출력
		for (int h=0; h<n; h++)					// temp.length로 설정할 경우 빈 공간이 0으로 출력됨
			System.out.printf("%3d", temp[h]);
		System.out.println();


		
	}
}


// 실행 결과
/*
  2  3  7 10 11  6 14						→ 방법 ①
계속하려면 아무 키나 누르십시오 . . .
*/
/*
  2  3  7 10 11  6 14						→ 방법 ②
계속하려면 아무 키나 누르십시오 . . .
*/