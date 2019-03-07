/*===========================
  ���� Ŭ���� ��� ����
  - �������̽�(Interface)
===========================*/

// �� �ǽ� ����
//    ���� ó�� ���α׷��� �����Ѵ�.
//    ��, �������̽��� Ȱ���� �� �ֵ��� �Ѵ�.

// ���� ��)
// �ο��� �Է�(1~10) : 2
// 1��° �л��� �й� �̸� �Է�(���鱸��) : 1921004 �ۡۡ�
// ���� ���� ���� ���� �Է�   (���鱸��) : 90 100 85
// 2��° �л��� �й� �̸� �Է�(���鱸��) : 1921005 �ۡۡ�
// ���� ���� ���� ���� �Է�   (���鱸��) : 85 70 65

// 1921004 �ۡۡ�  90 100  85       275  91
//               ��  ��  �� 
// 1921005 �ۡۡ�  85  70  65      220  73
//               ��  ��  ��

// ����Ϸ��� �ƹ� Ű�� �����ʽÿ�...

import java.util.Scanner;

// �Ӽ��� �����ϴ� Ŭ���� �� ������ Ȱ��
class Record {
	String hak, name;   //-- �й�, �̸�
	int kor, eng, mat;   //-- ����, ����, ���� ����
	int tot, avg;      //-- ����, ���(���ǻ� ���� ó��)
}

// �������̽�
interface Sungjuk {

	public void set();      //-- �ο� �� �Է� 
	public void input();      //-- �л��� �й�, �̸�, ��������, ��������, �������� �Է�
	public void print();      //-- �Է��� �л��� ���� ���
}

// ���� �ذ� �������� �����ؾ� �� Ŭ����
class SungjukImpl implements Sungjuk {   // Sungjuk �������̽��� �޼ҵ� ������
   
	Record[] rc;      //-- class Record �迭
	int st, i, j;   //-- �л���, for�� ����
	int[][] score;   //-- ����, ����, ���� ������ ������ 2�� �迭
	char[][] rank;   //-- ������ ��� 2�� �迭

	@Override      // �޼ҵ� override
	public void set() {      // �������̽� Sungjuk�� �޼ҵ� �� set() �޼ҵ� ������
      
		Scanner sc = new Scanner(System.in);

		do         // do~while���� �̿��� �ο��� �Է�
		{
			System.out.print("�ο��� �Է�(1~10) : ");
			st = sc.nextInt();
		}	
		while (st<1 || st>10);   // �Է��� �� �ִ� �л����� 1~10
		rc = new Record[st];   // rc �迭�� �Է��� �л� �� ��ŭ�� �迭 �� ����
		score = new int[st][3];   // score �迭�� �Է��� �л� �� ��ŭ�� �迭 �� ����, [3] �� ����, ����, ��������
		rank = new char[st][3];   // rank �迭�� �Է��� �л� �� ��ŭ�� �迭 �� ����, [3] �� ����, ����, ���������� ���
	}

	@Override      // �޼ҵ� override
	public void input() {   // �������̽� Sungjuk�� �޼ҵ� �� input() �޼ҵ� ������

		Scanner sc = new Scanner(System.in);

		for (i=0; i<st; i++)   // for���� �̿��Ͽ� �л��� �й�, �̸�, ��������, ��������, �������� �Է�
		{
			rc[i] = new Record();
			System.out.printf("%d��° �л��� �й� �̸� �Է�(���鱸��) : ", i+1);
			rc[i].hak = sc.next();      // �й� �Է� ����
			rc[i].name = sc.next();   // �̸� �Է� ����

			System.out.print("���� ���� ���� ���� �Է�   (���鱸��) : ");
			score[i][0] = rc[i].kor = sc.nextInt();   // score 2�� �迭�� rc[i].kor�� �������� ����
			score[i][1] = rc[i].eng = sc.nextInt();   // score 2�� �迭�� rc[i].eng�� �������� ����
			score[i][2] = rc[i].mat = sc.nextInt();   // score 2�� �迭�� rc[i].mat�� �������� ����

			rc[i].tot = rc[i].kor + rc[i].eng + rc[i].mat;   // ���� ���
			rc[i].avg = rc[i].tot / 3;         // ��� ���(������)
		}

		System.out.println();            // ����

		for (i=0; i<st; i++) {   // for���� �̿��Ͽ� ��������, ��������, �������� ���� ��� �ο�

			for (j=0; j<3; j++) {

				switch (score[i][j] - score[i][j]%10) {      // ������ ������ 10���� ������ ���� �������� �� ��
					case 100: rank[i][j] = '��';break;   // 100�̻��� ���   
					case 90: rank[i][j] = '��';break;      // 90�̻��� ���
					case 80: rank[i][j] = '��';break;      // 80�̻��� ���
					case 70: rank[i][j] = '��';break;      // 70�̻��� ���
					case 60: rank[i][j] = '��';break;      // 60�̻��� ���
					default: rank[i][j] = '��';break;      // �� ��
				}
			}
		}
	}

	@Override      // �޼ҵ� override
	public void print() {   // �������̽� Sungjuk�� �޼ҵ� �� print() �޼ҵ� ������      
		System.out.println();   // ����

		for (i=0; i<st; i++)   // for���� �̿��Ͽ� �Է��� �л��� ���� ���
		{
			// �й�, �̸�, ��������, ��������, ��������, ��������, ������� ���
			System.out.printf("%s %s %d %d %d\t%d %d\n", rc[i].hak, rc[i].name, rc[i].kor, rc[i].eng, rc[i].mat, rc[i].tot, rc[i].avg);   
        
			// rank�� ���߹迭�� �ش� �л��� ����, ����, ���� ��� ���
			System.out.printf("\t\t%c %c %c\n", rank[i][0], rank[i][1], rank[i][2]);
		}
	}	
}

// main() �޼ҵ尡 �����ϰ� �ִ� �ܺ� Ŭ����
public class Test116 {

   public static void main(String[] args) {
	   
	   Sungjuk ob;

	   // ���� �ذ� �������� �ۼ��ؾ� �� ob ����

	   ob = new SungjukImpl();   //-- �� ĳ����
	   ob.set();
	   ob.input();
	   ob.print();
   }
}


// ���� ���
/*
1921004 ������ 90 100 85        275 91
                �� �� ��
1921005 ȫ�浿 85 70 60    215 71
                �� �� ��
// ����Ϸ��� �ƹ�Ű�� �����ʽÿ�...
*/