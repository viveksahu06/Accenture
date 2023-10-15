public class FindMaximum { 
    public static void fMax(int arr[]){
        int m=-1;
        int idx=-1; 
        for(int i=0;i<arr.length;i++){
           if(arr[i]>m){
            idx=i; 
            m=arr[i];
           }
        } 
        System.out.println(m);
        System.out.println(idx);
    }
    public static void main(String[] args) {
        int arr[]={15,78,96,17,20,14,36,18,20}; 
        fMax(arr);
    }
}
