import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray
{
    // Q.88
    public static void merge(int[] nums1, int m, int[] nums2, int n)
    {
        /*   Time Complexity : O((m+n)*log(m+n))   */
        for(int i = m, j = 0; i < nums1.length; i++,j++)
        {
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
        System.out.print("Merge Sorted Array : ");
        for (int val : nums1)
        {
            System.out.print(val + "\t");
        }
    }

    // O(m+n)
    /*
    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
        int i = m - 1, j = n - 1, x = m + n - 1;

        while(i >= 0 && j >= 0) {
            if(nums1[i] >= nums2[j]) nums1[x--] = nums1[i--];
            else nums1[x--] = nums2[j--];
        }

        while(i >= 0) {
            nums1[x--] = nums1[i--];
        }
        while(j >= 0) {
            nums1[x--] = nums2[j--];
        }
    }
     */

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of 1st Array : ");
        int size1 = sc.nextInt();
        System.out.println("Elements of 1st Array : ");
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++)
        {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Size of 2nd Array : ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Elements of 1st Array : ");
        for (int i = 0; i < size2; i++)
        {
            arr2[i] = sc.nextInt();
        }
        merge(arr1,size1-size2,arr2,size2);
    }
}
