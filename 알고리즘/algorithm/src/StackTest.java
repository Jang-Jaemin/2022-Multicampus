import java.util.Scanner;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {

		// 입력 Scanner
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> st = new Stack();
		if(st.isEmpty() == false) {
			System.out.println("마지막 푸시 데이터 : " + st.peek());			
		}
		st.push(5);
		st.push(6);
		st.push(7);
		st.push(8);
		
		System.out.println("데이터 푸시 종료");
		
		if(st.isEmpty() == false) {
			System.out.println("마지막 푸시 데이터 : " + st.peek());			
		}
		
		System.out.println("데이터 삭제 시작");
		while(! st.isEmpty()) {
			int value = st.pop();
			System.out.println(value);
		}

	}

}
