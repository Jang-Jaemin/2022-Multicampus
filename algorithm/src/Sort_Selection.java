import java.util.Arrays;

public class Sort_Selection {

	static void selection(int[] a, int num) {
		
		for(int i = 0; i < a.length - 1; i++) {
			System.out.println("===" + i + "번 데이터 정렬===" + Arrays.toString(a));
			int min = i;
			
			for(int j = i + 1; j < a.length; j++) {
				System.out.print("i : " + i + ", j : " + j + ", min : " + min + " ");
				System.out.println(Arrays.toString(a));
				if(a[j] < a[min]) {
					min = j;
				}
				int temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}
		}
	}
	
	public static void main(String[] args) {

		// 선택정렬 : 오름차순 {1, 2, 3, 4, 5}
		int[] data = {4, 2, 3, 5, 1};
		
		System.out.println("선택정렬 이전 : " + Arrays.toString(data));
		selection(data, data.length);
		// data 객체 매개변수 전달되면, bubble 메소드 내부 - data 배열 내부값 변경
		System.out.println("선택정렬 이후 : " + Arrays.toString(data));

	}

}
