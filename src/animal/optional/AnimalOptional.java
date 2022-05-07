package animal.optional;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class AnimalOptional {
private Scanner scanner = new Scanner(System.in);
private AnimalOPService service = new AnimalOPService();
	public static void main(String[] args) {
		new AnimalOptional().run();
	}

	private void run() {
boolean done = false;
while(!done) {
	System.out.print("Enter Optional : ");
	String search = scanner.nextLine();
	
	if(search.isEmpty()) {
		done = true;
	}
	else {
		try {
		String found = service.find(search);
		System.out.println("I found " + found + ".");
		
	}
		catch(NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
	}
}
	}
}

	



