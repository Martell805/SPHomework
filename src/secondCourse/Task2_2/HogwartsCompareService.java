package secondCourse.Task2_2;

public class HogwartsCompareService {
    public static void compareHogwartsStudents(HogwartsStudent student1, HogwartsStudent student2){
        if(student1.getScore() > student2.getScore()){
            System.out.printf("%s обладает большей мощностью магии, чем %s\n", student1.getName(), student2.getName());
        } else if (student1.getScore() == student2.getScore()){
            System.out.printf("%s и %s обладает равной мощностью магии\n", student1.getName(), student2.getName());
        } else {
            System.out.printf("%s обладает меньшей мощностью магии, чем %s\n", student1.getName(), student2.getName());
        }
    }

    public static void compareGryffindorStudents(GryffindorStudent student1, GryffindorStudent student2){
        if(student1.getScore() > student2.getScore()){
            System.out.printf("%s лучший Гриффиндорец, чем %s\n", student1.getName(), student2.getName());
        } else if (student1.getScore() == student2.getScore()){
            System.out.printf("%s и %s равные Гриффиндорцы\n", student1.getName(), student2.getName());
        } else {
            System.out.printf("%s лучший Гриффиндорец, чем %s\n", student1.getName(), student2.getName());
        }
    }

    public static void compareHufflepuffStudents(HufflepuffStudent student1, HufflepuffStudent student2){
        if(student1.getScore() > student2.getScore()){
            System.out.printf("%s лучший Пуффендуец, чем %s\n", student1.getName(), student2.getName());
        } else if (student1.getScore() == student2.getScore()){
            System.out.printf("%s и %s равные Пуффендуйцы\n", student1.getName(), student2.getName());
        } else {
            System.out.printf("%s лучший Пуффендуец, чем %s\n", student1.getName(), student2.getName());
        }
    }

    public static void compareRavenclawStudents(RavenclawStudent student1, RavenclawStudent student2){
        if(student1.getScore() > student2.getScore()){
            System.out.printf("%s лучший Когтевранец, чем %s\n", student1.getName(), student2.getName());
        } else if (student1.getScore() == student2.getScore()){
            System.out.printf("%s и %s равные Когтевранцы\n", student1.getName(), student2.getName());
        } else {
            System.out.printf("%s лучший Когтевранец, чем %s\n", student1.getName(), student2.getName());
        }
    }

    public static void compareSlytherinStudents(SlytherinStudent student1, SlytherinStudent student2){
        if(student1.getScore() > student2.getScore()){
            System.out.printf("%s лучший Слизеринец, чем %s\n", student1.getName(), student2.getName());
        } else if (student1.getScore() == student2.getScore()){
            System.out.printf("%s и %s равные Слизеринцы\n", student1.getName(), student2.getName());
        } else {
            System.out.printf("%s лучший Слизеринец, чем %s\n", student1.getName(), student2.getName());
        }
    }
}
