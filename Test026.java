/*===============================
  ■■■ 연산자(Operator) ■■■
  - 비트 단위 연산자
===============================*/

// 비트 shift 연산자

public class Test026 {

	public static void main(String[] args) {
		
		int x = 128;

		System.out.printf("x << 3 = %d\n", x<<3);
		System.out.printf("x *  8 = %d\n", x*8);

		System.out.printf("x >> 3 = %d\n", x>>3);
		System.out.printf("x / 8  = %d\n", x/8);

		System.out.printf("x << 24 = %d\n", x<<24);		// 음수의 최대값
		System.out.printf("x << 25 = %d\n", x<<25);		//--==>> 0
		System.out.printf("x << 31 = %d\n", x<<31);		//--==>> 0
		System.out.printf("x << 32 = %d\n", x<<32);		//--==>> 128 본인 자리 찾음(int, 32비트) 
		System.out.printf("x << 33 = %d\n", x<<33);		//--==>> 256
	
	}
}

/*
	128		→	00000000 00000000 00000000 10000000

	128<<3  →  00000000 00000000 00000100 00000000		왼쪽으로 3칸 이동

	128		→	00000000 00000000 00000000 10000000

	128>>3  →  00000000 00000000 00000000 00010000		오른쪽으로 3칸 이동
*/

// 실행 결과
/*
x << 3 = 1024
x *  8 = 1024
x >> 3 = 16
x / 8  = 16
x << 24 = -2147483648
x << 25 = 0
x << 31 = 0
x << 32 = 128
x << 33 = 256
계속하려면 아무 키나 누르십시오 . . .
*/