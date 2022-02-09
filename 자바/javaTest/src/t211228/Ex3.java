package t211228;

public class Ex3 {

	public static void main(String[] args) {
		
		/*사다리꼴 면적 실수: 300.xxx
		윗변 : 정수  = 10
		아랫변 : 정수 = 15
		높이 : 정수 = 12*/
		
		int top = 10;
		int bottom = 15;
		int height = 13;
		double area = (top + bottom ) * height / 2.0;
		System.out.println("윗변=" + top + " 아랫변=" + bottom + " 높이=" + height + " 인 사다리꼴의 면적=" + area);
		
		
	}

}
