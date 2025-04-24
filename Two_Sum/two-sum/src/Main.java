import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();

        int[] example1 = new int[] {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum.twoSum(example1, 9)));

        int[] example2 = new int[] {3,2,4};
        System.out.println(Arrays.toString(twoSum.twoSum(example2, 6)));

        int[] example3 = new int[] {3,3};
        System.out.println(Arrays.toString(twoSum.twoSum(example3, 6)));


    }
}
