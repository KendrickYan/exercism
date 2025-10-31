// powershell> javac Runner.java; java Runner
// cmd> javac Runner.java & java Runner

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();

        System.out.println(languages.isEmpty());
    }
}