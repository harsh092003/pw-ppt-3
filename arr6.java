public class arr6 {
    public static void main(String args[]){
        int nums[]={2,2,1};
        int output=Single(nums);
        System.out.println(output);
    }
    public static int Single(int nums[]){
        int n=0;
        for(int num: nums){
            n^=num; 
        }
        return n;
    }
    
}
