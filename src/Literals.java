public class Literals {
    public static void main(String[] args) {
        int i = 0x1f;
        System.out.println("i = " + Long.toBinaryString(i));

        int a = 0x2f;
        System.out.println("a = " + Long.toBinaryString(a));

        //boolean b = i && a;
        System.out.println(i != a);
    }
}
