package easy;

public class StarTriangle {
    public static void main(String[] args) {

        String stars = "*";
        for(int count = 1; count <= 5; count ++){

            System.out.println(stars);
            stars += "*";
        }
    }
}
