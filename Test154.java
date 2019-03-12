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
	
	
}

import java.util.Vector;

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