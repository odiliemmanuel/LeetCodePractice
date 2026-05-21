package medium;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {
    public static void main(String[] args) {

        List<Integer> list = List.of(2, 4, 3);
        List<Integer> list2 = List.of(5, 6, 9);

        List<Integer> result = addTwoNumbers(list, list2);
        System.out.println(result);
    }

    public static List<Integer> addTwoNumbers(List<Integer> num1, List<Integer> num2) {
        List<Integer> result = new ArrayList<>();

        for (int count = 0; count < num1.size(); count++) {
            for (int index = count; index < num2.size(); index++) {
                int sum = num1.get(count) + num2.get(index);
                if (sum > 9) {
                    result.add(sum - 10);
                }
                else{
                    result.add(sum);
                }

            }
        }

        return result;
    }
}
