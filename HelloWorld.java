import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Let's play a game!");

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	
		try {
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			System.out.println("your int: " + i);
		} catch (Exception e) {
			System.out.println(e);
		}

		for (String arg:args) {
			System.out.println(arg + " Again!");
		}

	}
}

