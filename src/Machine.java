public class Machine {
    double esp;
    int milk;
    int iCream;
    int syrup;
    int juice;

    public Machine(double esp, int milk,int iCream,int syrup,int juice) {
        this.esp = esp;
        this.milk = milk;
        this.iCream = iCream;
        this.syrup = syrup;
        this.juice = juice;
    }
        public void espresso () {
            System.out.println((esp >= 8) ? "Готовится эспрессо" : "Недостаточно ингридиентов");
        }
        public void milk () {
            System.out.println((milk >= 8) ? "Готовится молоко" : "Недостаточно ингридиентов");
        }
        public void iceCream () {
            System.out.println((iCream >= 8) ? "Готовится мороженное" : "Недостаточно ингридиентов");
        }
        public void syrup () {
            System.out.println((syrup >= 8) ? "Готовится сироп" : "Недостаточно ингридиентов");
        }
        public void juice () {
            System.out.println((juice >= 8) ? "Готовится сок" : "Недостаточно ингридиентов");
        }
        public void flatWhite () {
            System.out.println((esp >= 8 * 0.4 && milk >= 8 * 0.6) ? "Готовится Флэт-Уйат" : "Недостаточно ингридиентов");
        }
        public void latte () {
            System.out.println((esp >= 8 * 0.15 && milk >= 8 * 0.85) ? "Готовится Латте" : "Недостаточно ингридиентов");
        }
        public void smoothie () {
            System.out.println((syrup >= 8 * 0.1 && iCream >= 8 * 0.5 && esp >= 8 * 0.35) ?
                    "Готовится смузи" : "Недостаточно ингридиентов");
        }
    }


