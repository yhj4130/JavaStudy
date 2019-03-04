/*=======================================================
  ���� Ŭ������ �ν��Ͻ� ����
  - ������(Constructor)�� �ʱ�ȭ ��(Initialized Block) 
=======================================================*/


public class Test078 {
	
	int n;
	int m;

	//n = 10;		//-- ���� �߻�
	//m = 20;
	
	// ������(Constructor)
	Test078() {

		n = 100;
		m = 200;
		System.out.println("������ ����");
	}

	// �ʱ�ȭ ��(Initialized Block) 
	{			
		n = 10;
		m = 20;
		System.out.println("�ʱ�ȭ �� ����");
	}

	// ������(Constructor)
	Test078(int n, int m) {

		this.n = n;
		this.m = m;

		System.out.println("���� �ִ� ������ ����");
	}

	// ��� �޼ҵ� ����
	void write() {
		
		System.out.println("n : " + n + ", m : " + m);
	}

	public static void main(String[] args) {

		Test078 ob1 = new Test078();
		ob1.write();
		//-->> �ʱ�ȭ �� ����
		//	   ������ ����
		//	   n : 100, m : 200

		Test078 ob2 = new Test078(1234, 5678);
		ob2.write();
		//-->> �ʱ�ȭ �� ����
		//	   ���� �ִ� ������ ����
		//     n : 1234, m : 5678
	}
}


