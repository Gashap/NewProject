class Assignment{
    //int hd;
    //char c;
}

public class HalloDate {
    //static void f(Assignment a){
    //    a.c = 'e';
    //}
    int hd;
    public static void main(String[] args) {

        HalloDate ass1 = new HalloDate();
        HalloDate ass2 = new HalloDate();
//1
        ass1.hd = 8;
        ass2.hd = 15;
        System.out.println("1. ass1.hd = " + ass1.hd + ", ass2.hd = " + ass2.hd);
//2
        ass1.hd = ass2.hd; //ass1.hd = ass2.hd = 15
        System.out.println("2. ass1.hd = " + ass1.hd + ", ass2.hd = " + ass2.hd);
//3
        ass2.hd = 3; //ass1.hd остаётся 15, ass2.hd = 3
        System.out.println("3. ass1.hd = " + ass1.hd + ", ass2.hd = " + ass2.hd);
//4
        ass1 = ass2; //совмещение имён, экземпляры имеют одиноковую ссылку
        System.out.println("4. ass1.hd = " + ass1.hd + ", ass2.hd = " + ass2.hd);
//5
        ass2.hd = 6;
        System.out.println("5. ass1.hd = " + ass1.hd + ", ass2.hd = " + ass2.hd);
//6
        ass1.hd = 12;
        System.out.println("6. ass1.hd = " + ass1.hd + ", ass2.hd = " + ass2.hd);


        //Assignment ass3 = new Assignment();
        //ass3.c = 'b';

        //System.out.println("1. ass3.c = " + ass3.c);
        //f(ass3);
        //System.out.println("2. ass3.c = " + ass3.c);
    }
}
