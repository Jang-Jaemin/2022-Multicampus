package hash;

public class ChainHashMain {

	public static void main(String[] args) {
		ChainHash<Integer, String> ch = new ChainHash(13);
		int result = ch.add(1,  "삼성컴퓨터");
		System.out.println(result);
		result = ch.add(2,  "LG노트북");
		System.out.println(result);
		result = ch.add(3,  "애플맥북");
		System.out.println(result);
		
		ch.dump();

	}

}
