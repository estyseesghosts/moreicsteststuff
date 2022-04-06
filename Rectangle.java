class Rectangle {
    public static void main (String[] args) {
        printRect('g', 7, 9, true); // params: char fill, int width, int height, boolean isHollow
        printRect('O', 4, 3, false);
        printRect('H', 16, 10, true);

    }

    static final String SPACER = " ";

    public static void printRect(char fill, int width, int height, boolean isHollow) {
        /*
        Parameters:
        char fill - the character the rectangle should be made of
        int width - the width of the rectangle
        int height - the height of the rectangle
        boolean isHollow - should the rectangle be hollow?
         */
        if (width < 0 || height < 0) return;
        String[] out = new String[height];
        String black = "";
        String hollow = "";
        for (int i = 0; i <= width; i++) {
            black += fill;
            if (isHollow) hollow += SPACER;
            if (!isHollow) hollow+=fill;
        }

        hollow = fill + hollow.substring(1, hollow.length()-1) + fill;

        for (int i = 0; i < out.length; i++) {
            if (i == 0 || i == out.length-1) out[i] = black;
            else out[i] = hollow;
        }

        for (int i = 0; i < out.length; i++) System.out.println(out[i]);

    }
}