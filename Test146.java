/*====================================
  ���� ����(Exception) ó�� ����
====================================*/

// Test145�� ��

class Demo2
{
	// �ֿ� �Ӽ� ����
	private int value;
	
	// setter
	public void setValue(int value) throws Exception {
		
		if (value<=0)
			throw new Exception("value �� 0���� �۰ų� ���� �� �����ϴ�.");
			//-- ���ο� ���� �߻�

		this.value = value;
	}
	
	// getter
	public int getValue() {

		return value;
	}
}

public class Test146 {

	public static void main(String[] args) throws Exception {

		Demo2 ob = new Demo2();
		
		try
		{
			ob.setValue(-10);
			int result = ob.getValue();
			System.out.println(result);
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}
}


// ���� ���
/*
java.lang.Exception: value �� 0���� �۰ų� ���� �� �����ϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/