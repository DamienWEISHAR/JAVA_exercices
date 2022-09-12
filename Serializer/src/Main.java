import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		User user = new User();
		user.name = "Laurie";
		user.password = "123456";
		
		FileOutputStream fileOut = new FileOutputStream ("UserInfo.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(user);
		
		out.close();
		fileOut.close();
		
		System.out.println("Object info saved!");
	}

}
