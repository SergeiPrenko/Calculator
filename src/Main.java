import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int operand1 =operand();
        char operation = simvol();
        int operand2 = operand();
        int result = calc(operand1, operand2, operation);
    }
    public static int operand() {
        System.out.println("Введите число");
        int sum;
        if (scanner.hasNextInt()) {
            sum = scanner.nextInt();
        } else {
            System.out.println("Не верно, повторите");
            scanner.next();
            sum = operand();
        }
        return sum;
    }
    public static char simvol() {
        System.out.println("Введите операцию");
        char sim = scanner.next().charAt(0);
        return sim;
    }

    public static int calc(int operand1, int operand2, int operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = operand1 + operand2;
                System.out.println("Итог: " + result);
                break;
            case '-':
                result = operand1 - operand2;
                System.out.println("Итог: " + result);
                break;
            case '*':
                result = operand1 * operand2;
                System.out.println("Итог: " + result);
                break;
            case '/':
                result = operand1 / operand2;
                System.out.println("Итог: " + result);
                break;
            default:
                System.out.println("Не корректная операция");
        }
        return result;
    }
}