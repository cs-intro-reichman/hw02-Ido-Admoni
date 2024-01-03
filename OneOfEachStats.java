import java.util.Random;

public class OneOfEachStats {
    public static void main(String[] args) {
        int numFam = Integer.parseInt(args[0]);
        int seed = Integer.parseInt(args[1]);
        Random generator = new Random(seed);

        double totChild = 0;
        int[] families = new int[5];

        for (int i = 0; i < numFam; i++) {
            int boy = 0;
            int girl = 0;

            while (boy == 0 || girl == 0) {
                double rnd = generator.nextDouble();
                if (rnd >= 0.5) {
                    girl++;
                } else {
                    boy++;
                }
            }

            int children = boy + girl;
            totChild += children;

            if (children >= 4) {
                families[4]++;
            } else if (children == 3) {
                families[3]++;
            } else {
                families[2]++;
            }
        }

        int maxChild = -1;
        int maxFam = -1;

        for (int j = 2; j < families.length; j++) {
            if (families[j] > maxChild) {
                maxFam = j;
                maxChild = families[j];
            }
        }

        String printEnding = "";
        if (maxFam == 4) {
            printEnding += " or more.";
        } else {
            printEnding += ".";
        }

        System.out.println("Average: " + totChild / numFam + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + families[2]);
        System.out.println("Number of families with 3 children: " + families[3]);
        System.out.println("Number of families with 4 or more children: " + families[4]);
        System.out.println("The most common number of children is " + maxFam + printEnding);
    }
}
