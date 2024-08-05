class recr{
   public static void main (String args[]){
       int n = 1;
           change(n);
   }
   static int change(int n){
      if(n==6){
        return -1;
      }
      
      System.out.println(n); 
      return change(n+1);
   }
}