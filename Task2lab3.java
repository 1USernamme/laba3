package lab3;

public class Task2lab3 {
    public static void main(String[] args) {
        printResults(3);
        printResults(2);
        printResults(1); // Некоректний t
    }

    /**
     * Обчислює значення функції x(t, I).
     *
     * @param t параметр t
     * @return значення функції x(t, I)
     * @throws IllegalArgumentException якщо t < 1
     */
    public static double calculateFunction(int t) {
        if (t < 1) {
            throw new IllegalArgumentException("Invalid t = " + t + ". Must be t >= 1.");
        }

        double sum = 0;
        for (int i = 1; i <= t; i++) {
            double sqrtPart1 = Math.sqrt(i * 3.5);
            double sqrtPart2 = Math.sqrt(i * 2);
            sum += sqrtPart1 + sqrtPart2;
        }
        return sum;
    }

    static void printResults(int t) {
        System.out.print("t:" + t + " result: ");
        try {
            System.out.println(calculateFunction(t));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}