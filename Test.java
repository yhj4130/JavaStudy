// ���� ��)
// ���������� �Է��ϼ��� : 2019
// �������� �Է��ϼ���	 : 7
/*
       [ 2019�� 7�� ]

 ��  ��  ȭ  ��  ��  ��  ��
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
			System.out.print("���������� �Է��ϼ��� : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);

		do
		{
			System.out.print("�������� �Է��ϼ���	: ");
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
		System.out.print("\t [ " + y + "��" + m + "�� ]");
		System.out.println();
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
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