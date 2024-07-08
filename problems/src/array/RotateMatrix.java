package array;

import java.util.Arrays;

public class RotateMatrix
{
    public static void run()
    {
        rotateMatrix();
    }

    public static void rotateMatrix()
    {
        int[][] matrix = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}};
        ArrayUtil.printArray(matrix);
    }
}
