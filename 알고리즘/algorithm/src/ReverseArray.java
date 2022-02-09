import java.util.Scanner;

public class ReverseArray {
	
	static int[] reverse(int[] data) {
		System.out.println("=====max 메소드 내부=====");
		for(int i = 0; i < data.length; i++) {
			System.out.print("data[" + i + "] = " + data[i] + "\t");
		}
		System.out.println();
		
		for(int i = 0; i < data.length / 2; i++) {
			new ReverseArray().swap(data, i, data.length - i - 1);
		}
		return data;
	}
	
	void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("숫자 갯수 : ");
		int count = stdIn.nextInt();
		stdIn.nextLine();
		
		System.out.print("역순으로 정렬할 숫자" + "(" + count + "개)" + " : ");
		String line = stdIn.nextLine();
		System.out.println();
		
		// 공백으로 숫자 분리
		String[] num = line.split(" ");
		int[] numInt = new int[count];
		for(int i = 0; i < count; i++) {
			numInt[i] = Integer.parseInt(num[i]);
		}
		
		reverse(numInt);
		
		// 기본형 + 참조형 매개변수 전달 - call by value 원리
		// 참조형 주소값 복사 전달 = data, numInt 같은 주소, 동일 배열 객체 참조
		System.out.println("=====main 메소드 내부=====");
		for(int i = 0; i < numInt.length; i++) {
			System.out.print("data[" + i + "] = " + numInt[i] + "\t");
		}
		System.out.println();

	}

}
