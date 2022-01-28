import java.util.Arrays;

public class Sort_Insertion {

	static void insertion(int[] a, int num) {
		
		System.out.println(Arrays.toString(a));
		for(int i = 1; i < num; i++) {
			int j;
			// 1. 정렬되지 않은 데이터 한개를 선택한다.
			int temp = a[i];
//			System.out.println(" i = " + i + ", temp = " + temp);
			System.out.printf(" i = %d, temp = %d\n", i, temp);
			// 2. 정렬된 데이터들 자리 이동(temp가 크면) 반복
			for(j = i; j > 0 && a[j-1] > temp; j--) {
				System.out.printf("현재 a[j-1]값 %d은 temp값 %d보다 크므로 자리가 밀리는 중\n", a[j-1], temp);
				a[j] = a[j-1];
			}
			a[j] = temp;
			System.out.println("===밀어내고 삽입 중간결과 : " + Arrays.toString(a));
			// 3. 1번 데이터를 2번 빈 자리에 삽입
			
		}
	}
	
	public static void main(String[] args) {

		// 삽입정렬 : 오름차순 {1, 2, 3, 4, 5}
		int[] data = {3, 5, 4, 2, 1};
		
		System.out.println("삽입정렬 이전 : " + Arrays.toString(data));
		insertion(data, data.length);
		// data 객체 매개변수 전달되면, bubble 메소드 내부 - data 배열 내부값 변경
		System.out.println("삽입정렬 이후 : " + Arrays.toString(data));

	}

}
