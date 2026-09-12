package hard;

public class OutputNumbersInASpiralForm {

    public static void main(String[] args) {

        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

        int counter = 0;

        for(int count = 0; count < numbers.length; count++){
            if(counter < 3){
                System.out.print(numbers[count]);
            }

            else{
                continue;
//                System.out.println();

            }

            System.out.println();
            counter ++;
        }
    }
}
