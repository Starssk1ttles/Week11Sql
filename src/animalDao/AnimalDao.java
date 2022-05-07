package animalDao;

import java.util.ArrayList;
import java.util.List;

import animal.model.Animals;

public class AnimalDao {
	List<Animals> animals = new ArrayList<>(List.of(
	new Animals("Dog"),
	new Animals("Cat"),
	new Animals("Lizard"),
	new Animals("Fish"),
	new Animals("Monkey")));
	
	public List<Animals> getAnimal() {
		return animals;
	}
}
