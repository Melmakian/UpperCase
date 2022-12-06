import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Locale;

public class December {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(out);
        System.setOut(stream);
        testString.printSomething();
        String result = out.toString().toUpperCase();
        System.setOut(consoleStream);
        StringBuilder stringBuilder = new StringBuilder(result);
        String s = stringBuilder.toString().toUpperCase();
        System.out.println(s);

    }

    public static class TestString{
        public void printSomething(){
            System.out.println("it's a text for testing");
        }
    }
}
