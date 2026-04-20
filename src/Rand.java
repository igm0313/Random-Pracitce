import java.util.Random;

public class Rand {
    public static void main(String[] args){
        Random r = new Random();
        int a = r.nextInt(101);
        System.out.println("Random is = "+ a);
        System.out.println("Math.random is = "+Math.random());
        char c = (char)('A' + r.nextInt('Z'-'A'));
        System.out.println(c);
    }
}
