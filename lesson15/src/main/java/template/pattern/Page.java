package template.pattern;

public abstract class Page {

    final void display() {
        header();
        menu();
        body();
        footer(5);
    }

    boolean header() {
        System.out.println("Header");
        return true;
    }

    void footer(int i) {
        if (i < 0)
            return;

        System.out.println("Copyright...");
    }

    void menu() {
        System.out.println("Menu");
    }

    abstract void body();
}
