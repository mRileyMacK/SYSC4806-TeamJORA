package Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Student extends Person {

    private Integer studentNumber = null;
    private Boolean inGroup = false;

    public Student() {}
    public Student(String name, Integer studentId) {
        super(name, "student");
        this.studentNumber = studentId;
    }

    public Integer getStudentNumber(){
        return this.studentNumber;
    }

    public void setStudentNumber(Integer studentId){
        this.studentNumber = studentId;
    }

    public Boolean isInGroup(){
        return this.inGroup;
    }

    public void setInGroup(Boolean inGroup){
        this.inGroup = inGroup;
    }
}
