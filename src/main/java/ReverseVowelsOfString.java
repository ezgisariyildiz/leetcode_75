public class ReverseVowelsOfString {

    public String reverseVowels(String s) {
        // Stringi karakter dizisine çeviriyoruz
        char[] chars = s.toCharArray();

        // Sesli harfleri kontrol etmek için iki pointer oluşturuyoruz
        int left = 0, right = chars.length - 1;

        // Sesli harfleri tanımlıyoruz
        String vowels = "aeiouAEIOU";

        // Sol ve sağ pointerlar birbiriyle kesişene kadar devam ediyoruz
        while (left < right) {
            // Sol pointer sesli harf bulana kadar ilerler
            while (left < right && vowels.indexOf(chars[left]) == -1) {
                left++;
            }
            // Sağ pointer sesli harf bulana kadar ilerler
            while (left < right && vowels.indexOf(chars[right]) == -1) {
                right--;
            }

            //Sol ve sağdaki sesli harflerin yerlerini değiştiriyoruz
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // Pointerları hareket ettiriyoruz
            left++;
            right--;

        }
        return new String(chars);
    }
    public static void main(String[] args) {
        ReverseVowelsOfString reverseVowels = new ReverseVowelsOfString();
        System.out.println(reverseVowels.reverseVowels("IceCreAm")); // Output: AceCreIm
        System.out.println(reverseVowels.reverseVowels("leetcode")); // Output: leotcede
        System.out.println(reverseVowels.reverseVowels("hello")); // Output: holle
    }
}
