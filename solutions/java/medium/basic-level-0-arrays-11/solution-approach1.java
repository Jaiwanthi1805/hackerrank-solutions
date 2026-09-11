// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-arrays/challenges/basic-level-0-arrays-11/problem?isFullScreen=true
// Problem     Basic_Level_0_Arrays_11
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-11, 11:10 a.m.
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int zero = 0, one = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x == 0)
                zero++;
            else
                one++;
        }

        System.out.println("0:" + zero);
        System.out.println("1:" + one);
    }
}
