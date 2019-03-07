/*=====================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Wrapper Ŭ����
=======================================*/

import java.math.BigDecimal;

public class Test128
{
	public static void main(String[] args)
	{
		BigDecimal a = new BigDecimal("123456789.123456789");


		// movePointLeft() : �Ҽ����� �������� �̵�
		BigDecimal b = a.movePointLeft(3);
		System.out.println(b);
		//--==>> 123456.789123456789

		BigDecimal t1 = new BigDecimal("400.0");
		BigDecimal t2 = new BigDecimal("6.0");

		BigDecimal t3 = t1.divide(t2, 3);
		BigDecimal t4 = t1.divide(t2, 2);
		System.out.println("t3 : " + t3);
		System.out.println("t4 : " + t4);
		//--==> t3 : 66.6
		//	    t4 : 66.7

		// ������(��ü �Ӽ� Ȯ��, �ݿø� ���� �ʴ´�. �� ����)

		BigDecimal c = a.divide(b, BigDecimal.ROUND_DOWN);
		// �� BigDecimal c = a.divide(b, 1); �� ������ ����

		System.out.println(BigDecimal.ROUND_DOWN);		//--==>> 1
		System.out.println(c);
		
		//--==>> 1000.000000000

		// ��ȿ�ڸ� : �Ҽ��� ���� 5��° �ڸ�(�� ��° ���ڰ� 5)

		BigDecimal d = a.divide(b, 5 , BigDecimal.ROUND_DOWN);
		System.out.println(d);
		//--==>> 1000.00000
	}
}


// ���� ���
/*
123456.789123456789
t3 : 66.6
t4 : 66.7
1
1000.000000000
1000.00000
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/