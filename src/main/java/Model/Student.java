package Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Student extends Person {

    private Integer studentId = null;
    private Boolean inGroup = false;

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

    public Boolean isInGroup(){
        return this.inGroup;
    }

    public void setInGroup(Boolean inGroup){
        this.inGroup = inGroup;
    }
}
