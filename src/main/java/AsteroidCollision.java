import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            boolean destroyed = false;

            // Çarpışma kontrolü: Stack'in üstündeki asteroit sağa (+) gidiyor, yenisi sola (-) gidiyor
            while (!stack.isEmpty() && stack.peek() > 0 && asteroid < 0) {
                int top = stack.peek();
                if (Math.abs(top) < Math.abs(asteroid)) {
                    // Stack'teki asteroit daha küçük, yok et ve devam et
                    stack.pop();
                } else if (Math.abs(top) == Math.abs(asteroid)) {
                    // Eşit büyüklükte asteroitler, ikisini de yok et
                    stack.pop();
                    destroyed = true;
                    break;
                } else {
                    // Yeni gelen asteroit daha küçük, yok et
                    destroyed = true;
                    break;
                }
            }

            // Eğer yeni asteroit yok edilmediyse, stack'e ekle
            if (!destroyed) {
                stack.push(asteroid);
            }
        }

        // Stack'teki sonucu diziye dönüştür
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        AsteroidCollision solution = new AsteroidCollision();

        // Örnek testler
        int[] asteroids1 = {5, 10, -5};
        System.out.println(java.util.Arrays.toString(solution.asteroidCollision(asteroids1))); // Çıktı: [5, 10]

        int[] asteroids2 = {8, -8};
        System.out.println(java.util.Arrays.toString(solution.asteroidCollision(asteroids2))); // Çıktı: []

        int[] asteroids3 = {10, 2, -5};
        System.out.println(java.util.Arrays.toString(solution.asteroidCollision(asteroids3))); // Çıktı: [10]
    }
}
