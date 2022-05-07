package animal.service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import animal.AnimalType;
import animal.model.Animals;
import animalDao.AnimalDao;

public class AnimalService {
private static AnimalDao animalDao = new AnimalDao();

public List<Animals> getAnimal(AnimalType type) {
	List<Animals> animals = animalDao.getAnimal();
	Comparator<Animals> comp = null;
	
	switch(type) {
	case ANONYMOUS_INNER_CLASS:
		comp = new Comparator<Animals>() {

			@Override
			public int compare(Animals p1, Animals p2) {
			return	Animals.compareAnimals(p1, p2);
			}
			
		};
		break;
		
		
	case LAMBDA:
		comp = (p1, p2) -> Animals.compareAnimals(p1, p2);
			
		break;
		
		
	case METHOD_REFERENCE:
		comp = Animals ::compareAnimals;
		break;
		
		
	case NORMAL_CLASS:
		comp = new AnimalSort();
		break;
		
		
	default:
	throw new RuntimeException("Not a Animal Type" + type);
	
	}
	
	animals.sort(comp);
	return animals;
	
	
}

static class AnimalSort implements Comparator<Animals> {

	@Override
	public int compare(Animals p1, Animals p2) {
		// TODO Auto-generated method stub
		return Animals.compareAnimals(p1, p2);
	}	
	}

}




	
