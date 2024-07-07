package string;

import array.ArrayUtil;

import java.util.Arrays;

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
        ArrayUtil.reverseArray(charArray);
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
        char[] charArray = input.toCharArray();
        ArrayUtil.reverseOddOrEvenIndices(charArray, isOdd);
        return new String(charArray);
    }

    public static boolean hasUniqueAsciiCharactersUsingArray(String input)
    {
        return hasUniqueAsciiCharactersUsingArray(input, false);
    }

    public static boolean hasUniqueAsciiCharactersUsingArray(String input, boolean isExtendedAscii) throws IllegalArgumentException
    {
        if(input == null)
        {
            throw new IllegalArgumentException(INPUT_STR_CANNOT_BE_NULL);
        }

        return ArrayUtil.hasUniqueAsciiCharacters(input.toCharArray(), isExtendedAscii);
    }

    public static boolean isPalindrome(String input) throws IllegalArgumentException
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

        return ArrayUtil.isTheSameVersion(version1Parts, version2Parts);
    }

    public static String getUniqueCharacters(String input, boolean isOrderRequired, boolean isSortingRequired)
    {
        if(input == null)
        {
            throw new IllegalArgumentException(INPUT_STR_CANNOT_BE_NULL);
        }
        char[] charArray = input.toCharArray();
        return ArrayUtil.getUniqueCharacters(charArray, isOrderRequired, isSortingRequired).toString();
    }

    public static String removeDuplicates(String input)
    {
        return getUniqueCharacters(input, false, false);
    }

    public static String removeDuplicates(String input, boolean isOrderRequired)
    {
        return getUniqueCharacters(input, isOrderRequired, false);
    }

    public static String removeDuplicatesAndSort(String input, boolean isOrderRequired, boolean isSortingRequired)
    {
        return getUniqueCharacters(input, isOrderRequired, isSortingRequired);
    }
}
