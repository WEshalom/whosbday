package shalow.whosbday.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity(name = "contacts")
public class Contact{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contactId;

    private String firstName;
    private String lastName;
    private String homePhone;
    private String cellPhone;
    private String email;
    private LocalDate birthday;
    private String address;

    @ManyToMany
    @JoinTable(
            name = "reminders",
            joinColumns = @JoinColumn (name = "contact_id"),
            inverseJoinColumns = @JoinColumn (name = "birthday_id")
        )
    private List<Birthday> bdaysToRemindOn;


    public Contact(){
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Birthday> getBdaysToRemindOn() {
        return bdaysToRemindOn;
    }

    public void setBdaysToRemindOn(List<Birthday> remindOnBirthdaysList) {
        this.bdaysToRemindOn = remindOnBirthdaysList;
    }
}
