// powershell> javac Runner.java; java Runner
// cmd> javac Runner.java & java Runner

public class Runner {
    public static void main(String[] args) {
        int[] someNumbers = {23, 63, 24, 17};

        System.out.println(
                someNumbers[someNumbers.length-1]
        );
    }
}