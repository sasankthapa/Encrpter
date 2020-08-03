
public class Encryter {
	String secret;
	
	Encryter(String secret) {
		this.secret=secret;
	}
	
	public String encrypt(String message) {
		String output="";
		for(int i=0;i<message.length();i++) {
			int curr=(int) message.charAt(i);
			int toAdd=(int) secret.charAt(i%secret.length());
			output+=String.valueOf((char) ((curr+(toAdd/(i+1)))%256));
		}
		return output;
	}
	
	public String decrypt(String message) {
		String output="";
		for(int i=0;i<message.length();i++) {
			int curr=(int) message.charAt(i);
			int toSub=(int) secret.charAt(i%secret.length());
			output+=String.valueOf((char) ((curr-(toSub/(i+1)))%256));
		}
		return output;
	}
}
