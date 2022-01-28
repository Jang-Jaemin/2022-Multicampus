import java.util.Arrays;

public class Sort_Merge {

	static int[] buff;
	
	static void merge(int[] a, int num) {
		
		buff = new int[num];
		_merge(a, 0, num - 1);
		// 2개 배열 분할 다시 병합정렬 - 1개 배열
		buff = null;
	}
	
	static void _merge(int[] a, int left, int right) {
		
		// 1개 그룹 분할
		if(left < right) {
			int i;
			int center = (left + right) / 2;
			int p = 0;
			int j = 0;
			int k = left;
			
			_merge(a, left, center);
			_merge(a, center + 1, right);
			
			// 병합정렬
			// buff 병합하면서 정렬배열, a배열 분할배열
			// a[] 왼쪽 반만 저장
			for(i = left; i <= center; i++) {
				buff[p++] = a[i];
			}
			
			while(i <= right && j < p) {
				// buff에 a배열 왼쪽반 < 배열 오른쪽 반
				a[k++] = buff[j] <= a[i] ? buff[j++] : a[i++];
			}
			
			while(j < p) {
				a[k++] = buff[j++];		// 남아있는 내용 복사
			}
			System.out.printf("left = %d, right = %d 일 때, 합병 중간 결과 = %s\n", left, right, Arrays.toString(a));
		}
	}
	
	public static void main(String[] args) {

		// 병합정렬 : 오름차순 {1, 2, 3, 4, 5}
		int[] data = {2, 5, 4, 1, 3};
		
		System.out.println("병합정렬 이전 : " + Arrays.toString(data));
		merge(data, data.length);
		System.out.println("병합정렬 이후 : " + Arrays.toString(data));

	}

}
