package Model;

import javax.persistence.*;
import java.util.HashSet;

@Entity
public class PersonList {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id = null;
    private String name = null;

    @OneToMany(cascade = CascadeType.ALL)
    private HashSet<Person> personList;

    public PersonList(){
        this.personList = new HashSet<Person>();
    }

    public PersonList(String name, HashSet<Person> personList){
        this.name = name;
        this.personList = personList;
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

    public HashSet<Person> getPersonList(){
        return this.personList;
    }

    public void setPersonList(HashSet<Person> personList){
        this.personList = personList;
    }

    public void addPerson(Person person){
        this.personList.add(person);
    }

    public void removePerson(Person person){
        this.personList.remove(person);
    }

    public int getSize(){
        return this.personList.size();
    }
}
