/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int sum = 0;
        String why = "";

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
                if (why.isEmpty()) {
                    why = why + i;
                } else {
                    why = why + " + " + i;
                }
            }
        }

        if (sum == num) {
            System.out.println(num + " is a perfect number since " + num + " = " + why);
        } else {
            System.out.println(num + " is not a perfect number");
        }
    }
}

	
	

