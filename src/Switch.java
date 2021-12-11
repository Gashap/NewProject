import java.util.Random;

public class Switch {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++){
            int c = random.nextInt(26) + 'a';
            if (c < 100) System.out.print((char)c + ",\t " + c + ":\t");
            else System.out.print((char)c + ",\t" + c + ":\t");
            switch (c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("гласная");
                    break;
                case 'y':
                case 'w':
                    System.out.println("условно гласная");
                    break;
                default:
                    System.out.println("согласная");
            }
        }
    }
}
