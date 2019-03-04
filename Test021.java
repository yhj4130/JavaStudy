/*===================================
  ���� �ڹ� �⺻ ���α׷��� ����
  - BufferedReader
  - ���������
  - printf()
===================================*/

// ����ڷκ��� ������ �� �� �Է¹޾� ��Ģ���� �� ������ ������ �����Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է¹޴� ������ BufferedReader�� Ȱ���� �� �ֵ��� �ϰ�
// ����ϴ� ������ printf() �޼ҵ带 Ȱ���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 10
// �� ��° ���� �Է� : 2

//====[���]====
// 10 + 2 = 12
// 10 - 2 = 8
// 10 * 2 = 20
// 10 / 2 = 5
// 10 % 2 = 0
//==============
//����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test021 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int int1;
		int int2;		

		System.out.print("ù ��° ���� �Է� : ");
		int1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		int2 = Integer.parseInt(br.readLine());

		System.out.println("\n====[���]====");
		System.out.printf("\n%d + %d = %d", int1, int2, (int1+int2));
		System.out.printf("\n%d - %d = %d", int1, int2, (int1-int2));
		System.out.printf("\n%d * %d = %d", int1, int2, (int1*int2));
		System.out.printf("\n%d / %d = %f", int1, int2, (int1/int2));
		System.out.printf("\n%d % %d = %f", int1, int2, (int1%int2));
		System.out.println("==============");

	}
}
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test021 {

	public static void main(String[] args) throws IOException {
		
		// �� �ֿ� ���� ����
		int num1, num2;						//-- ����� �Է°��� ���� ����
		int res1, res2, res3, res4, res5;	//-- �� ������ ������� ���� ����
		
		//BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �� ���� �� ó��
		// �� ����ڿ��� �ȳ� �޼��� ��� �� �Է°� ������ ��Ƴ���
		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());

		// ��� ������ ���� ����� ����
		res1 = num1 + num2;
		res2 = num1 - num2;
		res3 = num1 * num2;
		res4 = num1 / num2;
		res5 = num1 % num2;

		// �� ��� ���
		System.out.println();
		System.out.println("====[���]====");

		System.out.printf("%d + %d = %d%n", num1, num2, res1);
		System.out.printf("%d - %d = %d%n", num1, num2, res2);
		System.out.printf("%d * %d = %d%n", num1, num2, res3);
		System.out.printf("%d / %d = %d%n", num1, num2, res4);
		System.out.printf("%d %% %d = %d%n", num1, num2, res5);

		System.out.println("==============");

	}
}

// ���� ���
/*
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 2

====[���]====
10 + 2 = 12
10 - 2 = 8
10 * 2 = 20
10 / 2 = 5
10 % 2 = 0
==============
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/