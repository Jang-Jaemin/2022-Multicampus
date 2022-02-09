package t220104;

class Employee{
	
 	int id;
 	String name;
 	int baseSalary, generalFee, totalSalary;
 	
 	public Employee(int id, String name, int baseSalary, int generalFee) {
		this.id = id;
		this.name = name;
		this.baseSalary = baseSalary;
		this.generalFee = generalFee;
	}
 	
 	Employee() {}
 	
	void calcTotalSalary() {
		
		totalSalary = baseSalary + generalFee;
		//100문장 정의
	}
}

class Manager extends Employee{
	
	int managerFee;
	
 	public Manager(int id, String name, int baseSalary, int generalFee, int managerFee) {
		super(id, name, baseSalary, generalFee);
		this.managerFee = managerFee;
	}
 	
	@Override
	void calcTotalSalary() {
		//totalSalary = baseSalary + generalFee + managerFee;
		super.calcTotalSalary();
		totalSalary = totalSalary + managerFee;
	}

	
 }
	
class Engineer extends Employee{
	int certiFee, techFee;
	Engineer(int id, String name, int baseSalary, int generalFee, int certiFee, int techFee){
		super(id, name, baseSalary, generalFee);
		this.certiFee = certiFee;
		this.techFee = techFee;
	}
	@Override
	void calcTotalSalary() {
		//totalSalary = baseSalary + generalFee + certiFee + techFee;
		super.calcTotalSalary();
		totalSalary = totalSalary + certiFee + techFee;
	}
}//Engineer end

		
class Secretary extends Employee{
	
	int secFee;
	
	public Secretary(int id, String name, int baseSalary, int generalFee, int secFee ) {
		super(id, name, baseSalary, generalFee);
		this.secFee = secFee;
	}
	
	@Override
	void calcTotalSalary() {
		//totalSalary = baseSalary + generalFee + secFee;
		super.calcTotalSalary();
		totalSalary = totalSalary + secFee;
	}	
}
	
//====== 4개 클래스 정의 ================
	   
public class SalaryTest{
	public static void main(String args[]){
	
		Employee e [] = new Employee[4];
		// 1.상속 2.생성자(타입 순서 갯수....)
		e[0] = new Employee	(1000,"이사원",10000,5000);
		e[1] = new Manager	(2000,"김간부",20000,10000,10000);
		e[2] = new Engineer	(3000,"박기술",15000,7500,5000,5000);
		e[3] = new Secretary(4000,"최비서",15000,7000,10000);
		
		/* 배열 내의 각 객체의 
	          급여계산메소드 호출하고
		사번, 이름, 본봉, 총급여 출력*/
		System.out.println("사번:이름:본봉:총급여");
		for(int i = 0; i < e.length; i++) {
			e[i].calcTotalSalary(); 	//e[i].overriding메소드 --> 각 객체 메소드 실행
			System.out.println(e[i].id +":" + e[i].name +":" +e[i].baseSalary +":" + e[i].totalSalary);
		}
		
		/*
		사번:이름:본봉:총급여
		1000:이사원:10000:xxxxx
		2000:김간부:20000:xxxxx
		3000:박기술:15000:xxxxx
		4000:최비서:15000:xxxxx
		 */ 
	}
}
