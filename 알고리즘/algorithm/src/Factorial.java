
public class Factorial {

	static int fact1(int num) {
		
		System.out.println("===" + num + "일 때 fact1 시작===");
		int result = 1;
		
		for(int i = 1; i <= num; i++) {
			result = result * i;
		}
		System.out.println("===" + num + "일 때 fact1 종료===");
		return result;
	}
	
	static int fact2(int num) {
		
		// num 변경하여 같은 메소드 계속 호출
		// 종료 조건
		System.out.println("===" + num + "일 때 fact2 시작===");
		if(num == 0 || num == 1) return 1;
		System.out.println("===" + num + "일 때 fact1 종료===");
		return num * fact2(num - 1);
	}
	
	public static void main(String[] args) {

		System.out.println("5!(반복문) : " + fact1(5));
		System.out.println("5!(재귀호출) : " + fact2(5));

	}

}
