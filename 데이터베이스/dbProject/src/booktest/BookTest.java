// db_과제2_한상민

package booktest;

import bookdao.BookDAO;
import bookdto.BookDTO;

public class BookTest {

	public static void main(String[] args) {
		
		BookDAO bookDAO = new BookDAO();
		
		// insert
//		BookDTO bookDTO = new BookDTO("B004", "자바스크립트", "강길동", 2020, 28000, "서울출판사");
//		bookDAO.insertBook(bookDTO);
		
		// select
		BookDTO[] arr = bookDAO.selectBook();
		for(BookDTO dto : arr) {
			if(dto != null) {
				System.out.println(dto);				
			}
		}

	}

}
