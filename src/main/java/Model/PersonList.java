package Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class PersonList {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id = null;
    private String name = null;

    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Person> people;

    public PersonList(){}

    public PersonList(String name, Collection<Person> people){
        this.name = name;
        this.people = people;
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

    public void addPerson(Person person){
        this.people.add(person);
    }

    public void removePerson(Person person){
        this.people.remove(person);
    }
}
