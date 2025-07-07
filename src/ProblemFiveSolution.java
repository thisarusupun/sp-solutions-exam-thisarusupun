import java.util.ArrayList;
import java.util.List;

public class ProblemFiveSolution {
    private static final List<String> possibleSolutions = new ArrayList<>();

    public static void main(String[] args) {

        findPossibleSolutions(2, "1", 1, 1);

        System.out.println(possibleSolutions.size());
        for (String possibleSolution : possibleSolutions) {
            System.out.println(possibleSolution);
        }
    }

    private static void findPossibleSolutions(int index, String currentExpression, int currentSum, int lastValue) {
        if (index == 10) {
            if (currentSum == 100) {
                possibleSolutions.add(currentExpression);
            }
            return;
        }

        findPossibleSolutions(index + 1, currentExpression + "+" + index, currentSum + index, index
        );

        findPossibleSolutions(index + 1, currentExpression + "-" + index, currentSum - index, -index
        );

        int newLastValue;
        if (lastValue >= 0) {
            newLastValue = lastValue * 10 + index;
        } else {
            newLastValue = lastValue * 10 - index;
        }

        int newSum = currentSum - lastValue + newLastValue;

        findPossibleSolutions(index + 1, currentExpression + index, newSum, newLastValue);
    }
}
