public class Task2 {
    Task2(){
        // Задание 1

        int clientOS = 1;

        System.out.printf("Установите версию приложения для %s по ссылке\n", (clientOS == 1) ? "Android" : "iOS");

        // Задание 2

        int clientDeviceYear = 2014;

        System.out.printf("Установите %sверсию приложения для %s по ссылке\n",
                (clientDeviceYear >= 2015) ? "" : "облегченную ",
                (clientOS == 1) ? "Android" : "iOS");

        // Задание 3

        int year = 2004;

        System.out.printf("%d год %sявляется високосным", year,
                (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? "" : "не ");

        // Задание 4

        int deliveryDistance = 95;
        int deliveryTime = 1;

        deliveryTime += (deliveryDistance > 20) ? 1 : 0;
        deliveryTime += (deliveryDistance > 60) ? 1 : 0;

        System.out.println("Потребуется дней: " + deliveryTime);

        // Задание 5

        int monthNumber = 12;

        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима"); break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна"); break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето"); break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень"); break;

        }
    }
}
