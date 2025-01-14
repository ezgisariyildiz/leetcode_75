import java.util.Arrays;

public class MoveZeroes1 {
    public void moveZeroes(int[] nums) {
        int insertPos = 0; // 0 olmayan elemanları yerleştireceğimiz pozisyon

        // 1. Adım: 0 olmayan elemanları öne taşı
        for (int num : nums) { // Dizi boyunca gez
            if (num != 0) {    // 0 olmayan bir eleman bulursak
                nums[insertPos++] = num; // Bu elemanı "insertPos" pozisyonuna yerleştir ve insertPos'u artır
            }
        }

        // 2. Adım: Geriye kalan pozisyonlara 0 yerleştir
        while (insertPos < nums.length) { // Dizideki geri kalan pozisyonlar
            nums[insertPos++] = 0;        // Hepsini 0 yap
        }
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        // Orijinal diziyi yazdır
        System.out.println(Arrays.toString(nums));

        MoveZeroes1 moveZeroes1 = new MoveZeroes1();
        moveZeroes1.moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }



}
