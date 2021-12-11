public class ShortCircuit {

    static boolean t1(int value){
        System.out.println("t1 = " + value);
        System.out.println("Результат: " + (value < 1));
        return value < 1;
    }

    static boolean t2(int value){
        System.out.println("t2 = " + value);
        System.out.println("Результат: " + (value <= 2));
        return value <= 2;
    }

    static boolean t3(int value){
        System.out.println("t3 = " + value);
        System.out.println("Результат: " + (value < 3));
        return value < 3;
    }

    public static void main(String[] args) {
        boolean b = t1(0) && t2(2) && t3(2);
        System.out.println("Выражение " + b);
    }
}
