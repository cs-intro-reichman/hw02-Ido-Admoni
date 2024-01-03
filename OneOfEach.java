


/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int count = 0;
		boolean Boy = false;
		boolean Girl = false;
		while (!(Boy && Girl)) {
			boolean isChildBoy = Math.random() < 0.5; 
			if (isChildBoy){
				Boy = true;
				System.out.print("b ");
			} else {
				Girl = true;
				System.out.print("g ");
			}
			count = count+1;
	}
		System.out.println();
			System.out.println("You made it... and now you have " + count + " children");

}
}
