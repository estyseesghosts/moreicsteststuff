class ReplaceLetter {
    public static void main(String[] args) {
        System.out.println(replaceLetter("hello", 'l', 'y'));
    }

    public static String replaceLetter(String inStr, char ch1, char ch2) {
        String out = "";

        for (int i = 0; i < inStr.length(); i++) {
            if (inStr.charAt(i) == ch1) out += ch2;
            else out += inStr.charAt(i);
        }

        return out;
    }
}