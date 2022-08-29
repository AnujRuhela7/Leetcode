import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters
{
    // Q.3
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<Character> charSet = new HashSet<>();
        int max = 0;

        for (int i = 0, j = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (!charSet.contains(c))
            {
                charSet.add(c);
            }
            else
            {
                max = Math.max(max,charSet.size());
                while (charSet.size() != 0 && charSet.contains(c))
                {
                    charSet.remove(s.charAt(j));
                    j++;
                }
                charSet.add(c);
            }
        }
        max = Math.max(charSet.size(), max);
        System.out.println(max);
    }
}