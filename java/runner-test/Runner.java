// powershell> javac Runner.java; java Runner
// cmd> javac Runner.java & java Runner

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        String someString = "Hello";
        char[] toArray = someString.toCharArray();

        for (char ch: toArray) {
            System.out.println(ch);
        }
    }
}