package easy;

public class FibonacciBasics {
    public static void main(String[] args) {

        int firstNumber = 0;
        int secondNumber = 1;

// 0 1 1 2 3 5 8 13

        for(int count = 0; count <= 10; count ++){

            if(count == 0){
                System.out.println(firstNumber);

            }
            else if(count == 1){
                System.out.println(secondNumber);
            }
            else {
                int c = firstNumber + secondNumber;
                System.out.println(c);
                firstNumber = secondNumber;
                secondNumber = c;
            }

        }
    }
}

