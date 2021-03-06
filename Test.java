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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int y, m, w, nalsu;

		int[] day = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		do
		{
			System.out.print("『연도』를 입력하세요 : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);

		do
		{
			System.out.print("『월』을 입력하세요	: ");
			m = Integer.parseInt(br.readLine());

		}
		while (m<1 || m>12);

		if ((y%4==0 && y%100!=0) || y%400==0)
			day[1] = 29;
		else
			day[1] = 28;

		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;

		for (int i=0; i<(m-1); i++)
			nalsu += day[i];

		nalsu += 1;

		w = nalsu%7;

		System.out.println();
		System.out.print("\t [ " + y + "년" + m + "월 ]");
		System.out.println();
		System.out.println("  일  월  화  수  목  금  토");
		System.out.println("============================");

		for (int i=1; i<=w; i++)
			System.out.print("    ");

		for (int i=1; i<=day[m-1]; i++)
		{
			System.out.printf("%4d", i);
			w++;

			if (w%7==0)
			{
				System.out.println();
			}
		}

		if (w%7!=0)
		{
			System.out.println();
		}

		System.out.println("============================");
	}
}