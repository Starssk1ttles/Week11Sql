package animal.optional.dao;

import java.util.Optional;

public class OptionalDao {
public  Optional<String> find(String search) {
	if("Animal".equals(search)) {
		return Optional.empty();	}
	return Optional.of(search);
}
	
}
