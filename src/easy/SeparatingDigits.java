package easy;

public class SeparatingDigits {
    public static void main(String[] args) {

        int number = 42339;

        String result = "";

        while(number > 0){

            int remainder = number % 10;
            result = result + remainder;
            number = number / 10;
        }


        System.out.println(result);

        for(int count = result.length() -1; count >= 0; count --){
            System.out.print(result.charAt(count) + " ");
        }
    }
}
