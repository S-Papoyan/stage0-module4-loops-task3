package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public static void printDigitsSum(int t) {
        int result = 0;
        if (t > 0) {
            String s = "" + t;
            String[] split = s.split("");
            for (String value : split) {
                result += Integer.parseInt(value);
            }
        }
        if (t < 0) {
            String s = "" + t;
            String[] split = s.split("");
            for (int i = 1; i < split.length; i++) {
                result += Integer.parseInt(split[i]);
            }
        }
        System.out.println(result);
    }
}
