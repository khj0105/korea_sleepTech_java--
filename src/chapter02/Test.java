package chapter02;



import java.util.Scanner;



public class Test {

	public static void main(String[] args) {

		// == 1.조건문 예제 == //

		// : 좌표의 사분면 찾기

		// 1. 스캐너를 사용하여 x, y 변수에 데이터를 저장

		// 2. (x, y) 좌표가 제 1, 2, 3, 4 사분면 중 어느 위치에 있는지 검사

		// >> 조건문



		// 3. 각 분기에 위치할 경우 functionScope 변수에 몇 사분면인지 할당

		// EX) functionScope = "제1사분면"



		// 4. 조건문 이행 완료 시

		// "결과: " + functionScope 출력



//		Scanner sc = new Scanner(System.in);

//

//		System.out.println("x: ");

//		int x = sc.nextInt();

//		System.out.println("y: ");

//		int y = sc.nextInt();

//

//		if (x > 0 && y > 0) {

//			System.out.println("제1사분면");

//		} else if (x < 0 && y > 0) {

//			System.out.println("제2사분면");

//		} else if (x < 0 && y < 0) {

//			System.out.println("제3사분면");

//		} else {

//			System.out.println("제4사분면");

//		}



		String functionScope = null;

		Scanner sc = new Scanner(System.in);



		System.out.println("x: ");

		int x = sc.nextInt();

		System.out.println("y: ");

		int y = sc.nextInt();



		if (x > 0 && y > 0) {

			functionScope = "제1사분면";

		} else if (x < 0 && y > 0) {

			functionScope = "제2사분면";

		} else if (x < 0 && y < 0) {

			functionScope = "제3사분면";

		} else {

			functionScope = "제4사분면";

		}

		

		System.out.println("결과: " + functionScope);

		sc.close();



		

		

		

		// == 2.예제 == //

		// : for 반복문을 사용하여 1부터 10까지의 숫자 중에서 짝수만 출력

		

//		System.out.println();

//		for(int i =1; i<=10; i++) {

//			System.out.print(i);

//		}



		System.out.println();

		for(int i = 1; i<=10; i++) {

			if(i % 2 == 0) {

				System.out.print(i);

			}

		}

		

		

		System.out.println();

		

		// == 3.구구단 예제 == //

		

		for(int i = 1; i <=9; i++) {

			for(int o = 1; o<= 9; o++) {

				System.out.println("구구단 : " + i + " X " +  o  + " = " + i * o );

			}

		}

		

		

		

		// == 4.예제 == //

		// : 구구단 전체를 출력하는 코드

		// > 2단 ~ 9단까지 반복 ( 8번 반복 )

		// > 각 단의 내부에서는 1 ~ 9까지 숫자 반복 ( 9번 반복 )

		

		/*

		 for(int i = 2; i <= 9; i++) {

		 	for(int j = 0; j < 9; j++) {

				System.out.println("구구단 : " + i + " X " +  j  + " = " + i * j);

			}

		}

		 */

		for (int i = 0; i< 8; i++) {

			int dan = i + 2; 

			System.out.println("[" + dan + "단 ]");

			for (int j = 0; j < 9 ; j++) {

				int number = j + 1; 

				System.out.println(dan + "X" + number + " = " + dan * number);

			}

		}



		

		

		// == 5.예제 ==

		//0부터 20까지의 정수 중에서 홀수만 출력

		

		for(int i = 0; i<=20; i++) {

			if( i % 2 != 0) {

				System.out.println(i);

			}

		}



		// == 6.예제 == //

		// 사용자 입력을 받아 1 ~ 10 사이의 숫자가 입력될 때까지 반복

		// : do-while문으로 작성

		// > 1 ~ 10까지의 숫자를 입력한 경우 해당 수를 출력

		// > "올바른 숫자: " + inputNumber



		// == 7.예제 == //

//		1. 점수에 따른 학점 출력 (if, else if, else 사용)

//

//        사용자로부터 점수를 입력받아 아래 기준에 따라 학점을 출력하세요.

//        0 미만 또는 100 초과인 경우: 유효하지 않은 점수입니다.

//        90 이상: A

//        80 이상: B

//        70 이상: C

//        60 이상: D

//        그 외: F

//	

		// == 8.예제 == //

//		2. 삼각형 모양의 별(*) 출력 (중첩 for 사용)

//        (1)

//        *

//        **

//        ***

//        ****

//        *****



		// 2. (2)

		/*

		    *

		   **

		  ***

		 ****

		*****

		*/

	}

}