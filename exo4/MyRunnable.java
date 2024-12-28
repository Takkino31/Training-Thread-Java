package training.exo4;

public class MyRunnable implements Runnable{


    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println(
                        "Je suis le thread -->"+ Thread.currentThread().getName()+ "\n"+
                        "J'en suis a ma " + (i+1) + "e execution"
                );
                                                                                                                                                                                                               Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " completed");
    }


}
