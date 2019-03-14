/*===================================
  ���� �÷��� (Collection) ����
===================================*/

// Map - HashTable, HashMap
// - java.util.Map �������̽��� Ű(key)�� ��(value)�� ����(mapping)�ϸ�,
//   ������ Ű�� ����� �� ���� �����ؾ� �ϸ�,
//   �� Ű�� �� ���� ������ �����ؾ� �Ѵ�.
//   ��, �ϳ��� Ű ���� �����ϴ� �ϳ��� ���� ���� �ڷᱸ���̴�.

/*
�� Hashtable<K, V> Ŭ����

   - �ؽ����̺� ������ ��ü �𵨸�ȭ �� Ŭ������
     �˻��� �����ϱ� ������ ��� �󵵰� ���� �� ���Ѵ�.

   - �ؽ����̺��̶� Ű(key)�� �׿� �����ϴ� ������(value)��
     ���е� ������ �����̴�.

   - �����͸� �����ϰ�, �˻��ϱ� ���ؼ� Ű�� �����ϸ�,
     �� ���������� Ű ���� �ο��ϸ� �ش� �����Ͱ� ��ȯ�ȴ�.

   - ����, Hashtable Ŭ������ Key �Ǵ� Value �� ������ null �� ������� �ʴ´�.
*/

import java.util.Hashtable;

public class Test164 {
	
	private static final String[] names = {"������", "������", "�̿���", "�輺��", "���ȯ", "�ӳ���"};

	private static final String[] tels 
		= {"010-9118-5974", "010-4780-3733", "010-9170-3896", "010-1111-1111", "010-2317-7455", "010-2684-4905"};
		

	public static void main(String[] args) {

		// Hashtable �ڷᱸ�� �ν��Ͻ� ����
		Hashtable<String, String> ht = new Hashtable<String, String>();

		// ht ��� Hashtable �ڷᱸ���� �迭(names, tels)�� ����ִ�
		// �����͸� ��ҷ� �߰��ϱ�(��Ƴ���) �� put(k, v)
		//ex) ht.put("ȫ�浿","010-1111-1111");
		//            ------   -------------
		//             key         value

		for (int i=0; i<names.length; i++)
		{
			ht.put(names[i], tels[i]);
		}

		// ht ��� �ؽ����̺��� ��� �� ���� key �� �̿��Ͽ� �˻�
		String findName1 = "������";
		//String findName1 = "������";
		String str = ht.get(findName1);		// get(Ű) �� ��
		if(str != null) {

			System.out.println(findName1 + " ��ȭ��ȣ : " + str);
		}
		System.out.println();
		//--==>> ������ ��ȭ��ȣ : 010-4780-3733
		
		// ht ��� �ؽ����̺� �ڷᱸ���� key �� �����ϴ����� ���� Ȯ��
		// �� containsKey()
		String findName2 = "������";
		if (ht.containsKey(findName2))
			System.out.println(findName2 + " ���̹��� �����մϴ�.");
		else
			System.out.println(findName2 + " �����Ͱ� �������� �ʽ��ϴ�");
		System.out.println();
		//--==>> ������ �����Ͱ� �������� �ʽ��ϴ�

		String findName3 = "���ȯ";
		if (ht.containsKey(findName3))
			System.out.println(findName3 + " �����Ͱ� �����մϴ�.");
		else 
			System.out.println(findName3 + " �����Ͱ� �������� �ʽ��ϴ�.");
		System.out.println();
		//--==>> ���ȯ �����Ͱ� �����մϴ�.

		// ht ��� �ؽ����̺� �ڷᱸ���� value �� �����ϴ����� ���� Ȯ��
		// �� contains()
		String findTel1 = "010-9170-3896";
		if (ht.contains(findTel1))
			System.out.println(findTel1 + " �����Ͱ� �����մϴ�.");
		else
			System.out.println(findTel1 + " �����Ͱ� �������� �ʽ��ϴ�.");
		System.out.println();
		//--==>> 010-9170-3896 �����Ͱ� �����մϴ�.

		String findTel2 = "010-1234-1234";
		if (ht.contains(findTel2))
			System.out.println(findTel2 + " �����Ͱ� �����մϴ�.");
		else
			System.out.println(findTel2 + " �����Ͱ� �������� �ʽ��ϴ�.");
		System.out.println();
		//--==>> 010-1234-1234 �����Ͱ� �������� �ʽ��ϴ�.

		// ht ��� �ؽ����̺� �ڷᱸ������
		// �������ء� ������ ����
		ht.remove("������");

		// ���� (�� remove()) ���� key �� �����ϴ��� Ȯ��
		if(ht.containsKey("������"))
			System.out.println("�������� �����մϴ�.");
		else
			System.out.println("�������� �������� �ʽ��ϴ�.");
		System.out.println();
		//--==>> �������� �������� �ʽ��ϴ�.

		// ���� (�� remove()) ���� value �� �����ϴ��� Ȯ��
		if(ht.contains("010-9118-5974"))
			System.out.println("010-9118-5974 �����մϴ�.");
		else
			System.out.println("010-9118-5974 �������� �ʽ��ϴ�.");
		System.out.println();
		//--==>> 010-9118-5974 �������� �ʽ��ϴ�.

		// null �Է� �õ�

		//ht.put(null, null);				//-- key, value ��� null	�� (��)
		//ht.put("������", null);			//-- value �� null			�� (��)
		//ht.put(null, "010-2222-2222");	//-- key �� null			�� (��)
		
		// �ߺ��� key �� �Է�
		ht.put("������", "010-9999-9999");	

		System.out.println(ht.get("������"));
		System.out.println();
		//--==>> 010-9999-9999
		//-- ���� "010-4780-3733" ���� "010-9999-9999"�� ����Ǿ����� Ȯ��
		//   (�� �����)

		// �ߺ��� value �� �Է�
		ht.put("�̱��", "010-9170-3896");

		System.out.println(ht.get("�̱��"));
		System.out.println(ht.get("�̿���"));
		System.out.println();
		//--==>> 010-9170-3896
		//		 010-9170-3896
		//-- ���� �����Ϳ� �ƹ��� ������ ��ġ�� ������ Ȯ��
	}		
}