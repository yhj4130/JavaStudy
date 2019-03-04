import java.util.Scanner;

/*
public class Sungjuk {

	Record rc[];
	
	int st;
	
	// 정보 입력
	void write() {

		Scanner sc = new Scanner(System.in);
		do
		{	
			System.out.print("인원 수 입력(1~100) : ");
			st = sc.nextInt();
		}
		while (st<0 || st >100);
		
		rc = new Record[st];
		
		for (int i=0; i<st; i++)
		{
			rc[i] = new Record();
			System.out.print((i+1)+"번째 학생의 이름 입력 : ");
			rc[i].name = sc.next(); 
			System.out.print("국어점수 : ");
			rc[i].kor = sc.nextInt();
			System.out.print("영어점수 : ");
			rc[i].eng = sc.nextInt();
			System.out.print("수학점수 : ");
			rc[i].math = sc.nextInt();
			
		}
	}
	
	// 결과 출력
	void print() {

		System.out.println();
		
		for (int i=0; i<st; i++)
		{
			rc[i].tot = rc[i].kor + rc[i].eng + rc[i].math;
			rc[i].avg = rc[i].tot / 3.0;
		}

		for (int i=0; i<st; i++)
		{
			for (int j=0; j<st; j++)
			{
				if (rc[i].avg < rc[j].avg)
				{
					rc[i].rank = rc[i].rank + 1;
				}
			}
			System.out.printf(" %s %d %d %d %d %.1f %d\n", rc[i].name, rc[i].kor, rc[i].eng, rc[i].math, rc[i].tot, rc[i].avg, (rc[i].rank+1));
		}
		System.out.println();
	}
}
*/


public class Sungjuk 
{
	// 주요 속성 구성
	int inwon;			//-- 인원 수
	Record[] recArr;	//-- Record 배열
						//   (학생 1명 당 Record배열의 방 1개 활용)

	// 기능 (메소드 정의)
	// ① 인원수 입력
	public void set() {
		
		Scanner sc = new Scanner(System.in);

		do
		{	
			System.out.print("인원 수 입력(1~100) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>100);
		
		// Record 클래스를 기반으로 생성된 객체(인스턴스)를 담을 수 있는
		// 배열방을 inwon 만큼 생성한 것이지,
		// Record 클래스의 인스턴스를 생성한 것은 아니다.
		recArr = new Record[inwon];
	}

	// ② 상세 데이터 입력 + ③ 총점/평균 산출
	public void input() {
		
		Scanner sc = new Scanner(System.in);

		String[] subTitle = {"국어점수 : ", "영어점수 : ", "수학점수 : "};

		for (int i=0; i<inwon; i++)	// 인원수 만큼 반복(== recArr.length)
		{

			// Record 클래스 기반의 인스터스 생성
			recArr[i] = new Record();
			System.out.printf("%d번째 학생의 이름 입력 : ", i+1);
			recArr[i].name = sc.next();

			for (int j=0; j<subTitle.length; j++)
			{
				// 안내 메세지 출력
				System.out.print(subTitle[j]);

				// 사용자가 입력한 데이터를 스코어(score) 배열에 담아내기
				recArr[i].score[j] = sc.nextInt();

				// 국어, 영어, 수학 점수 데이터를 반복적으로 입력받는 동안
				// 그 과정에서 총점 누적하기
				recArr[i].tot += recArr[i].score[j];
			}

			// 평균 산출하기
			recArr[i].avg  = recArr[i].tot / 3.0;
		}
	}

	// ③ 결과출력
	public void print() {
		
		// 석차 산출 메소드 호출구문 추가
		ranking();

		// 개행
		System.out.println();

		// 학생 1인 당 반복 출력 구문
		for (int i=0; i<inwon; i++)		//-- 학생 인원 수 만큼 반복
		{
			// 이름 출력
			System.out.printf("%5s", recArr[i].name);

			// 성적(국어, 영어, 수학)
			for (int j=0; j<3; j++)
				System.out.printf("%4d", recArr[i].score[j]);
			
			// 총점, 평균 출력
			System.out.printf("%5d", recArr[i].tot);
			System.out.printf("%8.2f", recArr[i].avg);
			
			// 석차 출력 구문 추가
			System.out.printf("%5d", recArr[i].rank);
			6
			// 개행
			System.out.println();
		}
	}
	// ④ 석차 산출 메소드 추가
	private void ranking() {
		
		// 루프 변수
		int i, j;

		// 모든 학생들의 등수(석차)를 1로 초기화
		for (i=0; i<inwon; i++)
			recArr[i].rank = 1;

		// 등수(석차) 산출
		for (i=0; i<inwon-1; i++)		// i → 비교 기준을 설정하는 인덱스
		{
			for (j=i+1; j<inwon; j++)	// j → 비교 대상을 설정하는 인덱스
			{
				if (recArr[i].avg > recArr[j].avg)	// 기준 데이터가 비교 데이터보다 크다면
				{
					// 비교 데이터의 rank를 1만큼 증가
					recArr[j].rank++;
				}
				else if (recArr[j].avg > recArr[i].avg)	// 비교 데이터가 기준 데이터보다 크다면
				{
					// 기준 데이터의 rank를 1만큼 증가
					recArr[i].rank++;
				}
			}
		}
	}
}
