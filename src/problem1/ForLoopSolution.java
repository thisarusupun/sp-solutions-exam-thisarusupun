package problem1;

public class ForLoopSolution {

    public static void main(String[] args) {
        int[] numList = {1,2,3,4,5,6,7,8,9};
        int sumOfNumbers = findSumUsingForLoop(numList);
        System.out.println("sum of the numbers " + sumOfNumbers);
    }

    private static int findSumUsingForLoop(int[] numList) {
        int sum = 0;
        for (int i=0; i< numList.length ; i++){
            sum += numList[i];
        }
        return sum;
    }
}
