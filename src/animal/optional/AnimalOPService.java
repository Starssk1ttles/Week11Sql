package animal.optional;

import java.util.NoSuchElementException;

import animal.optional.dao.OptionalDao;

public class AnimalOPService {
	private OptionalDao dao = new OptionalDao();

	public String find(String search) {

		return dao.find(search).orElseThrow(() -> new NoSuchElementException("The keyword " + search  + " is not found"));
		
	}

}
