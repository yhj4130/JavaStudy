/*========================================
  ���� Ŭ���� ��� ����
  - ��� ���迡 �ִ� Ŭ������ ���� ĳ����
  - �� ĳ����, �ٿ� ĳ����
========================================*/

// ���� Ŭ����, �θ� Ŭ����
class SuperTest {

	public int a = 10, b = 20;
	public void write() {

		System.out.println("���� Ŭ���� write() �޼ҵ�");
	}

	public int hap() {

		return a + b;
	}
}

// ���� Ŭ����, �ڽ� Ŭ����
class SubTest extends SuperTest {
	
	public int b = 100, c = 200;

	@Override
	public int hap() {

		return a + b + c;
	}

	public void print() {

		System.out.println("���� Ŭ���� print() �޼ҵ�");
	}
}

// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test111 {

	public static void main(String[] args) {

		// ���� Ŭ����(sub class) ��� �ν��Ͻ� ����
		SubTest ob1 = new SubTest();
		System.out.println("ob1.b : " + ob1.b);
		//--==>> ob1.b : 100
		
		//SubTest ob2 = new SubTest();

		// �� �� ĳ����
		//SuperTest ob2;
		SuperTest ob2 = ob1;
		//-- ��SuperTest ob2 = (SuberTest)ob1;���� ������ �ڵ�

		System.out.println("ob2.b : " + ob2.b);
		//--==>> ob2.b : 20
		//-- ������ ��ü���� ���� �Ҵ�ǹǷ�
		//   ���� b�� ob2�� �����̴�.

		System.out.println("��    : " + ob2.hap());
		//--==>> ��    : 310
		//-- hap() �޼ҵ�� �������̵�(Overriding) �Ǿ� �ְ�
		//   ob2�� ob1�� ��ĳ������ ������ ��ü�̹Ƿ�
		//   ob1�� �����Ǵ� �������� �̹� ���� Ŭ������ �޼ҵ�� ������ �Ǿ���
		//   ��SuperTest���� hap() �޼ҵ带 ȣ���ϴ� ���� �ƴ϶�
		//   ��SubTest������ �������� hap() �޼ҵ带 ȣ���ϰ� �ȴ�.
		//   �� , �޼ҵ�� ��ĳ������ �Ǵ���
		//   ������(�����)�� �̻� ������ ������� �ǵ��� �� ����.

		ob2.write();
		//--==>> ���� Ŭ���� write() �޼ҵ�
		
		//ob2.print();
		//--==>> ���� �߻� �� �ٿ� ĳ���� �ʿ�

		// �� �ٿ� ĳ����
		((SubTest)ob2).print();
		//--==>> ���� Ŭ���� print() �޼ҵ�

		// �� �߰� ���� --------------------------------------
		// �ٿ� ĳ���� ���� ����
	}
}