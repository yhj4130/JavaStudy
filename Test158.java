/*===================================
  ���� �÷��� (Collection) ����
===================================*/

// �� �ǽ� ����
// ���� �ۼ����� Test158 Ŭ������ �ϼ��Ͽ� ���� ����� ���� ���α׷��� �����Ѵ�.

/*
���� ��)


	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 1

	1��° ��� �Է� : ���Ѿ�
	1��° ��� �Է� ����
	��� �Է� ���(Y/N)? : y

	2��° ��� �Է� : ��ȫ��
	2��° ��� �Է� ����
	��� �Է� ���(Y/N)? : n


	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 2

	[���� ��ü ���]
		���Ѿ�
		��ȫ��
	���� ��ü ��� �Ϸ�
	

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 3

	�˻��� ��� �Է� : ���Ѿ�
	
	[�˻� ��� ���]
	�׸��� �����մϴ�.


	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 4

	������ ��� �Է� : ���ȯ

	[���� ��� ���]
	�׸��� �������� �ʾ� ������ �� �����ϴ�.


	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 5

	������ ��� �Է� : ��ȫ��
	������ ���� �Է� : �輱��

	[���� ��� ���]
	������ �Ϸ�Ǿ����ϴ�.


	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 6

	���α׷� ����
	����Ϸ��� �ƹ�Ű�� �����ʽÿ�...
*/

import java.util.Vector;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Menus {

	public static final int E_ADD=1;	//-- ��� �߰�
	public static final int E_DISP=2;	//-- ��� ���
	public static final int E_FIND=3;	//-- ��� �˻�
	public static final int E_DEL=4;	//-- ��� ����
	public static final int E_CHA=5;	//-- ��� ����
	public static final int E_EXIT=6;	//-- ����
}

public class Test158 extends Menus {
	
	// �ֿ� �Ӽ� ����
	private static final Vector<Object> vt;
	private static BufferedReader br;
	private static Integer sel;			//-- ���� ��
	private static String con;			//-- ��� ����

	// static �ʱ�ȭ ��
	static {
		
		// Vector �ڷᱸ�� ����
		vt = new Vector<Object>();

		// BufferedReader Ŭ���� �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));

		// ����� �Է°� �ʱ�ȭ
		sel = 1;
		con = "Y";
	}

	// �޴� ��� �޼ҵ�
	public static void menuDisp() {

		System.out.println("[�޴� ����]");
		System.out.println("1. ��� �߰�");
		System.out.println("2. ��� ���");
		System.out.println("3. ��� �˻�");
		System.out.println("4. ��� ����");
		System.out.println("5. ��� ����");
		System.out.println("6. ����");
	}

	// �޴� ���� �޼ҵ�
	public static void menuSelect() throws IOException{

		do
		{
			System.out.print(">> �޴� ����(1~6) : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<E_ADD || sel >E_EXIT);
	}

	// ���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
	public static void menuRun() throws IOException {

		if(sel == E_ADD)
			addElement();
		else if(sel == E_DISP)
			dispElement();
		else if(sel == E_FIND)
			findElement();
		else if(sel == E_DEL)
			delElement();
		else if(sel == E_CHA)
			chaElement();
		else if(sel == E_EXIT)
			exit();
	}

	// ��� �߰�(�Է�) �޼ҵ�
	public static void addElement() throws IOException {
		
		int i = 0;
		
		while(true){

			do
			{
				i++;
				System.out.printf("\n%d��° ��� �Է� : ", i);
				String str = br.readLine();
				vt.add(str);
				System.out.printf("%d��° ��� �Է� ����~!!\n", i);
				System.out.print("��� �Է� ���(Y/N)? : ");
				con = br.readLine();
			}
			while (con.equals("N") && con.equals("n"));
			
			if (con.equals("N") || con.equals("n"))
			{
				System.out.println("\n");
				break;
			}
		}
	}

	// ��� ��� �޼ҵ�
	public static void dispElement() {

		System.out.println("\n[���� ��ü ���]");

		for (int i=0; i<vt.size(); i++)
			System.out.printf("     %s\n", vt.elementAt(i));
		System.out.println();

		System.out.println("���� ��ü ��� �Ϸ�\n\n");
	}

	// ��� �˻� �޼ҵ�
	public static void findElement() throws IOException {

		System.out.print("\n�˻��� ��� �Է� : ");
		String str3 = br.readLine();

		System.out.println("\n[�˻� ��� ���]");

		
		if (vt.contains(str3))
		{
			System.out.println("�׸��� �����մϴ�.\n\n");
		}
		else
			System.out.println("�׸��� �������� �ʽ��ϴ�.\n\n");
	}

	// ��� ���� �޼ҵ�
	public static void delElement() throws IOException {
	
		System.out.print("\n������ ��� �Է� : ");
		String str4 = br.readLine();

		System.out.println("\n[���� ��� ���]");

		if (vt.contains(str4))
		{
			vt.remove(str4);
			System.out.println("���� �Ϸ�!!!\n\n");
		}
		else
			System.out.println("�׸��� �������� �ʾ� ������ �� �����ϴ�.\n\n");
	}

	// ��� ����(����) �޼ҵ�
	public static void chaElement() throws IOException {
		
		String str1;
		String str2;

		System.out.print("\n������ ��� �Է� : ");
		str1 = br.readLine();
		
		if (vt.contains(str1))
		{
			System.out.print("������ ���� �Է� : ");
			str2 = br.readLine();
			vt.set(vt.indexOf(str1), str2);
			System.out.println("\n[���� ��� ���]");
			System.out.println("������ �Ϸ�Ǿ����ϴ�.\n\n");
		}
		else
			System.out.println("�׸��� �������� �ʽ��ϴ�.\n\n");
	}

	// ���α׷� ���� �޼ҵ�
	public static void exit() {
		
		System.out.println("\n���α׷� ����");
		System.exit(-1);
	}
	
	// main() �޼ҵ� -- �ϼ�
	public static void main(String[] args) throws IOException {
	
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
	}
}