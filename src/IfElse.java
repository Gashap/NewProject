public class IfElse {
    //static int result = 0;

    static boolean test(int testval, int begin, int end){
        return (begin >= testval && testval <= end);
    }

    public static void main(String[] args) {
        System.out.println(test(7,5, 10));
        System.out.println(test(5,6, 7));
        System.out.println(test(3,3, 2));
    }
}
