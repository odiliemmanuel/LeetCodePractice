package easy;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive number: ");
        int number = input.nextInt();

        while(number <= 0){
            System.out.println("Please enter a positive number: ");
            number = input.nextInt();

        }
    }
}
