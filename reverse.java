class reverse {
    
    static int change(int n) {
        int reversed = 0; // Initialize reversed number
        while (n != 0) {
            int rem = n % 10; // Get the last digit
            reversed = reversed * 10 + rem; // Append last digit to reversed number
            n /= 10; // Remove last digit from n
        }
        return reversed;
    }

    public static void main(String[] args) {
        int n = 2324;
        int reversedNumber = change(n); // Reverse the number
        System.out.println("Original number: " + n);
        System.out.println("Reversed number: " + reversedNumber);
    }
}
