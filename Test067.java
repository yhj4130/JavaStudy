/*============================================
  ���� �޼ҵ� ���ȣ�� (��� �޼ҵ�) ����
  - return
============================================*/

public class Test067 {

	public static void main(String[] args) {

		showHi(3);
	}

	public static void showHi(int cnt) {
		
		System.out.println("Hi~!");
		
		// showHi(c--);		�״�� 3�� ��� showHi(3) �� showHi(--c) �� ����
		
		// showHi(--c);		1��ŭ �����ϴٰ� 0 -1 -2 �� ���

		if (cnt==1)			// 1���� �����ϱ� ���� �ڵ��Ǿ��� ���� �� ��ġ ����
			return;			// �޼ҵ� ����

		showHi(--cnt);
		
	}

}

// ���� ���
/*
Hi~!
Hi~!
Hi~!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/