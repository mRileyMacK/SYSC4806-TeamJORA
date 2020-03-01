package Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Rubric {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id = null;

    @OneToOne
    private Item item = null;

    @OneToMany
    private List<RubricValue> rubricValues = new ArrayList<RubricValue>();

    public Rubric(){}

    public Rubric(Item item) {
        this.item = item;
    }

    private void addRubricValue(RubricValue rubricValue) {
        this.rubricValues.add(rubricValue);
    }
}
