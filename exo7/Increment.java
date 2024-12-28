package training.exo7;

public class Increment extends Thread{

    static int val = 5;
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Increment();
        Thread t2 = new Increment();
        Thread t3 = new Increment();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();


    }

    public static synchronized void increment(){
        val++;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
            try {
                System.out.println(
                        "Je suis le thread " + Thread.currentThread().getName()+ "\n" +
                                "La valeur de i est " + val  + "\n" +
                                "Je vais dormir 2s"
                );
                Thread.sleep(2000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }


}
