package tv;

public class TVUser {

	public static void main(String[] args) {
		TVFactory factory = new TVFactory();
		TV tv = factory.getTV(args[0]);
		if(tv != null) {
			tv.powerOn();
			tv.soundUp();
			tv.soundDown();
			tv.powerOff();			
		}
		
	}

}
