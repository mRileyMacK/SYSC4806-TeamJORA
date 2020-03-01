package Model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Student extends Person {

    @ManyToOne
    private Group group;

    public Student() {}

    public Student(String name) {
        super(name, "student");
    }

    public Group getGroup(){
        return this.group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student [id=" + super.getId() + ", name=" + super.getName() + ", group=" + group + "]";
    }
}
