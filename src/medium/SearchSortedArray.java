package medium;

public class SearchSortedArray {
    public static void main(String[] args) {

        int[] nums1 = {4,5,6,7,0,1,2};
        int target = 3;
        int result = searchNumber(nums1, target);
        System.out.println(result);

    }

    public static int searchNumber(int [] number, int target) {
        for (int count = 0; count < number.length; count++) {

            if (number[count] == target) {
                return count;
            }

        }
        return -1;
    }
}
