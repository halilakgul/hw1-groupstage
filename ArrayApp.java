public class ArrayApp {
    /**
     * Finds the maximum value in an integer array.
     * @param arr the input array
     * @return maximum value in the array
     */
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}