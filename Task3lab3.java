package lab3;

public class Task3lab3 {

    // Метод main для перевірки з різними значеннями ε.
    public static void main(String[] args) {
        printResults(0.001);
        printResults(0.0001);
        printResults(1e-6);
        printResults(-0.001);  // Некоректне значення
    }

    /* Обчислення суми з точністю ε.
     * @param epsilon точність (ε > 0).
            * @return результат обчислення суми.
     * @throws IllegalArgumentException якщо epsilon <= 0.
            */
    public static double computeSum(double epsilon) {
        if (epsilon <= 0) {
            throw new IllegalArgumentException("Точність ε повинна бути більше 0: ε = " + epsilon);
        }

        double sum = 0.0;
        int i = 0;
        double term;

        // Цикл обчислення доданків
        do {
            term = Math.pow(-2, i) / (factorial(i) * (i + 1));
            sum += term;
            i++;
        } while (Math.abs(term) >= epsilon);  // Умова зупинки при досягненні точності
        return sum;
    }

    // Метод для обчислення факторіалу числа.
    private static double factorial(int n) {
        double fact = 1.0;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Допоміжний метод для друку результатів
    static void printResults(double epsilon) {
        System.out.print("ε: " + epsilon + " result: ");
        try {
            System.out.println(computeSum(epsilon));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}