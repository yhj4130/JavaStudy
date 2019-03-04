/*===============================
  ���� ������(Operator) ����
  - ���� ������ == ���� ������
===============================*/

// �� �ǽ� ����
// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������... �������� ������� �Ǻ��Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, BufferedReader�� readLine()�� Ȱ���ϰ�
// ������ ���� �����ڸ� Ȱ���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է� : 2000
// 2000�� �� ����
// ����Ϸ��� �ƹ� Ű��...

// ������ ���� �Է� : 2011
// 2000�� �� ���
// ����Ϸ��� �ƹ� Ű��...

// �� ������ �Ǻ� ����
//	  ������ 4�� ����̸鼭 100�� ����� �ƴϰų�
//    400�� ����̸� ����
//    �׷��� ������ ���

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test029 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;
		String strResult;

		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());

		strResult = (n%4==0 && n%100!=0 || n%400==0) ? "����" : "���";

		System.out.printf("%d�� �� %s%n", n, strResult);
	}
}