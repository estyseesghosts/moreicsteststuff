class RectTest {
    public static void main (String[] args) {
        printRect('g', 7, 9, true); // params: char fill, int width, int height, boolean isHollow
        printRect('O', 4, 3, false);
        printRect('H', 16, 10, true);
        printRect('z', 10, 3);

    }

    public static void printRect(char fill, int width, int height) {
        /*
        Parameters:
        char fill - the character the rectangle should be made of
        int width - the width of the rectangle
        int height - the height of the rectangle
         */

        String black = Character.toString(fill).repeat(width);

        for (int i = 0; i < height; i++) {
            System.out.println(black);
        }
    }

    public static void printRect(char fill, int width, int height, boolean isHollow) {
        /*
        Parameters:
        char fill - the character the rectangle should be made of
        int width - the width of the rectangle
        int height - the height of the rectangle
        boolean isHollow - should the rectangle be hollow?
            */

        String black = Character.toString(fill).repeat(width);
        String hollow = fill + " ".repeat(width-2) + fill;

        for (int i = 0; i < height; i++) {
            if (isHollow) {
                if (i > 0 && i < height-1) {
                    System.out.println(hollow);
                    continue;
                }	
            }	
            System.out.println(black);
        }
    }
}
