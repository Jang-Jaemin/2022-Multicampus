// java_과제1_한상민

class Product {
	// 멤버 변수 설정
	String prdNo;
	String prdName;
	int prdPrice;
	int prdYear;
	String prdMaker;
	
	// 매개변수 값 전달 받아 초기화
	public Product(String prdNo, String prdName, int prdPrice, int prdYear, String prdMaker) {
		this.prdNo = prdNo;
		this.prdName = prdName;
		this.prdPrice = prdPrice;
		this.prdYear = prdYear;
		this.prdMaker = prdMaker;
	}
	
	// 데이터 출력 : toString()
	@Override
	public String toString() {
		return prdNo + "\t" + prdName + "\t" + prdPrice + "\t" + prdYear + "\t" + prdMaker;
	}
}

public class ProductTest {

	public static void main(String[] args) {

		// 객체 생성
		Product p1 = new Product("001", "노트북", 1200000, 2021, "삼성");
		Product p2 = new Product("002", "모니터", 300000, 2021, "LG");
		Product p3 = new Product("003", "마우스", 30000, 2020, "로지텍");
		
		// 출력값 저장
		String notebook = p1.prdNo + "\t" + p1.prdName + "\t" + p1.prdPrice + "\t" + p1.prdYear + "\t" + p1.prdMaker;
		String monitor = p2.prdNo + "\t" + p2.prdName + "\t" + p2.prdPrice + "\t" + p2.prdYear + "\t" + p2.prdMaker;
		String mouse = p3.prdNo + "\t" + p3.prdName + "\t" + p3.prdPrice + "\t" + p3.prdYear + "\t" + p3.prdMaker;
		
		// 데이터 출력
		System.out.println("상품번호" + "\t" + "상품명" + "\t" + "가격" + "\t" + "연도" + "\t" + "제조사");
		System.out.println("--------------------------------------");
		System.out.println(notebook);
		System.out.println(monitor);
		System.out.println(mouse);

	}

}
