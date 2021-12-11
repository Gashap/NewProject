import java.util.Random;

public class ListInt2 {
    int a = 0;

    public static void main(String[] args) {
        ListInt2 li1 = new ListInt2();
        ListInt2 li2 = new ListInt2();
        int i = 1;
        while (i == i++){
            Random random = new Random();
            li1.a = random.nextInt(50);

            if (li1.a < li2.a){
                System.out.println(li1.a + " < " + li2.a);
                li2.a = li1.a;
            }

            else if (li1.a > li2.a){
                System.out.println(li1.a + " > " + li2.a);
                li2.a = li1.a;
            }

            else if (li1.a == li2.a){
                System.out.println(li1.a + " = " + li2.a);
            }
        }
    }
}
