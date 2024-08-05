class str{
    public static void main (String args[]){
           String p="";
           String up = "sdksalfak";
          change(p,up);
    }
    static void change(String p,String up){
        if(up.isEmpty()){
             System.out.print(p);
             return;
        }
        char ch = up.charAt(0);
        if (ch =='a'){
            change(p,up.substring(1));
        }
        else{
            change(p+ch,up.substring(1));
        }
    }
}