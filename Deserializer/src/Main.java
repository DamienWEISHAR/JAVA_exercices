import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		User user = null;
		FileInputStream fileIn = new FileInputStream("C:\\Users\\dweis\\Desktop\\eclipse\\Serializer\\UserInfo.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		user = (User) in.readObject();
		in.close();
		fileIn.close();
		
		System.out.println(user.name + " "+ user.password);
		user.sayHello();
	}

}
