package shalow.whosbday.repositories;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import shalow.whosbday.models.Contact;

import java.util.List;

public interface ContactRepository extends CrudRepository<Contact, Long> {
//    List<Contact> findAllContacts();
//
//    Contact findContactById(int contactId);

}
