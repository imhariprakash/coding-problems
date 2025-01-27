package string;

import static string.StringUtil.isTheSameVersion;

public class SoftwareVersionComparison
{
    public static void run()
    {
        compareVersions();
    }

    public static void compareVersions()
    {
        System.out.println("0: Both are same 1: First version is greater. -1: Second version is greater");
        System.out.println(isTheSameVersion("1.0", "1.0.0"));
        System.out.println(isTheSameVersion("15", "15.0"));
        System.out.println(isTheSameVersion("10.1", "10.1.0"));
        System.out.println(isTheSameVersion("10.1", "10.1.1"));
        System.out.println(isTheSameVersion("10.1.2", "10.1.1"));
    }
}
