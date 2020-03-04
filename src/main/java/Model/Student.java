package Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Student extends Person {

    private Integer studentNumber = null;
    private Boolean inGroup = false;
    private Group group;
    public Student() {}
    public Student(String name, Integer studentNumber) {
        super(name, "student");
        this.studentNumber = studentNumber;
    }

    public Student(String name, Integer studentNumber, Group group){
        this(name, studentNumber);
        this.group = group;
        setInGroup();
    }

    public Integer getStudentNumber(){
        return this.studentNumber;
    }

    public void setStudentNumber(Integer studentNumber){
        this.studentNumber = studentNumber;
    }

    public void addToGroup(Group group){
        this.group = group;
        group.addStudent(this);
    }

    public Boolean isInGroup(){
        return this.inGroup;
    }

    public void setInGroup(){
        this.inGroup = true;
    }

    public void clearInGroup(){this.inGroup = false;}
}
