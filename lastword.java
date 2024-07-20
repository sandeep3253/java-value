public class lastword {
    public static void main(String[] args) {
     String s = "hello world";
       System.out.println(s.trim());
        String[] words = s.trim().split(" ");
        return words[words.length - 1].length();
    }
}

