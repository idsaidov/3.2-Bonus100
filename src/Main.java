public class Main {
    public static void main(String[] args) {
        int score = 30;
        int replenishment = 1300;
        int bonus = 0;

        if (replenishment > 1000) {
            bonus = replenishment / 100;
            System.out.println("Клиент пополнил счёт на " + replenishment + " рублей. Накопил " + bonus + " бонусов.");
        }else {
            System.out.println("Клиент пополнил счёт на " + replenishment + " рублей. Вы накопили " + bonus + " бонусов.");
            System.out.println("Если клиент пополняет счёт более чем на 1000 рублей, то сотовый оператор дарит ему по 1 рублю за каждые полные 100 рублей пополнения.");
        }
        int inTotal = score + replenishment + bonus;

        System.out.println("Итоговая сумма на счету клиента: " + inTotal + "рублей.");



    }
}