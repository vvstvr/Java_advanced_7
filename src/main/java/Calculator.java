import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Введите первое число: ");
        float first = scanner.nextFloat();
        System.out.printf("Введите второе число: ");
        float second = scanner.nextFloat();

        System.out.printf("Выберите операцию (+,-,*,/): ");
        char op = scanner.next().charAt(0);

        switch (op) {
            case '+':
                System.out.printf("Sum: %.4f\n", addition(first, second));
                break;
            case '-':
                System.out.printf("Div: %.4f\n", subtraction(first, second));
                break;
            case '*':
                System.out.printf("Mult: %.4f\n", multiplication(first, second));
                break;
            case '/':
                System.out.printf("Quot: %.4f\n", division(first, second));
                break;
        }
    }

    /**
     *
     * @param a Первое расчётное значение
     * @param b Второе расчётное значение
     * @return Возвращаем результат сложения
     */

    public static float addition (float a, float b){
        return a + b;
    }
    /**
     *
     * @param a Первое расчётное значение
     * @param b Второе расчётное значение
     * @return Возвращаем результат вычитания
     */
    public static float subtraction (float a, float b) {

        return a - b;
    }
    /**
     *
     * @param a Первое расчётное значение
     * @param b Второе расчётное значение
     * @return Возвращаем результат умножения
     */
    public static float multiplication (float a, float b){

        return a * b;
    }
    /**
     *
     * @param a Первое расчётное значение
     * @param b Второе расчётное значение
     * @return Возвращаем результат деления
     */
    public static float division (float a, float b){

        return a / b;
    }

}
