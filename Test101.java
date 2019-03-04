/*=======================================
  ���� �ֹε�Ϲ�ȣ ��ȿ�� �˻� ����
=======================================*/

/*
�� �ֹε�Ϲ�ȣ ���� ����

   �� ������ �ڸ��� ������ ���ڸ� ���� ��Ģ�� �°� ���Ѵ�.

	  123456 - 1234567 (�� �ֹι�ȣ)
	  ****** ******
	  234567 892345	   (�� �� �ڸ��� ������ ��)

   �� ��Ģ�� �°� ���� ������ ������ ����� ��� ���Ѵ�.

   ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
       * * * * * *   * * * * * * *
	   2 3 4 5 6 7   8 9 2 3 4 5
	  -----------------------------
   �� 14 + 15 + 0 + 30 + 6 + 35 + 8 + 72 + 12 + 6 + 4 + 15

   	  == 217
	
   �� ������ ������� 11�� ������ ������������ ���Ѵ�.

	  217 / 11 �� 19(��) 8(������)

   �� 11���� �������� �� ������� ���Ѵ�.
      
	  11 - 8 

   �� ���°���� ó���� ���� ����� �ֹι�ȣ�� �����ϴ� ������ ���ڿ�
      ��ġ�ϴ��� ���Ѵ�.

					   ��ġ
	  11 - 8 ������ 3 == �ֹι�ȣ ������ ���� 3
   
   �� ������ ���ڿ� ���� ��� ��ȿ�� �ֹε�Ϲ�ȣ
*/

// ���� ��)
// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 123456-12345678 �� �Է°��� �ʰ�
// >> �Է� ����
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ�...

// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 123456-123456   �� �Է°��� ����
// >> �Է� ����

// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 750615-1252085  �� ��ȿ�� �ֹι�ȣ
// >> ��Ȯ�� �ֹι�ȣ

// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 750615-1252086  �� ��ȿ���� ���� �ֹι�ȣ
// >> �߸��� �ֹι�ȣ

// �� ���ڿ�.length() �� ���ڿ��� ���� ��ȯ
//    ���ڿ�.substring() �� ���ڿ� ����

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test101 {

	public static void main(String[] args) throws IOException {

		// �׽�Ʈ
		//String strTemp = "���ع��� ��λ��� ������ �⵵��";
		//System.out.println(strTemp.length());
		//--==>> 17

		// �׽�Ʈ
		//System.out.println("�������� �� �ҳ���".length());
		//--==>> 10

		// �׽�Ʈ
		//System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 5));
		//--==>> de
		
		//System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 50));
		//--==>> java.lang.StringIndexOutOfBoundsException

		// �׽�Ʈ
		//System.out.println("���̿��������װڳ�".substring(4,9));
		//--==>> �����װڳ�

		// �׽�Ʈ
		//System.out.println("������������".substring(3));
		//System.out.println("������������".substring(3, "������������".length()));
		//--==>> ������

		
		// BufferedReader Ŭ���� �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		String strTemp;
		
		int[] a = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
		int[] b = new int[13];
		int count=0;
		
		int c;	// ������

		System.out.print("�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : ");
		strTemp = br.readLine();
			
		if (strTemp.length()!=14)
			System.out.println(">> �Է� ����"); 
	
		for (int i=0; i<6; i++)
			b[i] = Integer.parseInt(strTemp.substring(i, i+1));	
	
		for (int i=6; i<strTemp.length()-1; i++)
			b[i] = Integer.parseInt(strTemp.substring(i+1, i+2));
		
		for (int i=0; i<strTemp.length()-2; i++)
			count += a[i] * b[i];
		
		c = 11- count%11;

		if (Integer.parseInt(strTemp.substring(13))==c)
			System.out.println(">> ��Ȯ�� �ֹι�ȣ");
		else if (c==11 && b[13]==1)
			System.out.println(">> ��Ȯ�� �ֹι�ȣ");
		else if (c==10 && b[13]==0)
			System.out.println(">> ��Ȯ�� �ֹι�ȣ");
		else
			System.out.println(">> �߸��� �ֹι�ȣ");
		*/
		
		
		// �Է¹��� �ֹι�ȣ
		String str;

		// �������� �� �迭 ����
		int[] chk = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};		// - �� 0 check

		// ���� ���� �� ������
		int tot = 0;

		// ����ڿ��� �ȳ� �޼��� ��� �� �ֹι�ȣ �Է¹ޱ�
		System.out.print("�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : ");
		str = br.readLine();
			
		if (str.length() != 14) {
			System.out.println(">> �Է¿���");
			return;
		}

		// Ȯ��
		//System.out.println(">> �ڸ��� ����");
		
		for (int i=0; i<13; i++)	// i �� 0 1 2 3 4 5 6 7 8 9 10 11 12
		{
			if (i==6)
				continue;

			tot += chk[i] * Integer.parseInt(str.substring(i, (i+1)));
		}

		//-- ������� �����ϸ� �� �� �� �� ��� ���� ��Ȳ�̸�
		//   ��Ģ�� �°� ���� ������ ������ ����� ��� ���� ����
		//   ���� tot�� ����ִ� ���°� �ȴ�.

		int su = 11 - tot % 11;
		
		// ���� ��� ��� ������ �߰� ���� �ʿ�
		// �� su�� ���� ���� ����� �� �ڸ��� ���� ���
		//    �ֹι�ȣ ������ �ڸ����� ���� �� ���� ��Ȳ
		su = su % 10;	// su %= 10;

		//-- ������� �����ϸ� �� �� �� �� ��� ���� ��Ȳ�̸�
		//   ���� ���� ����� ���� su�� ����ִ� ��Ȳ�� �ȴ�.

		// ���� ��� ���
		if (su == Integer.parseInt(str.substring(13)))
			System.out.println(">> ��Ȯ�� �ֹι�ȣ");
		else
			System.out.println(">> �߸��� �ֹι�ȣ");
		
			
	}	
}


// ���� ���
/*
�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 961001-2068518
>> ��Ȯ�� �ֹι�ȣ
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
/*
�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 1234
>> �Է� ����
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 5
        at java.lang.String.substring(String.java:1963)
        at Test101.main(Test101.java:110)
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
/*
�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 961001-2068519
>> �߸��� �ֹι�ȣ
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/