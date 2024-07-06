package string;

import array.ArrayUtil;

import static error.ErrorMessages.INPUT_STR_CANNOT_BE_NULL;

public class StringUtil
{
    public static String reverseStringUsingArray(String input)
    {
        if(input == null)
        {
            throw new IllegalArgumentException(INPUT_STR_CANNOT_BE_NULL);
        }
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++)
        {
            ArrayUtil.swap(charArray, i, charArray.length - 1 - i);
        }
        return new String(charArray);
    }

    public static String reverseOnlyOddIndicesInStringUsingArray(String input)
    {
        return StringUtil.reverseOddOrEvenIndicesInStringUsingArray(input, true);
    }

    public static String reverseOnlyEvenIndicesInStringUsingArray(String input)
    {
        return StringUtil.reverseOddOrEvenIndicesInStringUsingArray(input, false);
    }

    public static String reverseOddOrEvenIndicesInStringUsingArray(String input, boolean isOdd)
    {
        if(input == null)
        {
            throw new IllegalArgumentException(INPUT_STR_CANNOT_BE_NULL);
        }
        int remainder = 0; // Default even
        if(isOdd)
        {
            remainder = 1;
        }
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++)
        {
            if(i % 2 == remainder)
            {
                ArrayUtil.swap(charArray, i, charArray.length - 1 - i);
            }
        }
        return new String(charArray);
    }

    public static boolean hasUniqueAsciiCharacters(String input)
    {
        return hasUniqueAsciiCharacters(input, false);
    }

    public static boolean hasUniqueAsciiCharacters(String input, boolean isExtendedAscii)
    {
        if(input == null)
        {
            throw new IllegalArgumentException(INPUT_STR_CANNOT_BE_NULL);
        }
        boolean[] charSet;
        if(isExtendedAscii)
        {
            charSet = new boolean[256];
        }
        else
        {
            charSet = new boolean[128];
        }
        for (char c : input.toCharArray())
        {
            if(charSet[c])
            {
                return false;
            }
            charSet[c] = true;
        }
        return true;
    }
}
