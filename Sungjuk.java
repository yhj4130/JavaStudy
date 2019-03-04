import java.util.Scanner;

/*
public class Sungjuk {

	Record rc[];
	
	int st;
	
	// ���� �Է�
	void write() {

		Scanner sc = new Scanner(System.in);
		do
		{	
			System.out.print("�ο� �� �Է�(1~100) : ");
			st = sc.nextInt();
		}
		while (st<0 || st >100);
		
		rc = new Record[st];
		
		for (int i=0; i<st; i++)
		{
			rc[i] = new Record();
			System.out.print((i+1)+"��° �л��� �̸� �Է� : ");
			rc[i].name = sc.next(); 
			System.out.print("�������� : ");
			rc[i].kor = sc.nextInt();
			System.out.print("�������� : ");
			rc[i].eng = sc.nextInt();
			System.out.print("�������� : ");
			rc[i].math = sc.nextInt();
			
		}
	}
	
	// ��� ���
	void print() {

		System.out.println();
		
		for (int i=0; i<st; i++)
		{
			rc[i].tot = rc[i].kor + rc[i].eng + rc[i].math;
			rc[i].avg = rc[i].tot / 3.0;
		}

		for (int i=0; i<st; i++)
		{
			for (int j=0; j<st; j++)
			{
				if (rc[i].avg < rc[j].avg)
				{
					rc[i].rank = rc[i].rank + 1;
				}
			}
			System.out.printf(" %s %d %d %d %d %.1f %d\n", rc[i].name, rc[i].kor, rc[i].eng, rc[i].math, rc[i].tot, rc[i].avg, (rc[i].rank+1));
		}
		System.out.println();
	}
}
*/


public class Sungjuk 
{
	// �ֿ� �Ӽ� ����
	int inwon;			//-- �ο� ��
	Record[] recArr;	//-- Record �迭
						//   (�л� 1�� �� Record�迭�� �� 1�� Ȱ��)

	// ��� (�޼ҵ� ����)
	// �� �ο��� �Է�
	public void set() {
		
		Scanner sc = new Scanner(System.in);

		do
		{	
			System.out.print("�ο� �� �Է�(1~100) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>100);
		
		// Record Ŭ������ ������� ������ ��ü(�ν��Ͻ�)�� ���� �� �ִ�
		// �迭���� inwon ��ŭ ������ ������,
		// Record Ŭ������ �ν��Ͻ��� ������ ���� �ƴϴ�.
		recArr = new Record[inwon];
	}

	// �� �� ������ �Է� + �� ����/��� ����
	public void input() {
		
		Scanner sc = new Scanner(System.in);

		String[] subTitle = {"�������� : ", "�������� : ", "�������� : "};

		for (int i=0; i<inwon; i++)	// �ο��� ��ŭ �ݺ�(== recArr.length)
		{

			// Record Ŭ���� ����� �ν��ͽ� ����
			recArr[i] = new Record();
			System.out.printf("%d��° �л��� �̸� �Է� : ", i+1);
			recArr[i].name = sc.next();

			for (int j=0; j<subTitle.length; j++)
			{
				// �ȳ� �޼��� ���
				System.out.print(subTitle[j]);

				// ����ڰ� �Է��� �����͸� ���ھ�(score) �迭�� ��Ƴ���
				recArr[i].score[j] = sc.nextInt();

				// ����, ����, ���� ���� �����͸� �ݺ������� �Է¹޴� ����
				// �� �������� ���� �����ϱ�
				recArr[i].tot += recArr[i].score[j];
			}

			// ��� �����ϱ�
			recArr[i].avg  = recArr[i].tot / 3.0;
		}
	}

	// �� ������
	public void print() {
		
		// ���� ���� �޼ҵ� ȣ�ⱸ�� �߰�
		ranking();

		// ����
		System.out.println();

		// �л� 1�� �� �ݺ� ��� ����
		for (int i=0; i<inwon; i++)		//-- �л� �ο� �� ��ŭ �ݺ�
		{
			// �̸� ���
			System.out.printf("%5s", recArr[i].name);

			// ����(����, ����, ����)
			for (int j=0; j<3; j++)
				System.out.printf("%4d", recArr[i].score[j]);
			
			// ����, ��� ���
			System.out.printf("%5d", recArr[i].tot);
			System.out.printf("%8.2f", recArr[i].avg);
			
			// ���� ��� ���� �߰�
			System.out.printf("%5d", recArr[i].rank);
			6
			// ����
			System.out.println();
		}
	}
	// �� ���� ���� �޼ҵ� �߰�
	private void ranking() {
		
		// ���� ����
		int i, j;

		// ��� �л����� ���(����)�� 1�� �ʱ�ȭ
		for (i=0; i<inwon; i++)
			recArr[i].rank = 1;

		// ���(����) ����
		for (i=0; i<inwon-1; i++)		// i �� �� ������ �����ϴ� �ε���
		{
			for (j=i+1; j<inwon; j++)	// j �� �� ����� �����ϴ� �ε���
			{
				if (recArr[i].avg > recArr[j].avg)	// ���� �����Ͱ� �� �����ͺ��� ũ�ٸ�
				{
					// �� �������� rank�� 1��ŭ ����
					recArr[j].rank++;
				}
				else if (recArr[j].avg > recArr[i].avg)	// �� �����Ͱ� ���� �����ͺ��� ũ�ٸ�
				{
					// ���� �������� rank�� 1��ŭ ����
					recArr[i].rank++;
				}
			}
		}
	}
}
