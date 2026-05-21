package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddTwoNumbers {
    public static void main(String[] args) {

        int[] list = {2, 4, 3};
        int [] list2 = {5, 6, 9};

        ArrayList<Integer> result = addTwoNumbers(list, list2);
        System.out.println(result);
    }

    public static ArrayList<Integer> addTwoNumbers(int[] num1, int[] num2) {
        ArrayList<Integer> result = new ArrayList<>();
        int sum = 0;
        for(int count = 0; count < num1.length; count ++) {
            for (int index = 0;  index < num2.length; index ++) {
               sum = num1[count] + num2[index];

                if (sum > 9) {
                    sum = sum - 10;

                }

                num1[count] += 1;

            }

            result.add(sum);

        }

        return result;
    }
}
