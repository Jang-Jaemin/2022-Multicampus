
public class LeapYearTest {

	public static void main(String[] args) {

		int[][] datesample = {{2022, 1, 24}, {2020, 12, 12}, {1999, 1, 1}, {2000, 12, 12}};
		
		// datesample 각 데이터의 연도 추출하여 해당 연도가 윤년인지 판단
		for(int i = 0; i < datesample.length; i++) {
			int year = datesample[i][0];
			
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
	//			System.out.println(year % 4);
	//			System.out.println(year % 100);
	//			System.out.println(year % 400);
				System.out.println(year + " 윤년이다.");
			}
		}

	}

}
