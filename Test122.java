/*=======================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
=======================================*/

// �� Test121 Ŭ������ ��

//import java.lang.*;

public class Test122 {	// extends Object

	/*
	Object ����� ���
	*/
	
	// Object Ŭ�����κ��� �������� toString() �޼ҵ� ������
	@Override
	public String toString() {
		
		return "�������� toString()";
	}

	public static void main(String[] args) {

		Test122 ob = new Test122();

		System.out.println("ob.toString() : " + ob.toString());
		//--==>> ob.toString() : �������� toString()

		System.out.println("ob            : " + ob);
		//--==>> ob            : �������� toString()
	}
}