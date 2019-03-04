/*================================
  ���� Ŭ������ �ν��Ͻ� ����
  - Ŭ������ �ν��Ͻ� Ȱ��
================================*/

// �� �ǽ� ����
// 1 ~ 3 ������ ���� ������ ������ �߻�����
// ����, ����, �� ���� ���α׷��� �����Ѵ�.
// ��, Ŭ������ ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ����, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.

// ���� ������ �� 1 : ����, 2 : ����, 3 : ��

// ���� ��)
// 1:���� 2:���� 3:�� �� �Է�(1~3) : 4
// 1:���� 2:���� 3:�� �� �Է�(1~3) : -12
// 1:���� 2:���� 3:�� �� �Է�(1~3) : 2
// - ����   : ����
// - ��ǻ�� : ��
// >> �º�������� : ��ǻ�Ͱ� �̰���ϴ�.
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ�...

import java.util.Scanner;
import java.util.Random;


public class Test094 {

	String[] mod = {"����", "����", "��"};

	int user;
	int com;
	
	public void write() {

		Scanner sc = new Scanner(System.in);
	
		do
		{
			System.out.print("1:���� 2:���� 3:�� �� �Է�(1~3) : ");
			user = sc.nextInt();
		}
		while (user<1 || user>3);
	}

	public void print() {
	
		System.out.printf("- ����   : %s\n", mod[user-1]);

		Random rd = new Random();
		 
		com = rd.nextInt(3)+1;		// 1 2 3

		System.out.printf("- ��ǻ�� : %s\n", mod[com-1]);
		
	}

	public void game() {

		if (user==com)
			System.out.println(">> �º�������� : ���º� �Դϴ�.");

		else if (user==1&&com==3 || user==2&&com==1 || user==3&&com==2)
			System.out.println(">> �º�������� : ������ �̰���ϴ�.");

		else
			System.out.println(">> �º�������� : ��ǻ�Ͱ� �̰���ϴ�.");
		
	}
	
	public static void main(String[] args) {
		
		
		Test094 ob = new Test094();

		ob.write();
		ob.print();
		ob.game();
	}
}



// ���� ���
/*
1:���� 2:���� 3:�� �� �Է�(1~3) : 4
1:���� 2:���� 3:�� �� �Է�(1~3) : 1
- ����   : ����
- ��ǻ�� : ����
>> �º�������� : ��ǻ�Ͱ� �̰���ϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
/*
1:���� 2:���� 3:�� �� �Է�(1~3) : 2
- ����   : ����
- ��ǻ�� : ����
>> �º�������� : ���º� �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
/*
1:���� 2:���� 3:�� �� �Է�(1~3) : 3
- ����   : ��
- ��ǻ�� : ����
>> �º�������� : ������ �̰���ϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
class RpsGame
{
	int user;
	int com;

	private void runCom() {

		Random rd = new Random();
		 
		com = rd.nextInt(3)+1;		// 1 2 3
	}

	public void input() {

		runCom();

		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("1:���� 2:���� 3:�� �� �Է�(1~3) : ");
			user = sc.nextInt();
		}
		while (user<1 || user>3);
	}

	public void middleCalc() {

		String[] str = {"����", "����", "��"};

		System.out.printf("- ����   : " + str[user-1]);
		System.out.printf("- ��ǻ�� : " + str[com-1]);
	}

	public String resultCalc() {

		String result = "���º�";

		if ((user==1&&com==3) || (user==2&&com==1) || (user==3&&com==2))
			result = "����� �¸��߽��ϴ�.";
		if ((user==1&&com==2) || (user==2&&com==3) || (user==3&&com==1))
			result = "��ǻ�Ͱ� �¸��߽��ϴ�.";

		return result;
	}

	public void print(String result) {

		System.out.println(">> �º�������� : " + result);
	}

	public static void main(String[] args) {

		RpsGame rg = new RpsGame();

		rg.input();
		rg.middleCalc();
		String result = rg.resultCalc();
		rg.print(result);
	
	}
}
*/