public class Palindrome {
    // Checks if a given number is a palindrome.
    public static void main(String[] args) {
        int num = 15951;
        Palindrome p = new Palindrome();
        boolean result = p.isNumberPalindrome(num);

        if (result) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }

    // Returns true if the given number is a palindrome, false otherwise.
    public boolean isNumberPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reverse = 0;
        int temp = x;

        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        return reverse == x;
    }
}