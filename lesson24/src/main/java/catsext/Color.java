package catsext;

public enum Color {

    WHITE(1, "White cat"),
    BLACK(2, "Black cat"),
    RED(3, "Red cat");

    private int index;
    private String color;

    Color(int index, String color) {
        this.index = index;
        this.color = color;
    }

    public int getIndex() {
        return index;
    }

    public String getColor() {
        return color;
    }
}
