public class CalculateBinaryOperations {
    public static int calBin(String str) {

        if (str.length() == 0)
            return -1;
        int ans = str.charAt(0) - '0';

        for (int i = 1; i < str.length() - 1; i++) {
            char ch = str.charAt(i);
            char ne = str.charAt(i + 1);
            if (ch == 'A')
                ans = (ans & (ne - '0'));
            else if (ch == 'B')
                ans = (ans | (ne - '0'));
            if (ch == 'C')
                ans = (ans ^ (ne - '0'));
        }

        return ans;
    }

    public static void main(String[] args) {
        String str = "1C0C1C1A0B1";
        System.out.println(calBin(str));

    }
}
