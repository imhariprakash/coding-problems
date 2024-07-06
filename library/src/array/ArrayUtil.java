package array;

import static error.ErrorMessages.INVALID_ARRAY_OR_INDICES;

public class ArrayUtil
{
    public static void swap(int[] inputArray, int sourceIndex, int destIndex)
    {
        if (inputArray == null || sourceIndex < 0 || sourceIndex >= inputArray.length || destIndex < 0 || destIndex >= inputArray.length)
        {
            throw new IllegalArgumentException(INVALID_ARRAY_OR_INDICES);
        }
        int temp = inputArray[sourceIndex];
        inputArray[sourceIndex] = inputArray[destIndex];
        inputArray[destIndex] = temp;
    }

    public static void swap(char[] inputArray, int sourceIndex, int destIndex)
    {
        if (inputArray == null || sourceIndex < 0 || sourceIndex >= inputArray.length || destIndex < 0 || destIndex >= inputArray.length)
        {
            throw new IllegalArgumentException(INVALID_ARRAY_OR_INDICES);
        }
        char temp = inputArray[sourceIndex];
        inputArray[sourceIndex] = inputArray[destIndex];
        inputArray[destIndex] = temp;
    }

    public static <T> void swap(T[] array, int sourceIndex, int destIndex)
    {
        if (array == null || sourceIndex < 0 || sourceIndex >= array.length || destIndex < 0 || destIndex >= array.length)
        {
            throw new IllegalArgumentException(INVALID_ARRAY_OR_INDICES);
        }
        T temp = array[sourceIndex];
        array[sourceIndex] = array[destIndex];
        array[destIndex] = temp;
    }

    public static <T> void printArray(T[] array)
    {
        printArray(array, 0, array.length - 1);
    }

    public static <T> void printArray(T[] array, int startIndex, int endIndex)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (i >= startIndex && i <= endIndex)
            {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}
