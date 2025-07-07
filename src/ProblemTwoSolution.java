import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProblemTwoSolution {

    public static void main(String[] args) {
        List<String> list1 = List.of("a","b","c");
        List<Integer> list2 = List.of(1,2,3,4,5,6,7);

        int listOneLength = list1.size();
        int listTwoLength = list2.size();


        if (listOneLength == listTwoLength) {
            List<Object> combinedList = findCombinedList(listOneLength, list1, list2);
            System.out.println(combinedList);
        }

        if (listOneLength < listTwoLength) {
            List<Object> combinedList = findCombinedList(list1, list2, listOneLength, listTwoLength);
            System.out.println(combinedList);
        }
    }

    // this is for equal size list
    private static  List<Object> findCombinedList(int listOneLength, List<String> list1, List<Integer> list2) {
        List<Object> combinedList = new ArrayList<>();
        for (int i = 0; i < listOneLength; i++) {
            combinedList.add(list1.get(i));
            combinedList.add(list2.get(i));
        }
        return combinedList;
    }

    // this is for unequal list sizes
    // as list1.size() < list2.size() this is also can be used for list1.size() > list2.size()
    private static List<Object> findCombinedList(List<String> list1, List<Integer> list2, int listOneLength, int listTwoLength) {
        List<Object> combinedList = new ArrayList<>();
        for (int i = 0; i < listOneLength; i++) {
            combinedList.add(list1.get(i));
            combinedList.add(list2.get(i));
        }
        for (int i = listOneLength ; i < listTwoLength; i++) {
            combinedList.add(list2.get(i));
        }
        return combinedList;
    }

}
