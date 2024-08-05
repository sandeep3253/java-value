import java.util.*;

class duplicatevalue{
    public static void main (String args[]){
        int [] nums ={12,1,12,2};
             HashSet<Integer> seen = new HashSet<>();
             for(int i =0; i<nums.length;i++){
                 if(seen.contains(nums[i])){
                //    seen.add(nums[i]);
                     System.out.println(nums[i]);
                 }
                 else{
                    seen.add(nums[i]);
                 }
             }

    }
}