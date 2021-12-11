import java.util.Random;

public class ForEach {

    public static void main(String[] args) {
        Random random = new Random();
        int[] i = new int[10];
        for (int a = 0; a < 10; a++) i[a] = random.nextInt(20);
        for (int x : i) System.out.println(x);
    }

}
