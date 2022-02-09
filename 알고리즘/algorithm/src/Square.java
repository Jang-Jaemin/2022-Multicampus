import java.util.Scanner;

public class Square {

	static void Square(int w) {
		for(int i = 1; i <= w; i++) {
			for(int j = 1; j <= w; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void Triangle_R(int w) {
		for(int i = 1; i <= w; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
				System.out.println();
		}
	}
	
	static void Triangle_L(int w) {
		for(int i = 1; i <= w; i++) {
			for(int j = w; j >= 1; j--) {
				if(i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}	
			}
			System.out.println();
		}
	}
	
	static void Triangle_RT(int w) {
		for(int j = 1; j <= w; j++) {
			for(int i = 1; i < j; i++) {
				System.out.print(" ");	
			}
			for(int i = w; i >= j; i--) {
				System.out.print("*");	
			}
			System.out.println();
		}
	}
	
	static void Triangle_LT(int w) {
		for(int j = 1; j <= w; j++) {
			for(int i = w; i >= j; i--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void Triangle_Num(int w) {
		int num = 65;
		for(int j = 1; j <= w; j++) {
			for(int i = 1; i < j; i++) {
				System.out.print(" ");	
			}
			for(int i = w; i >= j; i--) {
				System.out.print((char)num++);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력하세요.");
			System.out.print("한 변의 길이 : ");
			int width = stdIn.nextInt();
			
			// 0보다 작은 값 입력시 종료
			if(width <= 0) {
				System.out.println("0보다 큰 값을 입력하세요.");
				break;
			}
			
			Square(width);
			System.out.println("======");
			Triangle_R(width);
			System.out.println("======");
			Triangle_L(width);
			System.out.println("======");
			Triangle_RT(width);
			System.out.println("======");
			Triangle_LT(width);
			System.out.println("======");
			Triangle_Num(width);
			System.out.println("======");
		}

	}

}
