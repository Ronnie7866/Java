package DataStructureAndAlgorithms.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
        public static List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String, List<String>> map = new HashMap<>();
            for (String s : strs) {
                char[] charArray = s.toCharArray();
                Arrays.sort(charArray);
                String key = String.valueOf(charArray);

                if (!map.containsKey(key)) {
                    map.put(key, new ArrayList<>());
                }
                    map.get(key).add(s);
            }
            return new ArrayList<>(map.values());
        }
        public static void main(String[] args) {
            String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};

            List<List<String>> ans = groupAnagrams(arr);
            System.out.println(ans);
        }
    }
