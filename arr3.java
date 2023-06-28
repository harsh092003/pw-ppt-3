import java.util.*;
public class arr3 {
    public static void main(String args[]){
        int nums[]={1,2,3};
        System.out.print("Given array: ");
        System.out.println(Arrays.toString(nums));
        permutation(nums);
        System.out.print("Permuted array:");
        System.out.println(Arrays.toString(nums));
    }
    public static void permutation(int nums[]){
        int n=nums.length;
        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i >=0){
            int j=n-1;
             while(j>=0 && nums[j]<=nums[i]){
            j--;
            }
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
          
        }
        int x=i+1;
        int y=n-1;
        while(x<y){
            int temp=nums[x];
            nums[x]=nums[y];
            nums[y]=temp;
            x++;
            y--;
        
        }

    }
     public static void swap(int[]nums,int i,int j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            }
    
}
