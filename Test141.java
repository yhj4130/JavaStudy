/*=======================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Random Ŭ����
=======================================*/

/*
�� java.util.Random Ŭ������

   ���� ������ ������ �߻����� �����ϴ� Ŭ�����̴�.
   Math Ŭ������ ���� �޼ҵ��� random() �޼ҵ嵵 ������ �����ϴ� �޼ҵ�������
   0.0 ~ 1.0 ������ �Ǽ� ���¸� �߻��ϰ� �ǹǷ�
   �ʿ��� ���� ������ ������ ������ ���ؼ��� �߰����� ������� �����ؾ� �Ѵ�.
   �׷��� �ڹٴ� ���� ������ ������ �߻������ִ�
   ���� Ŭ������ Random Ŭ������ ������ �����ϰ� �ִ�.
*/

// �ζ� ��ȣ ������ (���� �߻� ���α׷�)

// ���α׷��� ����Ǹ� �⺻������ �ζǸ� 5���� �����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// 2 39 40 41 42 45
// 1 2 8 16 28 42
// 4 9 10 13 14 28
// 20 24 31 33 37 41
// 5 7 8 11 36 40
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ�...

import java.util.Random;
import java.util.Arrays;

class Lotto {

	// �迭 ���� ���� �� �޸� �Ҵ� �� �ζ� ��ȣ�� ��Ƶ� �迭�� 6��
	private int[] num = new int[6];

	// getter
	public int[] getNum() {
		return num;
	}

	// 6���� ������ �߻���Ű�� �޼ҵ� ����
	public void start() {
		
		int cnt = 0;
		Random rd = new Random();
		int n;
		
		jump:
		while (cnt<6)	// cnt �� 0 1 2 3 4 5
		{
			n = rd.nextInt(45)+1;	// 1 ~ 45
			for (int i=0; i<cnt; i++)
			{
				if(num[i] == n)	// num[1] 10	
					continue jump;
			}
			num[cnt++] = n;
		}
		sorting();
	}

	// ���� �޼ҵ�
	private void sorting() {

		Arrays.sort(num);
	}
}

public class Test141 {

	public static void main(String[] args) {
		
		// Lotto Ŭ���� �ν��Ͻ� ����
		Lotto lotto = new Lotto();

		// �⺻ 5����
		for (int i=1; i<=5; i++)
		{
			lotto.start();

			// ��� ���
			for (int n : lotto.getNum())
				System.out.printf("%4d", n);
			System.out.println();
		}

		/*
		Random rd = new Random();

		int[][] num = new int[5][6];

		for (int i=0; i<num.length; i++)
		{
			for (int j=0; j<num[i].length; j++)
			{	
				num[i][j] = rd.nextInt(45)+1;
				for (int k=0; k<j; k++)
				{
					if (num[i][j]==num[i][k])
					{
						i--;
						break;
					}
				}
			
			}
		}

		for (int i=0; i<num.length; i++)
		{
			for (int j=0; j<num[i].length; j++)
			{	
				for (int k=0; k<j; k++)
				{
					if (num[i][j] < num[i][k])
					{
						num[i][j] = num[i][j] ^ num[i][k];
						num[i][k] = num[i][k] ^ num[i][j];
						num[i][j] = num[i][j] ^ num[i][k];
					}
				}
			}
		}

		for (int i=0; i<5; i++)
		{
			for (int j=0; j<6; j++)
				System.out.printf("%3d", num[i][j]);
			System.out.println();
		}
		System.out.println();
		*/
	}
}


// ���� ���
/*
   1   5   9  13  16  17
  13  17  21  22  26  31
  23  29  31  34  40  45
   4  11  13  22  27  37
  16  18  20  28  34  37
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/