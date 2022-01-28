// 알고리즘_과제1_한상민

import java.util.Scanner;

public class QuickSort {

	static void Student(int[] a, int stu1, int stu2) {
		
		int temp = a[stu1];
		a[stu1] = a[stu2];
		a[stu2] = temp;
	}
	
	// 퀵 정렬
	static void quickSort(int[] data, int left, int right) {
		
		int pl = left;
		int pr = right;
		int x = data[(pl + pr) / 2];
		int temp;
		
		do {
			while(data[pl] < x) pl++;
			while(data[pr] > x) pr--;
			if(pl <= pr) {
				Student(data, pl++, pr--);
			}
		} while(pl <= pr);
		
		if(pr > left) quickSort(data, left, pr);
		if(pl < right) quickSort(data, pl, right);
		
		// 내림차순 정렬
		for(int i = 0; i < data.length - 1; i++) {
			for(int j = i + 1; j < data.length; j++) {
				if(data[j] > data[i]) {
					temp = data[j];
					data[j] = data[i];
					data[i] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수 입력 : ");
		int student = sc.nextInt();
		System.out.println();
		
		int[] data = new int[student];
		
		for(int i = 0; i < student; i++) {
			System.out.print("학생" + (i+1) + " 점수 입력 : ");
			data[i] = sc.nextInt();
		}
		
		quickSort(data, 0, student - 1);
		
		System.out.println("\n성적 순으로 정렬");
		for(int k = 0; k < data.length; k++) {
			System.out.println((k+1) + "등 : " + data[k]);							
		}
		
		
		

	}

}
