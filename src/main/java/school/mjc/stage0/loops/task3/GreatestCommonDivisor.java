package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int result = 0;
        for (int i = 2; i <= 100; i++) {
            if (first % i == 0 && second % i == 0) {
                result = i;
            }
        }
        System.out.println(result);
    }
}
