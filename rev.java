class rev{
   public static void  change(char[]s){
     int left =0;
     int right = s.length-1;
        
     while (left<right){
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        
        left++;
        right--;
        }
      }
     public static void main (String args[]){
        char[] s ={'g','f','h','t'};
        change(s);
        System.out.println(s);
        }
       }
       
    
