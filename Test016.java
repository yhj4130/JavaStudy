/*===================================
  ���� �ڹ� �⺻ ���α׷��� ����
  - �ڹ��� �⺻ ����� : printf()
===================================*/

public class Test016{

	public static void main(String[] args){
		
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");	//-- ��\n�� ����

		// ���� ��� �޼ҵ�
		System.out.printf("12345678901234567890");
		System.out.printf("12345678901234567890\n");	//-- ��\n�� ����
		System.out.printf("12345678901234567890%n");	//-- ��%n�� ����

		System.out.printf("%d + %d = %d\n", 10, 20, 30);
		//--==>> AAABBBCCC
		//		 1234567890123456789012345678901234567890
		//		 12345678901234567890
		//		 10 + 20 = 30

		System.out.printf("%d\n", 123);
		System.out.printf("%10d\n", 123);
		System.out.printf("%010d\n", 123);
		//--==>> 123
		//              123
		//        0000000123

		System.out.printf("%+d\n", 365);
		System.out.printf("+%d\n", 365);
		//-->> +365
		//	   +365

		System.out.printf("%d\n", +365);
		//--==>> 365

		//System.out.printf("%-d\n", 365);	//-- �����Ϲ���x, ��Ÿ�� ���� �߻�
		System.out.printf("-%d\n", 365);
		System.out.printf("%d\n", -365);
		//--==>> -365
		//		 -365

		System.out.printf("%(d\n", -365);
		System.out.printf("%(d\n", 365);
		//--==>> (365)
		//       365

		//System.out.printf("%d\n", 'A');		// ��Ÿ�� ���� �߻�
		System.out.printf("%c\n", 'A');
		//System.out.printf("%c\n", "ABCD");	// ��Ÿ�� ���� �߻�
		System.out.printf("%s\n", "ABCD");
		//--==>> A
		//	     ABCD

		System.out.printf("%h\n", 365);			// 16������ ǥ��
		System.out.printf("%o\n", 24);			// 8������ ǥ��
		//--==>> 16d
		//		 30

		System.out.printf("%s\n", "true");		// ���ڿ�
		System.out.printf("%b\n", true);		// boolean ����
		//--==>> true
		//		 true\

		System.out.printf("%f\n", 123.23);		// �Ҽ��� ���� 6��° �ڸ����� ǥ��
		System.out.printf("%.2f\n", 123.23);	// �Ҽ��� ���� 2��° �ڸ����� ǥ��(�ݿø�)
		System.out.printf("%.2f\n", 123.236);	// �Ҽ��� ���� 2��° �ڸ����� ǥ��(�ݿø�)
		System.out.printf("%8.2f\n", 123.236);	// 8ĭ �ȿ� �Է�, �Ҽ��� ���� 2��° �ڸ����� ǥ��(�ݿø�)	
		System.out.printf("%2.2f\n", 123.1234);	// 2ĭ �Ѿ ��� ǥ��(���� x), �Ҽ��� ���� 2��° �ڸ����� ǥ��(�ݿø�)
		//--==>> 123.230000
				 123.23
				 123.24
				   123.24
				 123.12
	}
}

// ���� ���
/*
AAABBBCCC
1234567890123456789012345678901234567890
12345678901234567890
10 + 20 = 30
123
       123
0000000123
+365
+365
365
-365
-365
(365)
365
A
ABCD
16d
30
true
true
123.230000
123.23
123.24
  123.24
123.12
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/