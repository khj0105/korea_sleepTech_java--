package chapter03;



import java.util.Arrays;



// Array 클래스

// : 배열을 조작하는데 유용한 기능들을 제공해주는 자바 내부 클래스

// >> 정렬, 검색, 변환 등

public class D_Array {

	public static void main(String[] args) {

		// == Arrays 클래스 사용법 == //

		

		

		int[] numbers = {3, 5, 1, 4, 2};

		

		// 1. 배열 정렬 (오름차순)

		// : Arrays.sort(정렬할 배열);

		

		// cf) .(마침표)연산자: 해당 클래스 내부의 기능을 사용

		Arrays.sort(numbers);

		System.out.println(numbers[0]);

		

		// 2. 배열 변환

		// : Arrays.toString(변환할 배열);

		// - 배열의 전체 구조를 파악할 수 있는 기능

		// - 각 요소를 순회하여 문자열 변환: [요소1, 요소2, ... ] 형태

		System.out.println(numbers); //[I@28a418fc

		System.out.println(Arrays.toString(numbers)); // [1, 2, 3, 4, 5]

		

		// 3. 배열 내 검색

		// : Arrays.binarySearch(배열, 검색내용);

		// - 존재O: 존재하는 요소의 인덱스 번호를 반환

		// - 존재X: 음수 반환(검색 내용)

		System.out.println(Arrays.binarySearch(numbers, 3)); //2

		System.out.println(Arrays.binarySearch(numbers, 6)); //-6

		

		// cf) binarySearch()는 반드시 정렬된 배열 내에서 검색!

		// : 해당 기능이 '이진 탐색 알고리즘'을 사용하기 때문!

		

		// 4. 배열의 비교

		// : Arrays.equals(a배열, b배열);

		// - 논리형태로 반환(true, false)

		int[] numbers2 = {1, 2, 3, 5, 4};

		System.out.println(Arrays.equals(numbers, numbers2));

		

		// 5. 배열의 채움

		// : Arrays.fill(배열, 삽입할 값);

		// - 배열의 모든 요소를 특정 값으로 채움

		int[] examples = new int[3];

		System.out.println(Arrays.toString(examples)); // [0, 0, 0]

		

		Arrays.fill(examples, 10);

		System.out.println(Arrays.toString(examples)); //[10, 10, 10]

		

		

		/*

		기본 데이터 타입 (Primitive Data Types)

		int, char, boolean, double 등과 같이 값 자체를 저장하는 데이터 타입입니다.

		이러한 타입은 배열을 만들 때 기본값을 자동으로 설정합니다.

		boolean[] 배열은 기본값 false

		char[] 배열은 기본값 '\u0000' (빈 문자)

		int[] 배열은 기본값 0

		double[] 배열은 기본값 0.0

		

		참조 데이터 타입 (Reference Data Types)

		String, Integer, Character, Double 등과 같은 객체 타입을 말합니다.

		참조 데이터 타입은 배열을 만들 때 기본값이 null입니다.

		예를 들어 ArrayList<Integer>와 같은 컬렉션을 사용할 때, 기본 데이터 타입인 int 대신 Integer와 같은 참조 타입을 사용해야 합니다.

		간단히 정리:

		기본 데이터 타입:

		int, char, boolean, double, float, long, byte, short

		참조 데이터 타입:

		String, Integer, Character, Double, Boolean 등 객체 타입

		 

		*/

	}

}