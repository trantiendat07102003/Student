package Bai1;

import java.util.Scanner;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Scanner scanner = new Scanner(System.in);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            System.out.println("nhap phan tu thu " + (i + 1) + ":");
            nums[i] = scanner.nextInt();
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};

    }
}
