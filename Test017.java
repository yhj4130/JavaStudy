/*=========================================
  ���� �ڹ� �⺻ ���α׷��� ����
  - �ڹ��� �⺻ ����� : java.util.Scanner
==========================================*/

// �� java.util.Scanner
//	�ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
//	����Ʈ(default)�� ���Ǵ� �ܶ� ���ڴ� �����̴�.
//	�ۼ��� ���� ��ū�� �� next()�� �޼ҵ带 ���
//	�ٸ� ������ ������ ��ȯ�� �� �ִ�.

import java.util.Scanner;

public class Test017 {

	public static void main(String[] args) {

		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		
		// �� �ֿ� ���� ����
		String name;			//-- �̸�
		int kor, eng, mat;		//-- ����, ����, ���� ����

		// �� ���� �� ó��
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.next();

		System.out.print("���� ���� �Է� : ");
		kor = sc.nextInt();

		System.out.print("���� ���� �Է� : ");
		eng = sc.nextInt();

		System.out.print("���� ���� �Է� : ");
		mat = sc.nextInt();

		// �� ��� ���
		System.out.println("\n�̸� : " + name);
		System.out.printf("���� : %d\n", (kor+eng+mat));
	}
}

// ���� ���
/*
�̸��� �Է��ϼ��� : ������
���� ���� �Է� : 90
���� ���� �Է� : 80
���� ���� �Է� : 70

�̸� : ������
���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/