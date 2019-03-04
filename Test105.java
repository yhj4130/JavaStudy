/*===================================
  ■■■ 정렬(Sort) 알고리즘 ■■■
===================================*/

// ○ 실습 문제
//    사용자로부터 여러 학생의 성적 정보를 정수 형태로 입력받아
//	  점수가 높은 순으로 등수를 부여하여 결과를 출력하는 프로그램을 구현한다.
//	  단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 인원 수 입력 : 5
// 이름 점수 입력(1) : 윤희진 90
// 이름 점수 입력(2) : 이정윤 80
// 이름 점수 입력(3) : 이아름 85
// 이름 점수 입력(4) : 홍길동 75
// 이름 점수 입력(5) : 고길동 95

// ==================
// 1등 고길동
// 2등 윤희진
// 3등 이아름
// 4등 이정윤 
// 5등 홍길동
// ==================
// 계속하려면 아무 키나 누르십시오...

import java.util.Scanner;

public class Test105 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		System.out.print("인원 수 입력 : ");
		int st = sc.nextInt();

		int num[] = new int[st];
		String[] name = new String[st];
		int[] score = new int[st];

		for (int i=0; i<st; i++)
		{
			System.out.printf("이름 점수 입력(%d) : ", i+1);
			name[i] = sc.next();
			score[i] = sc.nextInt();
		}
		

		boolean flag;
		String stName;
		int i=0;

		do
		{	
			flag = false;
			i++;
			for (int j=0; j<score.length-i; j++)	
			{
				if (score[j] < score[j+1])				
				{
					
					stName = name[j];
					name[j] = name[j+1];
					name[j+1] = stName;

					// 자리 바꾸기
					score[j] = score[j]^score[j+1];
					score[j+1] = score[j+1]^score[j];
					score[j] = score[j]^score[j+1];

					flag = true;			
				}
			}	
		}
		while (flag);
		
		int rank = 0;
	
		// 결과물 출력
		System.out.println("\n==================");
		
		for (int j=0; j<num.length; j++){
				
				rank++;

				if (j>0 && score[j]==score[j-1])
				{
					rank--;
					System.out.printf("%d등 %s\n", rank, name[j]);
				}
				else 
					System.out.printf("%d등 %s\n", j+1, name[j]);
		}

		System.out.println("==================");
		
	}
}


// 실행 결과
/*
인원 수 입력 : 5
이름 점수 입력(1) : 윤희진 90
이름 점수 입력(2) : 이정윤 80
이름 점수 입력(3) : 이아름 85
이름 점수 입력(4) : 홍길동 75
이름 점수 입력(5) : 고길동 95

==================
1등 고길동
2등 윤희진
3등 이아름
4등 이정윤
5등 홍길동
==================
계속하려면 아무 키나 누르십시오 . . .
*/