/*==================================
  ���� �ڹ��� ���� �� Ư¡ ����
  - ������ �ڷ���
  - Ű���� �� �ĺ���
==================================*/

public class Test005 {

	public static void main(String[] args){
		
		// ���� ���� �� �ʱ�ȭ(�޸𸮿� �� �Ҵ�)
		int a = 10, b = 5;

		// ���� ����
		int c,d;

		// ���� �� ó��
		c = a + b;	//-- a + b �� ������� c�� �����϶�.
		d = a - b;	//-- a - b �� ������� d�� �����϶�.

		// ��� ���
		System.out.println(a + " + " + b + " = " + c);
		//				 ����+���ڿ�+����+���ڿ�+����
		//-- �ڹٿ����� ���� �ٸ� �ڷ����� �����͵鳢����
		//   ��+�������� �����ϴ�.
		//	 �ٸ� �ڷ����� ���ڿ��� ��+������ ����� ���ڿ�.
		//   ��, ���ڿ� ���� �����ڷν� ��+��
		//-->> 10 + 5 = 15

		//���� ��ɿ� �޼ҵ� �� ���� �ɼ�(������ �ɼ�)
		// printf() / format()
		// JDK 1.5���� ��� ����.
		
		//System.out.printf("�� + �� = ��");
		//System.out.printf("�� + �� = ��", 10, 20, 30);
		//System.out.printf("�� + �� = ��", 'A', 20, 30);
		
		// ��%d���� 10���� ������ ��¼��� �ɼ�
		System.out.printf("%d + %d = %d\n", a, b, c);
		//--==>> 10 + 5 = 15
		//-- ��\n�� ����

		System.out.printf("%d + %d = %d%n", a, b, c);
		//--==>> 10 + 5 = 15
		//-- ��%n�� ����
	}
}

// ���� ���
/*
10 + 5 = 15
10 + 5 = 15
10 + 5 = 15
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/