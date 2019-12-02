package at.gerhofer.christmas;

public class ChristmasLetterPickup implements Runnable {

    private String kidsName;

    public ChristmasLetterPickup(String kidsName) {
        this.kidsName = kidsName;
    }

    @Override
    public void run() {
        long duration = (long) (Math.random() * 5000);
        System.out.println("Elf " + Thread.currentThread().getName() + " on the way to pickup the christmas letter for " + kidsName + " (ETA: -" + duration + ")");
        waitTime(duration);
        System.out.println("Elf " + Thread.currentThread().getName() + " picking the christmas letter for " + kidsName + " (ETA: -" + duration + ")");
        waitTime(duration);
        System.out.println("Elf " + Thread.currentThread().getName() + " is back with the christmas letter for " + kidsName);
    }

    private void waitTime(long duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
