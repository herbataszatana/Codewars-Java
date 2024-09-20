import java.util.ArrayList;
import java.util.Arrays;

public class SumWithoutHighestAndLowestNumber {

    public static void main(String[] args){
        sum(new int[]{1, 5, 6, 3, 33});
    }

    /*
    Sum all the numbers of a given array ( cq. list ), except the highest and
    the lowest element ( by value, not by index! ).
    The highest or lowest element respectively is a single
    element at each edge, even if there are more than one with the same value.
    Mind the input validation.
    Example
     */
    public static int sum(int[] numbers)
    {
        int sum = 0;
        if (numbers.length ==0){
            return sum;
        }
        else{
        Arrays.sort(numbers);
        for(int i =1; i< numbers.length-1; i++){
            sum = sum + numbers[i];
            }
        }
        return sum;

    }


}
