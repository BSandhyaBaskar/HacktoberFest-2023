public class InsertionSort {

    public int[] sortArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) { // Start from index 1
            int key = nums[i];
            int j = i - 1;
            // Move elements greater than key to one position ahead
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key; // Place the key in the correct position
        }
        return nums;
    }

    public static void main(String[] args) {
        InsertionSort sorter = new InsertionSort();
        int[] nums = {5, 2, 9, 1, 5, 6};
        System.out.println("Original array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        sorter.sortArray(nums);

        System.out.println("\nSorted array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
