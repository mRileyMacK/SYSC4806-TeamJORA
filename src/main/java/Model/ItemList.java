package Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ItemList {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id = null;
    private String name = null;

    @OneToMany
    private List<Item> items = new ArrayList<Item>();

    public ItemList(){}

    public ItemList(String name){
        this.name = name;
    }

    public Integer getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void addItem(Item item){
        items.add(item);
    }
}
