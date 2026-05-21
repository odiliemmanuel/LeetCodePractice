package medium;

public class ConsecutiveOccurrence {
    public static void main(String[] args) {

        int [] array = {3, 3, 3, 3};
        int result = consecutiveOccurrences(array);
        System.out.println(result);
    }


    public static int consecutiveOccurrences(int[] arrayOfNumbers) {
        int maximumLength = 1;
        int currentOccurrence = 1;

        for(int count = 1; count < arrayOfNumbers.length; count++){
           if(arrayOfNumbers[count] > arrayOfNumbers[count-1]){
               currentOccurrence ++;

               if(currentOccurrence > maximumLength){
                   maximumLength = currentOccurrence;
               }

           }
           else{
               currentOccurrence = 1;
           }
        }
        return maximumLength;
    }


}