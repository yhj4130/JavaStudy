/*===========================
  ���� Ŭ���� ��� ����
  - ���(Inheritance)
===========================*/

// �� �ǽ� ����
//    ������ ���� ���α׷��� �����Ѵ�.
//    ��, ����� ������ �����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 20 5
// ������ �Է�(+ - * /) : -
// >> 20 - 15 = 5
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ�...

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

		System.out.print("������ �� ���� �Է�(���� ����) : ");
		x = sc.nextInt();
		y = sc.nextInt();

		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();
	}

	public double calc() {
		double result = 0;

		switch(op) {
			case '+' : result = x + y; break;
			case '-' : result = x - y; break;
			case '*' : result = x * y; break;
			case '/' : result = x / y; break;
			default : System.out.println("�Ǻ� �Ұ�");
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