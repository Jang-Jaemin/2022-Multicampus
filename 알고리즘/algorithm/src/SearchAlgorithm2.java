
public class SearchAlgorithm2 {

	public static void main(String[] args) {

		// 이진검색으로 3 찾기
		// 1- 정렬상태의 데이터셋 준비
		// 2- 중앙값 찾을값 비교
		//    중앙값 > 찾을값 4 앞의 데이터셋 비교
		//    중앙값 < 찾을값 4 뒤의 데이터셋 비교
		//    중앙값 == 찾을값
		
		int[] data = {6, 4, 3, 2, 1, 5, 8};
		// 정렬상태 가정
		int[] data2 = {1, 2, 4, 5, 6, 7, 8};
		
		int target = 4;
		int pl = 0;
		int pr = data2.length - 1;
		
		// 중앙위치 찾는다
		while(true) {
			int pc = (pl + pr) / 2;
			
			if(target == data2[pc]) {
				System.out.println("data2[ " + pc + " ]에서 " + target + "을 찾았습니다.");
				break;
			} else if(target > data2[pc]) {
				pl = pc + 1;
			} else if(target < data2[pc]) {
				pr = pc - 1;
			}
			if(pl > pr) {
				System.out.println("찾지 못하였습니다.");
				break;
			}
		}
		System.out.println("pl = " + pl + ", pr = " + pr);

	}

}
