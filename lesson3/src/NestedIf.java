public class NestedIf {

    public static void main(String[] args) {

        int rooms = 5;
        int people = 10;

        if (rooms > 0) {
            if (people > 0) {
                System.out.println(people / rooms);
            } else {
                System.out.println("no rooms at all");
            }
        }
    }
}
