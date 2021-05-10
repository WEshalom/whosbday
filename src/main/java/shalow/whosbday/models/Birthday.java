package shalow.whosbday.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity(name = "birthdays")
public class Birthday{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long birthdayId;

    private String firstName;
    private String lastName;
    private LocalDate birthday;
    //although in db it's varchar
    private int age;

    @ManyToMany(mappedBy = "bdaysToRemindOn")
    private List<Contact> contactsToRemind;

    public Birthday(){
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String first_name) {
        this.firstName = first_name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String last_name) {
        this.lastName = last_name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Contact> getContactsToRemind() {
        return contactsToRemind;
    }

    public void setContactsToRemind(List<Contact> remindContacts) {
        this.contactsToRemind = remindContacts;
    }

}
