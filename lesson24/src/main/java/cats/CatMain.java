package cats;

public class CatMain {
    public static void main(String[] args) {

        Cat barsik = new Cat("Barsik", 5, Color.BLACK);
        Cat murzik = new Cat("Murzik", 7, Color.RED);

        switch (barsik.getColor()) {
            case BLACK:
                System.out.println(barsik.getName() + " is black");
                break;
            case WHITE:
                System.out.println(barsik.getName() + " is white");
                break;
            case RED:
                System.out.println(barsik.getName() + " is red");
                break;
        }

        if (murzik.getColor() == Color.RED) {
            System.out.println("Murzik is red");
        }

        Color color = murzik.getColor();
        String name = color.name();

        System.out.println(name);
    }
}
