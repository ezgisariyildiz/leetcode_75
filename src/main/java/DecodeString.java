import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<String> strStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int currentNum = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                // Rakamları sayıya çevir
                currentNum = currentNum * 10 + (c - '0');
            } else if (c == '[') {
                // Açılan parantez
                numStack.push(currentNum); // Sayıyı stack'e ekle
                strStack.push(currentString.toString()); // Mevcut string'i stack'e ekle
                currentString = new StringBuilder(); // Yeni bir string başlat
                currentNum = 0; // Sayıyı sıfırla
            } else if (c == ']') {
                // Kapanan parantez
                int repeatTimes = numStack.pop(); // Tekrar sayısını al
                StringBuilder temp = new StringBuilder(strStack.pop()); // Önceki string'i al
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(currentString); // String'i tekrar et
                }
                currentString = temp; // Mevcut string'i güncelle
            } else {
                // Harf ekle
                currentString.append(c);
            }
        }

        return currentString.toString();
    }
    public static void main(String[] args) {
        DecodeString solution = new DecodeString();

        // Örnek testler
        String s1 = "3[a]2[bc]";
        System.out.println(solution.decodeString(s1)); // Çıktı: "aaabcbc"

        String s2 = "3[a2[c]]";
        System.out.println(solution.decodeString(s2)); // Çıktı: "accaccacc"

        String s3 = "2[abc]3[cd]ef";
        System.out.println(solution.decodeString(s3)); // Çıktı: "abcabccdcdcdef"
    }
}
