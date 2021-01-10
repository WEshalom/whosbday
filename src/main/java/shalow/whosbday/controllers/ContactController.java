package shalow.whosbday.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shalow.whosbday.models.Contact;
import shalow.whosbday.repositories.ContactRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1/contacts")
public class ContactController {
    @Autowired
    private ContactRepository contactRepository;

    @GetMapping
    public List<Contact> list(){
        return contactRepository.findAll();
    }

    //GET
    @GetMapping
    @RequestMapping("{id}")
    public Contact read(@PathVariable Long id){
        return contactRepository.getOne(id);
    }

    //POST
    @PostMapping
    //TODO Validation
    public Contact create(@RequestBody final Contact contact){
        return contactRepository.saveAndFlush(contact);
    }

    //PUT
    //TODO Patch
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Contact update(@PathVariable Long id, @RequestBody Contact contact){
        Contact existingContact = contactRepository.getOne(id);
        BeanUtils.copyProperties(contact, existingContact, "contact_id");
        return contactRepository.saveAndFlush(existingContact);
    }

    //DELETE
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        //TODO check for children
        contactRepository.deleteById(id);
    }

}
