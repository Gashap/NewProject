public class ListInt3 {
    public static void main(String[] args) {
        //if(args.length != 0) max = Integer.parseInt(args[0]);
        for(int i = 1; i <= 10; i++) {
            boolean prime = true;
            int j;
            for(j = 2; j < i; j++)
            if(i % j == 0) prime = false;
            if(prime) System.out.println (i);
        }
    }
}
