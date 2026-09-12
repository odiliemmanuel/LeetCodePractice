package easy;

public class EvenAndOdds {
    public static void main(String[] args) {

        System.out.println("Even numbers: ");
        for(int count = 2; count <= 20; count ++){
            if(count % 2 == 0){
                System.out.println(count);
            }
        }

        System.out.println("Odd numbers: ");

        for(int count = 1; count <= 20; count ++){
            if(count % 2 != 0){
                System.out.println(count);
            }
        }
    }
}
