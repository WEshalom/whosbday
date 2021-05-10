package shalow.whosbday.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import shalow.whosbday.models.Birthday;
import shalow.whosbday.models.Contact;

public interface BirthdayRepository extends JpaRepository<Birthday, Long> {
}
