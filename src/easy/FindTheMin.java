package easy;

public class FindTheMin {
    public static void main(String[] args) {

        int[] numbers = {10, 22, 23, 40, 45};
        int smallest = numbers[0];

        for(int count = 0; count < numbers.length; count ++){
            if(numbers[count] < smallest){
                smallest = numbers[count];
            }

        }

        System.out.println("The smallest number is: " + smallest);
    }
}
