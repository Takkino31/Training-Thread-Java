package training.exo6;

public class SommeCarreRunnable implements Runnable {
    int val;

    public SommeCarreRunnable(int val) {
        this.val = val;
    }

    @Override
    public void run() {
        calculCarre(val);
    }

    public static void calculCarre(int val){
        System.out.println(
                "Je suis le Thread : "+ Thread.currentThread().getName() + "\n" +
                "Carre "+ val +" : = " + (val*val)  + "\n" +
                "Moi Thread : "+ Thread.currentThread().getName() + " j'ai termine une tache travail. NEXT TIME ."
        );
    }

}
