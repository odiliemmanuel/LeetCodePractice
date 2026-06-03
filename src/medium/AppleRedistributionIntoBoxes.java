package medium;


public class AppleRedistributionIntoBoxes {
    public static void main(String[] args) {

        int[] apple = {1, 3, 2};
        int[] capacity = {4, 3, 1, 5, 2};
        int result = AppleRedistributionIntoBoxes.findNumberOfBoxesRequiredForRedistribution(apple, capacity);
        System.out.println(result);

    }

    public static int findNumberOfBoxesRequiredForRedistribution(int[] apple, int[] capacity) {
        int sum = 0;

        for(int count = 0; count < apple.length; count++){
            sum += apple[count];
        }

        int counter = 0;
        int capacitySum = 0;
     
        for(int count = 0; count < capacity.length; count++){
            capacitySum += capacity[count]; // 4 // 3


            if(capacitySum == sum){
                counter = capacity.length;
                break;
            }

           else if(capacitySum < sum){
                counter ++;

           }


           else{
               counter ++;
               break;
           }


        }

        if(capacitySum < sum){
            return -1;
        }

        return counter;

    }
}