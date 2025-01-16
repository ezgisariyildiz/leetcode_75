import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualRowAndColumnPairs {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<List<Integer>, Integer> rowMap = new HashMap<>();

        // Satırları hashmap'e ekle
        for (int[] row : grid) {
            List<Integer> rowList = new ArrayList<>();
            for (int num : row) {
                rowList.add(num);
            }
            rowMap.put(rowList, rowMap.getOrDefault(rowList, 0) + 1);
        }

        int count = 0;

        // Sütunları oluştur ve kontrol et
        for (int col = 0; col < n; col++) {
            List<Integer> colList = new ArrayList<>();
            for (int row = 0; row < n; row++) {
                colList.add(grid[row][col]);
            }
            count += rowMap.getOrDefault(colList, 0);
        }

        return count;
    }

    public static void main(String[] args) {
        EqualRowAndColumnPairs solution = new EqualRowAndColumnPairs();

        int[][] grid1 = {
                {3, 2, 1},
                {1, 7, 6},
                {2, 7, 7}
        };
        System.out.println(solution.equalPairs(grid1)); // Çıktı: 1

        int[][] grid2 = {
                {3, 1, 2, 2},
                {1, 4, 4, 5},
                {2, 4, 2, 2},
                {2, 4, 2, 2}
        };
        System.out.println(solution.equalPairs(grid2)); // Çıktı: 3
    }
}
