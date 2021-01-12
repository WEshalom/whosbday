package shalow.whosbday.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity(name = "birthdays")
public class Birthday{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long birthday_id;

    private String first_name;
    private String last_name;
    private LocalDate birthday;
    //although in db it's varchar
    private int age;

    @ManyToMany(mappedBy = "bdaysToRemindOn")
    private List<Contact> contactsToRemind;

    public Birthday(){
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
