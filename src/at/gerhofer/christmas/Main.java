package at.gerhofer.christmas;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String [] args) {
        int numberOfElfes = 3;
        int numberOfKids = 15;

        ExecutorService executor = Executors.newFixedThreadPool(numberOfElfes);
        for (int i = 0; i < numberOfKids; i++) {
            Runnable work = new ChristmasLetterPickup("Kid #" + i);
            executor.execute(work);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {   }

        System.out.println("Merry Christmas!");
    }
}
