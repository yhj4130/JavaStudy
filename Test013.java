/*===================================
  ���� �ڹ� �⺻ ���α׷��� ����
  - ������ �ڷ���
  - �ڹ��� �⺻ �����
====================================*/

// �ﰢ���� �غ��� ���̿� ���̸� ����ڷκ��� �Է¹޾�
// �ﰢ���� ���̸� ���ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �� �ﰢ���� ���� ���ϱ� ��
// - �ﰢ���� �غ� �Է� :
// - �ﰢ���� ���� �Է� :

// >> �غ��� x, ���̰� x�� �ﰢ���� ���� : xxx
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013 {

	public static void main(String[] args) throws IOException {
		
		// �ܺηκ��� �����͸� �Է¹޵��� ó���ϱ� ���ؼ�
		// BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �ֿ� ���� ����
		int a, b;	// int underLength, height;		�غ�, ����

		double c;  // double area;	 �ﰢ���� ����

		
		// ���� �� ó��
		// �� ����ڿ��� �ȳ� �޼��� ���
		System.out.println("�� �ﰢ���� ���� ���ϱ� ��");
		System.out.print("- �ﰢ���� �غ� �Է� : ");

		// �� ����ڰ� �Է��� �����͸� ���� ���·� ��ȯ�� ��
		// ���� underLength�� ��Ƴ���
		a = Integer.parseInt(br.readLine());	//underLength = Integer.parseInt(br.readLine());
		
		// �� �ٽ� ����ڿ��� �ȳ� �޼��� ���
		System.out.print("- �ﰢ���� ���� �Է� : ");

		// �� ����ڰ� �Է��� �����͸� ���� ���·� ��ȯ�� ��
		//	  ���� height�� ��Ƴ���
		b = Integer.parseInt(br.readLine());	//height = Integer.parseInt(br.readLine());

		// �� �ﰢ���� ���̸� ���ϴ� ���� ó��
		c = a * b / 2.0;	// area = underLength * height / 2.0;
		//-- �Ǽ� �ڷ����� ��������� ������ ��������
		//   �Ǽ� ����� ������ �ʿ��� ��Ȳ�̴�.
		//   ������ ��2���� �ƴ� �Ǽ��� ��2.0������ ������ ������ �����ϰ� �Ǹ� 
		//   �� ������ �Ǽ� ������� ó���ȴ�.

		// ��� ���
		System.out.println();	//����
		System.out.printf(">> �غ��� %d, ���̰� %d�� �ﰢ���� ���� : %.1f\n", a, b, c);		// \n. %n �� �� ����
		// System.out.printf(">> �غ��� %d, ���̰� %d�� �ﰢ���� ���� : %.1f\n", underLength, height, area);

	}
}

// ���� ���
/*
�� �ﰢ���� ���� ���ϱ� ��
�ﰢ���� �غ� �Է� : 3
�ﰢ���� ���� �Է� : 5

>> �غ��� 3, ���̰� 5�� �ﰢ���� ���� : 7.5
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/