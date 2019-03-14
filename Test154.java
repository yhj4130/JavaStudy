/*===================================
  ���� �÷��� (Collection) ����
===================================*/

// Vector v = new Vector();
//-- ����ִ� Vector �ڷᱸ�� ����

// Vector v = new Vector(8);
//-- 8���� �ʱ� elements �� ���� Vector �ڷᱸ�� ����
//   8���� ��� ä������ �Ǹ�(���ڶ�� �Ǹ�) �ڵ����� Ȯ��ȴ�.

// Vector v = new Vector(3, 5);
//-- 3���� �ʱ� elements �� ���� Vector �ڷᱸ�� ����
//   3���� ��� ä������ �Ǹ�(���ڶ�� �Ǹ�) 5�� ����(Ȯ��)�ȴ�.

// �� ���ʹ� ������ ��ҷμ� ������, �Ǽ���, ���ڿ� ����
//    ��Ƴ��� ���� �����ϴ�.
//	  �� ���� ��� �� ������ ������ Ȯ�� -- check

import java.util.Vector;
import java.util.Iterator;

// MyVector Ŭ���� ���� �� Vector Ŭ���� ���
class MyVector extends Vector<Object> {
	
	/*
	... ���� Vector ��� ���
	*/

	// ������
	MyVector() {
		
		// Vector(���� Ŭ����) ������ ȣ��
		super(1, 1);
		//-- ù ��° ���� : �־��� �뷮
		//   �� ��° ���� : ������
	}

	public void addInt(int i) {
		
		addElement(new Integer(i));
	}
	
	void addFloat(float f) {

		addElement(new Float(f));
	}

	void addString(String s) {

		addElement(s);
	}

	void addCharArray(char[] a) {

		addElement(a);
	}

	void write() {
		
		/*
		Iterator<Object> it = this.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		*/
		//--==>> 5
		//		 3.14
		//		 �ȳ��ϼ���
		//		 [C@15db9742
		
		// ���� ����� ��

		Object o;
		int length = size();

		System.out.println("���� ��� ���� : " + length);
		//--==>> ���� ��� ���� : 4

		for (int i=0; i<length; i++)
		{
			o = elementAt(i);

			// ��instanceof�� ������
			//-- ó���ؾ� �ϴ� ����� ��ü Ÿ�� Ȯ��

			if (o instanceof Integer)
			{
				System.out.println("������ : " + o);
			}
			else if (o instanceof Float)
			{
				System.out.println("�Ǽ��� : " + o);
			}
			else if (o  instanceof String)
			{
				System.out.println("���ڿ��� : " + o.toString());
			}
			else if (o instanceof char[])
			{
				System.out.println("���ڹ迭 : " + String.copyValueOf((char[])o));
				for (char ch : (char[])o)
				{
					System.out.print(ch);
				}
				System.out.println();
			}
			else
				System.out.println("Ÿ�� Ȯ�� �Ұ�");

			//--==>> ������ : 5
			//		 �Ǽ��� : 3.14
			//		 ���ڿ��� : �ȳ��ϼ���
			//		 ���ڹ迭 : study
			//		 study

		}
	}
}

public class Test154 {

	public static void main(String[] args) {

		// MyVector Ŭ���� �ν��Ͻ� ����
		MyVector v = new MyVector();

		// �ֿ� ���� ���� �� �ʱ�ȭ
		int digit = 5;
		float real = 3.14f;
		String s = new String("�ȳ��ϼ���");
		char[] letters = {'s', 't', 'u', 'd', 'y'};

		v.addInt(digit);			//-- ���� �ڷᱸ���� ���� ����
		v.addFloat(real);			//-- ���� �ڷᱸ���� �Ǽ� ����
		v.addString(s);				//-- ���� �ڷᱸ���� ���ڿ� ����
		v.addCharArray(letters);	//-- ���� �ڷᱸ���� ���� �迭 ����

		v.write();
	}
}


// ���� ���
/*
���� ��� ���� : 4
������ : 5
�Ǽ��� : 3.14
���ڿ��� : �ȳ��ϼ���
���ڹ迭 : study
study
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/