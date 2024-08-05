class subseq {
    public static void main(String args[]) {
        change("", "sdf");
    }

    static void change(String p, String up) {
        
        if (up.isEmpty()) {
            System.out.println(p);
            return; 
        }
        
    
        char ch = up.charAt(0); 

        change(p + ch, up.substring(1));
        
    
        change(p, up.substring(1));
    }    
}
