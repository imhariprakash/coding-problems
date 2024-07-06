package string;

public class UniqueCharInString
{
    public static void main()
    {
        hasUniqueChar();
    }

    public static void hasUniqueChar()
    {
        System.out.println("29s2 : " + (StringUtil.hasUniqueAsciiCharacters("29s2")));
        System.out.println("1903aio9p : " + (StringUtil.hasUniqueAsciiCharacters("1903aio9p")));
        System.out.println("29s13 : " + (StringUtil.hasUniqueAsciiCharacters("29s13")));
        System.out.println("2813450769 : " + (StringUtil.hasUniqueAsciiCharacters("2813450769")));
        System.out.println("\"\" :" + (StringUtil.hasUniqueAsciiCharacters("")));
        try
        {
            System.out.println("null" + (StringUtil.hasUniqueAsciiCharacters(null)));
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("null : " + e.getMessage());
        }
    }
}
