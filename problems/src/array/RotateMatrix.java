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

        int[] emptyArray = new int[0];
        ArrayUtil.printArrayInSingleLine(emptyArray);

        try
        {
            ArrayUtil.printArrayInSingleLine(null);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Array cannot be null");
        }

        Integer[] array = {null, null, null};
        ArrayUtil.printArrayInSingleLine(array);

        Integer[] oneDimArray = {1, null, 3, null, 5};
        ArrayUtil.printArrayInSingleLine(oneDimArray);

        Integer[][] twoDimArray = {{1, 2, null}, {null, 5, 6}, {7, 8, 9}};
        ArrayUtil.printArrayInSingleLine(twoDimArray);

        Integer[][][] threeDimArray = {{{1, 2, 3}, {null, 5, 6}, {7, null, 9}}, {{null, 2, 3}, {4, 5, null}, {7, 8, 9}}, {{1, null, 3}, {4, 5, 6}, {null, 8, 9}}};
        ArrayUtil.printArrayInSingleLine(threeDimArray);

        Integer[][][][] fourDimArray = {{{{1, null}, {3, 4}}, {{null, 6}, {7, 8}}}, {{{null, 2}, {3, null}}, {{5, 6}, {null, 8}}}, {{{1, 2}, {null, 4}}, {{5, null}, {7, 8}}}};
        ArrayUtil.printArrayInSingleLine(fourDimArray);
    }

    public static void printArray()
    {
        int[][][] matrix = {{{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}},{{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}},{{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}},{{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}},{{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}}};
        ArrayUtil.printArray(matrix);
        int[] array1D = {1, 2, 3, 4, 5};
        ArrayUtil.printArray(array1D);
        int[][] array2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        ArrayUtil.printArray(array2D);
        int[][][] array3D = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};
        ArrayUtil.printArray(array3D);
        int[][][][] array4D = {{{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}}, {{{9, 10}, {11, 12}}, {{13, 14}, {15, 16}}}};
        ArrayUtil.printArray(array4D);
        Object[] mixedArray = {new int[]{1, 2, 3}, new int[][]{{4, 5}, {6, 7}}, new int[][][]{{{8, 9}, {10, 11}}}};
        ArrayUtil.printArray(mixedArray);

        int number = 1;
        ArrayUtil.printArray(number);

        int[] emptyArray = new int[0];
        ArrayUtil.printArray(emptyArray);

        try
        {
            ArrayUtil.printArray(null);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Array cannot be null");
        }

        Integer[] array = {null, null, null};
        ArrayUtil.printArray(array);

        Integer[] oneDimArray = {1, null, 3, null, 5};
        ArrayUtil.printArray(oneDimArray);

        Integer[][] twoDimArray = {{1, 2, null}, {null, 5, 6}, {7, 8, 9}};
        ArrayUtil.printArray(twoDimArray);

        Integer[][][] threeDimArray = {{{1, 2, 3}, {null, 5, 6}, {7, null, 9}}, {{null, 2, 3}, {4, 5, null}, {7, 8, 9}}, {{1, null, 3}, {4, 5, 6}, {null, 8, 9}}};
        ArrayUtil.printArray(threeDimArray);

        Integer[][][][] fourDimArray = {{{{1, null}, {3, 4}}, {{null, 6}, {7, 8}}}, {{{null, 2}, {3, null}}, {{5, 6}, {null, 8}}}, {{{1, 2}, {null, 4}}, {{5, null}, {7, 8}}}};
        ArrayUtil.printArray(fourDimArray);
    }

    public static void printArrayT()
    {
        int[][][] matrix = {{{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}},{{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}},{{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}},{{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}},{{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}}};
        ArrayUtil.printArrayT(matrix);
    }
}
