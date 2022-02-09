import java.util.Scanner;

public class DecimalToBin {
	
	static String[] toBin(int decimal, int base) {
		String[] remains = new String[30];
		int index = 0;
		while(true) {
			int remain = decimal % base;
			decimal = decimal / base;
			remains[index++] = String.valueOf(remain);
			if(decimal == 0) break;
		}
		return remains;
	}
	
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		System.out.print("변환할 진수 : ");
		int base = stdIn.nextInt();
		System.out.print(base + "진수로 변환할 10진수 : ");
		int count = stdIn.nextInt();
		
		// 이진수 메소드 구현
		String[] result = toBin(count, base);
		
		// 결과 출력
		for(int i = result.length-1; i >= 0; i--) {
			if(result[i] != null) System.out.print(result[i]);
		}
		System.out.println();
		System.out.println(Integer.toHexString(count));//16진수
	}

}
