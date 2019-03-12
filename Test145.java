/*====================================
  ■■■ 예외(Exception) 처리 ■■■
====================================*/

// Test146과 비교

class Demo
{
	private int value;
	
	// setter
	public void setValue(int value) {

		if (value<=0)
			return;	//-- 종료 → 메소드 종료

		this.value = value;
	}
	
	// getter
	public int getValue() {

		return value;
	}
}

public class Test145 {

	public static void main(String[] args) {

		Demo ob = new Demo();
		ob.setValue(-3);
		int result = ob.getValue();
		System.out.println(result);
	}
}


// 실행 결과
/*
0
계속하려면 아무 키나 누르십시오 . . .
*/