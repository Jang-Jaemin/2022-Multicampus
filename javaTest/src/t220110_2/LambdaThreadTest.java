package t220110_2;

// 2. interface Runnable { void run(); } -> 함수형 인터페이스 -> 람다식
public class LambdaThreadTest {

	public static void main(String[] args) {

		Thread arr[] = new Thread[3];
		
		arr[0] = new Thread(() -> {
			for(int i = 0; i <= 3; i++) {
				System.out.println("음악 듣는 중 입니다.");
			}
		});
		
		
		arr[1] = new Thread(() -> {
			for(int i = 0; i <= 10; i++) {
				System.out.println("다운로드 중 입니다.");	
			}
		});
		
		arr[2] = new Thread(() -> {
			for(int i = 0; i <= 5; i++) {
				System.out.println("뉴스 보는 중 입니다.");		
			}
		});
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].start();
		}
		
	}

}

/*
public class LambdaThreadTest {

	public static void main(String[] args) {

		Thread arr[] = new Thread[3];
		
		arr[0] = new Thread(new Runnable() {
			public void run() {
				for(int i = 0; i <= 3; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) { }
					System.out.println("음악 듣는 중 입니다.");
				}
			}
		});
		
		arr[1] = new Thread(new Runnable() {
			public void run() {
				for(int i = 0; i <= 10; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) { }
					System.out.println("다운로드 중 입니다.");				
				}
			}
		});
		
		arr[2] = new Thread(new Runnable() {
			public void run() {
				for(int i = 0; i <= 5; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) { }
					System.out.println("뉴스 보는 중 입니다.");				
				}
			}
		});
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].start();
		}
		
	}

}
*/
