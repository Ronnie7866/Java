package DataStructureAndAlgorithms.HashMap;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> mp = new HashMap<>();
        mp.put("Amir", 21);
        mp.put("Adil", 19);
        mp.put("Aisha", 17);
        mp.put("Mustafa", 15);
        mp.put("Taib", 10);
        System.out.println(mp.get("Mustafa"));
        for (var i : mp.keySet()){
            System.out.printf("Age of %s is %d \n", i,mp.get(i));
        }
    }
}
