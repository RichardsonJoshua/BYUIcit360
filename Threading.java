package ThreadsExecutors;




import java.util.logging.Level;
import java.util.logging.Logger;

//create runner
class testRunnable implements Runnable {

	int goals = 50;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Goals: " + (goals - 5));
        
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(testRunnable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
public class Threading {

    //create a list of strings
    public static void main(String[] args) {
       Thread alpha = new Thread(new testRunnable(), "Alex Ovechkin");
       Thread beta = new Thread(new testRunnable(), "Sidney Crosby");
       Thread gamma = new Thread(new testRunnable(), "Jamie Benn");
       Thread delta = new Thread(new testRunnable(), "Patrick Kane");
       TestExecutor test = new TestExecutor();
       alpha.start();
       //trys and catches are throughout to catch any unexpected exceptions
       try {
       //threads wait for 4 seconds before playing the next one
		Thread.sleep(4000);
	} catch (InterruptedException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
       beta.start();
       try {
		Thread.sleep(4000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
       gamma.start();
       try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       delta.start();
       test.testArray();
    }
    
}
