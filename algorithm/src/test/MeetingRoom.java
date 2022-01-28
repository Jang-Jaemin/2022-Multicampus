package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class MyMeetingsSort implements Comparator<int[]> {
	
	public int compare(int[] first, int[] second) {
		if(first[2] < second[2]) return -1;
		else if(first[2] > second[2]) return 1;
		else return 0;
	}
}

public class MeetingRoom {

	public static void main(String[] args) {

		int N = 6;
		int[][] meetings = {{1, 1, 10}, {2, 5, 6}, {3, 13, 15}, {4, 14, 17}, {5, 8, 14}, {6, 3, 12}};
		
		Arrays.sort(meetings, new MyMeetingsSort());
		
		for(int[] one : meetings) {
			System.out.println(Arrays.toString(one));			
		}
		
		// 정렬된 첫번째 회의 list에 저장
		ArrayList<int[]> list = new ArrayList();
		list.add(meetings[0]);
		
		// meetings 배열의 나머지 회의 시작시간, list 저장 마지막 회의 종료시간 비교
		for(int i = 1; i < meetings.length; i++) {
			if(list.get(list.size()-1)[2] <= meetings[i][1]) {
				list.add(meetings[i]);
			}
		}
		
		// list 저장 회의들
		for(int[] one : list) {
			System.out.println("회의번호 : " + one[0] + ", 시작시간 : " + one[1] + ", 종료시간 : " + one[2]);
		}
		

	}

}
