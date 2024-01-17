package DataStructureAndAlgorithms.RecursionOnStrings;

public class combinations {

    static void combi(String str, String currAns, String[] keyPad){
        if (str.isEmpty()){
            System.out.print(currAns + " ");
            return;
        }
        int currNum = str.charAt(0) - '0';
        String currChoice = keyPad[currNum];

        for (int i = 0; i < currChoice.length(); i++){
            combi(str.substring(1),currAns + currChoice.charAt(i),keyPad);
        }
        return;
    }

    public static void main(String[] args) {
        String str = "235";
        String[] keyPad = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        //                  0  1   2     3     4     5     6      7     8      9
        combi(str,"",keyPad);
    }
}
