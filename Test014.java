/*=============================================
  ���� �ڹ� �⺻ ���α׷��� ����
  - ������ �ڷ���
  - �ڹ��� �⺻ ����� : BufferedReader 
==============================================*/

// ����ڷκ��� �̸��� ��������, ��������, ���������� �Է¹޾�
// �̸��� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �̸��� �Է��ϼ��� :
// ���� ���� �Է� : 
// ���� ���� �Է� :
// ���� ���� �Է� :

// ====[���]====
// �̸� :
// ���� :
// ==============
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test014 {

	public static void main(String[] args) throws IOException {
		
		// �ܺηκ��� �����͸� �Է¹޵��� ó���ϱ� ���ؼ�
		// BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// InputStreamReader �ν��Ͻ� ���� + BufferedReader �ν��Ͻ� ����
		// InputStreamReader isr = new InputStreamReader(System.in);
		// BufferedReader br = new BufferedReader(isr);
		
		// �ֿ� ���� ����
		String name;	// �̸�		String strName;
		int kor, eng, math, total;	// ��������, ��������, ��������, ����	int nKor, nEng, nMat, nTot;
		
		// �߰� ���� ����
		//String strTemp;

		// ���� �� ó��
		// ������ڿ��� �ȳ� �޼��� ���(�̸� �Է� �ȳ�)
		System.out.print("�̸��� �Է��ϼ��� : ");

		// ������ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		name = br.readLine();	// strName = br.readLine();
		
		// ������ڿ��� �ȳ� �޼��� ���(�������� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");

		// ������ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		kor = Integer.parseInt(br.readLine());		
		// strTemp = br.readLine();				//-- ���ڿ��� �ӽ� ����
		// nKor = Integer.parseInt(strTemp);	//-- �ӽ����� ������ �� ��ȯ ��
												//   �������� ������ ��Ƴ���
		
		// ������ڿ��� �ȳ� �޼��� ���(�������� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");

		// ������ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		eng = Integer.parseInt(br.readLine());
		// strTemp = br.readLine();				//-- ���ڿ��� �ӽ� ����
												//   (���� ���������� �����)
		// nEng = Integer.parseInt(strTemp);	//-- �ӽ����� ������ �� ��ȯ ��
												//   �������� ������ ��Ƴ���
		
		// ������ڿ��� �ȳ� �޼��� ���(�������� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");

		// ������ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		math = Integer.parseInt(br.readLine());
		// strTemp = br.readLine();				//-- ���ڿ��� �ӽ� ����
												//   (���� ���������� �����)
		// nMat = Integer.parseInt(strTemp);	//-- �ӽ����� ������ �� ��ȯ ��
												//   �������� ������ ��Ƴ���
		
		// ���Էµ� �����͵��� �����Ͽ� ���� �����ϱ�
		total = kor + eng + math;
		// nTot = nKor + nEng + nMat;
		
		// ��� ���
		System.out.println();						// ����
		System.out.println("====[���]====");		// System.out.println("\n====[���]====");
		System.out.println("�̸� : " + name);		// System.out.println("�̸� : " + strName);
		System.out.printf("���� : %d\n", total);	// System.out.println("���� : " + nTot);
		System.out.println("==============");

	}
}

// ���� ���
/*
�̸��� �Է��ϼ��� : �ѽ¿�
���� ���� �Է� : 90
���� ���� �Է� : 80
���� ���� �Է� : 70

====[���]====
�̸� : �ѽ¿�
���� : 240
==============
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/