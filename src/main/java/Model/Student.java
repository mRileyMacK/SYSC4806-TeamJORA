package Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Student extends Person {

    private Integer studentId = null;

    public Student() {}
    public Student(String name, Integer studentId) {
        super(name, "student");
        this.studentId = studentId;
    }

    public Integer getStudentId(){
        return this.studentId;
    }

    public void setStudentId(Integer studentId){
        this.studentId = studentId;
    }
}
