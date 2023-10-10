public class Main {
    public static void main(String[] args) {

        int balance = 100; // количество денег на текущем счету клиента
        int refill = 1000; // сумма пополнения счета

        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }

        System.out.println(" количество бонусных рублей " + bonus);
        System.out.println(" итоговый счет " + (balance + refill + bonus));
    }
}
