public class Main {

    public static void main(String[] args) {

        // Задание 1
        byte a = 100;
        short b = 1000;
        int c = 100000;
        long d = 10000L;

        float e = 3.5f;
        double f = 3.5;

        // Задание 2
        char g = 1000;
        boolean h = true;

        double firstWeight = 78.2;
        double secondWeight = 82.7;

        double sum = firstWeight + secondWeight;
        System.out.println(sum);
        double dif = secondWeight - firstWeight;
        System.out.println(dif);

        // Задание 3
        int bananaWeight = 80;
        int milkWeight = 105;
        int iceCreamWeight = 100;
        int eggWeight = 70;

        int bananaAmount = 1;
        int milkAmount = 200;
        int iseCreamAmount = 2;
        int eggAmount = 1;

        milkAmount /= 100;

        int breakfastWeight = bananaWeight * bananaAmount + milkWeight * milkAmount +
                iceCreamWeight * iseCreamAmount + eggWeight * eggAmount;

        double breakfastWeightKG = breakfastWeight / 1000.0;

        System.out.println(breakfastWeightKG);

        // Задание 4
        int weightKG = 7;
        int weight = weightKG * 1000;

        int minimumLoss = 250;
        int maximumLoss = 500;
        int averageLoss = (maximumLoss - minimumLoss) / 2;


        System.out.println(weight / minimumLoss);
        System.out.println(weight / maximumLoss);
        System.out.println(weight / averageLoss);

        // Задание 5

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;

        int raisingPercent = 10;
        double multiplier = 1 + raisingPercent / 100.0;

        int newMashaSalary = (int) (mashaSalary * multiplier);
        int newDenisSalary = (int) (denisSalary * multiplier);
        int newKristinaSalary = (int) (kristinaSalary * multiplier);

        System.out.printf("Маша теперь получает %d рублей. Годовой доход вырос на %d рублей\n",
                newMashaSalary, (newMashaSalary - mashaSalary) * 12);
        System.out.printf("Денис теперь получает %d рублей. Годовой доход вырос на %d рублей\n",
                newDenisSalary, (newDenisSalary - denisSalary) * 12);
        System.out.printf("Кристина теперь получает %d рублей. Годовой доход вырос на %d рублей\n",
                newKristinaSalary, (newKristinaSalary - kristinaSalary) * 12);
    }
}
