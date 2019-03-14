/*===================================
  ���� �÷��� (Collection) ����
===================================*/

// List �� Vector, ArrayList
// - ���� ����
// - �迭�� ����
// - �ߺ� ���

/*
�� ArrayList Ŭ����
 
   - ArrayList �� Vector Ŭ������
     List �� ũ�� ������ ������ �迭�� ������ ������
	 �������� Vector Ŭ������ ��ü�� �⺻������ ����ȭ������,
	 ArrayList �� �׷��� �ʴٴ� ���̴�.(�񵿱�ȭ)

   - �񵿱�ȭ �÷����� ����ȭ�� �÷��Ǻ��� �� ���� ������ �����ϸ�
     ��������� �÷����� �������� �ʴ� ���α׷�������
	 �Ϲ������� ArrayList �� Vector ���� �� ��ȣ�ϸ�,
	 ArrayList �� ����ȭ�� ������� ���� Vector ó�� ���������ν�
	 ������ ����ȭ�� ������ �δ��� ���� �ʱ� ������
	 Vector ���� �� ������ ����ȴ�.

   - null �� ������ ��� ��Ҹ� ����ϸ�
     List �������̽��� �����ϴ� �� �ܿ� ����Ʈ�� �ݳ��ϱ� ����
	 ���������� ���Ǵ� �迭�� ����� �����ϴ� �޼ҵ带 �����Ѵ�.
*/

import java.util.ArrayList;
import java.util.Vector;
import java.util.List;
import java.util.ListIterator;


public class Test160 {

	public static void main(String[] args) {

		// ArrayList �ڷᱸ�� �ν��Ͻ� ����
		//ArrayList<String> list = new ArrayList<String>();
		//Vector<String> list = new Vector<String>();
		//List<String> list = new Vector<String>();
		List<String> list1 = new ArrayList<String>();

		// list1 �� ��� �߰� �� add()
		list1.add("�����");
		list1.add("�");
		list1.add("�ٸ��ٰ�����Ѿ󱼵�");
		
		// ArrayList �ڷᱸ�� �ν��Ͻ� ����
		//-- �̹� ������ �ν��Ͻ� ���� �������� list1 �� �����ڿ��� �Ѱ���
		List<String> list2 = new ArrayList<String>(list1);	// check

		// list2 �� ��� �߰� �� add()
		list2.add("ĸƾ����");

		// ArrayList �ڷᱸ�� �ν��Ͻ� ����
		List<String> list3 = new ArrayList<String>();

		// list3 �� list2 �� ��ü ��� �߰� �� addAll()
		list3.addAll(list2);

		// "�" �տ� "��Ʈ�ǰ��ͽ���" �߰� 
		//-- �� "�" ã�� �� indexOf() �� ��ġ�� �ε��� ��ȯ
		int n = list3.indexOf("�");
		//-- �� "�" ã�� �ε��� ��ġ�� "��Ʈ�ǰ��ͽ���" ����
		list3.add(n, "��Ʈ�ǰ��ͽ���");

		
		// ��� �� ���� ������ Ȯ��
		System.out.println("=====================================================================");
		System.out.println(list1);
		//--==>> [�����, �, �ٸ��ٰ�����Ѿ󱼵�]
		System.out.println(list2);
		//--==>> [�����, �, �ٸ��ٰ�����Ѿ󱼵�, ĸƾ����]
		System.out.println(list3);
		//--==>> [�����, ��Ʈ�ǰ��ͽ���, �, �ٸ��ٰ�����Ѿ󱼵�, ĸƾ����]
		System.out.println();

		// ��� �� listIterator() �޼ҵ带 ���� ���
		System.out.println("=====================================================================");
		ListIterator<String> li = list3.listIterator();
		while (li.hasNext())
			System.out.print(li.next() + " ");
		System.out.println("\n");
		//--==>> ����� ��Ʈ�ǰ��ͽ��� � �ٸ��ٰ�����Ѿ󱼵� ĸƾ����

		// ��� �� �������� ���
		System.out.println("=====================================================================");
		while(li.hasPrevious())
			System.out.print(li.previous() + " ");
		System.out.println("\n");
		//--==>> ĸƾ���� �ٸ��ٰ�����Ѿ󱼵� � ��Ʈ�ǰ��ͽ��� �����
	}
}