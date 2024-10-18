import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    public static void bucketSort(float[] array) {
        // Create an array of buckets
        int n = array.length;
        if (n <= 0) return;

        // Create n empty buckets
        ArrayList<Float>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Place each element in the corresponding bucket
        for (float value : array) {
            int bucketIndex = (int) (n * value); // Assuming value is in range [0, 1)
            if (bucketIndex >= n) bucketIndex = n - 1; // Handle edge case
            buckets[bucketIndex].add(value);
        }

        // Sort each bucket and concatenate results
        int index = 0;
        for (ArrayList<Float> bucket : buckets) {
            Collections.sort(bucket);
            for (float value : bucket) {
                array[index++] = value;
            }
        }
    }

    public static void main(String[] args) {
        float[] array = {0.42f, 0.32f, 0.64f, 0.25f, 0.45f, 0.91f, 0.35f};
        System.out.println("Original array:");
        for (float value : array) {
            System.out.print(value + " ");
        }

        bucketSort(array);

        System.out.println("\nSorted array:");
        for (float value : array) {
            System.out.print(value + " ");
        }
    }
}
