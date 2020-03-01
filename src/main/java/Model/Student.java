package Model;

import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    @ManyToMany
    private List<Classroom> classrooms = new ArrayList<Classroom>();

    public Student(String name) {
        super(name);
    }

    public void addClassroom(Classroom classroom) {
        this.classrooms.add(classroom);
    }

    public void removeClassroom(Classroom classroom) {
        this.classrooms.remove(classroom);
    }

    @Override
    public String toString() {
        return "Student [id=" + super.getId() + ", name=" + super.getName() + ", classrooms=" + classrooms + "]";
    }
}
