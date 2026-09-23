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


     /**
     * Finds the minimum value in an integer array.
     * @param arr the input array
     * @return minimum value in the array
     */
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    /**
    * Finds the difference of all elements from average of elements
    * @param arr
    * @return Difference of all elements from average
    */
    public static int[] differenceFromAverage(int[] arr) {
    int average = 0;
    int[] differences = new int[arr.length];
    for(int i = 0; i < arr.length; i++){
    average += arr[i];
    }
    average /= arr.length;

    for(int i = 0; i < arr.length; i++){
    differences[i] = arr[i] - average;
    }

    return differences;
    }

    /**
    * Finds the sum of odd-numbered indexes in the array
    * @param arr the input array
    * @return sum of odd-numbered indexes in the array
    */
    public static int findSumOfOddNumberedIndexes(int[] arr) {
    int sum = 0;
    for (int i = 1; i < arr.length; i += 2) {
    sum += arr[i];
    }
    return sum;
    }
    public static int findSumOfEvendNumberedIndexes(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i += 2) {
    sum += arr[i];
    }
    return sum;
    }

    
}