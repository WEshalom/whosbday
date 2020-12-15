package shalow.whosbday.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import shalow.whosbday.models.Person;
import shalow.whosbday.repositories.PersonRepo;

import java.util.List;

@RestController
@RequestMapping("/api/v1/persons")
public class PersonController {
    @Autowired
    private PersonRepo personRepo;

    @GetMapping
    public List<Person> list(){
        return personRepo.findAll();
    }

    //GET
    @GetMapping
    @RequestMapping("{id}")
    public Person read(@PathVariable Long id){
        return personRepo.getOne(id);
    }

    //POST
    @PostMapping
    //TODO Appropriate response
    //TODO Validation
    public Person create(@RequestBody final Person person){
        return personRepo.saveAndFlush(person);
    }

    //PUT
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Person update(@PathVariable Long id, @RequestBody Person person){
        //TODO not a PATCH
        //TODO Validation
        Person existingPerson = personRepo.getOne(id);
        BeanUtils.copyProperties(person, existingPerson, "person_id");
        return personRepo.saveAndFlush(existingPerson);
    }

    //DELETE
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        //TODO need to check for children records before deleting
        personRepo.deleteById(id);
    }



}
