package easy;

public class SearchInSortedArray {
    public static void main(String[] args) {

        int result = search(new int[]{5,7,7,8,8,9,10}, 6);
        System.out.println(result);
    }

    public static int search(int[] nums, int target) {
        int index = -1;
        for(int count = 0; count < nums.length; count ++){
            if(nums[count] == target){
                index = count;
            }


        }

        return index;
    }
}
