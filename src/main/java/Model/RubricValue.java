package Model;

import javax.persistence.*;

@Entity
public class RubricValue {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id = null;
    private Integer value = null;
    private String description = null;

    @OneToMany
    private Rubric rubric = null;

    public RubricValue(){}

    public RubricValue(Integer value, String description, Rubric rubric) {
        this.value = value;
        this.description = description;
        this.rubric = rubric;
    }

    private Integer getValue(){
        return this.value;
    }

    private void setValue(Integer value) {
        this.value = value;
    }

    private String getDescription(){
        return this.description;
    }

    private void setDescription(String description){
        this.description = description;
    }

    private Rubric getRubric(){
        return this.rubric;
    }
}
