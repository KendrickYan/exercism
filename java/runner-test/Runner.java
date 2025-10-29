// powershell> javac Runner.java; java Runner
// cmd> javac Runner.java & java Runner

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };

//        System.out.println(
//                Arrays.stream(birdsPerDay)
//        );
        Arrays.stream(birdsPerDay)
                .forEach(System.out::println);
    }
}