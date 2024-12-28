package training.exo8;

public class Consumer implements Runnable {
    private final Product product;

    public Consumer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        try {
            while (true) {
                product.waitForProductAvailable();
                System.out.println(Thread.currentThread().getName() + " : Consomme un produit.");
                System.out.println(" Je vais dormir 1 seconde.");
                Thread.sleep(1000); // Simulation d'un délai de consommation
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void getProduct() throws InterruptedException {
        product.waitForProductAvailable();
    }
}
