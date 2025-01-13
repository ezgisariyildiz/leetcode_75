public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        // nums dizisinin uzunluğunu n değişkenine atıyoruz
        int n = nums.length;
        int[] answer = new int[n];

        int leftProduct = 1;
        // nums dizisini baştan sona dolaşıyoruz
        for (int i = 0; i < n; i++) {
            //answer[i]'ye, nums[i]'den önceki elemanların çarpımını (leftProduct) atıyoruz
            answer[i] = leftProduct;
            // leftProduct değişkenini güncelliyoruz. Şimdiye kadar gördüğümüz elemanların çarpımını içeriyor.
            leftProduct *= nums[i];
        }

        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.productExceptSelf(nums);

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Output: 24 12 8 6
    }

}
