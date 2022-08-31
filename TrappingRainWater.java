import java.util.Scanner;

public class TrappingRainWater
{
    // Q.42 Trapping Rain Water
    public static int trap(int[] height)
    {
        int[] lMax = new int[height.length];
        int[] rMax = new int[height.length];
        int volume = 0;

        lMax[0] = height[0];
        for(int i = 1; i < height.length; i++)
        {
            lMax[i] = Math.max(lMax[i-1], height[i]);
        }

        rMax[height.length-1] = height[height.length-1];

        for(int i = height.length - 2; i >= 0; i--)
        {
            rMax[i] = Math.max(rMax[i+1],height[i]);
        }

        for(int i = 0; i < height.length; i++)
        {
            volume = volume + (Math.min(lMax[i],rMax[i]) - height[i]);
        }
        return volume;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size : ");
        int size = sc.nextInt();
        int[] height = new int[size];
        System.out.println("Array Elements : ");
        for (int i = 0; i < size; i++)
        {
            height[i] = sc.nextInt();
        }
        System.out.println("Volume of water stored : " + trap(height));
    }
}

/*
Given n non-negative integers representing an elevation map where the width of each bar is 1,
 compute how much water it can trap after raining.

Example 1:

Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1].
In this case, 6 units of rain water (blue section) are being trapped.

Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9

Constraints:

n == height.length
1 <= n <= 2 * 10^4
0 <= height[i] <= 10^5
*/