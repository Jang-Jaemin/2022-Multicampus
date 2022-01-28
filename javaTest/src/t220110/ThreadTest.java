package t220110;

class MusicThread extends Thread {
	// 상속, 오버라이딩
	public void run() {
		for(int i = 0; i <= 3; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { }
			System.out.println("음악 듣는 중 입니다.");				
		}
	}
	// 출력 : 음악 듣는중입니다. (3번 출력)
}

class NewsThread extends Thread {
	// 상속, 오버라이딩
	public void run() {
		for(int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { }
			System.out.println("다운로드 중 입니다.");				
		}
	}
	// 출력 : 뉴스보는 중입니다. (10번 출력)
}

class DownloadThread extends Thread {
	// 상속, 오버라이딩
	public void run() {
		for(int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { }
			System.out.println("뉴스 보는 중 입니다.");				
		}
	}
	// 출력 : 다운로드중 입니다. (5번 출력)
}

public class ThreadTest {

	public static void main(String[] args) {

		Thread arr[] = new Thread[3];
		arr[0] = new MusicThread();
		arr[1] = new NewsThread();
		arr[2] = new DownloadThread();
		
		for(int i = 0; i < arr.length; i++) {
//			arr[i].run();	// 멀티 쓰레드 X
			arr[i].start();
		}
		
	}

}
