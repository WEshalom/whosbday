package shalow.whosbday.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity(name = "contacts")
public class Contact{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contact_id;

    private String first_name;
    private String last_name;
    private String home_phone;
    private String cell_phone;
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

    public String getHome_phone() {
        return home_phone;
    }

    public void setHome_phone(String home_phone) {
        this.home_phone = home_phone;
    }

    public String getCell_phone() {
        return cell_phone;
    }

    public void setCell_phone(String cell_phone) {
        this.cell_phone = cell_phone;
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
