/*==========================================
  ���� ���� �帧�� ��Ʈ�� (���) ����
  - if�� �ǽ�
==========================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ ¦������ Ȧ������ �Ǻ��Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, BufferedReader�� readLine() �޼ҵ带 ���� �Է¹��� �� �ֵ��� ó����ȣ
// if���� Ȱ���Ͽ� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է� : 37
// 37 �� Ȧ���Դϴ�.
// ����Ϸ��� �ƹ�Ű��...

// ������ ���� �Է� : 26
// 37 �� ¦���Դϴ�.
// ����Ϸ��� �ƹ�Ű��... 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test030 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������ ���� �Է� : ");

		int i = Integer.parseInt(br.readLine());
		
		if (i%2==0)
			System.out.println(i+"�� ¦���Դϴ�.");

		if (i%2!=0) 
			System.out.println(i+"�� Ȧ���Դϴ�.");
	}
}

// ���� ���
/*
������ ���� �Է� : 37
37�� Ȧ���Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
������ ���� �Է� : 26
26�� ¦���Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/