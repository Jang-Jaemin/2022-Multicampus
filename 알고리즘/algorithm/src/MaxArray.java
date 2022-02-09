import java.util.Scanner;

public class MaxArray {
	
	static int max(int[] data) {
		System.out.println("=====max 메소드 내부=====");
		for(int i = 0; i < data.length; i++) {
			System.out.print("data[" + i + "] = " + data[i] + "\t");
		}
		System.out.println();
		
		// data 배열 중에서 최대값 리턴
		int max = data[0];
		System.out.println("max 최초값 : " + max);
		
		for(int i = 1; i < data.length; i++) {
			if(data[i] > max) {
				max = data[i];
				System.out.println("max 변경값 : " + max);
			}
		}
		data[0] = max;
		return max;
	}

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("숫자 갯수 : ");
		int count = stdIn.nextInt();
		stdIn.nextLine();
		
		System.out.print("최대값 찾을 숫자" + "(" + count + "개)" + " : ");
		String line = stdIn.nextLine();
		System.out.println();
		
		// 공백으로 숫자 분리
		String[] num = line.split(" ");
		int[] numInt = new int[count];
		for(int i = 0; i < count; i++) {
			numInt[i] = Integer.parseInt(num[i]);
		}
		
		int result = max(numInt);		// numInt 배열의 최대값
		System.out.println("max : " + result);
		
		// 기본형 + 참조형 매개변수 전달 - call by value 원리
		// 참조형 주소값 복사 전달 = data, numInt 같은 주소, 동일 배열 객체 참조
		System.out.println("=====main 메소드 내부=====");
		for(int i = 0; i < numInt.length; i++) {
			System.out.print("data[" + i + "] = " + numInt[i] + "\t");
		}
		System.out.println();

	}

}
