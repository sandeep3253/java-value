class watertraped{
    public static void main(String args[]){
        int []height ={2,4,5,4,5,4,0,1,1};
        
        int left=0,right =height.length-1;
        int watertraped=0;
        int leftmax=0,rightmax=0;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>=leftmax){
                    leftmax = height[left]; 
               }            else {
            watertraped += leftmax - height[left];
        }
        left++;
            }
           if(height[right]>=rightmax){
            rightmax=height[right];
           }
           else{
            watertraped += rightmax - height[right];
           } 

        }
        return watertraped;
    }
}