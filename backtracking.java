class backtracking{
    public static void main (String args[]){
        //change(3,3);
        System.out.println(change(3,3));
        System.out.println(path("",3,3));
    }
    static int change(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
       int left = change(r-1,c);
       int right =  change(r,c-1);
        return left+right;
    }
    static int path(String p,int r, int c){
          if(r==1 && c==1){
            System.out.println(p);
             return 1;
          }
          int count=0;
          if(r>1){
            count += path(p+"D",r-1,c);
          }
           if(c>1){
            count += path(p+"R",r,c-1);
           }
           return count;
    }
}