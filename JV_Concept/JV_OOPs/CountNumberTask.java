

public class CountNumberTask extends RecursiveTask<Integer> {
    private static final int THRESHOLD = 100;
    private int[] array;
    private int start;
    private int end;
    private int number;

    public CountNumberTask(int[] array, int start, int end, int number) {
        this.array = array;
        this.start = start;
        this.end = end;
        this.number = number;
    }

    protected Integer compute() {
        if (end - start <= THRESHOLD) {
            int count = 0;
            for (int i = start; i < end; i++) {
                if (array[i] == number) {
                    count++;
                }
            }
            return count;
        } else {
            int mid = (start + end) / 2;
            CountNumberTask task1 = new CountNumberTask(array, start, mid, number);
            task1.fork();
            CountNumberTask task2 = new CountNumberTask(array, mid, end, number);
            return task2.compute() + task1.join();
        }
    }
}
