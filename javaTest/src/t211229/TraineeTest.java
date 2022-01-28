package t211229;

class Trainee{
	String name;
	String sosok;
	String title;
	int fee;
	int addFee;
	int returnFee;
}

public class TraineeTest {

	public static void main(String[] args) {

		/* 실행 : 
		run-run configuration-arguments-program arguments
		이자바 멀티캠퍼스 JSP프로그래밍 50000 5000 */

		Trainee student = new Trainee();
		student.name = args[0];
		student.sosok = args[1];
		student.title = args[2];
		student.fee = Integer.parseInt(args[3]);	//"50000"
		student.addFee = Integer.parseInt(args[4]);
		
		/*switch(student.title) {
		case "자바프로그래밍":
			student.returnFee = (int)(student.fee * 0.25 + student.addFee);
			break;
		case "JDBC프로그래밍":
			student.returnFee = (int)(student.fee * 0.2 + student.addFee);
			break;
		case "JSP프로그래밍":
			student.returnFee = (int)(student.fee * 0.15 + student.addFee);
			break;
		default:
			System.out.println("잘못 입력되었습니다.");
		}*/
		
		if(student.title.equals("자바프로그래밍") ) {
			student.returnFee = (int)(student.fee * 0.25 + student.addFee);
		}else if(student.title.equalsIgnoreCase("JDBC프로그래밍") ) {
			student.returnFee = (int)(student.fee * 0.2 + student.addFee);
		}else if(student.title.equalsIgnoreCase("JSP프로그래밍") ) {
			student.returnFee = (int)(student.fee * 0.15 + student.addFee);
		}else {
			System.out.println("잘못 입력되었습니다.");	
		}
		
		System.out.println("이름=" + student.name);	
		System.out.println("소속=" + student.sosok);
		System.out.println("과정명=" + student.title);
		System.out.println("교육비=" + student.fee);
		System.out.println("부가금=" + student.addFee);
		System.out.println("환급금=" + student.returnFee);

	}

}
