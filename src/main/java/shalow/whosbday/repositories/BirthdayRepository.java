package shalow.whosbday.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import shalow.whosbday.models.Birthday;

public interface BirthdayRepository extends JpaRepository<Birthday, Long> {

}
