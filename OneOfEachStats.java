import java.util.Random;

public class OneOfEachStats {
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        int seed = Integer.parseInt(args[1]);
        Random generator = new Random(seed);

        int totalChildren = 0;
        int twoChildren = 0;  
        int threeChildren = 0; 
        int fourOrMoreChildren = 0;

        for (int i = 0; i < T; i++) {
            int count = 0;
            boolean boy = false;
            boolean girl = false;

            while (!(boy && girl)) {
                boolean isChildBoy = generator.nextDouble() < 0.5;
                if (isChildBoy) {
                    boy = true;
                    System.out.print("b ");
                } else {
                    girl = true;
                    System.out.print("g ");
                }
                count = count + 1;
            }
            System.out.println();
            totalChildren += count;

            if (boy && girl) {
                if (count == 2) {
                    twoChildren++;
                } else if (count == 3) {
                    threeChildren++;
                } else {
                    fourOrMoreChildren++;
                }
            }
        }

        double average = (double) totalChildren / T;
        int mostCommon = 2;
        if (threeChildren > twoChildren) {
            mostCommon = 3;
        } else if (fourOrMoreChildren > twoChildren && fourOrMoreChildren > threeChildren) {
            mostCommon = 4;
        }

        System.out.println("Average: " + average + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + twoChildren);
        System.out.println("Number of families with 3 children: " + threeChildren);
        System.out.println("Number of families with 4 or more children: " + fourOrMoreChildren);
        System.out.println("The most common number of children is " + mostCommon);
    }
}