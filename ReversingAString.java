public class ReversingAString {
    public static void main(String[] args) {
        String str = "my name is sanket";
        System.out.println(getReverse(str));
    }

    public static String getReverse(String str) {
        StringBuilder stb = new StringBuilder();
        int last = str.length();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                for (int j = i; j < last; j++) {
                    stb.append(str.charAt(j));
                }
                stb.append(' ');
                last = i;
            }
        }
        for (int j = 0; j < last; j++) {
            stb.append(str.charAt(j));
        }
        String str2 = stb.toString();

        return str2;

    }
}