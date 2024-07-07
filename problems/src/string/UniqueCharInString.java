package string;

public class UniqueCharInString
{
    public static void run()
    {
        hasUniqueChar();
    }

    public static void hasUniqueChar()
    {
        System.out.println("29s2 : " + (StringUtil.hasUniqueAsciiCharactersUsingArray("29s2")));
        System.out.println("1903aio9p : " + (StringUtil.hasUniqueAsciiCharactersUsingArray("1903aio9p")));
        System.out.println("29s13 : " + (StringUtil.hasUniqueAsciiCharactersUsingArray("29s13")));
        System.out.println("2813450769 : " + (StringUtil.hasUniqueAsciiCharactersUsingArray("2813450769")));
        System.out.println("\"\" :" + (StringUtil.hasUniqueAsciiCharactersUsingArray("")));
        try
        {
            System.out.println("null" + (StringUtil.hasUniqueAsciiCharactersUsingArray(null)));
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("null : " + e.getMessage());
        }
    }
}
