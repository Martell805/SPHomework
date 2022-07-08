package secondCourse.Task2_2;

public class Task2_2 {
    public static void solution(){
        GryffindorStudent harry = new GryffindorStudent("Гарри Поттер", 1, 1, 1, 1, 1);
        GryffindorStudent hermione = new GryffindorStudent("Гермиона Грейнджер", 1, 1, 5, 5, 6);
        GryffindorStudent ron = new GryffindorStudent("Рон Уизли", 1, 1, 3, 6, 5);

        SlytherinStudent draco = new SlytherinStudent("Драко Малфой", 2, 2, 1, 1, 100, 1, 1);
        SlytherinStudent graham = new SlytherinStudent("Грэхэм Монтегю", 1, 1, 1, 1, 1, 1, 1);
        SlytherinStudent gregory = new SlytherinStudent("Грегори Гойл", 1, 1, 1, 1, 1, 1, 1);

        HufflepuffStudent zachariah = new HufflepuffStudent("Захария Смит", 100, 100, 1, 1, 1);
        HufflepuffStudent cedric = new HufflepuffStudent("Седрик Диггори", 1, 1, 1, 1, 1);
        HufflepuffStudent justin = new HufflepuffStudent("Джастин Финч-Флетчли", 1, 1, 1, 1, 1);

        RavenclawStudent zhou = new RavenclawStudent("Чжоу Чанг", 1, 1, 1, 1, 1, 1);
        RavenclawStudent padma = new RavenclawStudent("Падма Патил", 1, 1, 1, 1, 1, 1);
        RavenclawStudent marcus = new RavenclawStudent("Маркус Белби", 1, 1, 1, 1, 1, 1);

        harry.print();

        hermione.compareTo(ron);
        draco.compareTo(zachariah);
    }
}
