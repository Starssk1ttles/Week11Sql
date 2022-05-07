package animalsort;

import java.util.List;

import animal.AnimalType;
import animal.model.Animals;
import animal.service.AnimalService;

public class AnimalSort {
private AnimalService animalService = new AnimalService();
	


public static void main(String[] args) {
		new AnimalSort().run();
	}



private void run() {
List<Animals> animal = animalService.getAnimal(AnimalType.METHOD_REFERENCE);
	print(animal,AnimalType.METHOD_REFERENCE);
}



private void print(List<Animals> animal, AnimalType type) {
	switch(type) {
			
	case LAMBDA:
		animal.forEach(animals -> System.out.println(animals.getAnimal()));
		break;
		
		
	case METHOD_REFERENCE:
		animal.forEach(System.out::println);
		break;
		
	case ANONYMOUS_INNER_CLASS:	
	case NORMAL_CLASS:
		for(Animals animals : animal) {
			System.out.println(animals.getAnimal());
		}
		break;
		
		
	default:
		break;
	
	}
	
}
	

}
