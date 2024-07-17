
class NumberPrinter implements Runnable {
    private int number;

    public NumberPrinter(int number) {
        this.number = number;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + number + ": " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread " + number + " interrupted.");
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new NumberPrinter(1));
        Thread t2 = new Thread(new NumberPrinter(2));

        t1.start(); // Start the first thread
        t2.start(); // Start the second thread
    }
}
