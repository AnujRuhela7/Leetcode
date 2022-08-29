import java.util.Scanner;

public class RunningSumOfArray
{
    // Q.1480

    public static int[] runningSum(int[] nums)
    {
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        int[] a = runningSum(arr);
        for ( int val : a)
        {
            System.out.println(val);
        }
    }
}
