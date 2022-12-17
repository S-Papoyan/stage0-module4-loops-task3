package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        if (lengthOfLastNumber <= 0) {
            System.out.println(0);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int result = 0;
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            stringBuilder.append("9".repeat(i));
            result += Integer.parseInt(String.valueOf(stringBuilder));
            stringBuilder.delete(0, stringBuilder.length());
        }
        System.out.println(result);
    }
}
