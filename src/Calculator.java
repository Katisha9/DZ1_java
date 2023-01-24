import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt();
        char operation = getOperation();
        int num2 = getInt();
        calc(num1,num2,operation);
    }

    public static int getInt(){
        System.out.println("Введите число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Ошибка! Введите число.");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Ошибка! Введите операцию.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static void calc(int num1, int num2, char operation){
        int result = 0;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Ошибка! Повторите ввод операции.");
        }
                System.out.println("Результат вычисления: "+result);

    }
}
