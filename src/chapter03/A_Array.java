// == 패키지 == //
// : 폴더 (파일 분리 저장소)
package chapter03; // chapter03 폴더 내의 파일임을 명시

// == 클래스 == //
// : 파일 (코드 저장소)
// : 한 개의 파일에는 하나의 클래스가 포함
// - 모든 코드가 클래스 안에서 동작
public class A_Array { // 클래스명 == 파일명 (대문자로 시작)
	// 코드 작성
	
	// == 메인 메서드 == //
	// : 프로그램 실행의 시작점
	public static void main(String[] args) {
		
		// 배열 (Array)
		// : 같은 타입의 여러 변수를 하나의 집합으로 묶어서 처리하는 구조
		// - 데이터를 연속적으로 저장
		// - 순서 O (index 인덱스 번호, 0부터 1씩 증가되는 값)
		// - 중복 O (동일한 값을 여러 요소에 저장 가능)
		// +) 요소: 배열에서 각각의 데이터
		
		// 1)변수
		int korean = 80;
		int math = 95;
		int english = 85;
		
		// 2) 배열
		// : 생성하여 사용 - new 연산자
		
		// == 배열의 선언 == //
		// : 생성한 배열을 담을 그릇
		// >> 데이터타입[] 배열명;
		// >> 데이터타입 배열명[];
		
		int[] scores; // - 정수형 데이터를 담을 수 있는 배열
		//int scores[];
		
		// cf) 배열명
		//	: 복수 형태의 변수명 사용을 권장
		
		// == 배열의 생성 == //
		// : 실제 데이터가 저장 X
		// - 데이터 배열이 저장된 첫 번째 메모리 주소가 저장
		// > new 데이터타입[배열의 길이];
		
		scores = new int[3]; // 요소의 개수가 3개인 배열 생성
		
		// cf) 참조 자료형 - 주소값 저장
		System.out.println(scores); //[I@c39f790
		
		// == 배열 요소에 접근 == //
		// : 배열명[인덱스 번호]
		// +) 데이터 변경(삽입): 배열명[인덱스번호] = 데이터값;
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		
		// cf) 배열 생성 시 모든 요소는 해당 데이터 타입의 기본값으로 초기화
		// >> 숫자(0), 문자열(""), 논리형(false)
	
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
//		System.out.println(scores[3]);
		
		// == 배열의 선언과 동시에 초기화 == //
		// : new 연산자 사용 + 직접적인 요소 대입의 배열 생성 시 길이 지정 X
		// >> 요소의 개수를 파악하여 길이가 자동 지정
		
		// 1) 데이터타입[] 배열명 = new 데이터타입[] {요소1, 요소2, ...};
		int[] scoresList = new int[] {90, 85, 75};
		System.out.println(scoresList[0]);
		
		// 2) 데이터타입[] 배열명 = {요소1, 요소2, ...}
		char[] greet = {'h', 'e', 'l', 'l', 'o'};
		System.out.print(greet[0]);
		System.out.print(greet[1]);
		System.out.print(greet[2]);
		System.out.print(greet[3]);
		System.out.print(greet[4]);
		System.out.println();
		
		
		//System.out.println(greet[5]);
		
		// ==  배열의 길이(크기) == //
		// 배열명. length 속성으로 사용
		System.out.println(greet.length); // 5
		
		// == 배열의 특징 == //
		// > 한 번 생성되면 크기 변경 x
		// > 참조 타입: 주소값이 저장
		// > 모든 요소는 같은 자료형
		
		// == 문자열 배열 생성 == //
		// : String 타입 배열의 초기값 null
		String[] fruits = new String[3];
		System.out.println(fruits); // [Ljava.lang.String;@71e7a66b(주소값)
		System.out.println(fruits[1]); // null
		
		fruits[1] = "사과";
		System.out.println(fruits[1]); // 사과
		
		fruits[1] = "오렌지";
		System.out.println(fruits[1]); // 오렌지
		
		// == 배열 요소 삭제 == //
		// : 삭제 기능을 담당하는 문법 X
		// > 삭제할 요소를 제외한 나머지 요소를 '새로운 배열'로 복사
		
		int[] original = {1, 2, 3, 4}; // 길이 4
		int removeIndex = 2;
		
		int[] newArray = new int[original.length -1]; // 길이 3
				
		int k = 0; // 새로운 배열의 인덱스 번호
		
		int originalLenght = original.length;
		
		for (int index = 0; index < originalLenght; index++) {
			if (index == removeIndex) {
				// index 번호가 2일 경우 새로운 배열에 값을 할당하지 않고 다음 조건으로 이동
				// : index 번호 2번의 요소가 새로운 배열에서는 삭제
				
				/*
					index는 현재 루프가 돌아가면서 가리키는 원본 배열의 인덱스입니다.
					예를 들어, original 배열이 {1, 2, 3, 4}일 때, 첫 번째 루프에서 index는 0, 두 번째 루프에서 index는 1, 이런 식으로 진행됩니다.
					removeIndex는 원본 배열에서 삭제하고 싶은 인덱스를 지정한 값입니다.
					여기서는 removeIndex가 2로 지정되어 있으므로, original 배열의 인덱스 2(즉, 3 값)를 삭제하려고 합니다.
				*/
				
				continue; // 루프의 나머지 코드를 건너뛰고 조건 확인으로 이동
				/*
					현재 인덱스에 해당하는 원본 배열의 값을 새로운 배열에 넣지 않고 그 값을 건너뛰도록 하는 역할을 합니다.
					즉, removeIndex에 해당하는 값을 새로운 배열에 추가하지 않고 넘어가게 됩니다.
					continue 명령어는 루프 안에서 현재 반복을 건너뛰고 바로 다음 반복으로 넘어가게 만들기 때문
				*/
			}
			
			newArray[k++] = original[index];
			// k, index
			// newArray[0] = original[0]
			// newArray[1] = original[1]
			// newArray[2] = original[3]
			
		}
				
		System.out.println(newArray[0]);
		System.out.println(newArray[1]);
		System.out.println(newArray[2]);
				
				
				
				
				
				
				
				
				
		
		
	}
}
