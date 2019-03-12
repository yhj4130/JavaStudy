/*=======================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Calendar Ŭ����
=======================================*/

// �� �ǽ� ����
//    ������ �������� �Է¹޴� ��¥��ŭ ���� ��, ��, ��, ������
//    Ȯ���Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.
//    ��, Calendar Ŭ������ Ȱ���Ͽ� ó���Ѵ�.

// ���� ��)
// ���� ��¥ : 2019-3-8 �ݿ���
// �� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

// ==========[Ȯ�ΰ��]==========
// 200�� �� : 2019-xx-xx x����
// ==============================
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ�...

import java.util.Calendar;
import java.util.Scanner;

public class Test139 {

	public static void main(String[] args) {
		
		// Scanner Ŭ���� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		
		// Calendar Ŭ������ �ν��Ͻ� ����
		Calendar cal = Calendar.getInstance();

		/*
		String[] week = {"�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����"};

		int y, m, d, w;
		int day;

		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1;
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK);

		System.out.println("���� ��¥ : "+ y + "-" + m + "-" + d + " " + week[w-1]);
		
		System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
		day = sc.nextInt();

		cal.add(Calendar.DATE, day);
		//cal.set(Calendar.DATE, cal.get(Calendar.DATE)+day);
		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1;
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK);

		System.out.println();
		System.out.println("==========[Ȯ�ΰ��]==========");
		System.out.println(day + "�� �� : " + y + "-" + m + "-" + d + " " + week[w-1]);
		System.out.println("==============================");
		*/

		// �ֿ� ���� ����
		int nalsu;		//-- ����ڷκ��� �Է¹��� �� ��
		int y, m, d, w;	//-- ��, ��, ��, ����
		String[] week = {"�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����"};

		// ������ ��, ��, ��, ���� Ȯ��(�������� : get())
		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1;	// check
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK);
		
		// ������ ��, ��, ��, ���� Ȯ�ΰ�� ���
		System.out.println("���� ��¥ : "+ y + "-" + m + "-" + d + " " + week[w-1]);

		do
		{
			System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
			nalsu = sc.nextInt();
		}
		while (nalsu<1);
		

		// �� �� ���ϱ� ����
		cal.add(Calendar.DATE, nalsu);
		
		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1;
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK);

		// ��� ���
		System.out.println();
		System.out.println("==========[Ȯ�ΰ��]==========");
		System.out.printf("%d�� �� : %tF %tA\n", nalsu, cal, cal);
		System.out.println("==============================");

	}
}


// ���� ���
/*
���� ��¥ : 2019-3-8 �ݿ���
�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

==========[Ȯ�ΰ��]==========
200�� �� : 2019-9-24 ȭ����
==============================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
/*
���� ��¥ : 2019-3-8 �ݿ���
�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 100

==========[Ȯ�ΰ��]==========
100�� �� : 2019-6-16 �Ͽ���
==============================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/