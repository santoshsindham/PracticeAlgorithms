package problems;

/*
 * Implement a method to perform basic string compression using
 * the counts of repeated characters. For example, the string aabcccccaaa
 * would become a2b1c5a3. If the "compressed" string would not become
 * smaller than the original string, your method should return the original string.
 */

public class CompressString {

    public static String compresString(String text) {
        int length = text.length();
        /*
         *  Compression makes sense at length of larger than or equal to 3.
         *  For instance: "aaa" -> "a3"
         */
        if (length > 2) {
            String compressedText = "";
            char lastChar = text.charAt(0);
            int charCount = 1;
            for (int i = 1; i < length; i++) {
                if (text.charAt(i) == lastChar) charCount++;
                else {
                    compressedText += Character.toString(lastChar) + Integer.toString(charCount);
                    lastChar = text.charAt(i);
                    charCount = 1;
                }
            }
            compressedText += Character.toString(lastChar) + Integer.toString(charCount);
            if (compressedText.length() < length)
                return compressedText;
        }
        return text;
    }
}