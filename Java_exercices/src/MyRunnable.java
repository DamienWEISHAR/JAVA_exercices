
public class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//increase
		for(int i=0; i<11; i++) {
			System.out.println("Thread#2 : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread #2 is finished");

	}

}
