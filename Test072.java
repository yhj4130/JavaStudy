/*================================
  ���� Ŭ������ �ν��Ͻ� ���� 
================================*/

// �۽ǽ� ����
// ����ڷκ��� ������ ������ �Է¹޾�
// 1���� �Է¹��� �� ���������� �����Ͽ�
// ������� ����ϴ� ���α׷��� �����Ѵ�.

// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ����, �Է� ó�� �������� BufferedReader �� readLine()�� ����ϸ�,
// �Է� �����Ͱ� 1���� �۰ų� 1000���� ū ���
// �ٽ� �Է¹��� �� �ִ� ó���� �����Ͽ� ���α׷��� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է�(1~1000) : 1002
// ������ ���� �Է�(1~1000) : -20
// ������ ���� �Է�(1~1000) : 100
// >> 1~ 100������ ��: 5050
// ����Ϸ��� �ƹ� Ű�� ��������

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Hap
{
	// �ֿ� ���� ����
	int n;
	BufferedReader br;	// �����������ڸ����� �� ���縦 �˷�����Ҷ��� �̷��� �и��Ѵ�.

	//�Է� �޼ҵ� ����
	void input() throws IOException
	{
		br = new BufferedReader(new InputStreamReader (System.in));	// ��ª�� ��ȸ�뼺�϶� ���⿡ ���۸� �� �ᵵ �ȴ�.

		do
		{
			System.out.print("������ ���� �Է�(1~1000) : ");
			n = Integer.parseInt(br.readLine());
		}while(n<1 || n>1000);
		
	}

	//���� ó�� �޼ҵ� ����
	int calResult()
	{	
		int sum = 0; 
		for (int i=1; i<=n; i++)
			sum += i;
		return sum;
	}

	//��� ��� �޼ҵ� ����
	void print(int b)
	{
		System.out.printf(">> 1 ~ %d������ �� : %d\n", n, b);
	}
}


//main() �޼ҵ带 �����ϰ� �ִ� �ܺ� Ŭ����

public class Test072
{
	public static void main(String[] args) throws IOException
	{
		//HapŬ���� �ν��Ͻ� ����
		Hap ha = new Hap();
	
		//������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ�� �� throws IOException ó��
		ha.input();

		//������ �ν��Ͻ��� ���� ���� �޼ҵ� ȣ�� �� int�� ����� ��ȯ ��޾Ƴ��� �ֵ��� ó��
		int s = ha.calResult();

		//������ �ν��Ͻ��� ���� ��� �޼ҵ� ȣ�� �� �Ű����� ����
		ha.print(s);
	}
}


//������
/*
������ ���� �Է�(1~1000) : 500
1~500������ �� : 125250
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
