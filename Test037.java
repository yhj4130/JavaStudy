/*==========================================
  ���� ���� �帧�� ��Ʈ�� (���) ����
  - if ~ else�� �ǽ�
==========================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ ���� �� ���� �Է¹޾�
// ���� �� ���� ū �� ������ ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է� �����͸� �ѹ��� ó���� �� �ֵ��� �����ϸ�
// ��xor�� �����ڸ� Ȱ���Ͽ� ���� ó���� �� �� �ְ�� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 160 80 214

// >> ���� ��� : 80 160 214

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
import java.util.Scanner;

public class Test037 {

	public static void main(String[] args) {
	
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc = new Scanner(System.in);

		int a, b, c;

		System.out.print("������ �� ���� �Է�(���� ����) : ");

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (a>b)		// �� ù ��° ������ �� ��° �������� ũ�ٸ�
		{
			// �� ������ �ڸ��� �ٲ۴�.
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;
		}
		if (b>c)		// �� �� ��° ������ �� ��° �������� ũ�ٸ�
		{
			// �� ������ �ڸ��� �ٲ۴�.0 
			b = b ^ c;
			c = c ^ b;
			b = b ^ c;
		}
		if (a>b)		// �� ù ��° ������ �� ��° �������� ũ�ٸ�
		{
			// �� ������ �ڸ��� �ٲ۴�.
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;
		}
		
		System.out.printf("\n>> ���İ�� : %d %d %d\n", a, b, c);

	}
}

// ���� ���
/*
������ �� ���� �Է�(���� ����) : 47 8 109

>> ���İ�� : 8 47 109
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/