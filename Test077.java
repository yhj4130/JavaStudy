/*=================================
  ���� Ŭ������ �ν��Ͻ� ����
  - ������(Constructor)
=================================*/

public class Test077 {
		
	int val1;
	double val2;

	Test077() {

		val1 = 0;
		val2 = 0;
		System.out.println("�Ű����� ���� ������ ȣ��");
	}

	Test077(int x) {

		val1 = x;
		val2 = 0;
		System.out.println("int�� �Ű������� �Ѱܹ޴� ������ ȣ��");
	}

    Test077(double y) {
		val1 = 0;
		val2 = y;
		System.out.println("double�� �Ű������� �Ѱܹ޴� ������ ȣ��");
	}

	Test077(int x, double y) {
		val1 = x;
		val2 = y;
		System.out.println("int�� double�� �Ű������� �Ѱܹ޴� ������ ȣ��");
	}

	public static void main(String[] args) {

		Test077 ob1 = new Test077();
		Test077 ob2 = new Test077(4);
		Test077 ob3 = new Test077(4.0);
		Test077 ob4 = new Test077(4, 4.0);

		System.out.println(ob1.val1 + "," + ob1.val2);
		System.out.println(ob2.val1 + "," + ob2.val2);
		System.out.println(ob3.val1 + "," + ob3.val2);
		System.out.println(ob4.val1 + "," + ob4.val2);
	}
}

// ���� ���
/*
�Ű����� ���� ������ ȣ��
int�� �Ű������� �Ѱܹ޴� ������ ȣ��
double�� �Ű������� �Ѱܹ޴� ������ ȣ��
int�� double�� �Ű������� �Ѱܹ޴� ������ ȣ��
0,0.0
4,0.0
0,4.0
4,4.0
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/