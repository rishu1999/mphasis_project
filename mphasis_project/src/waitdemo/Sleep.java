package waitdemo;

class Demo implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class Sleep {

	public static void main(String[] args) {
		Demo d = new Demo();
		Thread t = new Thread(d);
		
		t.start();
		System.out.println("program ended");
	}

}