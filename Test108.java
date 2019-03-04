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
import java.io.BufferedReader;
import java.io.InputStreamReader;

class AClass {

	protected int x, y;
	protected char op;

	AClass() {

	}

	void write(double result) {

		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
}

/*
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
			case '/' : result = (double)x / y; break;
			default : System.out.println("판별 불가");
		}

		return result;
	}
}
*/

class BClass extends AClass {

	BClass() {
	}

	boolean input() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("임의의 두 정수 입력(공백 구분) : ");	// 20 15
		String temp = br.readLine();							// "20 15"
		String[] str = temp.split("\\s");						// 구분자 → 공백

		// ※ 문자열.split("구분자");
		// ex) "사과 딸기 바나나 포도 수박".split("\\s");
		//     반환 → {"사과", "딸기", "바나나", "포도", "수박"}
		// ex) "10, 20, 30, 40".split("\\s");
		//     반환 → {"10", "20", "30", "40"}
		//-----------------------------------------> String[] str = {"20", 15"}

		if (str.length != 2)
			return false;	//-- false(거짓)을 반환하여 input() 메소드 종료
		
		// ※ 이 조건문을 수행할 경우 아래에 코드들이 남아있는 상황이지만
		//    더 이상 수행하지 않고 결과 값을 반환하며 메소드는 종료된다.

		x = Integer.parseInt(str[0]);
		y = Integer.parseInt(str[1]);

		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();
		
		/*
		if(op!='+' && op!='-' && op!='*' && op!='/')
			return false;

		return true;
		*/

		if (op=='+' || op=='-' ||  op=='*' || op=='/')
			return true;

		return false;
	}

	double calc() {
			
		double result = 0;

		switch(op) {
	
			case '+' : result = x + y; break;
			case '-' : result = x - y; break;
			case '*' : result = x * y; break;
			case '/' : result = (double)x / y; break;
			default : System.out.println("판별 불가");
		}
		return result;
	}
}

public class Test108 {

	public static void main(String[] args) throws IOException {
		
		/*
		BClass bc = new BClass();

		bc.print();
		double result = bc.calc();
		bc.write(result);
		*/
		
		BClass ob = new BClass();

		if (!ob.input())				// 입력값이 유효하지 않다면...
		{
			System.out.print("Error");
			return;
		}

		double result = ob.calc();
		ob.write(result);
	}
}


// 실행 결과
/*
임의의 두 정수 입력(공백 구분) : 20 15
연산자 입력(+ - * /) : +
>> 20 + 15 = 35.00
계속하려면 아무 키나 누르십시오 . . .
*/
/*
임의의 두 정수 입력(공백 구분) : 20 15
연산자 입력(+ - * /) : -
>> 20 - 15 = 5.00
계속하려면 아무 키나 누르십시오 . . .
*/
/*
임의의 두 정수 입력(공백 구분) : 20 15
연산자 입력(+ - * /) : *
>> 20 * 15 = 300.00
계속하려면 아무 키나 누르십시오 . . .
*/
/*
임의의 두 정수 입력(공백 구분) : 20 15
연산자 입력(+ - * /) : /
>> 20 / 15 = 1.33
계속하려면 아무 키나 누르십시오 . . .
*/