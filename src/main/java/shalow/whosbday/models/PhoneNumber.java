package shalow.whosbday.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity(name = "phonenumbers")
public class PhoneNumber {
    @Id
    @JsonIgnoreProperties({"hibernateLazyIntitializer", "handler"})
    private Long person_id;
    private String phone_type;
    private String phone_number;

    @ManyToOne(targetEntity = Person.class, fetch = FetchType.LAZY)
    @JoinTable(name = "persons")
    private Person person;

    public PhoneNumber(){
    }

    public Long getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Long person_id) {
        this.person_id = person_id;
    }

    public String getPhone_type() {
        return phone_type;
    }

    public void setPhone_type(String phone_type) {
        this.phone_type = phone_type;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Person getPersons() {
        return person;
    }

    public void setPersons(Person person) {
        this.person = person;
    }
}
