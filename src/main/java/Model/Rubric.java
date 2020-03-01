package Model;

import javax.persistence.*;
import java.util.Collection;


@Entity
public class Rubric {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id = null;

    @OneToOne(cascade = CascadeType.ALL)
    private Item item = null;

    @OneToMany(cascade = CascadeType.ALL)
    private Collection<RubricValue> rubricValues;

    public Rubric(){}

    public Rubric(Item item, Collection<RubricValue> rubricValues) {
        this.item = item;
        this.rubricValues = rubricValues;
    }

    public void addRubricValue(RubricValue rubricValue) {
        this.rubricValues.add(rubricValue);
    }

    public void removeRubricValue(RubricValue rubricValue) {
        this.rubricValues.remove(rubricValue);
    }
}
