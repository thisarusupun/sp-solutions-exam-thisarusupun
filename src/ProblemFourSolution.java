import java.util.*;

public class ProblemFourSolution {
    public static void main(String[] args) {
        int[] numList = { 50, 2, 1, 9 };
        String numChar = "";
        List<Map<String, ArrayList<String>>> numListMap = new ArrayList<>();
        Map<String, ArrayList<String>> map = new HashMap<>();
        for (int i : numList) {
            numChar = "" + i;
            String numInString = "";
            ArrayList<String> arraylist = new ArrayList<String>();
            for (int j : numList) {
                numInString = "" + j;
                if (numChar.charAt(0) == numInString.charAt(0)) {
                    arraylist.add(numInString);
                    Collections.sort(arraylist);
                    map.put("" + numChar.charAt(0), arraylist);
                }
            }
        }
        numListMap.add(map);
        String numInString = "";
        for (String key : map.keySet()) {
            numInString = map.get(key) + numInString;

        }
        numInString = numInString.replaceAll("\\D+", "");
        System.out.println(numInString);
    }

}
