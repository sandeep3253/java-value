import java.util.Arrays;

class twosum1 {
    public static void main(String args[]) {
        int[] arr = {-3, 2, 4, -1, 5, 4};
        int target = 3;

        // Sort the array to apply the two-pointer technique
        Arrays.sort(arr);

        // Initialize two pointers
        int left = 0;
        int right = arr.length - 1;

        // Call the twoSum function and print the result
        int[] result = twoSum(arr, target);
        if (result.length == 2) {
            System.out.println("Pair found: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found");
        }
    }

    public static int[] twoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        // Use the two-pointer approach
        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                // Return the pair of numbers
                return new int[]{arr[left], arr[right]};
            } else if (sum < target) {
                // Move the left pointer to the right to increase the sum
                left++;
            } else {
                // Move the right pointer to the left to decrease the sum
                right--;
            }
        }

        // Return an empty array if no pair is found
        return new int[]{};
    }
}
