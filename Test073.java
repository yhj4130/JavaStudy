/*================================
  ���� Ŭ������ �ν��Ͻ� ����
  - Ŭ���� ���� �ǽ�
================================*/

// �۽ǽ� ����
// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// ��Ģ ������ �����ϴ� ���α׷��� �����Ѵ�.
// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� �ۼ� �� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 10 5
// ������ ������ �Է�(+ - * /)	 :+
// >> 10 + 5 = 15
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	// �ֿ� �Ӽ� ����
	int a, b;	//-- ����ڷκ��� �Է¹��� �� ������ ��Ƶ� ����
	char ch;

	// �޼ҵ� ����(��� : �Է�)
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.print("������ ������ �Է�(+ - * /)	 :");
		ch =(char)System.in.read();
	
	}

	// �޼ҵ� ����(��� : ����)
	double cal()
	{
		double result = 0;
		switch (ch)
		{
			case '+' : result = a + b; break;
			case '-' : result = a - b; break;
			case '*' : result = a * b; break;
			case '/' : result = a / b; break;
		}		
		return result;
	}

	// �޼ҵ� ����(���:���)
	void print(double k)
	{	
		System.out.printf(">>%d %c %d = %.1f\n", a, ch, b, k);

	}
}


public class Test073
{
	public static void main(String[] args) throws IOException
	{
		//Calculate Ŭ���� ����� �ν���Ʈ ����
		Calculate ob = new Calculate();

		ob.input();
		double result = ob.cal();
		ob.print(result);
	}
}


//���� ���
/*
������ �� ���� �Է�(���� ����) : 5 6
������ ������ �Է�(+ - * /)      :+
>>5 + 6 = 11
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
