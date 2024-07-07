package string;

public class StringReverse
{
    public static void run()
    {
        reverseOnlyEvenIndicesInString();
    }

    public static void reverseString()
    {
        String input = "2312cba";
        String reversed = StringUtil.reverseStringUsingArray(input);
        System.out.println("Reversed String: " + reversed);

        input = "ba";
        reversed = StringUtil.reverseStringUsingArray(input);
        System.out.println("Reversed String: " + reversed);

        try
        {
            input = null;
            reversed = StringUtil.reverseStringUsingArray(input);
            System.out.println("Reversed String: " + reversed);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        input = "c a1";
        reversed = StringUtil.reverseStringUsingArray(input);
        System.out.println("Reversed String: " + reversed);

        try
        {
            input = "";
            reversed = StringUtil.reverseStringUsingArray(input);
            System.out.println("Reversed String: " + reversed);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        input = "ub32tca192";
        reversed = StringUtil.reverseStringUsingArray(input);
        System.out.println("Reversed String: " + reversed);
    }

    public static void reverseOnlyOddIndicesInString()
    {
        String input = "ub32tca192";
        String reversedOddIndices = StringUtil.reverseOnlyOddIndicesInStringUsingArray(input);
        System.out.println("Reversed Odd Indices String: " + reversedOddIndices);

        input = "1234567890";
        reversedOddIndices = StringUtil.reverseOnlyOddIndicesInStringUsingArray(input);
        System.out.println("Reversed Odd Indices String: " + reversedOddIndices);

        input = "abcdef";
        reversedOddIndices = StringUtil.reverseOnlyOddIndicesInStringUsingArray(input);
        System.out.println("Reversed Odd Indices String: " + reversedOddIndices);

        input = "12345";
        reversedOddIndices = StringUtil.reverseOnlyOddIndicesInStringUsingArray(input);
        System.out.println("Reversed Odd Indices String: " + reversedOddIndices);

        try
        {
            input = "";
            reversedOddIndices = StringUtil.reverseOnlyOddIndicesInStringUsingArray(input);
            System.out.println("Reversed Odd Indices String: " + reversedOddIndices);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            input = null;
            reversedOddIndices = StringUtil.reverseOnlyOddIndicesInStringUsingArray(input);
            System.out.println("Reversed Odd Indices String: " + reversedOddIndices);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void reverseOnlyEvenIndicesInString()
    {
        String input = "ub32tca192";
        String reversedEvenIndices = StringUtil.reverseOnlyEvenIndicesInStringUsingArray(input);
        System.out.println("Reversed Even Indices String: " + reversedEvenIndices);

        input = "1234567890";
        reversedEvenIndices = StringUtil.reverseOnlyEvenIndicesInStringUsingArray(input);
        System.out.println("Reversed Even Indices String: " + reversedEvenIndices);

        input = "abcdef";
        reversedEvenIndices = StringUtil.reverseOnlyEvenIndicesInStringUsingArray(input);
        System.out.println("Reversed Even Indices String: " + reversedEvenIndices);

        input = "12345";
        reversedEvenIndices = StringUtil.reverseOnlyEvenIndicesInStringUsingArray(input);
        System.out.println("Reversed Even Indices String: " + reversedEvenIndices);

        input = "";
        reversedEvenIndices = StringUtil.reverseOnlyEvenIndicesInStringUsingArray(input);
        System.out.println("Reversed Even Indices String: " + reversedEvenIndices);

        try
        {
            input = null;
            reversedEvenIndices = StringUtil.reverseOnlyEvenIndicesInStringUsingArray(input);
            System.out.println("Reversed Even Indices String: " + reversedEvenIndices);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
