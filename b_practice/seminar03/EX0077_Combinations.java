package b_practice.seminar03;
// https://leetcode.com/problems/combinations/

import java.util.ArrayList;
import java.util.List;

public class EX0077_Combinations {

    public static void main(String[] args) {
        System.out.println(combine(4, 2));
    }

    static List<List<Integer>> ans = new ArrayList<>();
    public static List<List<Integer>> combine(int n, int k) {
       genComb(n, k, 0, new ArrayList<>());
       return ans;
    }
    public static void genComb(int n, int k, int prevEl, List<Integer> curComb) {
        if (curComb.size() == k) {
            ans.add(new ArrayList<>(curComb));
        }

        for (int i = prevEl + 1; i <= n; i++) {
            curComb.add(i);
            genComb(n, k, i, curComb);
            curComb.remove(curComb.size() - 1);
        }
    }
}
