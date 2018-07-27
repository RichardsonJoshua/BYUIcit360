import java.util.Scanner;

public class APCExample {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Select one of the pro hockey players to learn about them.");
		ApplicationController app = new ApplicationController();
		app.dispatchRequest(input.next());
	}
}
