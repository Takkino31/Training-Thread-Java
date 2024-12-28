package training.exo8;

public class Producer implements Runnable{
    private final Product product;

    public Producer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        try {
            while (true){
                product.setProductAvailable();
                System.out.println(Thread.currentThread().getName() + " : Produit un produit.");
                System.out.println(" Je vais dormir 1 seconde.");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}