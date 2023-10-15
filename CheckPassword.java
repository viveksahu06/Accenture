public class CheckPassword {
    public static boolean isValid(String str) {
        if (str.length() < 4) {
            return false;
        }

        boolean num = false;
        boolean sChar = false;
        boolean slash = false;
        boolean cap = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                num = true;
            }

            if (ch >= 'A' && ch <= 'Z') {
                cap = true;
            }

            if (ch == ' ' || ch == '/') {
                slash = true;
            }

            if (i == 0 && (ch >= '0' && ch <= '9')) {
                sChar = true;
            }
        }

        return (num && cap && !slash && !sChar);
    }

    public static void main(String[] args) {
        String str = "bB1/89"; 
        System.out.println(isValid(str));
    }
}
