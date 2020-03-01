package Model;

import javax.persistence.*;

@Entity
public class RubricValue {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id = null;
    private Integer value = null;
    private String description = null;

    public RubricValue(){}

    public RubricValue(Integer value, String description) {
        this.value = value;
        this.description = description;
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
    
}
