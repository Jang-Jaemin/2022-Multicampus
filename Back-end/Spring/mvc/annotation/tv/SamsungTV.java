package annotation.tv;

import org.springframework.stereotype.Component;

@Component
public class SamsungTV implements TV {
	public SamsungTV() {
		System.out.println("삼성TV 생성자 호출");
	}
	public void powerOn() {
		System.out.println("samsungtv - 전원을 켜다");
	}
	public void powerOff() {
		System.out.println("samsungtv - 전원을 끄다");
	}
	public void soundUp() {
		System.out.println("samsungtv - 소리를 높이다");
	}
	public void soundDown() {
		System.out.println("samsungtv - 소리를 낮추다");
	}
}
