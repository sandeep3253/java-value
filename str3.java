public class str3 {
    public static int magicalString(int n) {
        if (n <= 0) return 0;
        if (n <= 3) return 1; // The first three characters "122" contain one '1'

        // Initialize the magical string with the first three characters
        int[] magic = new int[n + 1];
        magic[0] = 1;
        magic[1] = 2;
        magic[2] = 2;

        int head = 2; // Pointer to the current position for counts
        int tail = 3; // Pointer to the end of the magical string
        int num = 1;  // The next number to insert (1 or 2)

        // Generate the magical string
        while (tail < n) {
            for (int i = 0; i < magic[head]; i++) {
                if (tail < n) {
                    magic[tail] = num;
                    tail++;
                }
            }
        }

        // Count the number of '1's in the first n characters
        int countOnes = 0;
        for (int i = 0; i < n; i++) {
            if (magic[i] == 1) {
                countOnes++;
            }
        }

        return countOnes;
    }

    public static void main(String[] args) {
        int n = 4; // Example input
        int count = magicalString(n);
        System.out.println("Number of '1's in the first " + n + " characters: " + count); // Output should be 3
    }
}

