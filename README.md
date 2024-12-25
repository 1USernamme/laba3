# laba3

Завдання 1: Код
java
Копіювати код
package lab03;
package lab03;
Оголошення пакету, до якого належить цей клас. Пакет — це простір імен для організації класів у проєкті. У цьому випадку клас належить до пакету lab03.
java
Копіювати код
public class Task1 {
public class Task1
Оголошення публічного класу Task1.
opublic означає, що клас доступний для використання з будь-якого місця у проєкті.
oclass визначає, що це клас Java з назвою Task1.

Головний метод
java
Копіювати код
public static void main(String[] args) {
public static void main(String[] args)
Оголошення головного методу програми, який є точкою входу.
opublic: метод доступний з будь-якого місця.
ostatic: метод належить класу, а не конкретному об'єкту.
ovoid: метод не повертає значення.
oString[] args: параметр, який отримує масив рядків із командного рядка.

Виклики методів
java
Копіювати код
printResults(3, -1.5, 0.5);
printResults(5, -2, 1);
printResults(2, -1, 2);
printResults(20, -0.5, 0.8);
printResults(30, -1, 0.6); // Некоректний k
printResults(...)
Виклик методу printResults, який виводить результати обчислень на екран. Передаються три аргументи:
1.k — кількість ітерацій.
2.t — параметр.
3.s — параметр.
Коментар // Некоректний k вказує, що для останнього виклику буде помилка через невідповідність межам k.

Документація методу
java
Копіювати код
/**
* Обчислює суму ряду sum i = 1 to k ln(- t * i) * cos(sqrt(s * 1/(i^2))).
*
* @param k кількість ітерацій (2 < k <= 25)
* @param t параметр t
* @param s параметр s
* @return значення суми
* @throws IllegalArgumentException якщо k не в допустимих межах
*/
/
Це блок коментарів, який використовується як документація до методу calculateSum.
o@param: пояснює параметри методу.
o@return: описує, що повертає метод.
o@throws: описує, яку помилку може викинути метод.

Метод для обчислення суми
java
Копіювати код
public static double calculateSum(int k, double t, double s) {
public static double calculateSum(int k, double t, double s)
Оголошення методу calculateSum.
opublic: метод доступний з інших класів.
ostatic: метод належить класу.
odouble: метод повертає число з плаваючою комою.
oint k, double t, double s: вхідні параметри.

Умова перевірки
java
Копіювати код
if (k <= 2 || k > 25) {
throw new IllegalArgumentException("Invalid k = " + k + ". Must be 2 < k <= 25.");
}
Перевірка, чи параметр k виходить за межі [2, 25].
oЯкщо k <= 2 || k > 25, викидається виняток IllegalArgumentException.

Ініціалізація змінної
java
Копіювати код
double sum = 0;
double sum = 0;
Змінна sum використовується для накопичення результату.

Цикл обчислення
java
Копіювати код
for (int i = 1; i <= k; i++) {
double lnValue = Math.log(-t * i);
double cosValue = Math.cos(Math.sqrt(s * 1 / (i * i)));
sum += lnValue * cosValue;
}
for (int i = 1; i <= k; i++)
Цикл від i = 1 до i = k. На кожній ітерації:
oОбчислюється логарифм Math.log(-t * i).
oОбчислюється косинус кореня Math.cos(Math.sqrt(s * 1 / (i * i))).
oДо суми додається добуток lnValue * cosValue.

Повернення результату
java
Копіювати код
return sum;
Повертається накопичене значення суми sum.

Метод для друку результатів
java
Копіювати код
static void printResults(int k, double t, double s) {
System.out.print("k:" + k + " t:" + t + " s:" + s + " result: ");
try {
System.out.println(calculateSum(k, t, s));
} catch (IllegalArgumentException e) {
System.out.println("EXCEPTION! " + e.getMessage());
}
}
printResults(...)
Цей метод друкує результат або помилку на екран.
oВикликається метод calculateSum(k, t, s).
oЯкщо виникає помилка, її повідомлення виводиться у форматі EXCEPTION!.

Якщо хочете, можемо перейти до розбору Завдання 2 або ще детальніше заглибитись у будь-який із пунктів цього коду!
4o
Ви сказали:
продовжуй
Програма ChatGPT сказала:
ChatGPT
Завдання 2: Код
java
Копіювати код
package lab03;
package lab03;
Як і в Завданні 1, цей клас належить до пакету lab03.
java
Копіювати код
public class Task2 {
public class Task2
Оголошується клас Task2.

Головний метод
java
Копіювати код
public static void main(String[] args) {
public static void main(String[] args)
Метод головної програми, що запускає виконання. Як і в першому завданні, це точка входу.

Виклики методу printResults
java
Копіювати код
printResults(3);
printResults(2);
printResults(1); // Некоректний t
printResults(t)
Викликається метод printResults, що передає значення параметра t:
1.3 — коректне значення.
2.2 — коректне значення.
3.1 — некоректне значення, оскільки обмеження для t визначено в методі calculateFunction.

Документація методу
java
Копіювати код
/**
* Обчислює значення функції x(t, I).
*
* @param t параметр t
* @return значення функції x(t, I)
* @throws IllegalArgumentException якщо t < 1
*/
Це Javadoc-документація, яка пояснює метод calculateFunction.
o@param t: пояснює, що t — це вхідний параметр.
o@return: метод повертає результат обчислення функції.
o@throws IllegalArgumentException: якщо t менше 1, буде викинуто виняток.

Метод обчислення функції
java
Копіювати код
public static double calculateFunction(int t) {
public static double calculateFunction(int t)
Метод для обчислення функції x(t, I).

Умова перевірки
java
Копіювати код
if (t < 1) {
throw new IllegalArgumentException("Invalid t = " + t + ". Must be t >= 1.");
}
Перевіряється, чи значення t є меншим за 1. Якщо це так, викидається виняток IllegalArgumentException.

Ініціалізація змінної
java
Копіювати код
double sum = 0;
double sum = 0;
Змінна для збереження накопиченої суми.

Цикл обчислення
java
Копіювати код
for (int i = 1; i <= t; i++) {
double sqrtPart1 = Math.sqrt(i * 3.5);
double sqrtPart2 = Math.sqrt(i * 2);
sum += sqrtPart1 + sqrtPart2;
}
for (int i = 1; i <= t; i++)
Цикл ітерується від i = 1 до i = t. На кожній ітерації:
oMath.sqrt(i * 3.5): обчислюється квадратний корінь з добутку i і 3.5.
oMath.sqrt(i * 2): обчислюється квадратний корінь з добутку i і 2.
oОбидва значення додаються до змінної sum.

Повернення результату
java
Копіювати код
return sum;
Повертається підсумкове значення sum.

Метод друку результатів
java
Копіювати код
static void printResults(int t) {
System.out.print("t:" + t + " result: ");
try {
System.out.println(calculateFunction(t));
} catch (IllegalArgumentException e) {
System.out.println("EXCEPTION! " + e.getMessage());
}
}
printResults(int t)
Метод виводить результат обчислення функції або помилку.
oSystem.out.print: виводить значення t і текст result:.
oВикликається метод calculateFunction(t).
oЯкщо параметр t некоректний, помилка обробляється в catch і виводиться повідомлення про виняток.

Приклад виконання:
1.printResults(3):
oРозраховує значення функції для t = 3.
oПовертає суму для трьох ітерацій циклу.
2.printResults(2):
oРозраховує значення функції для t = 2.
3.printResults(1):
oВикидає виняток IllegalArgumentException, оскільки t < 1.

Хочете, щоб я одразу розбирав Завдання 3, чи зупинимося тут для уточнень?
4o
Ви сказали:
уточнен
Програма ChatGPT сказала:
ChatGPT
Давайте уточнимо, що саме вам потрібно. Ви хочете:
1.Деталізувати конкретний фрагмент коду з Завдання 2? Наприклад, як працює цикл або винятки?
2.Більше пояснень про логіку завдання (наприклад, чому саме такі формули для розрахунків)?
3.Приклади виконання з конкретними числами (розрахунок крок за кроком)?
4.Чи одразу перейти до розбору Завдання 3?
Дайте знати, і я одразу підлаштуюсь! 😊
4o
Ви сказали:
продовжуй
Програма ChatGPT сказала:
ChatGPT
Завдання 3: Код
java
Копіювати код
package lab03;
package lab03;
Як і у попередніх завданнях, це оголошення пакету lab03, у якому знаходиться клас Task2.

Головний метод
java
Копіювати код
public static void main(String[] args) {
printResults(0.001);
printResults(0.0001);
printResults(1e-6);
printResults(-0.001); // Некоректне значення
}
public static void main(String[] args)
Головний метод програми.
oВикликає printResults із різними значеннями epsilon.
oКоментар // Некоректне значення вказує, що при epsilon = -0.001 буде помилка.

Документація методу
java
Копіювати код
/**
* Обчислення суми з точністю ε.
* @param epsilon точність (ε > 0).
* @return результат обчислення суми.
* @throws IllegalArgumentException якщо epsilon <= 0.
*/
/
Це блок коментарів, який документує метод computeSum.
o@param epsilon: пояснює, що epsilon — це точність.
o@return: метод повертає суму, обчислену з заданою точністю.
o@throws IllegalArgumentException: викидається помилка, якщо epsilon <= 0.

Метод для обчислення суми
java
Копіювати код
public static double computeSum(double epsilon) {
public static double computeSum(double epsilon)
Метод для обчислення суми ряду з заданою точністю epsilon.
odouble: результат повертається як число з плаваючою комою.

Умова перевірки
java
Копіювати код
if (epsilon <= 0) {
throw new IllegalArgumentException("Точність ε повинна бути більше 0: ε = " + epsilon);
}
Перевіряється, чи значення epsilon менше або дорівнює 0. Якщо це так, викидається виняток IllegalArgumentException із повідомленням, що точність має бути додатною.

Ініціалізація змінних
java
Копіювати код
double sum = 0.0;
int i = 0;
double term;
double sum = 0.0;
Змінна для накопичення суми.
int i = 0;
Змінна-лічильник для циклу.
double term;
Змінна для збереження значення поточного доданка.

Цикл обчислення
java
Копіювати код
do {
term = Math.pow(-2, i) / (factorial(i) * (i + 1));
sum += term;
i++;
} while (Math.abs(term) >= epsilon);
do { ... } while (...);
Цикл do-while обчислює доданки ряду, доки абсолютне значення поточного доданка Math.abs(term) більше або дорівнює точності epsilon.

Обчислення доданка
java
Копіювати код
term = Math.pow(-2, i) / (factorial(i) * (i + 1));
Math.pow(-2, i): підносить -2 до степеня i.
factorial(i): обчислює факторіал i.
(i + 1): додається 1 до i у знаменнику.
Доданок додається до sum.

Умова виходу з циклу
java
Копіювати код
while (Math.abs(term) >= epsilon);
Цикл завершується, коли абсолютне значення поточного доданка term стане меншим за точність epsilon.

Повернення результату
java
Копіювати код
return sum;
Повертається значення суми sum, обчисленої з точністю epsilon.

Метод для обчислення факторіалу
java
Копіювати код
private static double factorial(int n) {
double fact = 1.0;
for (int i = 1; i <= n; i++) {
fact *= i;
}
return fact;
}
private static double factorial(int n)
Метод для обчислення факторіала числа n (n!).
oІніціалізується змінна fact = 1.0.
oЦикл for обчислює добуток усіх чисел від 1 до n.
oРезультат повертається як fact.

Метод для друку результатів
java
Копіювати код
static void printResults(double epsilon) {
System.out.print("ε: " + epsilon + " result: ");
try {
System.out.println(computeSum(epsilon));
} catch (IllegalArgumentException e) {
System.out.println("EXCEPTION! " + e.getMessage());
}
}
printResults(double epsilon)
Метод друкує результат або повідомлення про помилку.
oВикликається computeSum(epsilon).
oЯкщо значення epsilon некоректне, помилка обробляється у блоці catch.

Приклад виконання:
1. printResults(0.001):
Цикл обчислює доданки, доки їх значення >= 0.001.
Сума повертається й друкується.
2. printResults(1e-6):
Точність більша, ніж у попередньому випадку. Цикл виконає більше ітерацій, щоб досягти точності.
3. printResults(-0.001):
Викидається виняток IllegalArgumentException, оскільки epsilon <= 0.
