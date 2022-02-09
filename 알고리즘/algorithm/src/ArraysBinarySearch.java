import java.util.Arrays;

public class ArraysBinarySearch {

	public static void main(String[] args) {

		int[] data = {6, 4, 3, 2, 1, 5, 8};
		// 정렬상태 가정
		Arrays.sort(data);
		
		// data 전체내용 출력
		System.out.println(Arrays.toString(data));
		
		int target = 5;
		int index = Arrays.binarySearch(data, target);
		// index < 0 : 찾지 못함
		System.out.println(target + " 를(을) " + index + " 위치에서 찾았습니다.");

	}

}
