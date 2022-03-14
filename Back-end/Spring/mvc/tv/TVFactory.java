package tv;

public class TVFactory {
	public TV getTV(String name) {
		if(name.equalsIgnoreCase("samsung")) {
			return new SamsungTV();
		} else if(name.equalsIgnoreCase("lg")) {
			return new LgTV();
		} else {
			return null;
		}
	}
}
