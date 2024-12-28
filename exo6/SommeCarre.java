package training.exo6;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SommeCarre {
    public static void main(String[] args) {
        int [] tabInt = {2,3,5,3,6,9,2,6,11,22,2,3,5,3,6,9,2,6,11,22};
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        for (int i = 0; i < tabInt.length; i++) {
            final int val = tabInt[i];
            executorService.submit(new SommeCarreRunnable(val));
        }

        executorService.shutdown(); // Fermeture du pool après l'exécution des tâches

    }

    public static void calculCarre(int val){
        System.out.println(
                "Je suis le Thread : "+ Thread.currentThread().getName() + "\n" +
                        "Carre "+ val +" : = " + (val*val)  + "\n" +
                        "Moi Thread : "+ Thread.currentThread().getName() + " j'ai termine une tache travail. NEXT TIME ."
        );
    }
}
