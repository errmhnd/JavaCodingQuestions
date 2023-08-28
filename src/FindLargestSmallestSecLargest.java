public class FindLargestSmallestSecLargest {
    public static void main(String[] args) {
        int[] arr = {45, 82, 17, 63, 29, 54, 91, 10, 76, 38, 59, 22, 41, 87, 5};
        printLargestSmallestSecLargest(arr);
    }

    public static void printLargestSmallestSecLargest(int[] arr) {
        int lengthOfArray = arr.length;
        int largest = arr[0];
        int smallest = arr[0];
        int secLargest = arr[0];

        for (int i = 1; i < lengthOfArray; i++) {
            if (arr[i] > largest) {
                secLargest = largest;
                largest = arr[i];
            } else if (arr[i] < smallest) {
                secLargest = smallest;
                smallest = arr[i];
            } else if (arr[i] > secLargest) {
                secLargest = arr[i];
            }
        }
        
        // Print the results after the loop
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        System.out.println("Second Largest: " + secLargest);
    }
}