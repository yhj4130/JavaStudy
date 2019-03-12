/*====================================
  ■■■ 예외(Exception) 처리 ■■■
  - 예외 다시 던지기
====================================*/

public class Test147 {

	public static void main(String[] args) throws Exception {
		Test147 ob = new Test147();
		
		try
		{
			int a = ob.getValue(-2);
		    System.out.println("a : " + a);
		}
		catch (Exception e)
		{
			System.out.println("printStackTrace...(main)");		
			e.printStackTrace();
		}
		
	}

	public int getData(int data) throws Exception {

		if (data<0)
			throw new Exception("data가 0보다 작습니다.");	// ① 예외 발생
		
		return data+10;
	}
	
	// check
	public int getValue(int value) throws Exception {
		
		int a = 0;

		try
		{
			a = getData(-2);	// ② 예외 발생
		}
		catch (Exception e)		// ③ 예외 잡아내기
		{
			// ④ 잡아낸 예외에 대한 처리
			System.out.println("printStackTrace...(getValue)");
			e.printStackTrace();	
			
			// ⑤ 잡아낸 예외를 다시 던지기
			throw e;
			//-- 주석 처리 시 (즉, 잡아낸 예외를 다시 던지지 않을 경우)
			//   main() 메소드의 try-catch 는 수행되지 않게 된다.
		}

		return a;
	}
}


// 실행 결과
/*
printStackTrace...(getValue)
java.lang.Exception: data가 0보다 작습니다.
        at Test147.getData(Test147.java:27)
        at Test147.getValue(Test147.java:39)
        at Test147.main(Test147.java:13)
printStackTrace...(main)
java.lang.Exception: data가 0보다 작습니다.
        at Test147.getData(Test147.java:27)
        at Test147.getValue(Test147.java:39)
        at Test147.main(Test147.java:13)
계속하려면 아무 키나 누르십시오 . . .
*/