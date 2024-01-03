/**
 *    
 */
public class InOrder {
	public static void main (String[] args) {
		int firstNum = (int) (Math.random()*10) ; 
		System.out.print(firstNum + " ");
		boolean run = true;
		do {
			int nextNum = (int) (Math.random()* 10);
			if (nextNum >= firstNum){
				System.out.print(nextNum + " ");
				firstNum = nextNum;}
			else 
				run = false;
		} while (run);
			System.out.println();
		
}
}

