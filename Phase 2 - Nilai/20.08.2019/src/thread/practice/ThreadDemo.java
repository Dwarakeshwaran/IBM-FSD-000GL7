package thread.practice;

public class ThreadDemo implements Runnable{

	public static void main(String[] args) {
		ThreadDemo obj = new ThreadDemo();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		Thread t3 = new Thread(obj);
		t1.start();
		System.out.println(t1.isAlive());
		t2.start();
		System.out.println(t2.isAlive());
		
	}

	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("==>"+i);
			if(i==5) {
				try {
					Thread.sleep(2000);
					System.out.println("Pause");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
