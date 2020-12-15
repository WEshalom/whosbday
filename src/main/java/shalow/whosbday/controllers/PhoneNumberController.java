package shalow.whosbday.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shalow.whosbday.models.Person;
import shalow.whosbday.models.PhoneNumber;
import shalow.whosbday.repositories.PhoneNumberRepo;

import java.util.List;

@RestController
@RequestMapping("/api/v1/phonenumbers")
public class PhoneNumberController {
        @Autowired
        private PhoneNumberRepo phoneNumberRepo;

        @GetMapping
        public List<PhoneNumber> list(){
            return phoneNumberRepo.findAll();
        }

        //GET
        @GetMapping
        @RequestMapping("{id}")
        public PhoneNumber get(@PathVariable Long id){
            return phoneNumberRepo.getOne(id);
        }

        //POST
        @PostMapping
        //TODO Validation
        public PhoneNumber create(@RequestBody final PhoneNumber person){
            return phoneNumberRepo.saveAndFlush(person);
        }

        //PUT
        @RequestMapping(value = "{id}", method = RequestMethod.PUT)
        public PhoneNumber update(@PathVariable Long id, @RequestBody PhoneNumber phoneNumber){
            //TODO Validation
            PhoneNumber existingPhoneNumber = phoneNumberRepo.getOne(id);
            BeanUtils.copyProperties(phoneNumber, existingPhoneNumber, "person_id");
            return phoneNumberRepo.saveAndFlush(phoneNumber);
        }

        //DELETE
        @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
        public void delete(@PathVariable Long id){
            //TODO need to check for children records before deleting
            phoneNumberRepo.deleteById(id);
        }
}
