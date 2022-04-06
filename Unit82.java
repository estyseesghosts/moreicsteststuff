import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class Unit82 {
    public static void main (String[] args) {
	Questions.question1();
	Questions.question2();
        Questions.scoreTable();
    }
}

class Questions {
    public static void question1() {
        int[] list = new int[4];
        for (int i = 0; i < list.length; i++) list[i] = 3 - i;
        System.out.println(list[1]+2);
        System.out.println(list[1+2]);
        System.out.println(list[1]+list[2]);
    }

    public static void question2() {
        final int SIZE = 10;
        int[] sample = new int[SIZE];

        //  Initialize all elements of the array to one.
        Arrays.fill(sample, 1);
        System.out.println(Arrays.toString(sample));

        // Switch the values at either end of the array.
        for (int i = 0; i < sample.length; i++) sample[i] = i;
        int x = sample[0];
        sample[0] = sample[sample.length-1];
        sample[sample.length-1] = x;
        System.out.println(Arrays.toString(sample));

        // Change any negative values to positive values (of the same magnitude).
        for (int i = 0; i < sample.length; i++) sample[i] = -i;
        System.out.println(Arrays.toString(sample));

        for (int i = 0; i < sample.length; i++) sample[i] = Math.abs(sample[i]);
        System.out.println(Arrays.toString(sample));

        // Set the variable sampleSum to the sum of the values of all the
        // elements.
        int sampleSum = 0;
        for (int j : sample) sampleSum += j;
        System.out.println(sampleSum);

        // Print the contents of the odd-numbered locations
        for (int i = 1; i < sample.length; i+=2) System.out.println(sample[i]);
    }

    public static double max(double[] in) {
        double max = in[0];
        for (double v : in) if (v > max) max = v;
        return max;
    }

    public static boolean equals (double[] a, double[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }

    public static void scoreTable() {
        Scanner scanner = new Scanner(System.in);

        double mean = 0;
        int counter = 0;
        int[] count = new int[11]; // Accommodates 0 through 10

        while (true) {
            System.out.println("Enter a score (negative number will end program)");
            int score = scanner.nextInt();
            if (score < 0) break;
            else if (score > 10) continue;
            count[score] += 1;
            counter += 1;
        }

        System.out.println("Score / Occurrences");

        for (int i = 0; i < count.length; i++) {
            System.out.println(i + "  /  " + count[i]);
            mean += count[i] * i;
        }

        mean = mean/counter;
        mean = (double) Math.round(mean*10)/10;

        System.out.println("The mean is " + mean);
    }

}