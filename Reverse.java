/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
	String str = args [0];
	String result = ""; 
	char ch;
	char mid;
	for (int i = 0; i < str.length(); i++){
		ch = str.charAt(i);
		result = ch + result;
	}
	System.out.println(result);

	if (str.length() %2 == 0){
		mid = str.charAt((str.length() / 2) - 1); }
	else {
		mid = str.charAt(str.length()/2); }
		
	System.out.println("The middle character is " + mid);
}
}

