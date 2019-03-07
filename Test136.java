/*=======================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - ���ڿ� ���� Ŭ����
  - ĳ���� ��(CharaterSet)
=======================================*/

/*
�� ĳ���� ��(CharacterSet)
 
   - �����ڵ�(unicode)
     ���� ǥ������ ������ 2����Ʈ���� ���� ������ ���� ���ں�ȣ
	 ü��(UCS: Universal Code System)�� ���Ѵ�.
	 ������ǻ��, IBM, ����ũ�μ���Ʈ ���� ���ҽþ����� ������
	 �����ڵ�(Unicode)�� 1990�⿡ ù ������ ��ǥ�Ͽ���,
	 ISO/IEC JTC1 ���� 1995�� 9�� ���� ǥ������ �����Ͽ���.
	 ���� ��Ī�� ISO/IEC 10646-1(Universal Mutiple-Octet Coded 
	 Character Set)�̴�.

	 �������� ��ȯ�� ��Ȱ�ϰ� �ϱ� ���Ͽ� ���� 1���� �ο��Ǵ� ����
	 16��Ʈ�� �����Ͽ���. �ڵ� 1���� �� ����� 7��Ʈ, �񿵾�� 8��Ʈ,
	 �ѱ��̳� �Ϻ���� 16��Ʈ�� ���� ������ �Ǵµ� �̵��� ���
	 16��Ʈ�� ������ ���̴�.

   - UTF-8 �� UTF-16
     UTF-8 �� UTF-16 �� ���̸� �� ����� ���ϸ�
	 ���ڸ� ǥ���� ���� ������ �ٸ��ٴ� ���̴�.
	 UTF-8 �� 8��Ʈ�� ������ ��Ƽ����Ʈ���� ���ڸ� ǥ���ϰ�
	 UTF-16�� 16��Ʈ�� ������ ��Ƽ����Ʈ���� ���ڸ� ǥ���Ѵ�.

	 ��UTF-8(8bit UCS Transformation Format)
	   ������ �⺻������ ����ϴ� �ڵ�.
	   USC-2�� ���ǵǴ� ���� ������ �̿��Ͽ� ����� ���ڿ���
	   ����Ʈ ���� ��ȯ�ϴ� ����� 1�� 1���ڸ� 1~6����Ʈ ������
	   ��Ƽ����Ʈ�� ��ȯ�Ѵ�.
	 ��UTF-16(16bit UCS Transformation Format)
	   �ڹ��� �⺻ �ڵ�. �ڹٿ����� ���� �ϳ��� �����ϸ� ����Ʈ ����
	   �������̵�, �ѱ۹����̵� 2����Ʈ�� �����ϰ� �ȴ�.
	   UCS-2�� ���ǵǴ� ���� ������ �̿��ؼ� ����� ���ڿ���
	   UCS-4�� �Ϻ��� ���ڸ� ä���ֱ����� ���ڵ� ���.
	   UTF-8�� ������ �� �ִ�.
	   UCS-2�� �̿��� �� �ִ� ���ڼ��� ���� �ø� �� �ִ�.

	�� �ڹٴܿ����� UTF-16�� ����ϰ� �������� UTF-8�� ����ϱ� ������
	   ��쿡 ���� ��ȯ�ؾ� �ϴ� ��Ȳ�� �߻��� �� �ִ�.


�� �����ڵ��� ����

   - KSC5601
     �ѱ� �ϼ��� ǥ��(�ѱ� 2,350�� ǥ��).
	 �ѱ�����ǥ�� ����ó���о�(C)�� 5601�� ǥ�ؾ�.

   - KSC5636
     �����ڿ� ���� ǥ��.
	 �ѱ�����ǥ�� ����ó���о�(C)�� 5636�� ǥ�ؾ�.
	 ���� ASCII Code ���� ��������(\)�� ��(\) ǥ�÷� ��ü.

   - EUC-KR(MS949)
     Bell-Laboratories ���� ���н� �󿡼� ������ �̿��� ���ڸ�
	 �����ϱ� ���� ������ Ȯ�� ���н� �ڵ�(Extend UNIX Code) ��
	 �ѱ� ���ڵ� ���.
	 ������ KSC5636���� ó���ϰ� �ѱ��� KSC5601�� ó��
	 (EUC-KR(MS949) = KSC6301 + KSC5636)

  - UTF-8
    ������ ���ڴ� 1����Ʈ, �ѱ��� 3����Ʈ�� ǥ��.
	(�������� ���� ���. UTF-8 �������� JSP�� �ۼ��� ������
	 ���ϵ� UTF-8 �������� �����ؾ� �Ѵ�.)

  - UTF-16
    �ڹ� �⺻ �����ڵ�.
	������ ���ڴ� 1����Ʈ, �ѱ��� 2����Ʈ�� ǥ��.

  - ISO-8859-1
    ������ ��� ǥ�⿡ �ʿ��� US-ASCII �� ���� 94���� ������ ������ ����.
*/

import java.io.UnsupportedEncodingException;

public class Test136 {

	public static void main(String[] args) {

		byte[] buf;
		String name = new String("������");

		System.out.println("����Ʈ ĳ���� �� : " + System.getProperty("file.encoding"));
		//--==>> ����Ʈ ĳ���� �� : MS949 �� EUC-KR
		
		// ��String.getBytes��
		//  : ����Ʈ ĳ���ͼ��� ������� ����Ʈ �迭�� ��ȯ�ϴ� �޼ҵ�
		buf = name.getBytes();
		
		System.out.println("buf �迭�� length : " + buf.length);
		//--==>> buf �迭�� length : 6

		System.out.println();
		

		try
		{
			// UTF-8 ĳ���ͼ��� ������� ����Ʈ �迭 ��ȯ
			buf = name.getBytes("UTF-8");
		
			System.out.println("buf �迭�� length : " + buf.length);
			//--==>> buf �迭�� length : 9

		    System.out.println();

			// UTF-8 ���·� ����� ����Ʈ �迭��
			// String ��ü�� �Ķ���� �� ��UTF-8���� �ο��Ͽ� ����
			System.out.println("value1 : " + new String(buf, "UTF-8"));
			//--==>> value1 : ������

			System.out.println();

			System.out.println("value2 : " + new String(buf));
			//--==>> value2 : ?��?���?

			System.out.println();

			//------ ����

			//-- ���ڵ���� ��ȯ �ƴ�
			String convert = new String(name.getBytes("EUC-KR"), "UTF-8");

			System.out.println("value3 : " + convert);
			//--==>> value3 : ??????

			buf = convert.getBytes();	// EUC-KR
			System.out.println("buf �迭�� Length : " + buf.length);
			//--==>> buf �迭�� Length : 6

			buf = convert.getBytes("UTF-8");
			System.out.println("buf �迭�� Length : " + buf.length);
			//--==>> buf �迭�� Length : 18

			/*
			�� EUC-KR �� UTF-8 �� ��ȯ�Ѵٰ� ���� ���� �ڵ��� �ع�����
			   �̷��� ��ȯ���� ���� ����Ʈ �迭�� ������
			   EUC-KR �̵� UTF-8 �̵�
			   ��� ����Ʈ �迭�� �о���� �����ִ� ���� Ȯ���� �� �ִ�.

			   �̹� ���� ���·� String ��ü�� ����Ʈ �迭��
			   � ������ε� ������ �Ұ����ϴ�.
			*/
		}
		catch (UnsupportedEncodingException e)
		{
			System.out.println(e.toString());
		}
	}
}