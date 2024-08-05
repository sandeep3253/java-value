class duplicate {
    public static void main(String[] args) {
        char[] ch = "sannnnndeep".toCharArray(); // Convert string to character array
        int count = 0;
        count = change(ch, count);
        System.out.println("Number of duplicate adjacent characters: " +count);
    }

    static int change(char[] ch, int count) {
        for (int i = 0; i < ch.length - 1; i++) { // Use ch.length - 1 to prevent index out of bounds
            if (ch[i] == ch[i + 1]) {
                count++;
            }
        }
        return count;
    }
}
