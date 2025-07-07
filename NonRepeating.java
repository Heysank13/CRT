
public class NonRepeating {
    public static void main(String args[]) {

        String s1 = "Nashik";
        String s2 = "Nagpur";

        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                stb.append(s1.charAt(i));
            }

        }
        System.out.println(stb.toString());

    }

}
