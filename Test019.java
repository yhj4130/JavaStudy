/*=========================================
  ���� �ڹ� �⺻ ���α׷��� ����
  - �ڹ��� �⺻ ����� : java.util.Scanner
=========================================*/

// �� java.util.Scanner
//	�ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
//	����Ʈ(default)�� ���Ǵ� �ܶ� ���ڴ� �����̴�.
//	�ۼ��� ���� ��ū�� �� next()�� �޼ҵ带 ���
//	�ٸ� ������ ������ ��ȯ�� �� �ִ�.

import java.util.Scanner;

public class Test019 {

	public static void main(String[] args) {

		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// �� �ֿ� ���� ����
		String name;
		int kor, eng, mat, tot;

		// �� ���� �� ó��
		System.out.print("�̸�,����,����,���� �Է�(��,������) : ");
		//-- ������,90,80,70
		
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");		
		//				 ---------					 ---
		//			 "������,90,80,70"			������ ���ڿ��� ���ڿ��� ����� ���� �����ڸ� ���� ����
		//										\\s* : (������)���ڿ�

		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		// ���� ����
		tot = kor + eng + mat;

		// �� ��� ���
		System.out.println();
		System.out.printf("�̸� : %s%n", name);
		System.out.printf("���� : %d%n", tot);
	}
}

// ���� ���
/*
�̸�,����,����,���� �Է�(��,������) : ������,90,80,70

�̸� : ������
���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/