package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        int result = 0;
        int i = 10;
        if (t < 0) {
            t -= (2 * t);
        }
        while (t > 0) {
            result += t % i;
            t /= 10;
        }
        System.out.println(result);
    }
}
