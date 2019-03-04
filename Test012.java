/*=============================================
  ���� �ڹ� �⺻ ���α׷��� ����
  - ������ �ڷ���
  - �ڹ��� �⺻ ����� : BufferedReader Ŭ����
==============================================*/

// ����ڷκ��� �������� �Է¹޾�
// �� �Է¹��� �������� ����
// ���� ���̿� �ѷ��� ���ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ���� ������ �Է� : xx
// ���� : xxxxx.xx
// �ѷ� : xxxxx.xx
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test012{

	public static void main(String[] args) throws IOException {
	
		// BufferedReader Ŭ���� �ν��Ͻ� ���� �� ��ǻ�� ��ü�� Ű���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �ֿ� ���� ����
		int r;		//-- ������
		double a, b;		//- ����, �ѷ�

		// ���� �� ó��
		// �� ����ڿ��� �ȳ� �޼��� ���
		System.out.print("���� ������ �Է� : ");

		// �� ����ڰ� �Է��� ��(���ڿ�)�� �� br.readLine()
		//	  ������(������)���� ��ȯ�� �� �� Integer.parseInt()
		//    ������ ���� r�� ��Ƴ���
		r = Integer.parseInt(br.readLine());
						
		// �� ���� �� �ѷ� ����
		a = r * r * 3.141592;
		b = r *2 * 3.141592;
	
		// ��� ���
		//System.out.println(">> ���� : " + a);
		//System.out.println(">> �ѷ� : " + b);

		//System.out.printf(">> ���� : %f\n", a);
		//System.out.printf(">> �ѷ� : %f\n", b);	
		System.out.printf(">> ���� : %.2f\n", a);
		System.out.printf(">> �ѷ� : %.2f\n", b);
		//-- ��%f�� 10���� �Ǽ����� ��Ƴ��� �ɼǹ���
		//-- ��%.2f���� �Ҽ��� ���� ��°�ڸ����� ǥ���ϰڴٴ� �ǹ��� �߰� �ɼ�(�ݿø� ����)

	}
}

// ���� ���
/*
���� ������ �Է� : 120
>> ���� : 45238.9248
>> �ѷ� : 753.98208
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
���� ������ �Է� : 120
>> ���� : 45238.92
>> �ѷ� : 753.98
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/