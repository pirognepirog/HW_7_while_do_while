//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача № 1");

        int firstFriday = 1;
        for (int day = firstFriday; day <= 31; day += 7){
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет!");
        }

        System.out.println("Задача № 2, вариант 1");
        int fullDistance = 42_195;
        int massageDistance = 500;
        int myDistance = 0;
        do {
            System.out.println("Держитесь! Осталось " + fullDistance + " метров");
            fullDistance = fullDistance - massageDistance;
            if (fullDistance <= 0) {System.out.println("Молодец! Твой марафон окончен! Выпей воды и отдохни!");}
        } while (fullDistance >= 0);

        System.out.println("Задача № 2, вариант 2");
        fullDistance = 42_195;
        for (myDistance = 0; myDistance < fullDistance; myDistance += 500) {
            //fullDistance = fullDistance - massageDistance;
            System.out.println("Держитесь! Осталось " + (fullDistance - myDistance) + " метров");
        }

        System.out.println("Задача № 3, вариант 1");
        int budget = 5000;
        int day = 1;
        while (true){
            if (day % 5 == 0) {
                day++;
                System.out.println("В этот день плата не взымается! Мы заботимся о Вашем бюджете!");
                continue;
            }
        budget -= 100;
        System.out.println("День " + day + " Произведено списание средств в размере 100 р. Остаток " + budget + " р.");
        day++;
            if(budget <= 100){
                System.out.println("День " + day + " На вашем счете не достаточно средств! Пополните баланс!");
                break;
            }
        }

        System.out.println("Задача № 3, вариант 2");
        budget = 5000;
        day = 1;
        for (int i = budget; i >= 100; ){
            if (day % 5 == 0) {
                day++;
                System.out.println("В этот день плата не взымается! Мы заботимся о Вашем бюджете!");
                continue;
            }
            budget -= 100;
            System.out.println("День " + day + " Произведено списание средств в размере 100 р. Остаток " + budget + " р.");
            day++;
            if(budget <= 100){
                System.out.println("День " + day + " На вашем счете не достаточно средств! Пополните баланс!");
                break;
            }
        }

        System.out.println("Задача № 4");
        int month = 0;
        double total = 0D;
        int salary = 15_000;
        while(true){
            total = total + salary;
            if (total >= 12_000_000)
                break;
            month++;
            if (month % 6 == 0){
                total = total  * 1.07;
            }
            System.out.printf("Месяц %d, сумма накоплений %.2f рублей%n ", month, total);
        }
        System.out.println("Задача № 5");
        int charge = 20;   //текущий уровень заряда (начинается с 20%);
        int minute = 0;    //счетчик времени зарядки;
        int overheats = 0; //количество перегревов.
        while(true){
            minute++;
            charge = charge + 2;

            if(charge >= 100){
                System.out.println("Зарядка завершена, текущий уровень заряда " + charge + "%. Время заряда " + minute + " мин.");
                break;
            }
            if(minute % 10 == 0){
                overheats++;
                //minute = minute - 2;
                System.out.println("Техническая пауза зарядки на 2 минуты! Уровень заряда составляет "
                        + charge + "%. Время заряда " + minute + " мин.");
                continue;
            }
            if(overheats > 3){
                System.out.println("Батарея перегрелась более 3-х раз! Зарядка остановлена, текущий уровень заряда " + charge + "%");
                break;
            }
        }



    }
}