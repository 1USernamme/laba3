package lab3;
public class Task1lab3 {
    public static void main(String[] args) {
        printResults(3, -1.5, 0.5);
        printResults(5, -2, 1);
        printResults(2, -1, 2);
        printResults(20, -0.5, 0.8);
        printResults(30, -1, 0.6); // Некоректний k
    }

    /**
     * Обчислює суму ряду sum i = 1 to k ln(- t * i) * cos(sqrt(s * 1/(i^2))).
     *
     * @param k кількість ітерацій (2 < k <= 25)
     * @param t параметр t
     * @param s параметр s
     * @return значення суми
     * @throws IllegalArgumentException якщо k не в допустимих межах
     */
    public static double calculateSum(int k, double t, double s) {
        if (k <= 2 || k > 25) {
            throw new IllegalArgumentException("Invalid k = " + k + ". Must be 2 < k <= 25.");
        }

        double sum = 0;
        for (int i = 1; i <= k; i++) {
            double lnValue = Math.log(-t * i);
            double cosValue = Math.cos(Math.sqrt(s * 1 / (i * i)));
            sum += lnValue * cosValue;
        }
        return sum;
    }

    static void printResults(int k, double t, double s) {
        System.out.print("k:" + k + " t:" + t + " s:" + s + " result: ");
        try {
            System.out.println(calculateSum(k, t, s));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}