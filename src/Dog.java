public class Dog {

    String name, says;

    public static void main(String[] args) {
        Dog spot = new Dog();
        Dog scruffy = new Dog();

        spot.name = "Spot";
        scruffy.says = "Scruffy";

        System.out.println(spot.name);
        System.out.println(scruffy.says);
    }
}
