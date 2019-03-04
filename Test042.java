/*==========================================
  ���� ���� �帧�� ��Ʈ�� (���) ����
  - switch�� �ǽ�
==========================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� ������ ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, switch ���� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�
// ���� ����� ���ǻ� ���� ���·� ó���ϵ��� �Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 10
// �� ��° ���� �Է� : 28
// ������ �Է�(+ - * /) : +

// >> 10 + 28 = 28
// ����Ϸ��� �ƹ�Ű�� �����ʽÿ�...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test042 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b;

		char op;

		System.out.print("ù ��° ���� �Է� :    ");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("�� ��° ���� �Է� :    ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();

		switch(op) {
			case 43 : System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));break;
			case 45 : System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));break;
			case 42 : System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));break;
			case 47 : System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));break;
			default : return;		//-- �޼ҵ� ���� �� main() �޼ҵ� ���� �� ���α׷� ����

			// case ���1 : ����1; [break;] ������ �̷� ���� ������ case�� ��� ���� ���ڵ� ��� �����ϰ� ��
		
			// �� ��return�� : 1. ���� ��ȯ
			//				   2. �޼ҵ� ����

		}
	}
}

// ���� ���
/*
ù ��° ���� �Է� :    10
�� ��° ���� �Է� :    28
������ �Է�(+ - * /) : +

>> 10 + 28 = 38
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
/*
ù ��° ���� �Է� :    38
�� ��° ���� �Է� :    9
������ �Է�(+ - * /) : -

>> 38 - 9 = 29
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
/*
ù ��° ���� �Է� :    77
�� ��° ���� �Է� :    4
������ �Է�(+ - * /) : *

>> 77 * 4 = 308
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
/*
ù ��° ���� �Է� :    45
�� ��° ���� �Է� :    5
������ �Է�(+ - * /) : /

>> 45 / 5 = 9
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/