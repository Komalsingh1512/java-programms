public class program32 {
    // String Programs (Any Five)
    public static void main(String[] args) {
        String str = "Hello World";

        // 1. Reverse a string
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string: " + reversed);

        // 2. Count the number of vowels in a string
        int vowelCount = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);

        // 3. Check if a string is a palindrome
        String cleanedStr = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversedCleanedStr = new StringBuilder(cleanedStr).reverse().toString();
        boolean isPalindrome = cleanedStr.equals(reversedCleanedStr);
        System.out.println("Is the string a palindrome? " + isPalindrome);

        // 4. Count the frequency of each character in a string
        java.util.Map<Character, Integer> charFrequency = new java.util.HashMap<>();
        for (char c : str.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }
        System.out.println("Character frequency: " + charFrequency);

        // 5. Convert a string to uppercase
        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase string: " + upperCaseStr);
    }
}
