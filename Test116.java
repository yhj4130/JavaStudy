/*===========================
  ■■■ 클래스 고급 ■■■
  - 인터페이스(Interface)
===========================*/

// ○ 실습 문제
//    성적 처리 프로그램을 구현한다.
//    단, 인터페이스를 활용할 수 있도록 한다.

// 실행 예)
// 인원수 입력(1~10) : 2
// 1번째 학생의 학번 이름 입력(공백구분) : 1921004 ○○○
// 국어 영어 수학 점수 입력   (공백구분) : 90 100 85
// 2번째 학생의 학번 이름 입력(공백구분) : 1921005 ○○○
// 국어 영어 수학 점수 입력   (공백구분) : 85 70 65

// 1921004 ○○○  90 100  85       275  91
//               수  수  우 
// 1921005 ○○○  85  70  65      220  73
//               우  미  양

// 계속하려면 아무 키나 누르십시오...

import java.util.Scanner;

// 속성만 존재하는 클래스 → 지료형 활용
class Record {
	String hak, name;   //-- 학번, 이름
	int kor, eng, mat;   //-- 국어, 영어, 수학 점수
	int tot, avg;      //-- 총점, 평균(편의상 정수 처리)
}

// 인터페이스
interface Sungjuk {

	public void set();      //-- 인원 수 입력 
	public void input();      //-- 학생의 학번, 이름, 국어점수, 영어점수, 수학점수 입력
	public void print();      //-- 입력한 학생의 정보 출력
}

// 문제 해결 과정에서 설계해야 할 클래스
class SungjukImpl implements Sungjuk {   // Sungjuk 인터페이스의 메소드 재정의
   
	Record[] rc;      //-- class Record 배열
	int st, i, j;   //-- 학생수, for문 변수
	int[][] score;   //-- 국어, 영어, 수학 점수를 저장할 2중 배열
	char[][] rank;   //-- 점수의 등급 2중 배열

	@Override      // 메소드 override
	public void set() {      // 인터페이스 Sungjuk의 메소드 중 set() 메소드 재정의
      
		Scanner sc = new Scanner(System.in);

		do         // do~while문을 이용해 인원수 입력
		{
			System.out.print("인원수 입력(1~10) : ");
			st = sc.nextInt();
		}	
		while (st<1 || st>10);   // 입력할 수 있는 학생수는 1~10
		rc = new Record[st];   // rc 배열에 입력한 학생 수 만큼의 배열 방 설정
		score = new int[st][3];   // score 배열에 입력한 학생 수 만큼의 배열 방 설정, [3] → 국어, 영어, 수학점수
		rank = new char[st][3];   // rank 배열에 입력한 학생 수 만큼의 배열 방 설정, [3] → 국어, 영어, 수학점수의 등급
	}

	@Override      // 메소드 override
	public void input() {   // 인터페이스 Sungjuk의 메소드 중 input() 메소드 재정의

		Scanner sc = new Scanner(System.in);

		for (i=0; i<st; i++)   // for문을 이용하여 학생의 학번, 이름, 국어점수, 영어점수, 수학점수 입력
		{
			rc[i] = new Record();
			System.out.printf("%d번째 학생의 학번 이름 입력(공백구분) : ", i+1);
			rc[i].hak = sc.next();      // 학번 입력 저장
			rc[i].name = sc.next();   // 이름 입력 저장

			System.out.print("국어 영어 수학 점수 입력   (공백구분) : ");
			score[i][0] = rc[i].kor = sc.nextInt();   // score 2중 배열과 rc[i].kor에 국어점수 저장
			score[i][1] = rc[i].eng = sc.nextInt();   // score 2중 배열과 rc[i].eng에 영어점수 저장
			score[i][2] = rc[i].mat = sc.nextInt();   // score 2중 배열과 rc[i].mat에 수학점수 저장

			rc[i].tot = rc[i].kor + rc[i].eng + rc[i].mat;   // 총점 계산
			rc[i].avg = rc[i].tot / 3;         // 평균 계산(정수형)
		}

		System.out.println();            // 개행

		for (i=0; i<st; i++) {   // for문을 이용하여 국어점수, 영어점수, 수학점수 각각 등급 부여

			for (j=0; j<3; j++) {

				switch (score[i][j] - score[i][j]%10) {      // 점수에 점수를 10으로 나눴을 때의 나머지를 뺀 값
					case 100: rank[i][j] = '수';break;   // 100이상일 경우   
					case 90: rank[i][j] = '수';break;      // 90이상일 경우
					case 80: rank[i][j] = '우';break;      // 80이상일 경우
					case 70: rank[i][j] = '미';break;      // 70이상일 경우
					case 60: rank[i][j] = '양';break;      // 60이상일 경우
					default: rank[i][j] = '가';break;      // 그 외
				}
			}
		}
	}

	@Override      // 메소드 override
	public void print() {   // 인터페이스 Sungjuk의 메소드 중 print() 메소드 재정의      
		System.out.println();   // 개행

		for (i=0; i<st; i++)   // for문을 이용하여 입력한 학생의 정보 출력
		{
			// 학번, 이름, 국어점수, 영어점수, 수학점수, 총합점수, 평균점수 출력
			System.out.printf("%s %s %d %d %d\t%d %d\n", rc[i].hak, rc[i].name, rc[i].kor, rc[i].eng, rc[i].mat, rc[i].tot, rc[i].avg);   
        
			// rank의 이중배열로 해당 학생의 국어, 영어, 수학 등급 출력
			System.out.printf("\t\t%c %c %c\n", rank[i][0], rank[i][1], rank[i][2]);
		}
	}	
}

// main() 메소드가 포함하고 있는 외부 클래스
public class Test116 {

   public static void main(String[] args) {
	   
	   Sungjuk ob;

	   // 문제 해결 과정에서 작성해야 할 ob 구성

	   ob = new SungjukImpl();   //-- 업 캐스팅
	   ob.set();
	   ob.input();
	   ob.print();
   }
}


// 실행 결과
/*
1921004 윤희진 90 100 85        275 91
                수 수 우
1921005 홍길동 85 70 60    215 71
                우 미 양
// 계속하려면 아무키나 누르십시오...
*/