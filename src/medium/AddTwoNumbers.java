package medium;

import java.util.ArrayList;


public class AddTwoNumbers {
    public static void main(String[] args) {

        int[] list = {2, 4, 3};
        int [] list2 = {5, 6, 4};

        ArrayList<Integer> result = addTwoNumbers(list, list2);
        System.out.println(result);
    }

    public static ArrayList<Integer> addTwoNumbers(int[] num1, int[] num2) {
        ArrayList<Integer> result = new ArrayList<>();

        for(int count = 0; count < num1.length; count ++) {

              int sum = num1[count] + num2[count];

                if (sum > 9) {
                    sum = sum - 10;

                    result.add(sum);
                }
                else {
                    result.add(sum);

                }


        }

        return result;
    }
}
