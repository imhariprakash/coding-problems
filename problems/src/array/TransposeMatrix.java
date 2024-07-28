package array;

public class TransposeMatrix
{
    public static void run()
    {
        transposeSquareMatrix();
    }

    public static void transposeSquareMatrix()
    {
        int[][] array1 = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        ArrayUtil.transposeSquareMatrix(array1);
        int[][] array2 = new int[][] {{1, 2}, {3, 4}};
        ArrayUtil.transposeSquareMatrix(array2);
        int[][] array3 = new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        ArrayUtil.transposeSquareMatrix(array3);

        System.out.println("Transpose of array1:");
        ArrayUtil.printArrayInSingleLine(array1);

        System.out.println("Transpose of array2:");
        ArrayUtil.printArrayInSingleLine(array2);

        System.out.println("Transpose of array3:");
        ArrayUtil.printArrayInSingleLine(array3);
    }

    public static void transposeGenericSquareMatrix()
    {
        Long[][] array1 = new Long[][] {{1L, 2L, 3L}, {4L, 5L, 6L}, {7L, 8L, 9L}};
        ArrayUtil.transposeSquareMatrix(array1);
        Long[][] array2 = new Long[][] {{1L, 2L}, {3L, 4L}};
        ArrayUtil.transposeSquareMatrix(array2);
        Long[][] array3 = new Long[][] {{1L, 2L, 3L, 4L}, {5L, 6L, 7L, 8L}, {9L, 10L, 11L, 12L}, {13L, 14L, 15L, 16L}};
        ArrayUtil.transposeSquareMatrix(array3);

        long[][] array4 = new long[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // Should use

        System.out.println("Transpose of array1:");
        ArrayUtil.printArrayInSingleLine(array1);

        System.out.println("Transpose of array2:");
        ArrayUtil.printArrayInSingleLine(array2);

        System.out.println("Transpose of array3:");
        ArrayUtil.printArrayInSingleLine(array3);
    }
}
