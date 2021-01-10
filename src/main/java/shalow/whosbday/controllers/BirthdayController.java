package shalow.whosbday.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shalow.whosbday.models.Birthday;
import shalow.whosbday.models.Contact;
import shalow.whosbday.repositories.BirthdayRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1/birthdays")
public class BirthdayController {
    @Autowired
    private BirthdayRepository birthdayRepository;

    @GetMapping
    public List<Birthday> list(){
        return birthdayRepository.findAll();
    }

    //GET
    @GetMapping
    @RequestMapping("{id}")
    public Birthday read(@PathVariable Long id){
        return birthdayRepository.getOne(id);
    }

    //POST
    @PostMapping
    //TODO Validation
    public Birthday create(@RequestBody final Birthday birthday){
        return birthdayRepository.saveAndFlush(birthday);
    }

    //PUT
    //TODO Patch
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Birthday update(@PathVariable Long id, @RequestBody Birthday birthday){
        Birthday existingBirthday = birthdayRepository.getOne(id);
        BeanUtils.copyProperties(birthday, existingBirthday, "contact_id");
        return birthdayRepository.saveAndFlush(existingBirthday);
    }

    //DELETE
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        //TODO check for children
        birthdayRepository.deleteById(id);
    }

}
