/*==========================================
  ���� ���� �帧�� ��Ʈ�� (���) ����
  - �ݺ��� (while��) �ǽ�
==========================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ �Ҽ����� �ƴ����� �����Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ������ ���� �Է� : 10
// 10 �� �Ҽ� �ƴ�

// ������ ���� �Է� : 11
// 11 �� �Ҽ� �ƴ�

// �� �Ҽ� : 1 �Ǵ� �ڱ��ڽ��� �� �̿��� � ���ε� ���� �� ���� ��.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test050 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �ֿ� ���� ���� �� �ʱ�ȭ
		int a;			//-- ����� �Է°��� ���� ����
		
		// ���� �� ó��
		System.out.print("������ ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		int n = 1;		//-- ������� �Է°��� �������
						//   ������ ������ ������ ����(1�� ���� ����)
		
		while(n <= a) {
			n++;											// 1���� 1�� Ŀ��

			if(a == 1) {
				System.out.println(a + "�� �Ҽ� �ƴ�");		// 1�� �Է� ���� ���
				break;
			}
			if(a == n) {
				System.out.println(a + "�� �Ҽ�");			// �Է��� ���� n���� ���� ���
				break;
			}
			if(a%n == 0) {
				System.out.println(a + "�� �Ҽ� �ƴ�");		// while���� ���ư��鼭 �������� 0�� ���� ���
				break;
			}
		}

		/*
		int n = 2;

		boolean flag = true;		//-- �Ҽ��̴�. (check)
		
		while (n<a) {
			if(a%n == 0) {
				flag = false;		//-- �Ҽ��� �ƴϴ�.
				break;
			}

			n++;
		}

		// ��� ���(��� ���� �����ؾ� �� �߰� Ȯ�� �� 1���� ���ο� ���� Ȯ��)
		// �Ҽ��̴� && 1�� �ƴϴ�.
		// �� �������� ������� �Ҽ��̴�.
		// �׷��� ������ 
		// �� �������� ������� �Ҽ��� �ƴϴ�.

		if (flag == true && num!=1) 
			System.out.printf("%d �� �Ҽ�\n", a);
		else 
			System.out.printf("%d �� �Ҽ��� �ƴ�\n", a);
		*/
	
		
	}
}

// ���� ���
/*
������ ���� �Է� : 10
10�� �Ҽ� �ƴ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
/*
������ ���� �Է� : 11
11�� �Ҽ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/