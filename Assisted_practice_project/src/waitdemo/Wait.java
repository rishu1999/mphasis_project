package waitdemo;

public class Wait {

 private static Object LOCK = new Object();
	    public static void main(String args[]) throws InterruptedException
	    {
	        
	        synchronized (LOCK) 
	        {
	            LOCK.wait(1000);
	            System.out.println("Object '" + LOCK + "' is woken after" + " waiting for 1 second");
	        }
	    }
	}


