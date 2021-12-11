public class Encode {
    public static void main(String[] args) {
        String msg = "Ананастасия";
        StringBuilder encmsg = new StringBuilder();
        String decmsg = "";
        int key = 135;

        System.out.print("Original message: ");
        System.out.println(msg);

        //Encode message
        for (int i = 0; i < msg.length(); i++)
            encmsg.append((char) (msg.charAt(i) ^ key));

        System.out.print("Encoded message: ");
        System.out.println(encmsg);

        //Decode massage
        for (int i = 0; i < msg.length(); i++)
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);

        System.out.print("Decoded message: ");
        System.out.println(decmsg);

        //y = x<0 10 : 20;

    }
}
