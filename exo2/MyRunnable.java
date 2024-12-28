package training.exo2;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread avec runnable en cours d'execution");
    }

    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable();
        Thread thread = new Thread(r1);
        thread.start();
    }
}
