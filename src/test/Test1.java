package test;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import java.util.Scanner;

public class Test1 {
    
    static int[] maxLength;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for (int i=0; i<n; i++) {
            nums[i] = scan.nextInt();
        }
        maxLength = new int[n];
        
    }
    
    public static int maxLength(int exPos, int[] nums) {
        if (nums.length==0) return 0;
        int l = 1;
        int maxl = 0;
        int premin = 0;
        for (int i=1; i<nums.length; i++) {
            if (nums[i]>nums[i-1]) {
                l++;
            }
            else {
                for (int j=premin; j<i; j++) {
                    maxLength[j] = l;
                }
                l=1;
            }
            maxl = Math.max(l, maxl);
        }
        return l;
    }
}
