
public class Gcd {

	// 방법 3 : 재귀호출
	static int gcd(int max, int min) {
		
		System.out.println(max + " : " + min);
		int temp = max % min;
		if(temp == 0) return min;
		return gcd(min, temp);
	}
	
	public static void main(String[] args) {

		int a = 12;
		int b = 18;
		
//		for(int i = 1; i <= a; i++) {
//			if(a % i == 0) {
//				System.out.println(i + "는 " + a + "의 약수");
//			}
//		}
//		for(int i = 1; i <= b; i++) {
//			if(b % i == 0) {
//				System.out.println(i + "는 " + b + "의 약수");
//			}
//		}
//		for(int i = 1; i <= a; i++) {
//			if(b % i == 0 && a % i == 0) {
//				System.out.println(i + "는 " + a + "와 " + b + "의 공약수");
//			}
//		}
		// 두 수의 공약수 규칙
		// 18 - 12 = 6, 12 - 6 = 6
		
		// 두 수의 최대값 찾기
//		int max, min;
//		
//		if(a > b) {
//			max = a;
//			min = b;
//		} else {
//			max = b;
//			min = a;
//		}
		
		int max = 248;
		int min = 24;
		
		// 두 수의 최대공약수 찾기
		// 방법 1
		while(true) {
			System.out.println(max + " : " + min);
			int temp = max - min;
			if(temp == 0) break;
			if(temp < min) {
				max = min;
				min = temp;
			} else {
				max = temp;
			}
		}
		System.out.println("최대공약수 : " + max + "\n");
		
		// 방법 2
		while(true) {
			System.out.println(max + " : " + min);
			int temp = max % min;
			if(temp == 0) break;
			max = min;
			min = temp;
		}
		System.out.println("최대공약수 : " + min);
		System.out.println();
		System.out.println("최대공약수(재귀호출) : " + gcd(248, 24));

	}

}
