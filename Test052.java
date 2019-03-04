/*==========================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - 반복문 (while문) 실습
==========================================*/

// ○ 과제 
// 사용자로부터 임의의 정수를 입력받아
// 1부터 그 수까지의 전체 합과, 짝수의 합과, 홀수의 합을
// 각각 결과값으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 임의의 정수 입력 : 276
// >> 1 ~ 276 까지 정수의 합 :
// >> 1 ~ 276 까지 짝수의 합 :
// >> 1 ~ 276 까지 홀수의 합 :
// 계속하려면 아무 키나 누르십시오...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test052 {
      
	  public static void main(String[] args) throws IOException {

		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		  // 주요 변수 선언
		  int a;		  //-- 사용자가 입력받을 정수
		  int sum1 = 0;   //-- 정수합
		  int sum2 = 0;   //-- 짝수합
		  int sum3 = 0;   //-- 홀수합

		  int i = 0;      //-- while문에서 사용할 변수

		  System.out.print("임의의 정수 입력 : ");
		  a = Integer.parseInt(br.readLine());         
         
          // 연산 및 처리
          while (i <= a) {
			  sum1 += i;	   //-- 정수합 계산

              if (i%2==0)
				  sum2 += i;   //-- 2로 나누면 나머지가 0인 짝수합 계산

              if (i%2==1)
                  sum3 += i;   //-- 2로 나누면 나머지가 1인 홀수합 계산

              i++;
	      }
         
          // 결과 출력
          System.out.println(">> 1 ~ " + a + " 까지의 정수의 합 : " + sum1);
          System.out.println(">> 1 ~ " + a + " 까지의 짝수의 합 : " + sum2);
          System.out.println(">> 1 ~ " + a + " 까지의 홀수의 합 : " + sum3);         
      }
}

// 실행 결과
/*
임의의 정수 입력 : 276
>> 1 ~ 276 까지의 정수의 합 : 38226
>> 1 ~ 276 까지의 짝수의 합 : 19182
>> 1 ~ 276 까지의 홀수의 합 : 19044
계속하려면 아무 키나 누르십시오...
*/
/*
임의의 정수 입력 : 23
>> 1 ~ 23 까지의 정수의 합 : 276
>> 1 ~ 23 까지의 짝수의 합 : 132
>> 1 ~ 23 까지의 홀수의 합 : 144
계속하려면 아무 키나 누르십시오...
*/