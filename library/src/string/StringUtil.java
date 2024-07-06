package string;

import array.ArrayUtil;

import java.util.Arrays;

import static array.ArrayUtil.printArray;
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

    public static boolean isPalindrome(String input)
    {
        if(input == null)
        {
            throw new IllegalArgumentException(INPUT_STR_CANNOT_BE_NULL);
        }
        for(int i = 0; i < input.length(); i++)
        {
            if(input.charAt(i) != input.charAt(input.length() - 1 - i))
            {
                return false;
            }
        }
        return true;
    }

    public static int isTheSameVersion(String version1, String version2)
    {
        //10.2.1 : major, minor, patch (bugfix, patch : increase patch version number
        /*
        1 : if version1 > version2
        0 : if version1 == version2
        -1 : if version1 < version2
        */

        if(version1 == null || version2 == null)
        {
            throw new IllegalArgumentException(INPUT_STR_CANNOT_BE_NULL);
        }
        int[] version1Parts = Arrays.stream(version1.split("\\."))
                .map(String::trim)
                .mapToInt(Integer::parseInt).toArray();
        int[] version2Parts = Arrays.stream(version2.split("\\."))
                .map(String::trim)
                .mapToInt(Integer::parseInt).toArray();
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
}
