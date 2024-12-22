package static1.ex;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MathArrayUtils {

    public static int sum(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    public static double average(int[] values) {
        double avg = 0;
        for (int i = 0; i < values.length; i++) {
            avg += (values[i]);
        }
        return avg / values.length;
    }

    public static int min(int[] values) {
        int min = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }
}





