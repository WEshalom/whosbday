package shalow.whosbday.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import shalow.whosbday.models.PhoneNumber;

public interface PhoneNumberRepo extends JpaRepository<PhoneNumber, Long> {
}
