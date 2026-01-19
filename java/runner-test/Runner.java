// powershell> javac Runner.java; java Runner
// cmd> javac Runner.java & java Runner
// bash> javac Runner.java & java Runner

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        String someString = "[Hello:World!";
        String[] toArray = someString.split(":");
        System.out.println(toArray[0].substring(1));
    }
}