/*===========================
  ■■■ 클래스 고급 ■■■
  - 중첩 클래스
===========================*/

class Test2 {

	static int a = 10;	// 전역변수 멤버변수 static변수(클래스변수)
	int b = 20;			// 전역변수 멤버변수 instance변수(인스턴스 변수)
	
	// ▶ 첫 번째 write() 메소드
	void write() {

		System.out.println("write() - ①");
		final int c = 30;	// 지역변수 상수화된변수(값이변하지않은변수)
		int d = 40;			// 지역변수 값이수시로변할수있는변수

		// ※ 변수 c와 변수 d는 둘 다 지역변수이지만
		//    cㅊ는 final 변수이기 떄문에
		//    두 번째 write() 메소드에서 언제 접근하더라도
		//    고정된 값임을 보장받을 수 있다.
		//    반면에 d는 그 값이 수시로 변동될 수 있는 상황이므로
		//    LocalTest 클래스의 인스턴스 생성 시점을
		//    보장받을 수 없기 때문에 d에 접근하는 것은 피해야 한다.
		
		// 메소드 안에 존재하는 또다른 클래스(local class)
		class LocalTest	{

			// ▶ 두 번째 write() 메소드
			void write() {

				System.out.println("write() - ②");
				System.out.println("a : " + a);
				System.out.println("b : " + b);
				System.out.println("c : " + c);
				//System.out.println("d : " + d);	//--==>> 컴파일 에러
			}
		}

		d = 10;	//-- 주석처리할 경우 컴파일 에러 X
		
		// 첫 번째 write() 메소드에서 생성한 
		LocalTest ob1 = new LocalTest();
		ob1.write();	//-- 두 번째 write() 메소드 호출
	}
}

// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test118 {

	public static void main(String[] args) {

		Test2 ob2 = new Test2();
		ob2.write();	//-- 첫 번째 write() 메소드 호출

	}
}


// 실행 결과
/*
write() - ①
write() - ②
a : 10
b : 20
c : 30
계속하려면 아무 키나 누르십시오 . . .
*/