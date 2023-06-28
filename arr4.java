public class arr4 {
        public static void main(String args[]) {
            int nums[] = { 1,3,5,6 };
            int target = 5;
            int index = Bsearch(nums, target);
            System.out.println(index);
        }
    
        public static int Bsearch(int[] nums,int target){
            int l=0;
            int r=nums.length-1;
            while(l<=r){
                int m=l+(r-l)/2;
                if(nums[m]==target){
                    return m;
                }
                else if(nums[m]< target){
                    l=m+1;
                }
                else {
                    r=m-1;
                }
            }
            return -1;
    
        }
    }
    
    


    

