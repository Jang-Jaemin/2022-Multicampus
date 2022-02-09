import java.util.Arrays;

public class Sort_Bubble {

	static void bubble(int[] a, int num) {
		
		int min = 10000;
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length - i - 1; j++) {
				System.out.print("i : " + i + ", j : " + j + " ");
				if(a[j] > a[j+1]) {		// 오름차순 >, 내림차순 <
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				System.out.println(Arrays.toString(a));
			}
		}
	}
	
	public static void main(String[] args) {

		// 버블정렬 : 오름차순 {1, 2, 3, 4, 5}
		int[] data = {1, 2, 3, 5, 4};
		
		System.out.println("버블정렬 이전 : " + Arrays.toString(data));
		bubble(data, data.length);
		// data 객체 매개변수 전달되면, bubble 메소드 내부 - data 배열 내부값 변경
		System.out.println("버블정렬 이후 : " + Arrays.toString(data));

	}

}
