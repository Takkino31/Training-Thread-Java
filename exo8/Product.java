package training.exo8;

public class Product {

    private boolean productAvailable = false;

    public synchronized void setProductAvailable() throws InterruptedException {
        while (!productAvailable){
            wait();
        }
        productAvailable = true;
        notify();
    }

    public synchronized void waitForProductAvailable() throws InterruptedException{
        while (productAvailable){
            wait();
        }
        productAvailable = false;
        notify();
    }
}
