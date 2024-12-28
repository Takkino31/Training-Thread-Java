package training.exo8;

public class TestMarketPlace {

    public static void main(String[] args) throws InterruptedException {

        Product product = new Product();

//        product.productAvailable = false;
        Producer p1 = new Producer(product);
        Consumer c1 = new Consumer(product);

        Thread thread_p1 = new Thread(p1);
        Thread thread_c1 = new Thread(c1);

        thread_p1.setName("Producteur");
        thread_c1.setName("Consommateur");

        thread_p1.start();
        thread_c1.start();

        thread_p1.join();
        thread_c1.join();


    }
}
