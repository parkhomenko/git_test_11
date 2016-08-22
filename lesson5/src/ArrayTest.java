public class ArrayTest {

    public static void main(String[] args) {

        /*
        int[][] array = new int[5][];
        array[0] = new int[3];
        array[1] = new int[5];
        array[2] = new int[2];

        System.out.println(array[0][2]);

        array[1][3] = 5;
        */

        int[][] array = new int[5][5];
        int element = 1;
        for (int i = 0; i < 5; i++) {
            //array[i] = new int[5];
            for (int j = 0; j < 5; j++) {
                array[i][j] = element++;
            }
        }
    }
}
