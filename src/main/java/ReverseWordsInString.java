public class ReverseWordsInString {
    public String reverseWords(String s) {
        // Trim baştaki ve sondaki boşlukları siler, split ise kelimeleri ayırır
        // split("\\s+"): Birden fazla boşluğu birleştirerek kelimeleri böler
        String[] words = s.trim().split("\\s+");

        // Kelimeleri ters çevirip bir StringBuilder kullanarak birleştiriyoruz
        StringBuilder reversed = new StringBuilder();
        // Döngü, kelimeleri sondan başa doğru ekler.
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) { // Son kelimeden sonra boşluk eklememek için
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        ReverseWordsInString solution = new ReverseWordsInString();

        System.out.println(solution.reverseWords("the sky is blue"));        // "blue is sky the"
        System.out.println(solution.reverseWords("  hello world  "));       // "world hello"
        System.out.println(solution.reverseWords("a   good   example"));      // "example good a"
    }
}
