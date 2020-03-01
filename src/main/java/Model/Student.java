package Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Student extends Person {

    public Student() {}

    public Student(String name) {
        super(name, "student");
    }

    @Override
    public String toString() {
        return "Student [id=" + super.getId() + ", name=" + super.getName() + "]";
    }
}
