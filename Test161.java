/*===================================
  ���� �÷��� (Collection) ����
===================================*/

// ����Ʈ���� ������ �����͸� �־ ������.

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

class Demo1
{
	// ��ü ��� �޼ҵ�
	public void printList(List<String> lists) {

		System.out.println("\nLists ----------------------------------------");
		for(String s: lists)
			System.out.print(s + " ");
		System.out.println();
	}

	// ���� ��� �޼ҵ�
	public void printReverseList(List<String> lists) {

		System.out.println("\nReversed Lists ---------------");

		ListIterator<String> it = lists.listIterator(lists.size());
		while (it.hasPrevious())
		{
			String s = it.previous();
			System.out.print(s + " ");
		}
		System.out.println();
	}
	
	// �����ϴ� ���ڿ� �˻� �޼ҵ�
	public void searchList(List<String> lists, String searchValue) {
		
		Iterator<String> it = lists.iterator();
		System.out.println("\n��" + searchValue + "���� �����ϴ� ���ڿ� -----------");
		while (it.hasNext())
		{
			String s = it.next();
			// ��s.startsWith(searchValue)��
			// ���� �� ����(���ڿ�)�� searchValue �ΰ�?
			// �´ٸ� ����Ѵ�. �ƴ϶�� ������� �ʴ´�.
			if(s.startsWith(searchValue))
				System.out.print(s + " ");
		}
		System.out.println();
	}
	
	// �˻�(�����ε��� ~ ���ε���)
	List<String> searchList(List<String> lists, int start, int end) {
		
		/*
		List<String> list = new ArrayList<String>();

		for (int i=start; i<=end; i++)
		{
			list.add(lists.get(i));
		}

		return list;
		*/

		return lists.subList(start, end+1);
	}

	// ����(�����ε��� ~ ���ε���)
	void removeItems(List<String> lists, int start, int end) {
		
		/*
		for (int i=start; i<=end; i++)
		{
			lists.remove(lists.get(start));
		}
		*/

		lists.subList(start, end+1).clear();
	}
}

public class Test161 {

	public static void main(String[] args) {

		String[] data = {"�츮����", "���ѹα�", "�츮�Ǽ�", "��������", "������Ʈ"};
		
		Demo1 demo = new Demo1();

		Vector<String> v = new Vector<String>();
		ArrayList<String> list = new ArrayList<String>();
		LinkedList<String> link = new LinkedList<String>();

		/*
		�� ArrayList �� ���Ͽ� LinkedList �� �����
		   - ����
		     �� �ڷ��� ���԰� ������ �����ϴ�.
			 �� ����Ʈ ������ �ڷ��� �̵��� �ʿ����� �ʴ�.
			 �� ��� �� ��� ����� ������ �����ϴ�.
			 �� �������� ��� ����� �Ҵ��� �ʿ����� �ʴ�.
		   - ����
		     �� �������� ������� ���� ���� ������ ���� �ִ�.
			 �� �˰����� �����ϴ�.
			 �� Ư�� �ڷ��� Ž�� �ð��� ���� �ҿ�ȴ�.
		*/ 

		for(String s : data) {
			v.add(s);
			list.add(s);
			link.add(s);
		}
		
		// �⺻ ��ü ���
		demo.printList(v);
		demo.printList(list);
		demo.printList(link);
		
		// ���� ��ü ���
		demo.printReverseList(v);
		demo.printReverseList(list);
		demo.printReverseList(link);

		demo.searchList(v, "��");
		demo.searchList(list, "����");
		demo.searchList(link, "����");
		//--==>> ���롻�� �����ϴ� ���ڿ� -----------
		//		 ���ѹα� �������� ������Ʈ

		//		 ���������� �����ϴ� ���ڿ� -----------
		//		 ������Ʈ

		//		 �����ѡ��� �����ϴ� ���ڿ� -----------
		//		 ���ѹα� ��������

		List<String> sub = demo.searchList(list, 1, 3);
		demo.printList(sub);
		//--==>> Lists ----------------------------------------
		//		 ���ѹα� �츮�Ǽ� ��������

		demo.removeItems(list, 1, 3);
		demo.printList(list);
		//--==>> Lists ----------------------------------------
		//		 �츮���� ������Ʈ
	}
}