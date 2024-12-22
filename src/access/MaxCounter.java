package access;

public class MaxCounter {

    private int counter = 0;
    private int max = 0;

    MaxCounter(int max) {
        this.max = max;
    }

    void increment() {
        if (counter >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
        } else {
            this.counter++;
        }
    }

    int getCount() {
        return counter;
    }
}
