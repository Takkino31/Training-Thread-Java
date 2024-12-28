package training.exo3;

public class MyManyThreads implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " est entrain de s'executer");
        try {
            Thread.sleep(5000); // Simule un travail avec un délai d'une seconde
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " a terminé l'exécution");

    }

    public static void main(String[] args) {
        MyManyThreads r1 = new MyManyThreads();
        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r1);
        Thread thread3 = new Thread(r1);
        Thread thread4 = new Thread(r1);
        Thread thread5 = new Thread(r1);
        thread1.setName("Selly");
        thread2.setName("Ibrahima");
        thread3.setName("Mounina");
        thread4.setName("Thierno");
        thread5.setName("Maimouna");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
