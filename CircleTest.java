import java.util.Scanner;

class CircleTest
{
	int r;

	double PI = 3.141592;

	void input() 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("반지름 입력 : ");
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
			System.out.println(">>반지름이 " + r + "인 원의");
			System.out.printf(">>넓이 : %.2f\n", a);
			System.out.printf(">>둘레 : %.2f\n", l);
	}
	
}
