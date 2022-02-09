package test;

import java.util.Scanner;
import java.util.Stack;

public class CoinCharge {

	static Stack<Integer> coinStack = new Stack();
	
	// 잔돈 총액 charge(잔돈총액) 전달
	static int charge(int mymoney, int count) {
		
		int coinValue = coinStack.pop();
		int coinCount = mymoney / coinValue;
		int totalCount = coinCount + count;
		
		if(coinCount != 0)
			System.out.println(coinValue + "원 동전은 " + coinCount + "개 받습니다.");
		if(mymoney == 0) return totalCount;
		return charge(mymoney % coinValue, totalCount);
	}

	public static void main(String[] args) {

		// 키보드로 내가 낸 돈, 상품가격 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("내가 낸 돈 : ");
		int money = sc.nextInt();
		System.out.print("상품 가격 : ");
		int price = sc.nextInt();
		
		// 잔돈 총액 계산
		int mymoney = money - price;
		System.out.println("거스름돈 : " + mymoney + "원\n");
				
		int[] coins = {10, 50, 100, 300, 500};		// 오름차순 정렬
		
		for(int i : coins) {
			coinStack.push(i);			
		}
		
		System.out.println("총 동전 갯수 : " + charge(mymoney, 0) + "개");
			
	}

}
