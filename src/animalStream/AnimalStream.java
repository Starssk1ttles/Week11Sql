package animalStream;

import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnimalStream {

	public static void main(String[] args) throws IOException {
		Stream<String> streamOfString = Stream.of("Cat", "Dog", "Lizard", "Fish", "Monkey");

		streamOfString = Stream.of("Meow","Woof","Hiss","Bloop","Monke");
		String listOfStream = streamOfString.collect(Collectors.joining(", "));
		System.out.println("The animals sounds like this : " + listOfStream);
		

	}

}
