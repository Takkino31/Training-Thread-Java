package training.exo4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecutorService {

    public static void main(String[] args) {
        ExecutorService myExecutor;
        myExecutor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 3; i++) {
            MyRunnable r1 = new MyRunnable();
            myExecutor.submit(r1);
        }
        myExecutor.shutdown();
    }
}