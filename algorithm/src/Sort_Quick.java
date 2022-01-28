import java.util.Arrays;

public class Sort_Quick {

	static void quick(int[] a, int left, int right) {
		
//		System.out.printf("===left = %d 이고 right = %d 일 때, quick 시작===\n", left, right);
		
		int pl = left;				// 왼쪽 검색
		int pr = right;				// 오른쪽 검색
		int x = a[(pl + pr) / 2];	// 피봇
		
		do {
			while(a[pl] < x) {
				System.out.printf("피봇 %d와 현재데이터 %d 비교하여 %d가 더 큼.pl 현재 %d에서 1 증가\n", x, a[pl], x, pl);
				pl++;
			}
			while(a[pr] > x) {
				System.out.printf("피봇 %d와 현재데이터 %d 비교하여 %d가 더 큼.pr 현재 %d에서 1 감소\n", x, a[pr], x, pr);
				pr--;
			}
			if(pl <= pr) {
				System.out.printf("p1 = %d, pr = %d에서 %d %d 교환 발생\n", pl, pr, a[pl], a[pr]);
				int temp = a[pl];
				a[pl] = a[pr];
				a[pr] = temp;
				pl++;
				pr--;
			}
		} while(pl <= pr);
		
		System.out.printf("pl = %d, pr = %d에서 반복 종료 - 배열 = %s\n", pl, pr, Arrays.toString(a));
		
		if(pr > left) quick(a, left, pr);		// 피봇보다 작거나 같은 그룹 분할
		if(pl < right) quick(a, pl, right);		// 피봇보다 크거나 같은 그룹 분할
//		System.out.printf("===left = %d 이고 right = %d 일 때, quick 종료===\n", left, right);
	}
	
	public static void main(String[] args) {

		// 버블정렬 : 오름차순 {1, 2, 3, 4, 5}
		int[] data = {2, 5, 4, 1, 3};
		
		System.out.println("퀵정렬 이전 : " + Arrays.toString(data));
		quick(data, 0, data.length - 1);
		System.out.println("퀵정렬 이후 : " + Arrays.toString(data));

	}

}
