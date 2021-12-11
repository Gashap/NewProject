public class Fibonacci {
    int i = 0;

    public static void main(String[] args) {
        Fibonacci fibonacci1 = new Fibonacci();
        Fibonacci fibonacci2 = new Fibonacci();
        fibonacci1.i = 1;
        for (int k = 1; k <= 10; k++){
            //fibonacci1.i = fibonacci2.i;
            int a = fibonacci1.i + fibonacci2.i;
            //fibonacci1.i = fibonacci1.i + fibonacci2.i;
            fibonacci2.i = fibonacci1.i;
            System.out.println(fibonacci1.i);
        }
    }
}
