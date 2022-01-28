package t220106;

class MySum {
	
    int first;
    int second;
    
    MySum (int first, int second){
        this.first = first;
        this.second = second;
    }

	@Override
	public String toString() {
		return String.valueOf(first + second);
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof MySum) {
			// 자동형변환 이후에 접근 사용가능 변수나 메소드 -> Object 클래스 포함(MySum 불가)
			return toString().equals(obj.toString());
//			String me = toString();
//			String other = obj.toString();
//			
//			boolean result = me.equals(other);
//			return result;
		} else {
			return false;
		}
	}
}

public class OverridingTest {

	public static void main(String[] args) {
		
		int i = 10;
        int j = 20;
        
        MySum ms1 = new MySum(i, j);
        MySum ms2 = new MySum(i, j);

        System.out.println(ms1);
        System.out.println(ms2);
        if(ms1.equals(ms2)) {
            System.out.println("ms1과 ms2의 합계는 동일합니다.");
       }
//		String ms3 = new String("30");
//		if(ms1.equals(ms3)) {
//			System.out.println("ms1과 ms3의 합계는 동일합니다.");
//		}
    }
}
