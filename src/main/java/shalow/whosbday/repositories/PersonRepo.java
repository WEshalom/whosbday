package shalow.whosbday.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import shalow.whosbday.models.Person;

public interface PersonRepo extends JpaRepository<Person, Long> {
}
