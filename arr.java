import java.util.Arrays;

public class arr {
    public static void main(String args[]){
        int nums[]={-1,1,2,1,-4};
        int target=1;
        System.out.print("Given array:");
        System.out.println(Arrays.toString(nums));
        int m=closetSum(nums,target);
        System.out.println("closet sum is: "+m);

    }
    public static int closetSum(int nums[],int target){
        int n=nums.length;
        int closeSum=nums[0]+nums[1]+nums[2];

        for(int i=0;i<n-2;i++){
             int left=i+1;
             int right=n-1;
            int currentSum=nums[i]+nums[left]+nums[right];
            if(currentSum==target){
                return i;
            }
            if(Math.abs(currentSum-target)<Math.abs(closeSum-target)){
                closeSum=currentSum;
            }
            if(currentSum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return closeSum;
    }
    
}
