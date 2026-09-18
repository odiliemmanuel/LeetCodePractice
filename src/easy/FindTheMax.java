package easy;

public class FindTheMax {
    public static void main(String[] args) {
//                       0   1    2   3   4
        int[] numbers = {10, 22, 23, 40, 45};
        int largest = numbers[0];

        for(int count = 0; count < numbers.length; count ++){
            if(numbers[count] > largest){
                largest = numbers[count];

            }
        }

        System.out.println("The largest number is: " + largest);
    }
}
