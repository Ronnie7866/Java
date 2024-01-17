package DataStructureAndAlgorithms.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_03 {

    private static int longestSubstringWithoutRepeatingCharacter(String s) {
        if (s.isEmpty()) return 0;
        if (s.equals(" ")) return 1;
        if(s.length() == 1) return 1;

        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();

        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (map.containsKey(currentChar)) {
                // Move the left pointer to the right of the previous occurrence of the character
                left = Math.max(left, map.get(currentChar) + 1);
            }

            map.put(currentChar, right); // Update the index of the character

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
    public static void main(String[] args) {
        String s = "ababc";
        int ans = longestSubstringWithoutRepeatingCharacter(s);
        System.out.println(ans);
    }
}
