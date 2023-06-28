import java.util.*;
public class arr8 {
    public static void main(String args[]){
        int intervals[][]={{0,30},{5,10},{15,20}};
        boolean attend=canAttend(intervals);
        System.out.println(attend);
    }
    public static boolean canAttend(int[][] intervals){
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int n=intervals.length;
        for(int i=1;i<n;i++){
            if(intervals[i][0]<intervals[i-1][1]){
                return false;
            }
        }
        return true;
    }
}
