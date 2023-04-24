/******************************************************************************
 *  Compilation:  javac HelloGoodbye.java
 *  Execution:    java HelloGoodbye
 *
 *  Takes two names as command-line arguments and prints hello and goodbye messages as shown below (with the names for the hello message in the same order
 *  as the command-line arguments and with the names for the goodbye message in reverse order)
 *
 *  % java HelloGoodBye Kevin Bob
 *  Hello Kevin and Bob.
 *  Goodbye Bob and Kevin.
 *
 ******************************************************************************/

public class HelloGoodbye {
	public static void main(String[] args) {
		if (!(
			args[0] == null || args[0].isEmpty() || args[1] == null || args[1].isEmpty()
		)) {
			System.out.println(String.format("Hello %s and %s.", args[0], args[1]));
			System.out.println(String.format("Goodbye %s and %s.", args[1], args[0]));
		}
	}
}
