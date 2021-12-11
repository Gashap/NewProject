public class RoundingNumbers {
    public static void main(String[] args) {
        double above = 0.5, below = 0.2;
        float fabove = 0.4689f, fbelow = 0.2f;
        System.out.println("above = " + Math.round(above) + ", below = " + Math.round(below));
        System.out.println("fabove = " + Math.round(fabove) + ", fbelow = " + Math.round(fbelow));
    }
}
