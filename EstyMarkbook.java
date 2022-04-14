package TEMP;

public class EstyMarkbook {
    public static void main (String[] args)
    {
        Course calc = new Course("calc");
        // K, T, C, A
        Test limits = new Test(1.0, 2.5, 1.0, 1.8, 1.0, 2.0, 0.91667, 2.5, "limits");
        Test unit1 = new Test(0.7, 7.5, 0.6, 5.5, 0.875, 6.0, 1.0, 7.5, "unit 1");
        Test derivatives = new Test(0.75, 2.5, 0.75, 1.8, 0, 0, 0.75, 2.5, "derivatives");
        Test derivUnit = new Test(0.625, 7.5, 0.722, 5.5, 1.0, 6.0, 0.875, 7.5, "derivatives unit");
        Test smallQuiz = new Test(0.714, 2.5, 0, 0, 0, 0, 0.786, 2.5, "5.1 5.2 quiz");
        Test derivAppl = new Test(0.7, 7.5, 1.0, 5.5, 1.0, 6.0, 0.875, 7.5, "ch5");

        calc.testlist = new Test[] {limits, unit1, derivatives, derivUnit, smallQuiz, derivAppl};

        //calc.printScore();

        calc.findHeaviest();
    }
    
}

class Course {
    final int N = 6;

    Test[] testlist;

    String name;

    public Course()
    {
        this.name = "Null";
    }

    public Course (String name)
    {
        this.name = name;
    }

    public static double round (double x) 
    { return ((double) Math.round(x*1000))/1000; }

    public void printScore()
    {
        double finalScore = 0;
        double finalTotal = 0;

        for (Test a : testlist)
        {
            finalScore += a.catk[0]*a.catk[1];
            finalScore += a.cata[0]*a.cata[1];
            finalScore += a.catt[0]*a.catt[1];
            finalScore += a.catu[0]*a.catu[1];
            //////////
            finalTotal += a.catk[1];
            finalTotal += a.catt[1];
            finalTotal += a.catu[1];
            finalTotal += a.cata[1];
        }

        System.out.println("The score is " + round((finalScore/finalTotal)*100));
    }

    public static void printScore(Test[] list)
    {
        double finalScore = 0;
        double finalTotal = 0;

        for (Test a : list)
        {
            finalScore += a.catk[0]*a.catk[1];
            finalScore += a.cata[0]*a.cata[1];
            finalScore += a.catt[0]*a.catt[1];
            finalScore += a.catu[0]*a.catu[1];
            //////////
            finalTotal += a.catk[1];
            finalTotal += a.catt[1];
            finalTotal += a.catu[1];
            finalTotal += a.cata[1];
        }

        System.out.println("The score is " + round((finalScore/finalTotal)*100));
    }

    public void findHeaviest ()
    {
        double newMax = 0;
        char[] categories = new char[] {'K', 'C', 'A', 'T'};
        Test drop = new Test();
        int dropI = 0;
        Test[] templist = new Test[testlist.length];
        for (int i = 0; i < testlist.length; i++) templist[i] = new Test(testlist[i]); // just clones testlist to templist

        for (int x = 0; x < templist.length; x++) // iterates through templist, calculating the class grade with the test at index x removed
        {
            double finalScore = 0;
            double finalTotal = 0;

            for (int y = 0; y < templist.length; y++)
            {
                if (y == x) continue;

                finalScore += templist[y].catk[0]*templist[y].catk[1];
                finalScore += templist[y].cata[0]*templist[y].cata[1];
                finalScore += templist[y].catt[0]*templist[y].catt[1];
                finalScore += templist[y].catu[0]*templist[y].catu[1];
                //////////

                finalTotal += templist[y].catk[1];
                finalTotal += templist[y].catt[1];
                finalTotal += templist[y].catu[1];
                finalTotal += templist[y].cata[1];
            }

            if (finalScore/finalTotal >= newMax) { newMax = finalScore/finalTotal; drop = templist[x]; dropI = x;}
        }

        double dfkjghdfg = 0;
        char dfgdfg = 'L';

        for (char cat : categories)
        {
            if (drop.getGrade(cat) >= dfkjghdfg) { dfkjghdfg = drop.getGrade(cat); dfgdfg = cat; }
        }

        drop.drop(dfgdfg);

        templist[dropI] = drop;

        printScore(templist);
        System.out.println("Test dropped: " + drop.name + ", category dropped: " + dfgdfg);
        printScore(testlist);

    }

}

class Test {
    double[] catk = new double[2];
    double[] catt = new double[2];
    double[] catu = new double[2];
    double[] cata = new double[2];
    double[] blank = new double[] {0, 0};
    String name = "";

    public Test ()
    {
        this.name = "Null";
    }

    public Test (Test that)
    {
        this.catk = that.catk;
        this.cata = that.cata;
        this.catu = that.catu;
        this.catt = that.catt;
        this.name = that.name;
    }

    public Test (double catk, double catkw, double catt, double cattw, double catu, double catuw, double cata, double cataw, String name)
    {
        this.catk = new double[] {catk, catkw};
        this.catt = new double[] {catt, cattw};
        this.catu = new double[] {catu, catuw};
        this.cata = new double[] {cata, cataw};
        this.name = name;
    }

    public double getGrade ()
    {
        double weightedScore = this.catk[0]*this.catk[1]+this.catu[0]*this.catu[1]+this.cata[0]*this.cata[1]+this.catt[0]*this.catt[1];
        double weightedTotal = this.catk[1]+this.catt[1]+this.catu[1]+this.cata[1];
        return (weightedScore)/(weightedTotal);
    }

    public void drop (char cat)
    {
        switch (cat)
        {
            case 'K': catk = blank;
            case 'C': catu = blank;
            case 'A': cata = blank;
            case 'T': catt = blank;
        }
    }

    public double getGrade (char cat)
    {
        double[] know, app, think, com, blank;
        know = this.catk;
        app = this.cata;
        think = this.catt;
        com = this.catu;
        blank = new double[] {0, 0};

        switch (cat)
        {
            case 'A': app = blank;
            case 'K': know = blank;
            case 'T': think = blank;
            case 'C': com = blank; 
        }
        double weightedScore = know[0]*know[1]+com[0]*com[1]+app[0]*app[1]+think[0]*think[1];
        double weightedTotal = know[1]+think[1]+app[1]+com[1];
        return (weightedScore)/(weightedTotal);
    }

    public static double getGrade (Test test)
    {
        double weightedScore = test.catk[0]*test.catk[1]+test.catu[0]*test.catu[1]+test.cata[0]*test.cata[1]+test.catt[0]*test.catt[1];
        double weightedTotal = test.catk[1]+test.catt[1]+test.catu[1]+test.cata[1];
        return (weightedScore)/(weightedTotal);
    }

    public static double getGrade (Test test, char cat)
    {
        double[] know, app, think, com, blank;
        know = test.catk;
        app = test.cata;
        think = test.catt;
        com = test.catu;
        blank = new double[] {0, 0};

        switch (cat)
        {
            case 'A': app = blank;
            case 'K': know = blank;
            case 'T': think = blank;
            case 'C': com = blank; 
        }
        double weightedScore = know[0]*know[1]+com[0]*com[1]+app[0]*app[1]+think[0]*think[1];
        double weightedTotal = know[1]+think[1]+app[1]+com[1];
        return (weightedScore)/(weightedTotal);
    }
}
