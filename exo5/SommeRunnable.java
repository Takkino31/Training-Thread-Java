package training.exo5;

public class SommeRunnable implements Runnable{
    int[] tabInt;
    private int sum;

    public SommeRunnable(int[] tabInt) {
        this.tabInt = tabInt;
        this.sum = 0;
    }

    @Override
    public void run() {

        // Calculer la somme du tableau
        for (int value : tabInt) {
            sum += value;
        }
    }

    // Méthode pour récupérer la somme calculée
    public int getSum() {
        return sum;
    }
}
