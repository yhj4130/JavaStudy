/*====================================
  ■■■ 예외(Exception) 처리 ■■■
====================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test144 {

	private String[] data = new String[3];

	public void proc() //throws IOException 
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int n = 0;

		try
		{
			System.out.print("이름 입력[종료:Ctrl+z] : ");

		    while ((str = br.readLine()) != null)
			{
				data[n++] = str;
				System.out.print("이름 입력[종료:Ctrl+z] : ");
			}	
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("예외 발생");
			System.out.println("getMessage : " + e.getMessage());
			System.out.println("toString : " + e.toString());
			System.out.println("printStackTrace");
			e.printStackTrace();
		}
		
		catch (IOException e)
		{
			System.out.println(e.toString());	
		}

		System.out.println("입력된 내용");
		for (String s : data) {
			//System.out.println(s);

			if(s != null)
				System.out.println(s);
		}
		//System.out.println();

		
	}

	public static void main(String[] args) {

		Test144 ob = new Test144();
		ob.proc();
	}
}


// 실핼 결과
/*
이름 입력[종료:Ctrl+z] : 윤희진
이름 입력[종료:Ctrl+z] : 이아름
이름 입력[종료:Ctrl+z] : 이정윤
이름 입력[종료:Ctrl+z] : ^Z
입력된 내용
윤희진
이아름
이정윤

계속하려면 아무 키나 누르십시오 . . .
*/
/*
이름 입력[종료:Ctrl+z] : 이슬기
이름 입력[종료:Ctrl+z] : 윤희진
이름 입력[종료:Ctrl+z] : 이정윤
이름 입력[종료:Ctrl+z] : 이아름
예외 발생
getMessage : 3
toString : java.lang.ArrayIndexOutOfBoundsException: 3
printStackTrace
java.lang.ArrayIndexOutOfBoundsException: 3
        at Test144.proc(Test144.java:27)
        at Test144.main(Test144.java:56)
입력된 내용
이슬기
윤희진
이정윤

계속하려면 아무 키나 누르십시오 . . .
*/
/*
이름 입력[종료:Ctrl+z] : 윤희진
이름 입력[종료:Ctrl+z] : ^Z
입력된 내용
윤희진
계속하려면 아무 키나 누르십시오 . . .
*/