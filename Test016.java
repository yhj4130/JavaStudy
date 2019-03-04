/*===================================
  ■■■ 자바 기본 프로그래밍 ■■■
  - 자바의 기본 입출력 : printf()
===================================*/

public class Test016{

	public static void main(String[] args){
		
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");	//-- 『\n』 개행

		// 서식 출력 메소드
		System.out.printf("12345678901234567890");
		System.out.printf("12345678901234567890\n");	//-- 『\n』 개행
		System.out.printf("12345678901234567890%n");	//-- 『%n』 개행

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

		//System.out.printf("%-d\n", 365);	//-- 컴파일문제x, 런타임 에러 발생
		System.out.printf("-%d\n", 365);
		System.out.printf("%d\n", -365);
		//--==>> -365
		//		 -365

		System.out.printf("%(d\n", -365);
		System.out.printf("%(d\n", 365);
		//--==>> (365)
		//       365

		//System.out.printf("%d\n", 'A');		// 런타임 에러 발생
		System.out.printf("%c\n", 'A');
		//System.out.printf("%c\n", "ABCD");	// 런타임 에러 발생
		System.out.printf("%s\n", "ABCD");
		//--==>> A
		//	     ABCD

		System.out.printf("%h\n", 365);			// 16진수로 표현
		System.out.printf("%o\n", 24);			// 8진수로 표현
		//--==>> 16d
		//		 30

		System.out.printf("%s\n", "true");		// 문자열
		System.out.printf("%b\n", true);		// boolean 형태
		//--==>> true
		//		 true\

		System.out.printf("%f\n", 123.23);		// 소숫점 이하 6번째 자리까지 표현
		System.out.printf("%.2f\n", 123.23);	// 소숫점 이하 2번째 자리까지 표현(반올림)
		System.out.printf("%.2f\n", 123.236);	// 소숫점 이하 2번째 자리까지 표현(반올림)
		System.out.printf("%8.2f\n", 123.236);	// 8칸 안에 입력, 소숫점 이하 2번째 자리까지 표현(반올림)	
		System.out.printf("%2.2f\n", 123.1234);	// 2칸 넘어도 모두 표시(공백 x), 소숫점 이하 2번째 자리까지 표현(반올림)
		//--==>> 123.230000
				 123.23
				 123.24
				   123.24
				 123.12
	}
}

// 실행 결과
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
계속하려면 아무 키나 누르십시오 . . .
*/