/*=====================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Wrapper Ŭ����
=======================================*/

public class Test129
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);			//-- boxing
		Integer i2 = new Integer(i);	//-- boxing
	

		System.out.println(b2);		//--==>> 3
		System.out.println(i2);		//--==>> 256

		print(b2);
		print(i2);

		byte b3 = b2.byteValue(); //-- unboxing
		int i3 = i2.intValue();	  //-- unboxing

		// check
		int i4 =  b2.byteValue();
		//byte b4 = i2.intValue();		//--==>> ���� �߻�
		byte b4 = i2.byteValue();

		System.out.println("b3 : "  + b3);
		System.out.println("i3 : "  + i3);

		System.out.println("i4 : "  + i4);
		System.out.println("b4 : "  + b4);
	}

	/*
	static void print(Byte b)
	{
		//....
	}
	static void print(Integer i)
	{
		//....
	}	
	*/
	
	// �� java.lang.Number Ŭ����(�߻�Ŭ����)
	//	  ��� Wrapper Ŭ�������� �θ� Ŭ����(���� Ŭ����, ���� Ŭ����)�̴�.
	//	  b2,i2 �ڷ����� Number n�� �Ѿ���鼭
	//	  �� ĳ������ �Ͼ�� �ȴ�.(Auto-Boxing ����)

	static void print(Number n)
	{
		System.out.println(n);
		System.out.println(n.intValue());
	}
}


// ���� ���
/*
3
256
3
3
256
256
b3 : 3
i3 : 256
i4 : 3
b4 : 0
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/