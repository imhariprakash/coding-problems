package array;

import java.lang.reflect.Array;
import java.util.*;

import static error.ErrorMessages.INVALID_ARRAY;
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

    public static void reverseArray(char[] charArray)
    {
        for (int i = 0; i < charArray.length / 2; i++)
        {
            ArrayUtil.swap(charArray, i, charArray.length - 1 - i);
        }
    }

    public static void reverseOddOrEvenIndices(char[] charArray, boolean isOdd)
    {
        int remainder = 0; // Default even
        if(isOdd)
        {
            remainder = 1;
        }
        for (int i = 0; i < charArray.length / 2; i++)
        {
            if(i % 2 == remainder)
            {
                ArrayUtil.swap(charArray, i, charArray.length - 1 - i);
            }
        }
    }

    public static boolean hasUniqueAsciiCharacters(char[] charArray, boolean isExtendedAscii)
    {
        boolean[] charSet;
        if(isExtendedAscii)
        {
            charSet = new boolean[256];
        }
        else
        {
            charSet = new boolean[128];
        }

        for (char c : charArray)
        {
            if(charSet[c])
            {
                return false;
            }
            charSet[c] = true;
        }
        return true;
    }

    public static int isTheSameVersion(int[] version1Parts, int[] version2Parts)
    {
        int idx = 0;
        while(idx < version1Parts.length || idx < version2Parts.length)
        {
            if(idx < version1Parts.length && idx < version2Parts.length)
            {
                if(version1Parts[idx] > version2Parts[idx])
                {
                    return 1;
                }
                else if(version1Parts[idx] < version2Parts[idx])
                {
                    return -1;
                }
            }
            else if(idx < version1Parts.length)
            {
                if(version1Parts[idx] != 0)
                {
                    return 1;
                }
            }
            else
            {
                if(version2Parts[idx]!= 0)
                {
                    return -1;
                }
            }
            idx++;
        }
        return 0;
    }

    public static ArrayList getUniqueCharacters(char[] charArray, boolean isOrderRequired, boolean isSortingRequired)
    {
        Set<Character> uniqueCharacterSet;
        if(isOrderRequired)
        {
            uniqueCharacterSet = new LinkedHashSet<>();
        }
        else
        {
            uniqueCharacterSet = new HashSet<>();
        }

        for (char c : charArray)
        {
            uniqueCharacterSet.add(c);
        }

        ArrayList<Character> uniqueCharacterArray = new ArrayList<>(uniqueCharacterSet);
        if(isSortingRequired)
        {
            Collections.sort(uniqueCharacterArray);
        }
        return uniqueCharacterArray;
    }

    public static void printArrayInSingleLine(Object array)
    {
        if(array == null)
        {
            throw new IllegalArgumentException(INVALID_ARRAY);
        }
        printArrayInSingleLine(array, false, false);
        System.out.println();
    }

    private static void printArrayInSingleLine(Object array, boolean isLastElement, boolean hasNextSubArray)
    {
        if(array.getClass().isArray())
        {
            System.out.print("[");
            for (int i = 0; i < Array.getLength(array); i++)
            {
                Object subArray = Array.get(array, i);
                isLastElement = (i == Array.getLength(array) - 1);
                printArrayInSingleLine(subArray, isLastElement, (i < Array.getLength(array) - 1));
            }
            System.out.print("]");
            if(hasNextSubArray)
            {
                System.out.print(", ");
            }
        }
        else
        {
            System.out.print(array);
            if(!isLastElement)
            {
                System.out.print(", ");
            }
        }
    }

    public static void printArray(Object array)
    {
        printArray(array, 0);
    }

    public static void printArray(Object array, int level)
    {
        if(array.getClass().isArray())
        {
            System.out.print("[");
            for (int i = 0; i < Array.getLength(array); i++)
            {
                Object subArray = Array.get(array, i);
                isLastElement = (i == Array.getLength(array) - 1);
                printArrayInSingleLine(subArray, isLastElement, (i < Array.getLength(array) - 1));
            }
            System.out.print("]");
            if(hasNextElement)
            {
                System.out.print(", ");
            }
        }
        else
        {
            System.out.print(array);
            if(!isLastElement)
            {
                System.out.print(", ");
            }
        }
    }

    public static void printIndentation(int level)
    {
        printIndentation(level, 4); // Default Indentation
    }

    public static void printIndentation(int level, int spaceCount)
    {
        String indentation = " ".repeat(spaceCount);
        for(int i = 0; i < level; i++)
        {
            System.out.print(indentation);
        }
    }
}
