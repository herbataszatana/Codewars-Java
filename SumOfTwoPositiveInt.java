import java.util.Arrays;

public class SumOfTwoPositiveInt {
    public static void main(String[] args){
        sumTwoSmallestNumbers(new long[]{1, 5, 6, 3, 33});
    }

    public static long sumTwoSmallestNumbers(final long [] numbers) {
        //Your solution here
            Arrays.sort(numbers);
            long value = numbers[0] + numbers[1];
            return value;
    }

}
