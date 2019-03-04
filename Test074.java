/*=================================
  ���� Ŭ������ �ν��Ͻ� ����
  - Ŭ���� ���� �ǽ�
  - ������(Constructor)
=================================*/
/*
�� ������(Constructor)�� ����
  1.�޸� �Ҵ�
  2.�ʱ�ȭ

�� ������(Constructor)�� Ư¡
  1.�����ڴ� �޼ҵ�������, �Ϲ� �޼ҵ�ó�� ȣ��� �� ������,
   ��ȯ �ڷ����� ���� �� ����.(��void������ ���� �� ������ ���� ��ȯ�� ���� ����.)
  2.�����ڴ� Ŭ������ �̸��� ������ �̸��� ������ �Ѵ�.
   (��ҹ��� ��Ȯ�� ����)
  3.�����ڴ� ��ü�� �����ϴ� �������� ��new ������()���� ���·� ȣ��ȴ�.
   (�ν��Ͻ� ���� �� �� �� ���� ȣ��)
*/

class NumberTest
{
	int num; 

	// �� default ������
	//-- ������ �������� �ڵ����� �����Ǵ� �� �����ڴ�
	//   ����� ���� �����ڰ� ���� ���� ���� ��쿡�� ���������.

	/*
	NumberTest()
	{
		//�� ����ִ� ����
	}*/
	
	// ����� ���� ������
	NumberTest()
	{
		num = 10;
		System.out.println("����� ���� ������ ȣ��");
	}

	int getNum()
	{
		return num;
	}
}

// �� ��� Ŭ�������� �����ڰ� �����Ѵ�.
//    (����� ���� �����ڸ� ���� ������ ���� ���...
//    ������ �������� default �����ڰ� �ڵ����� ���Եȴ�.)

public class Test074
{
	public static void main(String[] args)
	{
		//NumberTestŬ���� ��� �ν��Ͻ� ����
		NumberTest nt1 = new NumberTest();
		//-- �ν��Ͻ��� �����Ǵ� ��������
		//   �̿� ���ÿ� ������ ȣ���� �̷������.
		
		/*
		NumberTest nt1 = new NumberTest
								+
							 NumberTest();
		*/
		System.out.println(nt1.getNum());
		//--==>> ����� ���� ������ ȣ��
		//		 10

		nt1.num = 100;
		System.out.println(nt1.getNum());
		//--==>> 100

		System.out.println("------------------------");

		// �� �ٸ� ��ü
		NumberTest nt2 = new NumberTest();

		System.out.println(nt2.getNum());

		NumberTest nt3 = new NumberTest();
		NumberTest nt4 = new NumberTest();
		NumberTest nt5 = new NumberTest();
	}
}
