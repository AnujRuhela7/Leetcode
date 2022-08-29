import java.util.Scanner;

public class LengthOfLastWord
{
    // Q.58
    public static int lengthOfLastWord(String s)
    {
        int len = 0;
        s = s.stripTrailing();
        int i = 0;
        if (s.length() == 1)
            return 1;
        else
            i = s.length()-1;
        while (i >= 0 && s.charAt(i) != ' ')
        {
            i--;
            len++;
        }
        return len;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(lengthOfLastWord(sc.nextLine()));
    }
}
