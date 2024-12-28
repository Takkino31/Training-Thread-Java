package training.exo1;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Mon thread est en cours d'execution");
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
