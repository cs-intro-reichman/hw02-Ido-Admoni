import java.util.Random;
  
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
        int numFam = Integer.parseInt(args[0]); 
        // init user input of number of iterations/families
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
        // init random generator using the given seed
		
        double totChild = 0; 
        // sums total children of all families for averaging later on
        int[] families = new int[5]; 
        //collects number of families with i number of children (2 children -> families[2]++, etc)

        for(int i=0; i<numFam; i++){ 
        // each loop creates new family by randomises children
    		int boy = 0;
            int girl = 0;
            
            while(boy == 0 || girl ==0){ 
            // produces children until at least 1 of each gender
                double rnd = generator.nextDouble();
                if(rnd >= 0.5){
                    girl++;
                }
                else {
                    boy++;
                }
            }

            int children = boy + girl;
            totChild += children;
            // add +1 to family size counter (families[])
            if(children >= 4){
                families[4]++;
            }
            else if(children == 3){
                families[3]++;
            }
            else {
                families[2]++;
            }
            /*System.out.println(i);
            System.out.println(totChild);
            */
        }

        int maxChild = -1; 
        // init maximum number of children per family
        int maxFam = -1; 
        // init biggest group by children number
        
        for(int j=2; j<families.length; j++){ 
        //checks which children amount has most families (max(families))
            if(families[j] > maxChild){
                maxFam = j;
                maxChild = families[j];
            }
        }

        String printEnding = ""; 
        // handles the requirement for "4 or more" printing
        if(maxFam == 4){
            printEnding +=  " or more.";
        }
        else printEnding += ".";
        System.out.println("Average: " + totChild / numFam + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + families[2]);
        System.out.println("Number of families with 3 children: " + families[3]);
        System.out.println("Number of families with 4 or more children: " + families[4]);
        System.out.println("The most common number of children is " + maxFam + printEnding);    
	}
}