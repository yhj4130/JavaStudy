/*==========================================
  ���� ���� �帧�� ��Ʈ�� (���) ����
  - if ~ else�� �ǽ�
==========================================*/

// �� ����
// ����ڷκ��� ���ĺ� �� ���ڸ� �Է¹޾�
// �̸� �Ǻ��Ͽ� �Է¹��� ���ĺ��� ������ ��츸
// ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, ��ҹ��ڸ� ��� ������ �� �ֵ��� ó���Ѵ�.
// ����, ���ĺ� �̿��� ���ڰ� �ԷµǾ��� ���
// �Է� ������ ���� ������ ����ڿ��� �ȳ��� �� �� �ֵ��� �Ѵ�.

// ���� ��)
// ���ĺ� �� ���� �Է� : A
// >> ���� 
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ�...

// ���ĺ� �� ���� �Է� : e
// >> ���� 
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ�...

// ���ĺ� �� ���� �Է� : B
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ�...

// ���ĺ� �� ���� �Է� : 1
// >> �Է� ����
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ�...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test038 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char alpa;

		System.out.print("���ĺ� �� ���� �Է� : ");
		alpa = (char)System.in.read();			// (char)�� ����ȯ

		if(alpa == 'a'| alpa == 'A') {
			System.out.println(">> ����");
		}
		else if(alpa == 'i'| alpa == 'I') {
			System.out.println(">> ����");
		}
		else if(alpa == 'e'| alpa == 'E') {
			System.out.println(">> ����");
		}
		else if(alpa == 'o'| alpa == 'O') {
			System.out.println(">> ����");
		}
		else if(alpa == 'u'| alpa == 'U') {
			System.out.println(">> ����");				//-->> ���� ���� ����
		}
		else if(alpa >= 65 && alpa <= 90) {
			System.out.println("");
		}
		else if(alpa >= 97 && alpa <= 122) {			//-->> ������ ���� ���� ����
			System.out.println("");
		}
		else
			System.out.println(">> �Է� ����");			//-->> �� �� �Է�
		
		
	}
}

// ���� ���
/*
���ĺ� �� ���� �Է� : e
>> ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
/*
���ĺ� �� ���� �Է� : i
>> ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
/*
���ĺ� �� ���� �Է� : g

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
/*
���ĺ� �� ���� �Է� : 1
>> �Է� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/