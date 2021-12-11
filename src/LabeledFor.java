public class LabeledFor {
    public static void main(String[] args) {
        outer:          //Другие команды недопустимы
        for (int i = 0; true;){  //Бесконечный цикл

            for (; i < 10; i++) {
                System.out.println("i = " + i);

                if (i == 2) {
                    System.out.println("continue");
                    continue;
                } //continue
                if (i == 3) {
                    System.out.println("break");
                    i++;
                    break;
                } //break
                if (i == 7) {
                    System.out.println("continue outer");
                    i++;
                    continue outer;
                } //continue outer
                if (i == 8) {
                    System.out.println("break outer");
                    break outer;
                } //break outer

                System.out.println("continue inner");
            }

        }

    }
}
