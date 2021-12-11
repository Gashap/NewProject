import java.util.stream.DoubleStream;

public class DoubleArray {
    public static void main(String[] args) {
        double[] dar1 = new double[12];
        double[] dar2 = {6.5, 3.7, 1.7, 5.8};

        int[] i = {1, 2, 3, 4, 5};

        double dar3 = dar2.length;
        double sum = DoubleStream.of(dar2).sum();
        System.out.println(sum/dar3);
    }
}
