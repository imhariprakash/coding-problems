package string;


public class RemoveDuplicateCharacters
{
    public static void run()
    {
        removeDuplicatesAndSort();
    }

    public static void removeDuplicatesAndSort()
    {
        System.out.println(StringUtil.removeDuplicates("cbbdca", true).toString());
        System.out.println(StringUtil.removeDuplicates("33417121", true).toString());
        System.out.println(StringUtil.removeDuplicates("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111"));
        System.out.println(StringUtil.removeDuplicates("abcdefg", false).toString());
        System.out.println(StringUtil.removeDuplicates("", false).toString());
        try
        {
            System.out.println(StringUtil.removeDuplicates(null, false).toString());
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
