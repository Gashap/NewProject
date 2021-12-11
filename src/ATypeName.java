public class ATypeName
{

    int a;

    public static void main(String[] args)
    {

        int i = 3;
        Integer in;
        in = i+5;
        System.out.println(in);

        ATypeName atn = new ATypeName();

        atn.a = in/2;

        System.out.println(atn.a);

    }

}
