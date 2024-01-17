package DataStructureAndAlgorithms.Backtracking;

import java.util.ArrayList;

public class NeverSitInMiddle {
    public static void function(String s, ArrayList<Character> al) {
        if (al.size() == s.length()) {
            boolean isValid = true;
            for (int i = 0; i < s.length() - 2; i++) {
                if (s.charAt(i) == 'A' && s.charAt(i + 2) == 'C' && s.charAt(i + 1) == 'B') {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                System.out.print(al + " ");
                return;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (al.contains(s.charAt(i))) {
                continue;
            }
            if (i > 0 && s.charAt(i) > s.charAt(i - 1) && (i == s.length() - 1 || s.charAt(i - 1) == 'B' || s.charAt(i) == 'A')) {
                continue;
            }

            if (i < s.length() - 1 && s.charAt(i) < s.charAt(i + 1) && (i == 0 || s.charAt(i - 1) == 'A' || s.charAt(i) == 'C')) {
                continue;
            }
            al.add(s.charAt(i));
            function(s, al);
            al.remove(al.size() - 1);
        }
    }
    public static void main(String[] args) {
        String s = "ABC";
        function(s, new ArrayList<>());
    }
}
