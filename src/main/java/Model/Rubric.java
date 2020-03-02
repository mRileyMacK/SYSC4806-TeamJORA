package Model;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;


@Entity
public class Rubric {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id = null;

    @OneToOne(cascade = CascadeType.ALL)
    private Item item = null;

    @OneToMany(cascade = CascadeType.ALL)
    private HashSet<RubricValue> rubricValues;

    public Rubric(){
        this.rubricValues = new HashSet<RubricValue>();
    }

    public Rubric(Item item) {
        this.item = item;
        item.setRubric(this);
        this.rubricValues = new HashSet<RubricValue>();
    }

    public Rubric(Item item, HashSet<RubricValue> rubricValues) {
        this.item = item;
        this.rubricValues = rubricValues;
    }

    public Item getItem(){
        return this.item;
    }

    public void setItem(Item item){
        this.item = item;
    }

    public void addRubricValue(RubricValue rubricValue) {
        this.rubricValues.add(rubricValue);
    }

    public void removeRubricValue(RubricValue rubricValue) {
        this.rubricValues.remove(rubricValue);
    }

    public int getSize(){
        return this.rubricValues.size();
    }
}
