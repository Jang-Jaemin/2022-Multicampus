// db_과제2_한상민

package bookdto;

// BookDTO 클래스 생성
public class BookDTO {
	
	String bookNo;
	String bookTitle;
	String bookAuthor;
	int bookYear;
	int bookPrice;
	String bookPublisher;
	
	public BookDTO(String bookNo, String bookTitle, String bookAuthor, int bookYear, int bookPrice, String bookPublisher) {
		super();
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookYear = bookYear;
		this.bookPrice = bookPrice;
		this.bookPublisher = bookPublisher;
	}

	@Override
	public String toString() {
		return bookNo + "\t" + bookTitle + "\t" + bookAuthor + "\t" + bookYear + "\t" + bookPrice + "\t" + bookPublisher;
	}
}
