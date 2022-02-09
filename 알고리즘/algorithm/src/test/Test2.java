package test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단으로 출력할까요? : ");
		int w = sc.nextInt();
		
		System.out.println();
		
		for(int i = 1; i <= w; i++) {
			for(int j = w - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

/*
정삼각형 별 출력
5 입력
        *
       ***
      *****
     *******
    *********

*/