import java.util.Random;

class SumThread1 extends Thread {
    private int[] arr;
    private int low, high;
    private long partialSum;

    public SumThread1(int[] arr, int low, int high) {
        this.arr = arr;
        this.low = low;
        this.high = Math.min(high, arr.length);
    }

    public void run() {
        partialSum = 0;
        for (int i = low; i < high; i++) {
            partialSum += arr[i];
        }
    }

    public long getPartialSum() {
        return partialSum;
    }
}

public class SumThread {
    public static void main(String[] args) throws InterruptedException {
        final int SIZE = 1000;
        int[] numbers = new int[SIZE];
        Random random = new Random();

        // Fill the array with random integers
        for (int i = 0; i < SIZE; i++) {
            numbers[i] = random.nextInt(100); // Example: random integers between 0 and 99
        }

        // Create and start 10 threads
        SumThread1[] threads = new SumThread1[10];
        for (int i = 0; i < 10; i++) {
            int low = i * 100;
            int high = (i + 1) * 100;
            threads[i] = new SumThread1(numbers, low, high);
            threads[i].start();
        }

        // Wait for threads to finish
        long totalSum = 0;
        for (SumThread1 t : threads) {
            t.join();
            totalSum += t.getPartialSum();
        }

        // Calculate the average
        double average = totalSum / (double) SIZE;
        
        System.out.println("Total Sum: " + totalSum);
        System.out.println("Average: " + average);
    }
}
