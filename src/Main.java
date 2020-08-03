
public class Main {
	public static void main(String[] args) {
		Encryter encryter=new Encryter("this is a test secret");
		String message=encryter.encrypt("test Message Message");
		System.out.println(message);
		System.out.println(encryter.decrypt(message));
	}
}
