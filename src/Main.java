import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Machine coffeeMachine = new Machine();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер напитка: \n 1 - Эспрессо \n 2 - Молоко\n 3 - Мороженное\n 4 - Сироп" +
                "\n 5 - Сок\n 6 - Флэт-Уайт\n 7 - Латте\n 8 - Смузи\n Чтобы выключить, введите 0");
        int instruction = scanner.nextInt();
        switch (instruction) {
            case 1:
                coffeeMachine.espresso();
                break;
            case 2:
                coffeeMachine.milk();
                break;
            case 3:
                coffeeMachine.iceCream();
                break;
            case 4:
                coffeeMachine.syrup();
                break;
            case 5:
                coffeeMachine.juice();
                break;
            case 6:
                coffeeMachine.flatWhite();
                break;
            case 7:
                coffeeMachine.latte();
                break;
            case 8:
                coffeeMachine.smoothie();
                break;
            case 0:
                break;
        }
    }
}
