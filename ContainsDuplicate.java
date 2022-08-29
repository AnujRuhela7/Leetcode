import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate
{
    // Q.217
    public static boolean containsDuplicate(int[] nums)
    {
        Set<Integer> num = new HashSet<>();
        for ( int val : nums)
        {
            num.add(val);
        }
        return nums.length > num.size();
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4};
        int[] a = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
        System.out.println(containsDuplicate(a));
    }
}
