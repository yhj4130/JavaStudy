/*=======================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Wrapper Ŭ����
========================================*/

/*
�� Wrapper Ŭ����

   1.�ڹٿ����� ��� ���ؿ��� �����ϴ� �⺻�� �����͸� ������
	 �������� Ŭ������ �����Ͽ� ��ü ������ ó���Ѵ�.
	 ���� �ڹٿ����� �̷��� �⺻�� �����͸�
	 ��ü ������ ó���� �� �ֵ��� Ŭ������ ������ �� �ۿ� ���µ�
	 �̷��� Ŭ������ ������ Wrapper Ŭ������ �Ѵ�.

   2.�⺻ �ڷ�����
	 byte,short,int,long,double,char,boolean ���� �����ϴ�
	 Byte,Short,Intger,Long,Float,Dobule,Character,Boolean��
	 Wrapper Ŭ���� ��
	 ū ���ڵ��� �ٷ�� ����
	 java.math.bigInteger�� java.math.BigDecimal Ŭ������ �����Ѵ�.

	 Wrapper Ŭ������ java.lang ��Ű���� ���ԵǾ� �����Ƿ�
	 ������ import ���� ���� �ٷ� ����ϴ� ���� �����ϸ�
	 �⺻���� ���������� Wrapper Ŭ������ ���� �޼ҵ带 ����
	 �� ��ȯ�� �����ϰ� ���� �񱳿� ���� ���굵 �����ϴ�.

	 ex) java.lang.Integer Ŭ����
	     int �⺻ �ڷ����� Wrapper Ŭ������
		 ������ �ٷ�µ� �ʿ��� ����� �޼ҵ�, ���� ��ȯ � �ʿ���
		 �޼ҵ� ���� �����ϰ� �ִ�.

		 static int parseInt(String s)
		 :���ڿ� �������� ����� ���ڸ� ���� ���·� ��ȯ�Ѵ�.
		
		 byte byteValue(), int intValue(),
		 short shortValue(), long longValue(),
		 float floatValue(), double doubleValue()
		 :�ش� �⺻ �ڷ������� �� ��ȯ�� ���� ��ȯ�Ѵ�.

�� ���� �ڽ�(Auto-Boxing)�� ���� ��ڽ�(Auto-Unboxing)

   �Ϲ������� ���۷��� ���� �⺻ �ڷ����� ȣȯ���� ������
   �� ��� �߻��ϴ� ���� �ذ��� ���� �ڹٿ����� Wrapper Ŭ������ �����ϰ� �Ǿ���.
   ������, JDK 1.5���� ���۷��� ���� �⺻ �ڷ�����
   ������ ���� �� ��ȯ�� �����ϰ� �Ǿ���.

   int a = 10, b;
   Integer ob;
   ob = a;
   // �⺻ �ڷ���(int)�� Integer ������ �ڵ� ��ȯ(���� �ڽ�)
   // �����δ� ��ob = new Intger(a);��

   b= ob;
   // Object(Integer)�� �⺻ �ڷ���(int)���� �ڵ� ��ȯ(���� ��ڽ�)
   // �����δ� ��b = ob.intValue();��

   �̴� JDK1.5���� �߰��� ���� �ڽ̰� ���� ��ڽ��̶��
   ������� ���� �������� ���̴�.
*/

public class Test125
{
	public static void main(String[] args)
	{
		int a = 10,b;
		Integer c;
		Object d;
		
		b = a; //-- int�� ������(�ڷ�) �� �� int�� ����
		c = new Integer(0);

		// �ط��۷��� �ڷ���(���� Ÿ��)�� �⺻ �ڷ���(�⺻ Ÿ��)�� ȣȯ���� �ʴ´�.
		//   JDK1.5 ���� ���۷��� ���� �⺻ �ڷ�����
		//   �ڵ����� �� ��ȯ�� �����ϰ� �Ǿ���.

		b = c;	//-- Intger�� ������(��ü) �� �� int�� ����(���� ��ڽ�)
		b = c.intValue();		// (��ڽ�)

		d = new Object();
		System.out.println("d.toString() : " + d.toString());
		//--==>> d.toString() : java.lang.Object@15db9742

		d = new Integer(10);		//-- �� ĳ����
		System.out.println("d.toString() : " + d.toString());
		//--==>>d.toString() : 10

		d = new Double(12.345);		//-- �� ĳ����
		System.out.println("d.toString() : "+d.toString());

		d = 10;
		System.out.println("d.toString() : " + d.toString());
		//--==>> d.toString() : 10

		d = 12.345;
		System.out.println("d.toString() : " + d.toString());
		//--==>> d.toString() : 12.34	
	}
}


// ���� ���
/*
d.toString() : java.lang.Object@15db9742
d.toString() : 10
d.toString() : 12.345
d.toString() : 10
d.toString() : 12.345
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
