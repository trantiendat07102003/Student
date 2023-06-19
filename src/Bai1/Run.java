package Bai1;

import java.util.Scanner;
import java.util.Arrays;

public class Run extends Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap kich thuoc cua mang:");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("nhap gia tri cua target:");
        int target = scanner.nextInt();
        solution.twoSum(nums, target);
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }

}
