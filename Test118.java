/*===========================
  ���� Ŭ���� ��� ����
  - ��ø Ŭ����
===========================*/

class Test2 {

	static int a = 10;	// �������� ������� static����(Ŭ��������)
	int b = 20;			// �������� ������� instance����(�ν��Ͻ� ����)
	
	// �� ù ��° write() �޼ҵ�
	void write() {

		System.out.println("write() - ��");
		final int c = 30;	// �������� ���ȭ�Ⱥ���(���̺�������������)
		int d = 40;			// �������� ���̼��÷κ��Ҽ��ִº���

		// �� ���� c�� ���� d�� �� �� ��������������
		//    c���� final �����̱� ������
		//    �� ��° write() �޼ҵ忡�� ���� �����ϴ���
		//    ������ ������ ������� �� �ִ�.
		//    �ݸ鿡 d�� �� ���� ���÷� ������ �� �ִ� ��Ȳ�̹Ƿ�
		//    LocalTest Ŭ������ �ν��Ͻ� ���� ������
		//    ������� �� ���� ������ d�� �����ϴ� ���� ���ؾ� �Ѵ�.
		
		// �޼ҵ� �ȿ� �����ϴ� �Ǵٸ� Ŭ����(local class)
		class LocalTest	{

			// �� �� ��° write() �޼ҵ�
			void write() {

				System.out.println("write() - ��");
				System.out.println("a : " + a);
				System.out.println("b : " + b);
				System.out.println("c : " + c);
				//System.out.println("d : " + d);	//--==>> ������ ����
			}
		}

		d = 10;	//-- �ּ�ó���� ��� ������ ���� X
		
		// ù ��° write() �޼ҵ忡�� ������ 
		LocalTest ob1 = new LocalTest();
		ob1.write();	//-- �� ��° write() �޼ҵ� ȣ��
	}
}

// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test118 {

	public static void main(String[] args) {

		Test2 ob2 = new Test2();
		ob2.write();	//-- ù ��° write() �޼ҵ� ȣ��

	}
}


// ���� ���
/*
write() - ��
write() - ��
a : 10
b : 20
c : 30
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/