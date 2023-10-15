import java.util.Arrays;
public class ProductSmallPair { 
    public static int productSmallPair(int sum,int arr[]){
        if(arr.length<=2) return -1; 
        Arrays.sort(arr); 
        if((arr[0]+arr[1])<=sum) return arr[0]*arr[1]; 
        return 0;

    }
    public static void main(String[] args) {
        int sum=9; 
        int arr[]={5,4,2,3,9,1,7}; 
        System.out.println(productSmallPair(sum,arr));
    }
}
/*
Implement the following Function

The function def ProductSmallestPair(sum, arr) accepts an integers sum and an integer array arr of size n. Implement the function to find the pair, (arr[j], arr[k]) where j!=k, Such that arr[j] and arr[k] are the least two elements of array (arr[j] + arr[k] <= sum) and return the product of element of this pair

NOTE

Return -1 if array is empty or if n<2
Return 0, if no such pairs found
All computed values lie within integer range
Example

Input

sum:9

Arr:5 2 4 3 9 7 1

Output

2

Explanation

Pair of least two element is (2, 1) 2 + 1 = 3 < 9, Product of (2, 1) 2*1 = 2. Thus, output is 2

Sample Input

sum:4

Arr:9 8 3 -7 3 9

Sample Output

-21 */
