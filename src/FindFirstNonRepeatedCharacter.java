import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "Cheese";
        findNonRepeatingCharacter(str);
    }

    public static void findNonRepeatingCharacter(String str) {
        // Create a hashmap to store character frequencies
        Map<Character, Integer> map = new HashMap<>();
        int counter = 1;

        // Iterate through the string to update character frequencies
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), counter);
            }
        }

        // Iterate through the hashmap to find the first non-repeated character
        for (Map.Entry<Character, Integer> entryMap : map.entrySet()) {
            if (entryMap.getValue() == 1) {
                // Print the first non-repeated character and exit the loop
                System.out.print(entryMap.getKey());
                break;
            }
        }
    }
}
