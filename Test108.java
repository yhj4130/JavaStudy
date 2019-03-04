/*===========================
  ■■■ 클래스 고급 ■■■
  - 상속(Inheritance)
===========================*/

// ○ 실습 문제
//    다음과 같은 프로그램을 구현한다.
//    단, 상속의 개념을 적용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 두 정수 입력(공백 구분) : 20 5
// 연산자 입력(+ - * /) : -
// >> 20 - 15 = 5
// 계속하려면 아무 키나 누르십시오...

import java.util.Scanner;
import java.io.IOException;

class AClass {

	protected int x, y;
	protected char op;

	AClass() {

	}

	void write(double result) {

		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
}

class BClass extends AClass {

	void print() throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		x = sc.nextInt();
		y = sc.nextInt();

		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();
	}

	public double calc() {
		double result = 0;

		switch(op) {
			case '+' : result = x + y; break;
			case '-' : result = x - y; break;
			case '*' : result = x * y; break;
			case '/' : result = x / y; break;
			default : System.out.println("판별 불가");
		}

		return result;
	}
}

public class Test108 {

	public static void main(String[] args) throws IOException {
		
		BClass bc = new BClass();

		bc.print();
		double result = bc.calc();
		bc.write(result);


	}
}