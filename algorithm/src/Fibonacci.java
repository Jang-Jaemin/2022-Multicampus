
public class Fibonacci {

	static int fibo(int num) {
		
		System.out.println("===" + num + "일 때 fibo 시작===");
		if(num == 1 || num == 2) return 1;
		System.out.println("===" + num + "일 때 fibo 종료===");
		return fibo(num - 2) + fibo(num - 1);
	}
	
	public static void main(String[] args) {

		// 1 1 2 3 5 8 13 21 34 55
		int i1 = 1;		// 현재 항의 이전항 값
		int i2 = 1;		// 현재 항의 이전 이전항 값
		System.out.println(1 + "항의 수열값 : " + i2);
		System.out.println(2 + "항의 수열값 : " + i1);
		
		for(int i = 3; i <= 10; i++) {
			int result = i2 + i1;
			System.out.println(i + "항의 수열값 : " + result);
			i2 = i1;		// 1 -> i2
			i1 = result;	// 2 -> i2
		}
		
		// 재귀호출
		System.out.println(10 + "항의 수열값 : " + fibo(10));

	}

}
