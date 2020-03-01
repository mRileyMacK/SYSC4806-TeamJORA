package Model;

import javax.persistence.*;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id = null;
    private String name = null;
    private String description = null;

    @ManyToOne
    private ItemList itemList = null;

    @OneToOne
    private Rubric rubric = null;

    public Item() {}

    public Item(String name, String description, ItemList itemList) {
        this.name = name;
        this.description = description;
        this.itemList = itemList;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public ItemList getItemList(){
        return this.itemList;
    }

    public void setItemList(ItemList itemList){
        this.itemList = itemList;
    }
}
