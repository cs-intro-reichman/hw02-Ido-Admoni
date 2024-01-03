/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
 
public class OneOfEachStats1 {
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        int totalChildren = 0; 
        int experiments = T;   

        for (int i = 0; i < T; i++) {
            int count = 0;
            boolean Boy = false;
            boolean Girl = false;

            while (!(Boy && Girl)) {
                boolean isChildBoy = Math.random() < 0.5;
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
        }

        double average = (double) totalChildren / (double) experiments; 

        double twoChildren = 0;
        double threeChildren = 0;
        double fourOrMoreChildren = 0;
        double mostCommon = 0;

        for (int i = 0; i < T; i++) {
            int count = 0;
            boolean Boy = false;
            boolean Girl = false;

            while (!(Boy && Girl)) {
                boolean isChildBoy = Math.random() < 0.5;
                if (isChildBoy) {
                    Boy = true;
                } else {
                    Girl = true;
                }
                count = count + 1;
            }
			
            if (count == 2) {
                twoChildren++;
            } else if (count == 3) {
                threeChildren++;
            } else {
                fourOrMoreChildren++;
            }
        }

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

