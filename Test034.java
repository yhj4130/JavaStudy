/*==========================================
  ���� ���� �帧�� ��Ʈ�� (���) ����
  - if ~ else�� �ǽ�
==========================================*/

// �� �ǽ� ����
// ������ �� ������ �����ڸ� �Է¹޾�
// �ش� �������� ó�� ����� ����ϴ� ���α׷��� �ۼ��Ѵ�.
// ��, if ���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
// ���� ����� ���ǻ� ���� ���·� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ù ��° ���� �Է�	 : 10
// �� ��° ���� �Է�	 : 14
// ������ �Է� (+ - * /) : +

// >> 10 + 14 = 24
// ����Ϸ��� �ƹ�Ű�� �����ʽÿ�...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test034 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b;
		String n;

		System.out.print("ù ��° ���� �Է�     : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է�     : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("������ �Է� (+ - * /) : ");
		n = br.readLine();

		if (n.equals("+"))
		{
			System.out.printf("%n>> %d + %d = %d%n", a, b, a+b);
		}
		else if (n.equals("-"))
		{
			System.out.printf("%n>> %d - %d = %d%n", a, b, a-b);
		}
		else if (n.equals("*"))
		{
			System.out.printf("%n>> %d * %d = %d%n", a, b, a*b);
		}
		else if (n.equals("/"))
		{
			System.out.printf("%n>> %d / %d = %d%n", a, b, a/b);
		}
		else
		{
			System.out.println("�Է� ������ ������ �����մϴ�.");
		}
	

		// ��� ��
		/*
		int a, b;
		char op;

		System.out.print("ù ��° ���� �Է�     : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է�     : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("������ �Է� (+ - * /) : ");
		op = (char)System.in.read();

		if (op == '+')
		{
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
		}
		else if (op == '-')
		{
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
		}
		else if (op == '*')
		{
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
		}
		else if (op == '/')
		{
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
		}
		else
		{
			System.out.println("�Է� ������ ������ �����մϴ�.");
		}
		*/

		// ��� ��
		/*
		int a, b, op;

		System.out.print("ù ��° ���� �Է�     : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է�     : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("������ �Է� (+ - * /) : ");
		op = System.in.read();			// int��

		// �׽�Ʈ Ȯ��
		//System.out.println("op : " + op);
		//-- + �� op : 43
		//-- - �� op : 45
		//-- * �� op : 42
		//-- / �� op : 47

		if (op == 43)	// '+'
		{
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
		}
		else if (op == 45)	// '-'
		{
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
		}
		else if (op == 42)	// '*'
		{
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
		}
		else if (op == 47)	// '/'
		{
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
		}
		else
		{
			System.out.println("�Է� ������ ������ �����մϴ�.");
		}
		*/

		// ��� ��
		/*
		int a, b, result=0;		// else �ʿ� x
		char op;

		System.out.print("ù ��° ���� �Է�     : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է�     : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("������ �Է� (+ - * /) : ");
		op = (char)System.in.read();

		if (op == '+')
			result = a + b;
		else if (op == '-')
			result = a - b;
		else if (op == '*')
			result = a * b;
		else if (op == '/')
			result = a / b;

		System.out.printf("\n>> %d %c %d = %d\n", a, op, b, result);
		*/

	}
}

// ���� ���
/*
ù ��° ���� �Է�     : 10
�� ��° ���� �Է�     : 14
������ �Է� (+ - * /) : +

>> 10 + 14 = 24
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
/*
ù ��° ���� �Է�     : 80
�� ��° ���� �Է�     : 44
������ �Է� (+ - * /) : -

>> 80 - 44 = 36
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
/*
ù ��° ���� �Է�     : 7
�� ��° ���� �Է�     : 8
������ �Է� (+ - * /) : *

>> 7 * 8 = 56
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
/*
ù ��° ���� �Է�     : 90
�� ��° ���� �Է�     : 10
������ �Է� (+ - * /) : /

>> 90 / 10 = 9
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/