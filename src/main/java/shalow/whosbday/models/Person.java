package shalow.whosbday.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity(name = "persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnoreProperties({"hibernateLazyIntitializer", "handler"})
    private Long person_id;
    private String first_name;
    private String last_name;
    private LocalDate birthday;

    @OneToMany(mappedBy = "person_id") //@OneToMany(mappedBy = "persons")
    private List<PhoneNumber> phoneNumbers;

    public Person(){
    }

    public Long getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Long person_id) {
        this.person_id = person_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public List<PhoneNumber> getPhoneNumbers() {

        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public int HashCode(){
        return Objects.hash(person_id, first_name, last_name, birthday);
    }

    //TODO Write these
    public boolean equals(Person otherPerson){
        return true;
    }

    public String toString(){
        return this.toString();
    }

}
