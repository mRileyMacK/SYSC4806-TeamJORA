package Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class ItemList {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id = null;
    private String name = null;

    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Item> items;

    public ItemList(){}

    public ItemList(String name, Collection<Item> items){
        this.name = name;
        this.items = items;
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
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }
}
