/*===================================
  ���� �÷��� (Collection) ����
===================================*/

import java.util.Vector;
import java.util.Collections;

public class Test155 {

	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors = {"����", "���", "�ʷ�", "�Ķ�", "����", "����"};

	public static void main(String[] args) {

		// ���� �ڷᱸ�� ����
		Vector<String> v = new Vector<String>();

		// v ��� ���� �ڷᱸ���� colors ��� �߰�
		for (String color : colors)
			v.add(color);

		System.out.println("ù ��° ��� : " + v.firstElement());
		System.out.println("�� ��° ��� : " + v.get(1));
		System.out.println("������  ��� : " + v.lastElement());
		System.out.println("�����  ���� : " + v.size());
		System.out.println();
		//--==>> ù ��° ��� : ����
		//		 �� ��° ��� : ���
		//		 ������  ��� : ����
		//		 �����  ���� : 6

		// �� ù ��° ��Ҹ� ���Ͼ硻���� ���� �� set()
		v.set(0, "�Ͼ�");

		System.out.println("ù ��° ��� : " + v.firstElement());
		System.out.println("�� ��° ��� : " + v.get(1));
		System.out.println("�����  ���� : " + v.size());
		System.out.println();
		//--==>> ù ��° ��� : �Ͼ�
		//		 �� ��° ��� : ���
		//		 �����  ���� : 6
		
		// �� ù ��° ��ҿ� ����Ȳ�� �߰� �� insertElementAt()
		v.insertElementAt("��Ȳ", 0);

		System.out.println("ù ��° ��� : " + v.firstElement());
		System.out.println("�� ��° ��� : " + v.get(1));
		System.out.println("�����  ���� : " + v.size());
		System.out.println();
		//--==>> ù ��° ��� : ��Ȳ
		//		 �� ��° ��� : �Ͼ�
		//		 �����  ���� : 7

		// �� ��ü ���
		System.out.print("��ü ��� : ");
		for (String str : v)
			System.out.print(str + " ");
		System.out.println("\n");
		//--==>> ��ü ��� : ��Ȳ �Ͼ� ��� �ʷ� �Ķ� ���� ����

		// �� �������� ����
		Collections.sort(v);
		
		System.out.print("�������� ���� �� ��ü ��� : ");
		for (String str : v)
			System.out.print(str + " ");
		System.out.println("\n");
		//--==>> �������� ���� �� ��ü ��� : ��� ���� ���� ��Ȳ �ʷ� �Ķ� �Ͼ�

		// �� �˻�
		// Collections.binarySearch()
		// �˻� ��� ����.��, �������� ���ĵ� �ڷῡ���� ��밡��.
		// �˻� ����� �������� ���� ��� ������ ��ȯ�Ѵ�.
		int idxBlue = Collections.binarySearch(v, "�Ķ�");
		System.out.printf("�Ķ� : %d ��° �ε����� ��ġ�ϰ� �ִ�.\n", idxBlue);
		System.out.println();
		//--==>> �Ķ� : 5 ��° �ε����� ��ġ�ϰ� �ִ�.

		int idxNavi = Collections.binarySearch(v, "����");
		System.out.printf("���� : %d ��° �ε����� ��ġ�ϰ� �ִ�.\n", idxNavi);
		System.out.println();
		//--==>> ���� : -1 ��° �ε����� ��ġ�ϰ� �ִ�. �� �˻� ��� ����.

		// �� �������� ����
		Collections.sort(v, Collections.reverseOrder());

		System.out.print("�������� ���� �� ��ü ��� : ");
		for (String str : v)
			System.out.print(str + " ");
		System.out.println("\n");
		//--==>> �������� ���� �� ��ü ��� : �Ͼ� �Ķ� �ʷ� ��Ȳ ���� ���� ���

		idxBlue = Collections.binarySearch(v, "�Ķ�");
		System.out.printf("�Ķ� : %d ��° �ε����� ��ġ�ϰ� �ִ�.\n", idxBlue);
		System.out.println();
		//--==>> �Ķ� : -8 ��° �ε����� ��ġ�ϰ� �ִ�.

		idxBlue = Collections.binarySearch(v, "�Ķ�", Collections.reverseOrder());
		System.out.printf("�Ķ� : %d ��° �ε����� ��ġ�ϰ� �ִ�.\n", idxBlue);
		System.out.println();
		//--==>> �Ķ� : 1 ��° �ε����� ��ġ�ϰ� �ִ�.
	}	
}