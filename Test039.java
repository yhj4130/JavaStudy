/*==========================================
  ���� ���� �帧�� ��Ʈ�� (���) ����
  - if ~ else�� �ǽ�
==========================================*/

// �� ����
// ����ڷκ��� ���ĺ� �� ���ڸ� �Է¹޾� �̸� �Ǻ��Ͽ�
// �ҹ��ڸ� �Է¹޾��� ��� �빮�ڷ� ��ȯ�ϰ�
// �빮�ڸ� �Է¹޾��� ��� �ҹ��ڷ� ��ȯ�ϴ�
// ���α׷��� �����Ѵ�.
// ��, �Է��� ��System.in.read()�� �޼ҵ带 Ȱ���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ���ĺ� �� ���� �Է� : A
// >> a
// ����Ϸ��� �ƹ�Ű�� �����ʽÿ�...

// ���ĺ� �� ���� �Է� : c
// >> C
// ����Ϸ��� �ƹ�Ű�� �����ʽÿ�...

// ���ĺ� �� ���� �Է� : 6
// >> �Է� ����
// ����Ϸ��� �ƹ�Ű�� �����ʽÿ�...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test039 {

	public static void main(String[] args) throws IOException {
		
		char alpa;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("���ĺ� �� ���� �Է� : ");
		alpa = (char)System.in.read();		//-->> (char)�� ����ȯ�Ͽ� �о����

		if(alpa>='A' && alpa<='Z') {
			System.out.println(">> "+(char)(alpa+32));		//-->> �빮�� ���� ���� �� �ҹ��ڷ� ��ȯ
		}
		else if(alpa>='a' && alpa<='z') {
			System.out.println(">> "+(char)(alpa-32));		//-->> �ҹ��� ���� ���� �� �빮�ڷ� ��ȯ
		}
		else 
			System.out.println("�Է� ����!!");				//-->> ���� �� ���� ��� �ش��� �� �� ���
	}
}

// ���� ���
/*
���ĺ� �� ���� �Է� : a
>> A
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
/*
���ĺ� �� ���� �Է� : F
>> f
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
/*
���ĺ� �� ���� �Է� : 2
�Է� ����!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/