class recrsorted{
    public static void main (String args[]){
         int [] arr={1,2,3,6,4};
         int index=0;
         System.out.println(arr);
    }
    static boolean change(int[]arr,int index){
         if(index==arr.length-1){
             return true;
         }
         return arr[index]<arr[index+1] &&  change(arr,index+1);
    }
}