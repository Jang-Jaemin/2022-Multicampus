 // java_과제2_한상민

class Book {
	// 멤버 변수 설정
	String bookNo;
	String bookTitle;
	String bookAuthor;
	int bookPrice;
	int bookYear;
	String bookPublisher;
	
	// 매개변수 값 전달 받아 초기화
	public Book(String bookNo, String bookTitle, String bookAuthor, int bookPrice, int bookYear, String bookPublisher) {
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookYear = bookYear;
		this.bookPublisher = bookPublisher;
	}

	// 데이터 출력 : toString()
	@Override
	public String toString() {
		return bookNo + "\t" + bookTitle + "\t" + bookAuthor + "\t" + bookPrice + "\t" + bookPublisher;
	}
}

// 상속
class Magazine extends Book {
	// 멤버 변수
	int month;
	
	// 매개변수 값 전달 받아 초기화
	public Magazine(String bookNo, String bookTitle, String bookAuthor, int bookPrice, int bookYear, String bookPublisher, int month) {
		super(bookNo, bookTitle, bookAuthor, bookPrice, bookYear, bookPublisher);
		this.month = month;
	}

	// 데이터 출력 : toString()
	@Override
	public String toString() {
		return bookNo + "\t" + bookTitle + "\t" + bookAuthor + "\t" + bookYear + "\t" + bookPrice + "\t" + bookPublisher + "\t" + month;
	}
}

public class BookTest {

	public static void main(String[] args) {

		// 객체 생성
		Book b1 = new Book("B001", "자바 프로그래밍", "홍길동", 25000, 2021, "멀티출판사");
		Book b2 = new Book("B002", "자바스크립트", "이몽룡", 30000, 2020, "서울출판사");
		Book b3 = new Book("B003", "HTML/CSS", "성춘향", 18000, 2021, "강남출판사");
		
		Magazine m1 = new Magazine("M001", "자바 월드", "홍길동", 25000, 2021, "멀티출판사", 5);
		Magazine m2 = new Magazine("M002", "웹 월드", "이몽룡", 30000, 2020, "서울출판사", 7);
		Magazine m3 = new Magazine("M003", "게임 월드", "성춘향", 18000, 2021, "강남출판사", 9);
		
		// 출력값 저장
		String java = b1.bookNo + "\t" + b1.bookTitle + "\t" + b1.bookAuthor + "\t" + b1.bookPrice + "\t" + b1.bookYear + "\t" + b1.bookPublisher;
		String js = b2.bookNo + "\t" + b2.bookTitle + "\t" + b2.bookAuthor + "\t" + b2.bookPrice + "\t" + b2.bookYear + "\t" + b2.bookPublisher;
		String html = b3.bookNo + "\t" + b3.bookTitle + "\t" + b3.bookAuthor + "\t" + b3.bookPrice + "\t" + b3.bookYear + "\t" + b3.bookPublisher;
		
		String javaworld = m1.bookNo + "\t" + m1.bookTitle + "\t" + m1.bookAuthor + "\t" + m1.bookPrice + "\t" + m1.bookYear + "\t" + m1.bookPublisher + "\t" + m1.month;
		String webworld = m2.bookNo + "\t" + m2.bookTitle + "\t" + m2.bookAuthor + "\t" + m2.bookPrice + "\t" + m2.bookYear + "\t" + m2.bookPublisher + "\t" + m2.month;
		String gameworld = m3.bookNo + "\t" + m3.bookTitle + "\t" + m3.bookAuthor + "\t" + m3.bookPrice + "\t" + m3.bookYear + "\t" + m3.bookPublisher + "\t" + m3.month;
				
		// 데이터 출력
		System.out.println("도서번호" + "\t" + "도서명" + "\t\t" + "저자" + "\t" + "가격" + "\t" + "발행일" + "\t" + "출판사");
		System.out.println("---------------------------------------------------------");
		System.out.println(java);
		System.out.println(js);
		System.out.println(html);
		
		System.out.println();
		
		System.out.println("잡지번호" + "\t" + "잡지명" + "\t" + "발행인" + "\t" + "가격" + "\t" + "발행연도" + "\t" + "출판사" + "\t" + "발행월");
		System.out.println("---------------------------------------------------------");
		System.out.println(javaworld);
		System.out.println(webworld);
		System.out.println(gameworld);
		
	}

}
