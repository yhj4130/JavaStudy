/*===================================
  ���� ����(Sort) �˰��� ����
===================================*/

// �� �ǽ� ����
//    ����ڷκ��� ���� �л��� ���� ������ ���� ���·� �Է¹޾�
//	  ������ ���� ������ ����� �ο��Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.
//	  ��, �迭�� ���� �˰����� Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// �ο� �� �Է� : 5
// �̸� ���� �Է�(1) : ������ 90
// �̸� ���� �Է�(2) : ������ 80
// �̸� ���� �Է�(3) : �̾Ƹ� 85
// �̸� ���� �Է�(4) : ȫ�浿 75
// �̸� ���� �Է�(5) : ��浿 95

// ==================
// 1�� ��浿
// 2�� ������
// 3�� �̾Ƹ�
// 4�� ������ 
// 5�� ȫ�浿
// ==================
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ�...

import java.util.Scanner;

public class Test105 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		System.out.print("�ο� �� �Է� : ");
		int st = sc.nextInt();

		int num[] = new int[st];
		String[] name = new String[st];
		int[] score = new int[st];

		for (int i=0; i<st; i++)
		{
			System.out.printf("�̸� ���� �Է�(%d) : ", i+1);
			name[i] = sc.next();
			score[i] = sc.nextInt();
		}
		

		boolean flag;
		String stName;
		int i=0;

		do
		{	
			flag = false;
			i++;
			for (int j=0; j<score.length-i; j++)	
			{
				if (score[j] < score[j+1])				
				{
					
					stName = name[j];
					name[j] = name[j+1];
					name[j+1] = stName;

					// �ڸ� �ٲٱ�
					score[j] = score[j]^score[j+1];
					score[j+1] = score[j+1]^score[j];
					score[j] = score[j]^score[j+1];

					flag = true;			
				}
			}	
		}
		while (flag);
		
		int rank = 0;
	
		// ����� ���
		System.out.println("\n==================");
		
		for (int j=0; j<num.length; j++){
				
				rank++;

				if (j>0 && score[j]==score[j-1])
				{
					rank--;
					System.out.printf("%d�� %s\n", rank, name[j]);
				}
				else 
					System.out.printf("%d�� %s\n", j+1, name[j]);
		}

		System.out.println("==================");
		
	}
}


// ���� ���
/*
�ο� �� �Է� : 5
�̸� ���� �Է�(1) : ������ 90
�̸� ���� �Է�(2) : ������ 80
�̸� ���� �Է�(3) : �̾Ƹ� 85
�̸� ���� �Է�(4) : ȫ�浿 75
�̸� ���� �Է�(5) : ��浿 95

==================
1�� ��浿
2�� ������
3�� �̾Ƹ�
4�� ������
5�� ȫ�浿
==================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/