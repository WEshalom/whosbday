package shalow.whosbday.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity(name = "birthdays")
public class Birthday{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String first_name;
    private String last_name;
    private LocalDate birthday;
    //although in db it's varchar
    private int age;

    @ManyToMany(mappedBy = "birthdays")
    private List<Contact> remindContacts;

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

    public List<Contact> getRemindContacts() {
        return remindContacts;
    }

    public void setRemindContacts(List<Contact> remindContacts) {
        this.remindContacts = remindContacts;
    }

}
