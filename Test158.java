/*===================================
  ■■■ 컬렉션 (Collection) ■■■
===================================*/

// ○ 실습 문제
// 현재 작성중인 Test158 클래스를 완성하여 다음 기능을 가진 프로그램을 구현한다.

/*
실행 예)


	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 1

	1번째 요소 입력 : 곽한얼
	1번째 요소 입력 성공
	요소 입력 계속(Y/N)? : y

	2번째 요소 입력 : 권홍비
	2번째 요소 입력 성공
	요소 입력 계속(Y/N)? : n


	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 2

	[벡터 전체 출력]
		곽한얼
		권홍비
	벡터 전체 출력 완료
	

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 3

	검색할 요소 입력 : 곽한얼
	
	[검색 결과 출력]
	항목이 존재합니다.


	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 4

	삭제할 요소 입력 : 김경환

	[삭제 결과 출력]
	항목이 존재하지 않아 삭제할 수 없습니다.


	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 5

	변경할 대상 입력 : 권홍비
	수정할 내용 입력 : 김선아

	[변경 결과 출력]
	변경이 완료되었습니다.


	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 6

	프로그램 종료
	계속하려면 아무키나 누르십시오...
*/

import java.util.Vector;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Menus {

	public static final int E_ADD=1;	//-- 요소 추가
	public static final int E_DISP=2;	//-- 요소 출력
	public static final int E_FIND=3;	//-- 요소 검색
	public static final int E_DEL=4;	//-- 요소 삭제
	public static final int E_CHA=5;	//-- 요소 변경
	public static final int E_EXIT=6;	//-- 종료
}

public class Test158 extends Menus {
	
	// 주요 속성 구성
	private static final Vector<Object> vt;
	private static BufferedReader br;
	private static Integer sel;			//-- 선택 값
	private static String con;			//-- 계속 여부

	// static 초기화 블럭
	static {
		
		// Vector 자료구조 생성
		vt = new Vector<Object>();

		// BufferedReader 클래스 인스턴스 생성
		br = new BufferedReader(new InputStreamReader(System.in));

		// 사용자 입력값 초기화
		sel = 1;
		con = "Y";
	}

	// 메뉴 출력 메소드
	public static void menuDisp() {

		System.out.println("[메뉴 선택]");
		System.out.println("1. 요소 추가");
		System.out.println("2. 요소 출력");
		System.out.println("3. 요소 검색");
		System.out.println("4. 요소 삭제");
		System.out.println("5. 요소 변경");
		System.out.println("6. 종료");
	}

	// 메뉴 선택 메소드
	public static void menuSelect() throws IOException{

		do
		{
			System.out.print(">> 메뉴 선택(1~6) : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<E_ADD || sel >E_EXIT);
	}

	// 선택된 메뉴 실행에 따른 기능 호출 메소드
	public static void menuRun() throws IOException {

		if(sel == E_ADD)
			addElement();
		else if(sel == E_DISP)
			dispElement();
		else if(sel == E_FIND)
			findElement();
		else if(sel == E_DEL)
			delElement();
		else if(sel == E_CHA)
			chaElement();
		else if(sel == E_EXIT)
			exit();
	}

	// 요소 추가(입력) 메소드
	public static void addElement() throws IOException {
		
		int i = 0;
		
		while(true){

			do
			{
				i++;
				System.out.printf("\n%d번째 요소 입력 : ", i);
				String str = br.readLine();
				vt.add(str);
				System.out.printf("%d번째 요소 입력 성공~!!\n", i);
				System.out.print("요소 입력 계속(Y/N)? : ");
				con = br.readLine();
			}
			while (con.equals("N") && con.equals("n"));
			
			if (con.equals("N") || con.equals("n"))
			{
				System.out.println("\n");
				break;
			}
		}
	}

	// 요소 출력 메소드
	public static void dispElement() {

		System.out.println("\n[벡터 전체 출력]");

		for (int i=0; i<vt.size(); i++)
			System.out.printf("     %s\n", vt.elementAt(i));
		System.out.println();

		System.out.println("벡터 전체 출력 완료\n\n");
	}

	// 요소 검색 메소드
	public static void findElement() throws IOException {

		System.out.print("\n검색할 요소 입력 : ");
		String str3 = br.readLine();

		System.out.println("\n[검색 결과 출력]");

		
		if (vt.contains(str3))
		{
			System.out.println("항목이 존재합니다.\n\n");
		}
		else
			System.out.println("항목이 존재하지 않습니다.\n\n");
	}

	// 요소 삭제 메소드
	public static void delElement() throws IOException {
	
		System.out.print("\n삭제할 요소 입력 : ");
		String str4 = br.readLine();

		System.out.println("\n[삭제 결과 출력]");

		if (vt.contains(str4))
		{
			vt.remove(str4);
			System.out.println("삭제 완료!!!\n\n");
		}
		else
			System.out.println("항목이 존재하지 않아 삭제할 수 없습니다.\n\n");
	}

	// 요소 수정(변경) 메소드
	public static void chaElement() throws IOException {
		
		String str1;
		String str2;

		System.out.print("\n변경할 대상 입력 : ");
		str1 = br.readLine();
		
		if (vt.contains(str1))
		{
			System.out.print("수정할 내용 입력 : ");
			str2 = br.readLine();
			vt.set(vt.indexOf(str1), str2);
			System.out.println("\n[변경 결과 출력]");
			System.out.println("변경이 완료되었습니다.\n\n");
		}
		else
			System.out.println("항목이 존재하지 않습니다.\n\n");
	}

	// 프로그램 종료 메소드
	public static void exit() {
		
		System.out.println("\n프로그램 종료");
		System.exit(-1);
	}
	
	// main() 메소드 -- 완성
	public static void main(String[] args) throws IOException {
	
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
	}
}