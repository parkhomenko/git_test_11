package cats;

public class Traverse {
    public static void main(String[] args) {

        for (Color color : Color.values()) {
            System.out.println(color.name() + " " + color.ordinal());
        }
    }
}
