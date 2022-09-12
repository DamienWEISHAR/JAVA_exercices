import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		
		/*
		 * 
		 * MULTI THREADS
		 * 
		 * even if one of the thread catches an exception and get interrupted,
		 * the others still continue
		 * 
		 */
		//to create a subclass of Thread = instantiate an object from a class with Override run()
		//					   which extends Thread
		MultiThread thread1 = new MultiThread(); 
		
		
		
		//implement Runnable interface and pass instance as argument to Thread constructor
		//better to use because you can extends another class
		MyRunnable runnable1 = new MyRunnable();
		Thread thread2 = new Thread(runnable1);//instance in the parameters of the constructor
		
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(thread1.getName());
		System.out.println(thread2.getName());
		
		thread1.start();
		//the main thread is going to wait until this thread is over then continues the rest of the program
		thread1.join(); //in ms, calling the thread (ex.main) waits until the specified thread dies or x ms to start
		thread2.start();
		
		
		//------------------------------------------------------------------------
		/*
		 * 
		 * THREADS
		 * 
		 */
		/*
    	thread =	A thread of execution in a program (kind of like a virtual CPU)
    				The JVM allows an application to have multiple threads running concurrently
    				Each thread can execute parts of you code in parallel with the main thread
    				Each thread has a priority.
    				Threads with higher priority are executed in preference compared to threads with a lower priority
    			
    			    The Java Virtual Machine continues to execute threads until either of the following occurs
    					1. The exit method of class Runtime has been called
    					2. All user threads have died
    					
    				When a JVM starts up, there is a thread which calls the main method
    				This thread is called “main”
    						
    				Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection 
				    JVM terminates itself when all user threads (non-daemon threads) finish their execution
    	 */ 	
		
		//to see how many threads are active 
		//System.out.println(Thread.activeCount());
		
		//to know the current thread name
		//if it is "main" it is because JVM calls the main method
		//if I want to change the name of the thread:
		//Thread.currentThread().setName("Damien"); //now the "main" becomes "Damien"
		//System.out.println(Thread.currentThread().getName());
		
		//to check the priority of the thread, more higher, more prioritized
		//System.out.println(Thread.currentThread().getPriority()); // by default 5 (1->10)
		
		//to change the priority of the main thread
		//Thread.currentThread().setPriority(8);
		//System.out.println(Thread.currentThread().getPriority());
		
		
		//to check if a thread is alive
		//System.out.println(Thread.currentThread().isAlive());
		
		//to have my thread sleep for a given amount of time (for a break...)
		//count down:
		/*
		for(int i=3; i>0; i--) {
			System.out.println(i);
			Thread.sleep(1000); //in ms
		}
		System.out.println("Nailed it!");
		*/
		
		//MyThread thread2 = new MyThread();
		
		//Daemon thread is for garbage
				//to check if a thread is a Deamon:
		//thread2.setDaemon(true);
		//System.out.println(thread2.isDaemon());
		
		//to start the new thread
		//thread2.start();
		//thread2.setName("thread number 2");
		//System.out.println(thread2.getName());
		//System.out.println(thread2.isAlive());
		//System.out.println(thread2.getPriority());
		//thread2.setPriority(3);
		//System.out.println(thread2.getPriority());
		//System.out.println(Thread.activeCount());
		
		
		
		
		
		
		
		
		//-----------------------------------------------------------------
		
		/*
		 * Timer = a facility for threads to schedule tasks
		 * 		   for future execution in a background thread
		 * 
		 * TimerTask = a task that can be scheduled for one-time 
		 * 		       or repeated execution by a Timer
		 */
		/*
		Timer timer = new Timer();
		
		TimerTask task =new TimerTask() { //compte à rebours
			
			int counter = 10;
			@Override
			public void run() {
				//timed task for the calendar
				System.out.println("It is time!");
				
				//count down
				/*
				if(counter>0) {
					System.out.println(counter+" seconds");
					counter --;
				}else {
					System.out.println("You fucked up...");
					timer.cancel(); 
				}
				
			
			}
		};
		*/
		
		
		
		
		/*
		//programming the task
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, 2022);
		date.set(Calendar.MONTH, Calendar.SEPTEMBER);
		date.set(Calendar.DAY_OF_MONTH, 4);
		date.set(Calendar.HOUR_OF_DAY,18);
		date.set(Calendar.MINUTE, 25);
		date.set(Calendar.SECOND, 0);
		//put a timer for the task		
		//timer.schedule(task, date.getTime());
		
		//timer.schedule(task, 1000); //task, time in ms
		//timer.scheduleAtFixedRate(task, 0, 1000); //(task, start at which loop, repeated how often in ms)
		*/
		}
}



