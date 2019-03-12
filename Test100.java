/*=======================
  ■■■ 만년달력 ■■■
=======================*/

// 실행 예)
// 『연도』를 입력하세요 : 2019
// 『월』을 입력하세요	 : 7
/*
       [ 2019년 7월 ]

 일  월  화  수  목  금  토
============================
      1   2   3   4   5   6
  7   8   9  10  11  12  13
 14  15  16  17  18  19  20
 21  22  23  24  25  26  27
 28  29  30  31
============================
*/
/*
※ 문제 인식 및 분석
   - 서기 1년 1월 1일 : 월요일

   - 연도가 4의 배수이면서 100의 배수가 아니거나,
     400의 배수이면 2월은 29일(윤년),
	 나머지 2월은 28일(평년)

   - 2019년 7월 달력을 그린다고 가정하면
     1.1.1 ~ 2019.6.31 까지의 전체 날 수를 구한다.
	 그 날 수에 +1 연산을 수행하면 (2019년 7월 1일의 요일 확인)
	 7월의 달력 그릴 준비 끝

   - 요일 = 전체 날수 %7
     요일 = 0 → 일요일
	        1 → 월요일
			     :
		    6 → 토요일
*/

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test100 {

	public static void main(String[] args) throws IOException {
		
		/*
		Scanner sc = new Scanner(System.in);
		
		int year, month;

		System.out.print("『연도』를 입력하세요 : ");
		year = sc.nextInt();
		
		do
		{
			System.out.print("『월』을 입력하세요   : ");
			month = sc.nextInt();
		}
		while (month<1 || month>12);
		

		System.out.printf("\n       [ %d년 %d월 ]\n", year, month);
		System.out.println("\n 일  월  화  수  목  금  토");
		System.out.println("============================");
		
		int[] months = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] weekNames = {"일", "월", "화", "수", "목", "금", "토"};
		
		int nalsu;		// 총 날 수
		int day;

		if(year%4==0 && year%100!=0 || year%400==0)	
		{
			months[1] = 29;			// 윤년
		}
		else								
		{
			months[1] = 28;			// 평년
		}
		
		nalsu = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;

		for (int i=0; i<(month-1); i++)
				nalsu += months[i];

		day = months[month-1];

		int[] week = new int[day];

		for (int i=0; i<week.length; i++)
		{
			week[i] = i+1;
		}

		day = nalsu%7+1;

		for (int i=0; i<day; i++)	
			System.out.print("    ");
			
		for (int i=0; i<week.length; i++)		
		{
			System.out.printf("%4d", week[i]);

			if ((day+i+1)%7==0 && i!=week.length-1)
			{
				System.out.println();
			}
		}

		System.out.println("\n============================\n");
		*/

		// BufferedReader 클래스 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 배열 선언 및 초기화
		// 각 달이 담고있는 마지막 날짜(매 월의 최대 날짜)
		int[] days = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		// 확인
		//System.out.println(days.length);	//-- 12

		// 주요 변수 선언
		int nalsu, y, m, w;		//-- 날수, 년, 월, 요일

		do
		{
			System.out.print("『연도』를 입력하세요 : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);

		do
		{
			System.out.print("『월』을 입력하세요   : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);

		//----------------- 여기 까지 수행하면 유요한 년도, 월 입력한 상태

		// 입력받은 년도에 해당하는 2월의 마지막 날 계산
		if((y%4==0 && y%100!=0) || y%400==0)	
			days[1] = 29;			//-- 윤년
		else								
			days[1] = 28;			//-- 평년
		//-- else구문은
		//   현재 days[1] 가 28로 입력되어 있는 상태이기 떄문에
		//   생략이 가능한 구문이 된다.

		// 1년 1월 1일 ~ 입력받은 년도 이전 년도의 12월 31일까지의 
		// 날 수 계산
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
		
		// 입력받은 년도(해당년도) 1월 1일 ~ 입력한 월의 이전 월 까지의
		// 날 수 누적 연산
		for (int i=0; i<(m-1); i++)
				nalsu += days[i];
		
		// 입력받은 월의 1일
		nalsu += 1;					// ++nalsu;

		// 확인
		//System.out.println(nalsu);	//--==>> 737241
		//-- 2019년 7월 기준

		//----------------- 여기 까지 수행하면 모든 날 수에 대한 종합 완료

		// 요일 산출
		// : 입력받은 월의 1일이 무슨 요일인지 확인하기 위한 연산
		w = nalsu%7;	//-- 0:일요일, 1:월요일, 2:화요일 ...

		// 확인
		//System.out.println(w);			//--==>> 1 → 2019년 7월 1일 → 월요일
		//-- 2019년 7월 기준

		// 출력(달력 그리기)
		System.out.println();
		System.out.println("\t [ " + y + "년" + m + "월 ]");
		System.out.println();
		System.out.println("  일  월  화  수  목  금  토");	// 두 칸 공백
		System.out.println("============================");

		// 특정 요일부터 1일이 출발할 수 있도록 공백 발생(지정)
		for (int i=1; i<=w; i++)
			System.out.print("    ");	// 네 칸 공백

		// 확인
		//System.out.printf("%4d", 1);

		// 해당 월(입력한 월)의 날짜만 출력될 수 있도록 반복문 구성
		for (int i=1; i<=days[m-1]; i++)
		{
			System.out.printf("%4d", i);
			w++;	//-- 날짜가 증가하는 만큼 요일도 함께 증가할 수 있도록 처리

			if (w%7==0)	// 토요일마다
			{
				System.out.println();
			}
		}

		// 달의 마지막 날짜가 출력 형식을 모두 채웠을 경우
		// 이미 일요일 개행이 이루어졌기 때문에
		// 이 경우에는 추가 개행을 하지 않도록 처리
		if (w%7!=0)
			System.out.println();
		
		System.out.println("============================");

		
	}
}


// 실행 결과
/*
『연도』를 입력하세요 : 2019
『월』을 입력하세요   : 2

       [ 2019년 2월 ]

 일  월  화  수  목  금  토
============================
                       1   2
   3   4   5   6   7   8   9
  10  11  12  13  14  15  16
  17  18  19  20  21  22  23
  24  25  26  27  28
============================

계속하려면 아무 키나 누르십시오 . . .
*/
/*
『연도』를 입력하세요 : 2019
『월』을 입력하세요   : 7

         [ 2019년7월 ]

  일  월  화  수  목  금  토
============================
       1   2   3   4   5   6
   7   8   9  10  11  12  13
  14  15  16  17  18  19  20
  21  22  23  24  25  26  27
  28  29  30  31
============================
계속하려면 아무 키나 누르십시오 . . .
*/