public class JaggedArray {
    public static void main(String[] args) {

        int[][] arr = new int[3][];

        arr[0] = new int[2]; // row 0 has 2 columns
        arr[1] = new int[4]; // row 1 has 4 columns
        arr[2] = new int[1]; // row 2 has 1 column

        // Assign values
        arr[0][0] = 1; arr[0][1] = 2;
        arr[1][0] = 3; arr[1][1] = 4; arr[1][2] = 5; arr[1][3] = 6;
        arr[2][0] = 7;

        // Traversing jagged array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
