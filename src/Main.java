public class Main {
    public static void main(String[] args) {
        int score = 130;
        int replenishment = 1300;
        int bonus = 0;

        if (replenishment > 1000) {
            bonus = replenishment / 100;
        }
        int total = score + replenishment + bonus;
        System.out.println("Ваш баланс: " + total + " руб.");

    }
}