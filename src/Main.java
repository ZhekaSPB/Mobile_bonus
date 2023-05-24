public class Main {
    public static void main(String[] args) {

        int was = 200;
        int replenishment = 1500;
        int bonus;
        if (replenishment >= 1000) {
            bonus = replenishment/100;
        } else {
            bonus = 0;
        }
        int amount = was + replenishment;
        System.out.println("Итоговый бонус: " + bonus);
        System.out.println("Итоговый счёт: " + amount);

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}