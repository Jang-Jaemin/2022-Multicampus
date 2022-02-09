import java.util.Arrays;
import java.util.Comparator;

class MyStringSort implements Comparator<String> {
	
	public int compare(String s1, String s2) {
		return s1.compareToIgnoreCase(s2);
		
		// s1, s2 대소문자 무시 같으면 0
		// s1 < s2 대소문자 무시 s1 앞쪽 배열 -1
		// s1 > s2 대소문자 무시 s2 앞쪽 배열 1
	}
}

class MyArraySort implements Comparator<int[]> {
	
	public int compare(int[] s1, int[] s2) {
		if(s1.length > s2.length) return 1;
		else if(s1.length < s2.length) return -1;
		else return 0;
		
		// 1차배열 각 데이터 객수가 작은 < 큰
		
	}
}

public class ArraysSortComparator {

	public static void main(String[] args) {

		String[] data = {"test", "TEST", "test123", "TeSt123", "가나다"};
		
//		Arrays.sort(data);
		Arrays.sort(data, new MyStringSort());		// 문자열 자연정렬 - 대소문자 구분 X
		
		System.out.println(Arrays.toString(data));
		
		int[][] data2 = {{1, 2, 3}, {4, 5, 6, 7, 8, 9}, {10, 20, 30}};
//		Arrays.sort(data2);
		Arrays.sort(data2, new MyArraySort());
		
		for(int[] one : data2) {
			System.out.println(Arrays.toString(one));			
		}

	}

}
