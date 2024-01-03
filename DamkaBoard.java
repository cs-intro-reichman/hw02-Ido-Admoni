/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int num = Integer. parseInt(args[0]);
		for (int i = 0 ; i < num ; i++){
			if (i %2 == 0) {   // if the row is even -> starts with "* "
				for (int j = 0 ; j < num ; j++){
					System.out.print("* ");
				}
			}				
			else { 
				for (int j = 0; j < num; j++ ) { // if the row is odd -> starts with " *"
					System.out.print(" *");
					} 	
			}
			System.out.println();
				}
				
			}
		}
