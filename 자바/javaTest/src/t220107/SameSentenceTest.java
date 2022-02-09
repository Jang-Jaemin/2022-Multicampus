package t220107;

import java.util.ArrayList;
import java.util.List;

class SameSentence {
	
	String[] compare(List<String> list1, List<String> list2){
		
		ArrayList<String> resultList = new ArrayList();
		
		// 구현
		// list1과 list2 저장 데이터 갯수 비교한다		
		int len1 = list1.size();
		int len2 = list2.size();
		
		if(len1 > len2) {
			len1 = len2;
		}
		
		for(int i = 0; i < len1; i++) {
			if(list1.get(i).equals(list2.get(i))) {
				resultList.add(list2.get(i));
			}
		}
		// ArrayList의 결과물을 String[]으로 변환
		String[] resultArray = new String[len1];
		
		resultList.toArray(resultArray);
		// 갯수 일치하면 list1, list2 모든 데이터를 각 인덱스별 비교하며 동일하면
		// String 배열 저장하고 리턴

		// 갯수 일치하지 않으면 list1, list2 더 작은 갯수의 list 갯수만큼 데이터를 각 인덱스별 비교하며 동일하면
		// String 배열 저장하고 리턴
		return resultArray;
	}
}

public class SameSentenceTest {
	
	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("자바는 객체지향 언어입니다");
		list1.add("우리는 멀티캠퍼스에서 자바를 배우는 중입니다");
		list1.add("오늘은 컬렉션 프레임워크를 배우죠! ");
		list1.add("내일은 스레드를 배울 예정입니다 ");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("자바는 객체지향 언어입니다");
		list2.add("우리는 multi에서 자바를 배우는 중입니다");
		list2.add("오늘은 콜렉션 프레임워크를 배우죠! ");
		list2.add("내일은 스레드를 배울 예정입니다 ");
		
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("자바는 객체지향 언어입니다");
		list3.add("우리는 멀캠에서 자바를 배우는 중입니다");
		list3.add("오늘은 컬렉션 프레임워크를 배우죠! ");
		
		SameSentence ss = new SameSentence();
		System.out.println("list1, list2에서 같은 내용을 출력합니다");
		String[] first = ss.compare(list1, list2);	// 메소드 호출 결과 출력
		
		for(String s : first) {
			if(s != null) System.out.println(s);
		}
		/*
		자바는 객체지향 언어입니다
		내일은 스레드를 배울 예정입니다 
		*/
		
		System.out.println("================================");
		System.out.println("list1, list3에서 같은 내용을 출력합니다");
		String[] second = ss.compare(list1, list3);	// 메소드 호출 결과 출력
		
		for(String s : second) {
			if(s != null) System.out.println(s);
		}
		/*
		자바는 객체지향 언어입니다
		오늘은 컬렉션 프레임워크를 배우죠!
		*/

	}
}
