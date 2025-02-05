package Saklaso_davaleba;

public class Main2 {
    public static void main(String[] args) {
        String word = "Hello";

        char uniqueChar = '.';

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < word.length(); j++) {
                if (i != j && c == word.charAt(j)){
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueChar = c;
                break;
            }

        }
        System.out.println(uniqueChar);
    }
}
