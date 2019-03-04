/*==========================================
  ���� ���� �帧�� ��Ʈ�� (���) ����
  - if�� �ǽ�
==========================================*/

// �� �ǽ� ����
// ����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
// ������ ���� ���·� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �̸� �Է� : ������
// ���� ���� : 90
// ���� ���� : 80
// ���� ���� : 70

// >> ����� �̸��� �������Դϴ�.
// >> ���� ������ 90,
// >> ���� ������ 80,
// >> ���� ������ 70,
// >> ������ 240�̰�, ����� 80�Դϴ�.
// >> ����� B�Դϴ�.
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

// �� ����� ��� ������ �������� ó���Ѵ�.

// 80 <= avg < 90 (x) �� avg >= 9 && avg < 90
// 90 ~ 100�� : A	80 ~ 89�� : B
// 70 ~ 79�� : C	60 ~ 69�� : D
// 60�� �̸� : F

// ��, BufferedReader�� readLine() �޼ҵ带 ���� �Է¹��� �� �ֵ��� �ϸ�, 
// printf() �޼ҵ带 ���� ����� �� �ֵ��� �Ѵ�.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test031 {

	public static void main(String[] args) throws IOException {
		
		String strName, grade;		// �̸�, ���	char grade
		int kor, eng, math, total;	// ����, ����, ����, ����
		double avg;					// ���	

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�̸� �Է� : ");
		strName = br.readLine();

		System.out.print("���� ���� : ");
		kor = Integer.parseInt(br.readLine());

		System.out.print("���� ���� : ");
		eng = Integer.parseInt(br.readLine());

		System.out.print("���� ���� : ");
		math = Integer.parseInt(br.readLine());

		total = kor + eng + math;		// ���� ���
		avg = total / 3.0;				// ��� ���
		

		if (avg >= 90)
			grade = "A";
		else if (avg >= 80)
			grade = "B";
		else if (avg >= 70)
			grade = "C";
		else if (avg >= 60)
			grade = "D";
		else
			grade = "F";
		
		/*
		grade = "F";			// F�� �̸� ���� 	
		if (avg >= 90)
			grade = "A";
		else if (avg >= 80)
			grade = "B";
		else if (avg >= 70)
			grade = "C";
		else if (avg >= 60)
			grade = "D";				// �������� �� esle�� ���� �ʾƵ� �ȴ�.
		*/

		System.out.printf("%n����� �̸��� %s�Դϴ�.%n", strName);
		System.out.printf(">> ���� ������ %d,%n", kor);
		System.out.printf(">> ���� ������ %d,%n", eng);
		System.out.printf(">> ���� ������ %d,%n", math);
		System.out.printf(">> ������ %d�̰�, ����� %.1f�Դϴ�.%n", total, avg);
		System.out.printf(">> ����� %s �Դϴ�.%n", grade);		// char - %c

	}
}

// ���� ���
/*
�̸� �Է� : ���ȯ
���� ���� : 90
���� ���� : 80
���� ���� : 70

����� �̸��� ���ȯ�Դϴ�.
>> ���� ������ 90,
>> ���� ������ 80,
>> ���� ������ 70,
>> ������ 240�̰�, ����� 80�Դϴ�.
>> ����� B �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/