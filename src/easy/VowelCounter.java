package easy;

public class VowelCounter {
    public static void main(String[] args) {

        String word = "programming";
        int vowelCount = 0;

        for(int count = 0; count < word.length(); count++){
            if(word.charAt(count) == 'a' || word.charAt(count) == 'e' || word.charAt(count) == 'i' || word.charAt(count) == 'o' || word.charAt(count) == 'u'){
                vowelCount++;
            }
        }

        System.out.println(vowelCount);
    }
}
