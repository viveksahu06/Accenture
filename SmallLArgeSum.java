import java.util.Arrays;
public class SmallLArgeSum {  
    public static int small(int arr[]){
        if(arr.length<=3) return 0; 
        Arrays.sort(arr); 
        return arr[arr.length-3]+arr[arr.length-4];
    }
    public static void main(String[] args) {
       // int arr[] = { 4, 0, 7, 9, 6, 4, 2 };  
      int  arr[]={3,2,1,7,5,4};
         System.out.println(small(arr));

    }
}