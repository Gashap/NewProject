public class StringOper {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z ";
        System.out.println("1. " + s + x + y + z);
        System.out.println("2. " + x + " " + s);
        s += "(сумма) = ";
        System.out.println("3. " + s + (x + y + z));
        System.out.println("4. " + x);
    }
}
