
public class MyThread extends Thread {

	@Override
	public void run() {
		if(this.isDaemon()) {
			System.out.println("It's a running daemon thread");
		}else {
		System.out.println("User thread running");
	}
	}
}
