import java.util.Scanner;

public class Machine {
    double esp;
    int milk;
    int iCream;
    int syrup;
    int juice;

    public void espresso() {
            System.out.println((esp>=8)? "Готовится эспрессо":"Недостаточно ингридиентов");
        }
        public void milk() {
        System.out.println((milk >= 8) ? "Готовится молоко" : "Недостаточно ингридиентов");
    }
    public void iceCream(){
        System.out.println((iCream >= 8) ? "Готовится мороженное" : "Недостаточно ингридиентов");
    }
    public void syrup() {
        System.out.println((syrup >= 8) ? "Готовится сироп" : "Недостаточно ингридиентов");
    }
    public void juice(){
        System.out.println((juice >= 8) ? "Готовится сок" : "Недостаточно ингридиентов");
    }
    public void flatWhite(){
        System.out.println((esp >= 8 * 0.4 && milk >= 8 * 0.6) ? "Готовится Флэт-Уйат" : "Недостаточно ингридиентов");
    }
    public void latte() {
        System.out.println((esp >= 8 * 0.15 && milk >= 8 * 0.85) ? "Готовится Латте" : "Недостаточно ингридиентов");
    }
    public void smoothie(){
        System.out.println((syrup >= 8 * 0.1 && iCream >= 8 * 0.5 && esp >= 8 * 0.35) ?
                "Готовится смузи" : "Недостаточно ингридиентов");
    }

    public static void main(String[] args) {
        Machine Coffeemachine = new Machine();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер напитка: \n 1 - Эспрессо \n 2 - Молоко\n 3 - Мороженное\n 4 - Сироп" +
                "\n 5 - Сок\n 6 - Флэт-Уайт\n 7 - Латте\n 8 - Смузи\n Чтобы выключить, введите 0");
        Coffeemachine.esp = 8;
        Coffeemachine.milk = 7;
        Coffeemachine.iCream = 3;
        Coffeemachine.syrup = 4;
        Coffeemachine.juice = 5;
        while (true) {
            int instruction = scanner.nextInt();
            if (instruction == 1){
                Coffeemachine.espresso();
            }
                if (instruction == 2){
                    Coffeemachine.milk();
                }
                if (instruction == 3){
                    Coffeemachine.iceCream();
                }
                if (instruction==4){
                    Coffeemachine.syrup();
                }
                if (instruction==5){
                    Coffeemachine.juice();
                }
                if (instruction==6){
                    Coffeemachine.flatWhite();
                }
                if (instruction==7){
                    Coffeemachine.latte();
                }
                if (instruction==8){
                    Coffeemachine.smoothie();
                }
                if (instruction==0){
                    break;
                }
            }
        }

    }

