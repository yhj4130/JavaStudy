/*====================================
  ���� ����(Exception) ó�� ����
  - ���� �ٽ� ������
====================================*/

public class Test147 {

	public static void main(String[] args) throws Exception {
		Test147 ob = new Test147();
		
		try
		{
			int a = ob.getValue(-2);
		    System.out.println("a : " + a);
		}
		catch (Exception e)
		{
			System.out.println("printStackTrace...(main)");		
			e.printStackTrace();
		}
		
	}

	public int getData(int data) throws Exception {

		if (data<0)
			throw new Exception("data�� 0���� �۽��ϴ�.");	// �� ���� �߻�
		
		return data+10;
	}
	
	// check
	public int getValue(int value) throws Exception {
		
		int a = 0;

		try
		{
			a = getData(-2);	// �� ���� �߻�
		}
		catch (Exception e)		// �� ���� ��Ƴ���
		{
			// �� ��Ƴ� ���ܿ� ���� ó��
			System.out.println("printStackTrace...(getValue)");
			e.printStackTrace();	
			
			// �� ��Ƴ� ���ܸ� �ٽ� ������
			throw e;
			//-- �ּ� ó�� �� (��, ��Ƴ� ���ܸ� �ٽ� ������ ���� ���)
			//   main() �޼ҵ��� try-catch �� ������� �ʰ� �ȴ�.
		}

		return a;
	}
}


// ���� ���
/*
printStackTrace...(getValue)
java.lang.Exception: data�� 0���� �۽��ϴ�.
        at Test147.getData(Test147.java:27)
        at Test147.getValue(Test147.java:39)
        at Test147.main(Test147.java:13)
printStackTrace...(main)
java.lang.Exception: data�� 0���� �۽��ϴ�.
        at Test147.getData(Test147.java:27)
        at Test147.getValue(Test147.java:39)
        at Test147.main(Test147.java:13)
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/