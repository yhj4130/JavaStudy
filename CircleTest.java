import java.util.Scanner;

class CircleTest
{
	int r;

	double PI = 3.141592;

	void input() 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է� : ");
		r = sc.nextInt();
	}

	double calLength()
	{		
		double result = ( 2 * r * PI);
		return result;
	}

	double calArea()
	{
		double result;
		result = r*r*PI;
		return result;
	}

	void print(double a,double l)
	{
			System.out.println(">>�������� " + r + "�� ����");
			System.out.printf(">>���� : %.2f\n", a);
			System.out.printf(">>�ѷ� : %.2f\n", l);
	}
	
}
