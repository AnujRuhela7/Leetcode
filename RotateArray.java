import java.util.Scanner;

/*
Q. 189
Given an array, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
*/

public class RotateArray
{
    public static void rangeReverseArray(int []arr, int begin, int end)
    {
        for (int i = begin; i < end; i++)
        {
            int temp = arr[end];
            arr[end] = arr[i];
            arr[i] = temp;
            end--;
        }
    }

    public static void rotate(int[] arr, int k)
    {
        int n = arr.length;
        k = k % n;

        rangeReverseArray(arr, n-k,n-1);
        rangeReverseArray(arr, 0, n-k-1);
        rangeReverseArray(arr, 0, n-1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Array : ");
        int size = sc.nextInt();
        System.out.println("Array Elements : ");
        int []arr = new int[size];
        for (int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Point of Rotation (k) : ");
        int k = sc.nextInt();

        for (int val : arr)
        {
            System.out.println(val);
        }
    }
}
