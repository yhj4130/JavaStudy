/*========================================
  ■■■ 클래스 고급 ■■■
  - 상속 관계에 있는 클래스들 간의 캐스팅
  - 업 캐스팅, 다운 캐스팅
========================================*/

// 상위 클래스, 부모 클래스
class SuperTest {

	public int a = 10, b = 20;
	public void write() {

		System.out.println("슈퍼 클래스 write() 메소드");
	}

	public int hap() {

		return a + b;
	}
}

// 하위 클래스, 자식 클래스
class SubTest extends SuperTest {
	
	public int b = 100, c = 200;

	@Override
	public int hap() {

		return a + b + c;
	}

	public void print() {

		System.out.println("서브 클래스 print() 메소드");
	}
}

// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test111 {

	public static void main(String[] args) {

		// 하위 클래스(sub class) 기반 인스턴스 생성
		SubTest ob1 = new SubTest();
		System.out.println("ob1.b : " + ob1.b);
		//--==>> ob1.b : 100
		
		//SubTest ob2 = new SubTest();

		// ○ 업 캐스팅
		//SuperTest ob2;
		SuperTest ob2 = ob1;
		//-- 『SuperTest ob2 = (SuberTest)ob1;』과 동일한 코드

		System.out.println("ob2.b : " + ob2.b);
		//--==>> ob2.b : 20
		//-- 변수는 객체별로 따로 할당되므로
		//   변수 b는 ob2의 변수이다.

		System.out.println("합    : " + ob2.hap());
		//--==>> 합    : 310
		//-- hap() 메소드는 오버라이딩(Overriding) 되어 있고
		//   ob2는 ob1을 업캐스팅한 상태의 객체이므로
		//   ob1이 생성되는 과정에서 이미 상위 클래스의 메소드는 재정의 되었고
		//   『SuperTest』의 hap() 메소드를 호출하는 것이 아니라
		//   『SubTest』에서 재정의한 hap() 메소드를 호출하게 된다.
		//   즉 , 메소드는 업캐스팅이 되더라도
		//   재정의(덮어쓰기)한 이상 원래의 기능으로 되돌릴 수 없다.

		ob2.write();
		//--==>> 슈퍼 클래스 write() 메소드
		
		//ob2.print();
		//--==>> 에러 발생 → 다운 캐스팅 필요

		// ○ 다운 캐스팅
		((SubTest)ob2).print();
		//--==>> 서브 클래스 print() 메소드

		// ※ 추가 관찰 --------------------------------------
		// 다운 캐스팅 가능 여부
	}
}