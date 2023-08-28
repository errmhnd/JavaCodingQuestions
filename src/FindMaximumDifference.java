public class FindMaximumDifference {
    public static void main(String[] args) {
        int[] arr = {58, 23, 76, 12, 47, 94, 31, 65, 29, 83};
        printMaximumDifference(arr);
    }

    public static void printMaximumDifference(int[] arr) {
        // Initialize max and min with the first element of the array
        int max = arr[0];
        int min = arr[0];

        // Iterate through the array to find the maximum and minimum values
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                // If the current element is greater than max, update max
                max = arr[i];
            } else if (arr[i] < min) {
                // If the current element is smaller than min, update min
                min = arr[i];
            }
        }

        // Calculate and print the maximum difference
        System.out.println("The Max Difference is: " + (max - min));
    }
}
