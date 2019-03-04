/*==========================================
  ���� ���� �帧�� ��Ʈ�� (���) ����
  - if ~ else�� �ǽ�
==========================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ ������ �Է¹޾�
// ���� ������ ū �� ������ ����ϴ� ���α׷��� �ۼ��Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 4
// �� ��° ���� �Է� : 8
// �� ��° ���� �Է� : 73

// >> ���� ��� : 4 8 73
// ��� �Ϸ��� �ƹ� Ű�� �����ʽÿ�...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		int a, b, c;	//-- ����ڰ� �Է��ϴ� ������ ������ ���� ����

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		c = Integer.parseInt(br.readLine());

		if (a>=b && b>=c) {
			System.out.printf("\n>>���� ��� : %d %d %d\n", c, b, a);
		}
		else if (a>=c && c>=b) {
			System.out.printf("\n>>���� ��� : %d %d %d\n", b, c, a);
		}
		else if (b>=a && a>=c) {
			System.out.printf("\n>>���� ��� : %d %d %d\n", c, a, b);
		}
		else if (b>=c && c>=a) {
			System.out.printf("\n>>���� ��� : %d %d %d\n", a, c, b);
		}
		else if (c>=a && a>=b) {
			System.out.printf("\n>>���� ��� : %d %d %d\n", b, a, c);
		}
		else if (c>=b && b>=a) {
			System.out.printf("\n���� ��� : %d %d %d\n", a, b, c);
		}
		else 
			System.out.printf("\n>> �Ǻ��� �Ұ����� ��Ȳ");
		*/
		
		int a, b, c;	//-- ����ڰ� �Է��ϴ� ������ ������ ���� ����
		int temp;
		
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		c = Integer.parseInt(br.readLine());

		if (a>b)		// �� ù ��° ������ �� ��° �������� ũ�ٸ�
		{
			// �� ������ �ڸ��� �ٲ۴�.
			temp = a;
			a = b;
			b = temp;
		}
		if (b>c)		// �� �� ��° ������ �� ��° �������� ũ�ٸ�
		{
			// �� ������ �ڸ��� �ٲ۴�.
			temp = b;
			b = c;
			c = temp;
		}
		if (a>b)		// �� ù ��° ������ �� ��° �������� ũ�ٸ�
		{
			// �� ������ �ڸ��� �ٲ۴�.
			temp = a;
			a = b;
			b = temp;
		}
		
		System.out.printf("\n>> ���İ�� : %d %d %d\n", a, b, c);

	}
}

// ���� ���
/*
ù ��° ���� �Է� : 87
�� ��° ���� �Է� : 3
�� ��° ���� �Է� : 45

>>���� ��� : 3 45 87
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/