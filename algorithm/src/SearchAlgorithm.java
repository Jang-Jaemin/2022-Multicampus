
public class SearchAlgorithm {

	public static void main(String[] args) {

		// 선형검색으로 3 찾기
		
		// 방법 1
//		int[] data = {6, 4, 3, 2, 1, 5, 8};
//		
//		int target = 3;
//		int i;
//		
//		for(i = 0; i < data.length; i++) {
//			System.out.println(i + "번째 반복중");
//			if(target == data[i]) {
//				System.out.println("data[ " + i + " ]에서 " + target + " 찾았습니다.");
//				break;
//			}
//		}
//		if(i == data.length) {		// 조건 판단
//			System.out.println(target + "을 찾지 못하였습니다.");
//		}
		
		// 방법 2 = 보초법
		int[] data = {6, 4, 3, 2, 1, 5, 8, 0};
		
		int target = 3;
		int i;
				
		for(i = 0; i < data.length - 1; i++) {
			System.out.println(i + "번째 반복중");
			if(target == data[i]) {
				System.out.println("data[ " + i + " ]에서 " + target + " 찾았습니다.");
				data[data.length - 1] = data[i];
				break;
			}
		}
		if(i == data.length) {		// 조건 판단
			System.out.println(target + "을 찾지 못하였습니다.");
		}

	}

}
