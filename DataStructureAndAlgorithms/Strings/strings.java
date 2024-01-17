package DataStructureAndAlgorithms.Strings;

public class strings {

    static String substring(String s){
        // base case
        if (s.isEmpty()) return "";
        // recursive work
        char smallAns = s.charAt(0);
        String ans = substring(s.substring(1));
        // self work

        return smallAns + ans;
    }

    public static void main(String[] args) {
        String str = "abc";
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = i + 1; j < str.length()+1; j++){
//                System.out.println(str.substring(i,j) + " ");
//            }
//        }
        System.out.println(substring(str));
    }
}
