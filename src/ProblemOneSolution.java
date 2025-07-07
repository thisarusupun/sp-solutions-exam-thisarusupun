public class ProblemOneSolution {

    public static void main(String[] args) {
        int[] numList = {1,2,3,4,5,6,7,8,9};

        int sumOfNumbersUsingForLoop = findSumUsingForLoop(numList);
        System.out.println("sum of the numbers using for loop " + sumOfNumbersUsingForLoop);

        int sumOfNumbersUsingWhileLoop = findSumUsingWhileLoop(numList);
        System.out.println("sum of the numbers using while loop " + sumOfNumbersUsingWhileLoop);

        int sumOfNumbersUsingRecursion = findSumUsingRecursion(numList,0,0);
        System.out.println("sum of the numbers using recursion " + sumOfNumbersUsingRecursion);

    }

    private static int findSumUsingForLoop(int[] numList) {
        int sum = 0;
        for (int i=0; i< numList.length ; i++){
            sum += numList[i];
        }
        return sum;
    }

    private static int findSumUsingWhileLoop(int[] numList) {
        int sum = 0;
        int i = 0;
        while (i < numList.length){
            sum += numList[i];
            i++;
        }
        return sum;
    }

    private static int findSumUsingRecursion(int[] numList, int sum, int index) {
        if (index == numList.length) {
            return sum;
        }
        return findSumUsingRecursion(numList, sum + numList[index], index + 1);
    }
}
