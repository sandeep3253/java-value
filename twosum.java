class twoSum {
   
    public static int[] twoSum(int[] nums, int target) {
        
        for (int i = 0; i < nums.length; i++) {
          
            for (int j = i + 1; j < nums.length; j++) {
                
                if (nums[i] + nums[j] == target) {
               
                    return new int[] { i, j };
                }
            }
        }
        
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
      
        int[] nums = {1, 2, 2, 5, 6};
        int target = 7;

        try {
           
            int[] result = twoSum(nums, target);
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } catch (IllegalArgumentException e) {
            
            System.out.println(e.getMessage());
        }
    }
}

