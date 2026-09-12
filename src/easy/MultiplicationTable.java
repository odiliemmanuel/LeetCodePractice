package easy;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        int product = 1;

        for(int count = 1; count <= 10; count ++){
            product = number * count;
            System.out.println(number + " x " + count + " = " + product);
        }
    }
}
