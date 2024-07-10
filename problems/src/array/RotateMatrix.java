package array;

import java.util.Arrays;

public class RotateMatrix
{
    public static void run()
    {
        printArrayInSingleLine();
    }

    public static void rotateMatrix()
    {

    }

    public static void printArrayInSingleLine()
    {
        int[][][] matrix = {{{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}},{{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}},{{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}},{{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}},{{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}}};
        ArrayUtil.printArrayInSingleLine(matrix);

        int[] array1D = {1, 2, 3, 4, 5};
        ArrayUtil.printArrayInSingleLine(array1D);

        int[][] array2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        ArrayUtil.printArrayInSingleLine(array2D);

        int[][][] array3D = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};
        ArrayUtil.printArrayInSingleLine(array3D);

        int[][][][] array4D = {{{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}}, {{{9, 10}, {11, 12}}, {{13, 14}, {15, 16}}}};
        ArrayUtil.printArrayInSingleLine(array4D);

        Object[] mixedArray = {new int[]{1, 2, 3}, new int[][]{{4, 5}, {6, 7}}, new int[][][]{{{8, 9}, {10, 11}}}};
        ArrayUtil.printArrayInSingleLine(mixedArray);

        int number = 1;
        ArrayUtil.printArrayInSingleLine(number);

        int[] emptyArray = new int[0];        ArrayUtil.printArrayInSingleLine(emptyArray);

        try
        {
            ArrayUtil.printArrayInSingleLine(null);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Array cannot be null");
        }
    }

    public static void printArray()
    {
        int[][][] matrix = {{{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}},{{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}},{{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}},{{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}},{{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}}};
        ArrayUtil.printArray(matrix);
        /*int[] array1D = {1, 2, 3, 4, 5};
        ArrayUtil.printArray(array1D);
        int[][] array2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        ArrayUtil.printArray(array2D);
        int[][][] array3D = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};
        ArrayUtil.printArray(array3D);
        int[][][][] array4D = {{{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}}, {{{9, 10}, {11, 12}}, {{13, 14}, {15, 16}}}};
        ArrayUtil.printArray(array4D);
        Object[] mixedArray = {new int[]{1, 2, 3}, new int[][]{{4, 5}, {6, 7}}, new int[][][]{{{8, 9}, {10, 11}}}};
        ArrayUtil.printArray(mixedArray);*/
    }
}
