public class Task3 {
    Task3(){
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
}
