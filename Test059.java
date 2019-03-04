/*=======================================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - 반복문 (for문) 실습
  - 다중 for문 (반복문의 중첩)을 활용한 구구단 출력 실습
=======================================================*/

/*
2 * 1 = 2  3 * 1 = 3  4 * 1 = 4  5 * 1 = 5
2 * 2 = 4  3 * 2 = 6  4 * 2 = 8  5 * 2 =10
2 * 3 = 6  3 * 3 = 9  4 * 3 =12  5 * 3 =15
2 * 4 = 8  3 * 4 =12  4 * 4 =16  5 * 4 =20
					:
2 * 9 =18  3 * 9 =27  4 * 9 =36  5 * 9 =45

6 * 1 = 6  7 * 1 = 7  8 * 1 = 8  9 * 1 = 9
6 * 2 =12  7 * 2 =14  8 * 2 =16  9 * 2 =18
6 * 3 =18  7 * 3 =21  8 * 3 =24  9 * 3 =27
6 * 4 =24  7 * 4 =28  8 * 4 =32  9 * 4 =36
					:
6 * 9 =54  7 * 9 =63  8 * 9 =72  9 * 9 =81
*/

public class Test059 {

	public static void main(String[] args) {
		
		/*
		int i,j,m;
				
		for (i=1;i<=5;i+=4)
		{
			for (j=1;j<=9;j++)
			{
				for (m=i+1;m<=i+4 ;m++ )
				{
					
					System.out.printf("%d * %d = %d		", m, j, m*j);
				}
				System.out.println();
			}
			System.out.println();
		}
		*/
		
		int dan;		// 구구단의 '단'을 처리하는 연산
		int i, j, k;	// 루프 변수
		int g;			// 각 곱셈 연산에 대한 결과값을 담을 변수
		
		for (i=0; i<2; i++ )
		{
			for (j=1; j<=9; j++)	//-- 곱해지는 수 구성(1~9)
			{
				for (k=2; k<=5; k++)	//-- 단 구성(2~9) 
				{		
					dan = i * 4 + k;	//-- i가 0일 경우 2,3,4,5 / i가 1일 경우 6, 7, 8, 9
					g = dan * j;
					System.out.printf("%4d * %d = %2d", dan, j, g);
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}

// 실행 결과
/*
   2 * 1 =  2   3 * 1 =  3   4 * 1 =  4   5 * 1 =  5
   2 * 2 =  4   3 * 2 =  6   4 * 2 =  8   5 * 2 = 10
   2 * 3 =  6   3 * 3 =  9   4 * 3 = 12   5 * 3 = 15
   2 * 4 =  8   3 * 4 = 12   4 * 4 = 16   5 * 4 = 20
   2 * 5 = 10   3 * 5 = 15   4 * 5 = 20   5 * 5 = 25
   2 * 6 = 12   3 * 6 = 18   4 * 6 = 24   5 * 6 = 30
   2 * 7 = 14   3 * 7 = 21   4 * 7 = 28   5 * 7 = 35
   2 * 8 = 16   3 * 8 = 24   4 * 8 = 32   5 * 8 = 40
   2 * 9 = 18   3 * 9 = 27   4 * 9 = 36   5 * 9 = 45

   6 * 1 =  6   7 * 1 =  7   8 * 1 =  8   9 * 1 =  9
   6 * 2 = 12   7 * 2 = 14   8 * 2 = 16   9 * 2 = 18
   6 * 3 = 18   7 * 3 = 21   8 * 3 = 24   9 * 3 = 27
   6 * 4 = 24   7 * 4 = 28   8 * 4 = 32   9 * 4 = 36
   6 * 5 = 30   7 * 5 = 35   8 * 5 = 40   9 * 5 = 45
   6 * 6 = 36   7 * 6 = 42   8 * 6 = 48   9 * 6 = 54
   6 * 7 = 42   7 * 7 = 49   8 * 7 = 56   9 * 7 = 63
   6 * 8 = 48   7 * 8 = 56   8 * 8 = 64   9 * 8 = 72
   6 * 9 = 54   7 * 9 = 63   8 * 9 = 72   9 * 9 = 81

계속하려면 아무 키나 누르십시오 . . .
*/