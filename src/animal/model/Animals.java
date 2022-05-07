package animal.model;

public class Animals {
private String animals;

public Animals(String animalname) {
	this.animals = animalname;
}

public Animals(Animals animals2) {
return;
}

@Override
public String toString() {
	return animals;
}

public String getAnimal() {
	return animals;
}

public static int compareAnimals(Animals p1, Animals p2) {
	return p1.animals.compareTo(p2.animals);
}


}
