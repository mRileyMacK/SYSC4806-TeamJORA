package Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Group {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id = null;
    private String name = null;

    @ManyToOne
    private List<Student> students = new ArrayList<Student>();

    public Group(String name){
        this.name = name;
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

    public List<Student> getStudents(){
        return this.students;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public void removeStudent(Student student){
        this.students.remove(student);
    }

}
