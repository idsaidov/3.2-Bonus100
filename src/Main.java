public class Main {
    public static void main(String[] args) {
        int score = 100;
        int replenishment = 300;
        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
            System.out.println("Клиент пополнил счёт на " + replenishment + " рублей. Накопил " + bonus + " бонусов.");
        }else {
            bonus = 0;
            System.out.println("Клиент пополнил счёт на " + replenishment + " рублей. Накопил " + bonus + " бонусов.");
            System.out.println("Если клиент пополняет счёт более чем на 1000 рублей, то сотовый оператор дарит ему по 1 рублю за каждые полные 100 рублей пополнения.");
        }
        int inTotal = score + replenishment + bonus;

        System.out.println("Итоговая сумма на счету клиента: " + inTotal + "рублей.");





    }
}