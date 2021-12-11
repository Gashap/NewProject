public class MiniMax {
    public static void main(String[] args) {
        int[] numbs = new int[10];
        int min, max;

        numbs [0] = -16;
        numbs [1] = 20;
        numbs [2] = -5;
        numbs [3] = 13;
        numbs [4] = 8;
        numbs [5] = 4;
        min = max = numbs[0];

        for (int i : numbs){
            if (i < min) min = i;
            if (i > max) max = i;
        }

        System.out.println("min " + min + "; max " + max);
    }
}
