/*===================================================
  ���� �ڹ� �⺻ ���α׷��� ����
  - �ڹ� �ҽ� �ڵ� �Է� �� ������ �ǽ�
  - println() �� print()
====================================================*/

public class Test002 {

	public static void main(String[] args){
		
		System.out.println("ù ��° ����...");
		System.out.println("�� ��° ����...\n");
		System.out.print("�� ��° ����...\n");
		System.out.print("�� ��° ����...\n\n\n");
		//-- ��println()�� �޼ҵ�� ��print()�� �޼ҵ��� ���̴�
		//	���� ��ŵ(�ٹٲ�, ����) ������ �ִ�.
		//	\n �� ���ڿ��� �����ϸ� ���� ��ŵ�� �����ϴ�.
		//	���� �� ����ϴ� �͵� �����ϴ�.
		
		System.out.println(7);
		System.out.println('7');
		System.out.println("7");

		System.out.println(7+7);
		System.out.println('7'+'7');
		System.out.println("7"+"7");
	}
}

// ���� ���
/*
ù ��° ����
�� ��° ����

�� ��° ����
�� ��° ����



7

7
14
110
77
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/ 