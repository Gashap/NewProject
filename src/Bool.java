import java.util.Random;

public class Bool {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(2); //диапазон 2 значения: 0 и 1
        int b = 1;
        System.out.println(a==b);
        System.out.println(a);
        System.out.println(b);
    }
}
