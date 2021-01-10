package shalow.whosbday.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import shalow.whosbday.models.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
