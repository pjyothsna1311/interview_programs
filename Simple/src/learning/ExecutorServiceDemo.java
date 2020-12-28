package learning;

import java.util.concurrent.*;

public class ExecutorServiceDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Runnable r = () -> System.out.println("runnable task");
        Callable<String> c = () -> {
            System.out.println("hi");
            return "returning future";
        };

        ExecutorService e = Executors.newFixedThreadPool(5);
        //e.execute(r);
        //e.submit(r);
        //e.submit(c);

        Future<String> future = e.submit(c);
        System.out.println(future.get());
        e.shutdown();

    }
}
