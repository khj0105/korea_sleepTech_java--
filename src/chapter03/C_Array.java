package chapter03;



public class C_Array {

	public static void main(String[] args) {

		// 다차원 배열

		// : 배열의 배열 (2, 3, 4... 차원)

		// >> 데이터를 테이블 형태로 구성할 때 유용

		// >> 게임 보드, 데이터 분석, 그래픽 등에 사용

		

		// == 다차원 배열의 선언 및 초기화 == //

		// 2차원 배열 선언: 데이터타입[][] 배열명;

		// 2차원 배열 생성: new 데이터타입[행의개수][열의개수];

		int[][] matrix = new int[3][3];

		

		// 각 요소에 할당

		matrix[0][0] = 1; // 1행 1열

		matrix[0][1] = 2; // 1행 2열

		matrix[0][2] = 3; // 1행 3열

		//matrix[0][3] = 4;

		

		// 선언과 동시에 초기화

		int[][] matrix2 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, { 10, 11, 12} };

		// >> 4행 3열

		// 4개의 "행"을 가지고 있으며, 각 행은 3개의 열을 가지고 있습니다

		

		// == 다차원 배열 출력 == //

		// : 각 행을 순회, 해당 행 내부의 요소를 순회

		// 세로는 **행(row)**을 나타냅니다.

		// 가로는 **열(column)**을 나타냅니다.

		

		for (int[] row: matrix2) {

			for (int value: row) {

				System.out.print(value + " ");

			}

			System.out.println();

			

			/*

			첫 번째 for문 (for (int[] row : matrix2))

			

			matrix2는 4개의 행(row)을 가지는 2차원 배열입니다.

			이 첫 번째 for문은 matrix2의 각 **행(row)**을 하나씩 가져옵니다.

			각 row는 1차원 배열로서, 그 안에는 3개의 열(column)이 포함되어 있습니다.

			두 번째 for문 (for (int value : row))

			

			row는 1차원 배열이므로, 각 **열(column)**을 하나씩 순회하며 **값(value)**을 가져옵니다.

			System.out.print(value + " ");

			

			각 열의 값을 공백을 두고 출력합니다.

			System.out.println();

			

			한 행의 값을 다 출력한 후, 다음 행을 출력하기 위해 줄 바꿈을 합니다.

			*/

		}

	}

}