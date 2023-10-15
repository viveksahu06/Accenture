public class DifferenceOfSum {
    public static int reDiff(int a, int b) {
        int ans = 0;
        int ds = 0;
        int nds = 0;
        for (int i = 1; i <= a; i++) {
            if (i % b == 0) {
                ds += i;
            } else {
                nds += i;
            }
        } 
        return nds-ds; 
    }

    public static void main(String[] args) {
        int a = 10, b = 3;
        System.out.println(reDiff(a,b));
    }

}
