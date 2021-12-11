public class UpCase {
    public static void main(String[] args) {
        char ch;

        for (int i=0; ; i++){
            ch = (char) ('a' + i);
            System.out.print(ch);

            //Сбрасывается шестой бит. После этого
            //в переменнной ch будет храниться код
            //символа прописной буквы
            ch = (char) ((int) ch & 65503);

            System.out.println(ch + " ");
        }
    }
}
