package shalow.whosbday.services;

import org.springframework.beans.factory.annotation.Autowired;
import shalow.whosbday.models.Contact;
import shalow.whosbday.repositories.ContactRepository;

import javax.persistence.EntityManager;
import java.util.*;

//make non-abstract to implement all repository methods
public abstract class ContactService implements ContactRepository{
    @Autowired
    ContactRepository contactRepository;

    public List<Contact> findAllContacts() {
        ArrayList<Contact> contactList = new ArrayList<Contact>();
        Iterable iterable = contactRepository.findAll();
        iterable.forEach(contactList::add(Contact c));
        return contactList;
    }

    public Contact findContactById(Long contactId) {
        return contactRepository.findById(contactId);
    }

//    public Optional<Movie> findById(Integer id) {
//        Movie movie = entityManager.find(Movie.class, id);
//        return movie != null ? Optional.of(movie) : Optional.empty();
//    }
//
//    public List<Movie> findAll() {
//        return entityManager.createQuery("from Movie").getResultList();
//    }

}
