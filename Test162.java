/*===================================
  ���� �÷��� (Collection) ����
===================================*/

// Set �� HashSet, TreeSet
// - ���� ����
// - ���� ������� �ʴ� ����(�⺻)

/*
�� HashSet<E> Ŭ����

   java.util.HashSet<E> Ŭ������
   Set �������̽��� �����ϴ� Ŭ������
   ������ ������ �ƴ϶� ������ �������� �����ؾ� �ϴ� �ڷᱸ�� �̴�.
   �̷� ���� �������� �ֿ��� ������� �ʴ´�.
   ����, ����ȭ�� �������� �ʴ´�.
*/

import java.util.Set;
import java.util.HashSet;

public class Test162 {

	public static void main(String[] args) {

		// HashSet �ڷᱸ�� �ν��Ͻ� ����
		Set<String> dog = new HashSet<String>();

		// dog ��� HashSet �ڷᱸ���� ��� �߰�
		dog.add("�ùٰ�");
		dog.add("���޶�Ͼ�");
		dog.add("��Ƽ��");
		dog.add("�����ڱ�");
		

		System.out.print("���� ������ Set : ");
		for(String str : dog)
			System.out.print(str + " ");
		System.out.println();
		//--==>> ���� ������ Set : ���޶�Ͼ� �ùٰ� ��Ƽ�� �����ڱ�
		//-- ������ �ǹ� ���� �ڷᱸ���̱� ������
		//   ������ �Է� ���� �� �ڷᱸ���� ��� �ݳ� ������
		//   ������� �����Ǿ� �ִ� ���� Ȯ��

		// ������(���) �߰�
		dog.add("�����ݸ�");
		dog.add("������");
		dog.add("������");
		dog.add("������");
		dog.add("������");
		dog.add("������");
		dog.add("������");		// �� �ߺ� �����͸� �߰��Ѵٰ� �ؼ�
		dog.add("������");		//    ������ �߻��ϴ� ���� �ƴϴ�.
		dog.add("������");
		dog.add("������");
		dog.add("�V�갳");
		dog.add("�V�갳");
		dog.add("�V�갳");
		dog.add("�V�갳");
		dog.add("�V�갳");
		dog.add("�V�갳");
		dog.add("�V�갳");
		
		System.out.print("�߰� �� ������ Set : ");
		for(String str : dog)
			System.out.print(str + " ");
		System.out.println();
		//--==>> �߰� �� ������ Set : ������ �V�갳 ���޶�Ͼ� �ùٰ� ��Ƽ�� �����ڱ� �����ݸ�

		// �� ������ �߰��Ǵ� ������ ������� ����� �����Ǿ� ������
		//    ���� �����Ͱ� ���� �� �ݺ��Ǿ� �߰��� ���
		//    �ϳ��� ��ȿ�� �����ͷ� �����Ǿ� �ִ� ���� Ȯ���� �� �ִ�.
		//    (�ƹ��� �߰��ص� �� ���� ��µ�)
	}
}