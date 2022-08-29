import java.util.*;

// Q.383
public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine)
    {
        //boolean result;
        Map<Character, Integer> rMap = new HashMap<>();
        Map<Character, Integer> mMap = new HashMap<>();

//        if (magazine.length() < ransomNote.length())
//        {
////            return false;
//        }
//        else
//        {
            calculateCharFrequency(ransomNote, rMap);
            calculateCharFrequency(magazine, mMap);
//        }


        System.out.println("Magazine : " + mMap);
        System.out.println("ransomNote : " + rMap);

        for ( Character c : rMap.keySet() )
        {
            if(!mMap.containsKey(c) || rMap.get(c) > mMap.get(c))
                return false;
        }
        return true;
    }

    private static void calculateCharFrequency(String str, Map<Character, Integer> fMap) {
        for (int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            int f = 1;
            if (!fMap.containsKey(c))
            {
                fMap.put(c,f);
            }
            else
            {
                int val = fMap.get(c);
                fMap.replace(c,++val);
            }
        }
    }
    /*

    public static boolean canConstruct(String ransomNote, String magazine)
    {
        boolean result;
        Set<Character> rChar = new HashSet<>();
        Set<Character> mChar = new HashSet<>();
        if (magazine.length() < ransomNote.length())
        {
            result = false;
        }
        else
        {
            for (int i = 0; i < magazine.length(); i++)
            {
                mChar.add(magazine.charAt(i));
            }
            for (int i = 0; i < ransomNote.length(); i++)
            {
                rChar.add(ransomNote.charAt(i));
            }

        }
        return result;
    }

*/
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("ransomNote : ");
        String rStr = sc.next();
        System.out.print("magazine : ");
        String mStr = sc.next();
        System.out.println(canConstruct(rStr,mStr));
    }
}