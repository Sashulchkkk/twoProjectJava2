public class Main {
    public static void main(String[] args) {
        int initialSum = 100;
        int replenish = 500;
        int bonus;
        int finalSum = initialSum + replenish;


        if (replenish >= 1000) {
            bonus = replenish / 100;
            finalSum = initialSum + replenish + bonus;

            System.out.println("Клиент пополнил счёт на " + replenish + " рублей — " +
                    "бонус равен " + bonus + " рублям, итоговая сумма на счету клиента — " + finalSum + " рублей.");
        } else {
            System.out.println("Клиент пополнил счёт на " + replenish + " рублей — " +
                    "бонусов нет, итоговая сумма на счету клиента —" + finalSum + " рублей.");
        }

    }
}