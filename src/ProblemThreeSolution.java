import java.util.HashMap;

public class ProblemThreeSolution {

    // this hashmap is used for memoization purpose to avoid any recalculations
    // Long data type is used as answer 3736710778780434371 is above the integer range

    private static final HashMap<Long, Long> calculatedValues = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(fibonacci(100L));
    }

    private static Long fibonacci(Long num){
        if (num < 2){
            return num;
        }
        if (calculatedValues.containsKey(num)){
            return calculatedValues.get(num);
        }
        Long result = fibonacci(num-1) + fibonacci(num-2);
        calculatedValues.put(num, result);
        return result;
    }
}
