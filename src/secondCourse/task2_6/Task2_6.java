package secondCourse.task2_6;

import java.util.*;
import java.util.stream.Collectors;


public class Task2_6 {
    public static void solution(){
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 6, 5, 5, 4, 7));
        String text = "a b c d e d a s f";

        // Задание 1

        System.out.println(
                nums.stream().filter(n -> n % 2 == 1).collect(Collectors.toList())
        );

        // Задание 2

        System.out.println(
                nums.stream().distinct().filter(n -> n % 2 == 0).sorted().collect(Collectors.toList())
        );

        // Задание 3

        System.out.println(
            new HashSet<>(List.of(text.split(" ")))
        );

        // Задание 4

        System.out.println(
                text.split(" ").length - new HashSet<>(List.of(text.split(" "))).size()
        );
    }
}
