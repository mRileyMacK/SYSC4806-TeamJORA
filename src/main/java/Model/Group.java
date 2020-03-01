package Model;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
public class Group {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id = null;
    private String name = null;

    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Student> students;

    public Group(String name, Collection<Student> students){
        this.name = name;
        this.students = students;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Collection<Student> getStudents(){
        return this.students;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public void removeStudent(Student student){
        this.students.remove(student);
    }

}
