package shouty;

public class Person {
	private int location;
	private static String shoutedMessage;
	
	public void setLocation(int location) {
		this.location = location;
	}

	public int getLocation() {
		return this.location;
	}
	
	public void shout(String message) {
		shoutedMessage = message;
	}
	
	public String getShout(){
		return shoutedMessage;
	}
}
