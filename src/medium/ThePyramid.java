package medium;

public class ThePyramid {
    public static void main(String[] args) {

        for(int count = 1; count <= 5; count++){

            for(int space = 5; space >= count; space --){
                System.out.print(" ");
            }

            for(int index = 1; index <= count; index ++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
