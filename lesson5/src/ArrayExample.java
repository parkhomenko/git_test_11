import ua.org.hillel.courses.Utils;

public class ArrayExample {

    public static void main(String[] args) {
        int[] array = Utils.getArrayFromConsole();

        int sum = getSumOfArrayElements(array);

        System.out.println("Sum of elements of array is " + sum);
    }

    private static int getSumOfArrayElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
