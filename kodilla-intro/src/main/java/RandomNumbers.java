import java.util.Random;

public class RandomNumbers {
    private static int minValue = 100;
    private static int maxValue = 0;

    public RandomNumbers() {
    }

    public static void main(String[] args) {
        randomNumbers();
        System.out.println("Najmniejsza wartość: " + getMinValue());
        System.out.println("Największa wartość: " + getMaxValue());
    }

    private static void randomNumbers() {
        int sum = 0;
        System.out.println("Wylosowane wartości: ");

        for(int var1 = 0; sum <= 5000; ++var1) {
            int r = (new Random()).nextInt(31);
            System.out.print(r + ";");
            if (r < minValue) {
                minValue = r;
            }

            if (r > maxValue) {
                maxValue = r;
            }

            sum += r;
        }

        System.out.println();
    }

    private static int getMinValue() {
        return minValue;
    }

    private static int getMaxValue() {
        return maxValue;
    }
}
