public class MississippiCharacterOccurrences {
    public static void main(String[] args) {
        String input = "Mississippi";
        char char1 = 's';
        char char2 = 'i';

        int countChar1 = 0;
        int countChar2 = 0;

        // Iterating through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == char1) {
                countChar1++;
            } else if (currentChar == char2) {
                countChar2++;
            }
        }

        System.out.println("Number of occurrences of character '" + char1 + "': " + countChar1);
        System.out.println("Number of occurrences of character '" + char2 + "': " + countChar2);
    }
}
