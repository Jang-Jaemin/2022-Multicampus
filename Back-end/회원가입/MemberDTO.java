package dto;

public class MemberDTO {
	// 테이블 내 1개 레코드행 == 6개 컬럼 구성
	String id, password, name, phone, email, address;

	public MemberDTO() {}
	
	public MemberDTO(String id, String password, String name, String phone, String email, String address) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return id + "님의 암호 : " + password + ", 이름 : " + name + ", 번호 : " + phone + ", 이메일 : " + email + ", 주소 : " + address + "<br>";
	}
}
