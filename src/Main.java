import java.time.LocalDate;
import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {
        TaskObjects();
    }

    public static void Task2(){
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

    public static void Task3(){
        // Задание 1
        int i = 0;
        while(i++ < 10) System.out.print(i + " ");
        System.out.println();

        for(;i-- > 1;) System.out.print(i + " ");
        System.out.println();

        // Задание 2
        int firstFriday = 1;

        for(int day = 1; day <= 31; day++)
            if(day % 7 == firstFriday)
                System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.\n", day);

        // Задание 3

        int currentYear = 2022;
        int frequency = 79;

        int startYear = currentYear - 200;
        int lastYear = currentYear + 100;

        int firstAppearance = ((startYear - 1) / frequency + 1) * frequency;

        for(int appearanceYear = firstAppearance; appearanceYear < lastYear; appearanceYear += frequency)
            System.out.println(appearanceYear);
    }

    public static void TaskArrays1(){
        // Задание 1
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        double[] arr2 = {1.57, 7.654, 9.986};

        char[] arr3 = {'h', 'e', 'l', 'l', 'o'};

        // Задание 2

        for(int q = 0; q < arr1.length; System.out.print(arr1[q] + ((q++ == arr1.length - 1) ? "\n" : ", ")));
        for(int q = 0; q < arr2.length; System.out.print(arr2[q] + ((q++ == arr2.length - 1) ? "\n" : ", ")));
        for(int q = 0; q < arr3.length; System.out.print(arr3[q] + ((q++ == arr3.length - 1) ? "\n" : ", ")));

        // Задание 3

        for(int q = arr1.length - 1; q >= 0; System.out.print(arr1[q] + ((q-- == 0) ? "\n" : ", ")));
        for(int q = arr2.length - 1; q >= 0; System.out.print(arr2[q] + ((q-- == 0) ? "\n" : ", ")));
        for(int q = arr3.length - 1; q >= 0; System.out.print(arr3[q] + ((q-- == 0) ? "\n" : ", ")));

        // Задание 4
        for(int q = 0; q < arr1.length; q = ((arr1[q] % 2 == 0) ? arr1[q]++ : arr1[q]) * 0 + q + 1);
        for(int q = 0; q < arr1.length; System.out.print(arr1[q] + ((q++ == arr1.length - 1) ? "\n" : ", ")));
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void TaskArrays2(){
        // Задание 1

        int[] arr = generateRandomArray();

        int sum = 0;
        for(int q = 0; q < arr.length; sum += arr[q++]);
        System.out.printf("Сумма трат за месяц составила %d рублей\n", sum);

        // Задание 2

        int min = 300_000, max = 99_999;
        for(int q = 0; q < arr.length; q++){
            min = Math.min(arr[q], min);
            max = Math.max(arr[q], max);
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей\n", min, max);

        // Задание 3

        System.out.printf("Средняя сумма трат за месяц составила %f рублей\n", (float) sum / arr.length);

        // Задание 4

        char[] fullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for(int q = -1; q++ < fullName.length / 2 - 1;
            fullName[q] = ((BiFunction<Character, Character, Character>)(itself, dummy) -> itself)
                    .apply(fullName[fullName.length - q - 1], fullName[fullName.length - q - 1] = fullName[q]));  // swap`а нет, пришлось так(
        System.out.println(fullName);
    }

    public static void TaskStrings(){
        // Задание 1

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        // Задание 2

        String uppercaseFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + uppercaseFullName);

        // Задание 3

        fullName = "Иванов Семён Семёнович";
        String allowedFullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + allowedFullName);
    }

    private static void isLeap(int year){
        System.out.printf("%d год %sявляется високосным\n", year,
                (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? "" : "не ");
    }

    private static void suitableVersion(int clientDeviceYear, int clientOS){
        int currentYear = LocalDate.now().getYear();

        System.out.printf("Установите %sверсию приложения для %s по ссылке\n",
                (clientDeviceYear >= currentYear) ? "" : "облегченную ",
                (clientOS == 1) ? "Android" : "iOS");
    }

    private static void deliveryTime(int deliveryDistance){
        int deliveryTime = 1;

        deliveryTime += (deliveryDistance > 20) ? 1 : 0;
        deliveryTime += (deliveryDistance > 60) ? 1 : 0;

        System.out.println("Потребуется дней: " + deliveryTime);
    }

    public static void TaskMethods(){
        // Задание 1

        isLeap(2004);

        // Задание 2

        suitableVersion(2020, 1);

        // Задание 3

        deliveryTime(95);
    }

    public static void TaskObjects(){
        Author author1 = new Author("Author", "1");
        Author author2 = new Author("Author", "2");

        System.out.println(author1 + " " + author2);

        Book book1 = new Book("Book1", author1, 1999);
        Book book2 = new Book("Book2", author2, 2004);

        System.out.println(book1 + " " + book2);

        book2.setPublicationYear(2003);

        System.out.println(book2);
    }
}
