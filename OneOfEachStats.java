import java.util.Random;

public class OneOfEachStats {
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        int seed = Integer.parseInt(args[1]);
        Random generator = new Random(seed);

        int totalChildren = 0;
        int experiments = 0; 

        double twoChildren = 0;
        double threeChildren = 0;
        double fourOrMoreChildren = 0;
        double mostCommon = 0;

        for (int i = 0; i < T; i++) {
            int count = 0;
            boolean Boy = false;
            boolean Girl = false;

            while (!(Boy && Girl)) {
                boolean isChildBoy = generator.nextDouble() < 0.5;
                if (isChildBoy) {
                    Boy = true;
                    System.out.print("b ");
                } else {
                    Girl = true;
                    System.out.print("g ");
                }
                count = count + 1;
            }
            System.out.println();
            totalChildren += count;

            if (Boy && Girl) { 
                experiments++;
                if (count == 2) {
                    twoChildren++;
                } else if (count == 3) {
                    threeChildren++;
                } else {
                    fourOrMoreChildren++;
                }
            }
        }

        double average = (double) totalChildren / (double) experiments;

        if (twoChildren > threeChildren && twoChildren > fourOrMoreChildren) {
            mostCommon = 2;
        } else if (threeChildren > twoChildren && threeChildren > fourOrMoreChildren) {
            mostCommon = 3;
        } else {
            mostCommon = 4;
        }

        System.out.println("Average: " + average + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + twoChildren);
        System.out.println("Number of families with 3 children: " + threeChildren);
        System.out.println("Number of families with 4 or more children: " + fourOrMoreChildren);
        System.out.println("The most common number of children is " + mostCommon);
    }
}