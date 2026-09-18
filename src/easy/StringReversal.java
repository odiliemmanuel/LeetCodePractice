package easy;

public class StringReversal {

    public static void main(String[] args) {

        String word = "progr  amming";

        for(int count = word.length() - 1; count >= 0; count--){
            System.out.print(word.charAt(count));
        }
        System.out.println();

    }
}
