public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и параметров программы:
        // начального счёта, суммы пополнения и тп
        int count = 100;
        int refill = 5;
        int total;

        // Условным оператором проверяете превысила ли сумма пополнения порог
        // и для этих двух разных сценариев рассчитываете сумму бонуса и выводите на экран.

        if (refill > 1000) {
            int bonus = refill/100;
            total = count + refill + bonus;
        } else {
            total = count + refill;
        }
        System.out.println("Сумма на вашем счете:" + total);

    }
}