// TODO: Define PrinterTask class that implements Runnable
class PrinterTask implements Runnable {
    public void run () {
        String name = Thread.currentThread().getName();

        for(int i = 1; i <= 5; i++) {
            System.out.println(name+ ": Running task "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Exercise11 {
    public static void main(String[] args) throws Exception{
        // TODO: Create a single PrinterTask object
        Runnable pt = new PrinterTask();

        // TODO: Create two threads using the same task
        // Name them "Worker-1" and "Worker-2"
        Thread t1 = new Thread(pt, "Worker-1");
        Thread t2 = new Thread(pt, "Worker-2");
        // TODO: Start both threads
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();

        // TODO: Use join() to wait for both threads to finish
        t1.join();
        t2.join();

    }
}
