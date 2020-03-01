package Model;

import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

public class Instructor extends Person {

    @OneToMany
    private List<Classroom> classrooms = new ArrayList<Classroom>();

    public Instructor(String name) {
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
        return "Instructor [id=" + super.getId() + ", name=" + super.getName() + ", classrooms=" + classrooms + "]";
    }
}
