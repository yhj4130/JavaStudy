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
			case '/' : result = (double)x / y; break;
			default : System.out.println("�Ǻ� �Ұ�");
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
		
		System.out.print("������ �� ���� �Է�(���� ����) : ");	// 20 15
		String temp = br.readLine();							// "20 15"
		String[] str = temp.split("\\s");						// ������ �� ����

		// �� ���ڿ�.split("������");
		// ex) "��� ���� �ٳ��� ���� ����".split("\\s");
		//     ��ȯ �� {"���", "����", "�ٳ���", "����", "����"}
		// ex) "10, 20, 30, 40".split("\\s");
		//     ��ȯ �� {"10", "20", "30", "40"}
		//-----------------------------------------> String[] str = {"20", 15"}

		if (str.length != 2)
			return false;	//-- false(����)�� ��ȯ�Ͽ� input() �޼ҵ� ����
		
		// �� �� ���ǹ��� ������ ��� �Ʒ��� �ڵ���� �����ִ� ��Ȳ������
		//    �� �̻� �������� �ʰ� ��� ���� ��ȯ�ϸ� �޼ҵ�� ����ȴ�.

		x = Integer.parseInt(str[0]);
		y = Integer.parseInt(str[1]);

		System.out.print("������ �Է�(+ - * /) : ");
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
			default : System.out.println("�Ǻ� �Ұ�");
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

		if (!ob.input())				// �Է°��� ��ȿ���� �ʴٸ�...
		{
			System.out.print("Error");
			return;
		}

		double result = ob.calc();
		ob.write(result);
	}
}


// ���� ���
/*
������ �� ���� �Է�(���� ����) : 20 15
������ �Է�(+ - * /) : +
>> 20 + 15 = 35.00
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
/*
������ �� ���� �Է�(���� ����) : 20 15
������ �Է�(+ - * /) : -
>> 20 - 15 = 5.00
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
/*
������ �� ���� �Է�(���� ����) : 20 15
������ �Է�(+ - * /) : *
>> 20 * 15 = 300.00
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
/*
������ �� ���� �Է�(���� ����) : 20 15
������ �Է�(+ - * /) : /
>> 20 / 15 = 1.33
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/