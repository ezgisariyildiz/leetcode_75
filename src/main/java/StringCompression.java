public class StringCompression {
    public int compress(char[] chars) {
        int index = 0;
        int i = 0;

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            chars[index++] = currentChar;

            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        StringCompression s = new StringCompression();

        char[] chars1 = {'a', 'b', 'c', 'd', 'e', 'f'};
        int length1 = s.compress(chars1);
        System.out.println(length1);
        System.out.println(new String(chars1, 0, length1));

        char[] chars2 = {'a', 'a', 'c', 'c', 'c', 'f', 'f'};
        int length2 = s.compress(chars2);
        System.out.println(length2);
        System.out.println(new String(chars2, 0, length2));

        char[] chars3 = {'a'};
        int length3 = s.compress(chars3);
        System.out.println(length3);
        System.out.println(new String(chars3, 0, length3));
    }
}
