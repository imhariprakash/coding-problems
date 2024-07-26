package string;

public class Palindrome
{
    public static void run()
    {
        checkPalindromeUsingTwoPointers();
    }

    public static void checkPalindrome()
    {
        System.out.println("2f1f2 : " + StringUtil.isPalindrome("2f1f2"));
        System.out.println("-101- : " + StringUtil.isPalindrome("-101-"));
        System.out.println("9 : " + StringUtil.isPalindrome("9"));
        System.out.println("99 : " + StringUtil.isPalindrome("99"));
        System.out.println("madam : " + StringUtil.isPalindrome("madam"));
        System.out.println("2f1 : " + StringUtil.isPalindrome("2f1"));
        System.out.println("-101 : " + StringUtil.isPalindrome("-101"));
        System.out.println("\"\" : " + StringUtil.isPalindrome(""));
        try
        {
            System.out.println("null : " + StringUtil.isPalindrome(null));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("null : " + e.getMessage());
        }
    }

    public static void checkPalindromeUsingTwoPointers()
    {
        System.out.println("2f1f2 : " + StringUtil.isPalindromeUsingTwoPointers("2f1f2"));
        System.out.println("-101- : " + StringUtil.isPalindromeUsingTwoPointers("-101-"));
        System.out.println("9 : " + StringUtil.isPalindromeUsingTwoPointers("9"));
        System.out.println("99 : " + StringUtil.isPalindromeUsingTwoPointers("99"));
        System.out.println("madam : " + StringUtil.isPalindromeUsingTwoPointers("madam"));
        System.out.println("2f1 : " + StringUtil.isPalindromeUsingTwoPointers("2f1"));
        System.out.println("-101 : " + StringUtil.isPalindromeUsingTwoPointers("-101"));
        System.out.println("\"\" : " + StringUtil.isPalindromeUsingTwoPointers(""));
        try
        {
            System.out.println("null : " + StringUtil.isPalindromeUsingTwoPointers(null));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("null : " + e.getMessage());
        }
    }
}
