/**LEETCODE AUGUST CHALLENGE (1st WEEK) */
//Using Just 1 loop
public class CapChallenge {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int u = 0;
        int a1 = (int) word.charAt(0);

        for (int i = 0; i < n; i++) {
            int z = (int) word.charAt(i);
            if (z >= 65 && z <= 90) {
                ++u;
            }
        }
        if (u == n || u == 0 || u == 1 && a1 >= 65 && a1 <= 90) {
            return true;
        }
        return false;
    }
}
