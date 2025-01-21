import java.util.Stack;

public class RemoveStars {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '*') {
                // En yakın sol karakteri kaldır
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // Yıldız değilse, stack'e ekle
                stack.push(c);
            }
        }
        // Stack'teki kalan karakterleri birleştir
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }
    public static void main(String[] args) {
        RemoveStars removeStars = new RemoveStars();

        String s1 = "leet**cod*e";
        System.out.println(removeStars.removeStars(s1));

        String s2 = "erase****";
        System.out.println(removeStars.removeStars(s2));
    }
}
