package medium;

public class TheBreaker {
    public static void main(String[] args) {

        int [] numbers = {45, 23, 43, 14, 35, 7, 27, 80, 49, 60};

        for(int count = 0; count < numbers.length; count ++){
            if(numbers[count] == 7){
                break;
            }

            System.out.println(numbers[count]);
        }
    }
}
