// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-arrays/challenges/basic-level-0-arrays-18/problem?isFullScreen=true
// Problem     Basic_Level_0_Arrays_18
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-20, 01:53 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

public class Main {

    static int search(int[] arr, int target) {
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == target) {
                return n - 1 - i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        System.out.println(search(arr, target));
    }
}
