/*===========================
  ���� Ŭ���� ��� ����
  - ��ø Ŭ����
===========================*/

/*
�� Anonymous Ŭ����(�͸��� Ŭ����, ���� Ŭ����)

   - awt �� �ȵ���̵� �̺�Ʈ ó������ �Ϲ������� ���
   - ���� Ŭ���� �޼ҵ带 �ϳ� ���� �������� �ʿ伺�� ���� �� ���
   - Ŭ������ ��ü�� �ʿ��ϸ� �� �ٽ� Ŭ������ �����ؾ� �ϴ�
     ���ŷο� ������ �͸��� Ŭ������ �����Ͽ� ó���Ѵ�.


�� ���� �� ����
  
   new ����Ŭ�����ǻ�����() 
   {
	   �������������� �ڷ��� �޼ҵ�()
	   {
		   //...
	   }
	};	�� �ݵ�� �����ݷ� �ʿ�


�� �������� ���� ���� ��(Ž���� �󿡼�)
   ��Ŭ������$1.class�� ������ �����Ǹ�
   $ ���� ���ڰ� ���������� �ο��ȴ�.
*/

//import java.lang.*;

class Test3 {
	
	/**/

	public	Object getString() {

		//return _____; �� Object

		//		��

		//Object ob = new Object();
		//return ob;

		//		��

		//return new Object();

		//		��

		//return new Object(){�߾��߾�};

		//		��

		return new Object() {
			
			@Override
			public String toString() {

				return "�͸��� Ŭ����";
			}
		};		// �� �����ݷ�(�� �ۼ� �� ���� �߻�)
	}
}

public class Test120 {
	public static void main(String[] args) {
		
		Test3 ob1 = new Test3();
		Test3 ob2 = new Test3();

		System.out.println(ob1.toString());
		//--==>> Test3@15db9742

		System.out.println(ob2.getString());
		//--==>> �͸��� Ŭ����
	}
}