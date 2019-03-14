/*===================================
  ���� �÷��� (Collection) ����
===================================*/

/*
�� Enumeration �� Iterator �������̽�

   Collection Framework ����
   Enumeration �� Iterator ��� �������̽��� �ִ�.
   �������� �ǹ̷δ� �ݺ�, ��ȯ �̶�� �ǹ̸� ������ ������
   � ��ü���� ������ ���� ��,
   �� ��ü���� � ������ ���� �ϳ��� �����Ͽ� ����ϱ� ����
   �������̽���� �� �� �ִ�.

   - java.util.Enumeration<E> �������̽�
     : �� �������̽��� ���� �� ���� �޼ҵ常�� �����Ͽ�
	   ��hasMoreElements()�� �޼ҵ带 ����
	   �������̽� �ȿ� ���� ��Ұ� �ִ����� ���� ���Ǹ� �Ѵ�.
	   ���� true �� ��ȯ�Ǿ��ٸ� ���� �ε����� ��Ұ� �����Ѵٴ� �ǹ��̸�
	   ��nextElement()�� �޼ҵ�� ���� ��Ҹ� ������ ����ϸ� �Ǵ� ���̴�.

	 ex) // v ��� ���� �ڷᱸ���� ����� ��� ��� ���
	     for (Enumeration e = v.elements(); e.hasMoreElements(); )
		 {
			 System.out.println(e.nextElement());
		 }


   - java.util.Iterator<E> �������̽�
     : Enumeration ���� �������� ���� ��remove()�� �޼ҵ尡 �߰��� �� ���̴�.
	   Iterator �� ������ �ִ� ��hasNext()���� ��next()�� �޼ҵ��
	   �̸��� �ణ �ٸ� �� Enumeration �������̽��� ������ �ִ� 
	   ��hasMoreElements()���� ��nextElement()����
	   ��Ȯ�� ��ġ�ϴ� ����� �����Ѵ�.
	   Enumeration ��� Iterator �� JDK 1.2���� �߰��Ͽ� ����ϴ� ������
	   Enumeration �������̽��� ���� ������ ��Ҹ� ������ ����� ���� ������
	   �̸� �����ϱ� ���� ���� ���� Iterator �������̽��̴�.
*/

import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;

public class Test159 {

	public static void main(String[] args) {
	
		// ���� �ڷᱸ�� �ν��Ͻ� ����
		Vector<String> v = new Vector<String>();

		// ���� �ڷᱸ�� v �� ��� �߰�
		v.add("Java");
		v.add("Oracle");
		v.add("Jsp");
		v.add("Servlet");
		v.add("Spring");

		// �� Enumeration
		Enumeration<String> e = v.elements();
		while (e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		//--==>> Java
		//		 Oracle
		//		 Jsp
		//		 Servlet
		//		 Spring

		System.out.println("--------------------------");

		// �� Iterator
		Iterator<String> it = v.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		//--==>> Java
		//		 Oracle
		//		 Jsp
		//		 Servlet
		//		 Spring
	}
}