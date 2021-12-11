public class StrOps {
    public static void main(String[] args) {
        String str1 = "ban";
        String str2;
        String str3 = "ban2";
        int res, isx1, isx2, isx3, isx4;
        char ch;

        System.out.println("Длина str1: " + str1.length());

        //Отобразит строку посимволно
        for (int i=0; i<str1.length(); i++)
            System.out.print(str1.charAt(i) + "\n");

        System.out.println("str1 ~ str2");

        System.out.println("str1 !~ str3");

        res = str1.compareTo(str3);
        System.out.println("str1 < str3");

        //Присвоить новую строку переменной str2
        str2 = "Ban 35 k";

        isx1 = str2.indexOf("an");
        System.out.println("Индекс первого вхождения One: " + isx1);
        isx2 = str2.indexOf("35");
        System.out.println("Индекс последнего вхождения One: " + isx2);
        isx3 = str2.charAt(4);
        System.out.println(isx3);
        isx4 = str2.length();
        System.out.println(isx4);
    }
}
