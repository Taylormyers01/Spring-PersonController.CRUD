package io.zipcoder.Controller;

import io.zipcoder.Model.Person;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    /**
     * Person createPerson(Person p), Person getPerson(int id), List<Person> getPersonList(),
     * Person updatePerson(Person p), and void DeletePerson(int id) methods,
     * and let it track a list of Person objects.
     */

    private List<Person> people;

    @PostMapping("/people")
    public Person createPerson(Person p){
        return null;
    }

    @GetMapping("/people/{id}")
    public Person getPerson(@PathVariable Integer id){
        return null;
    }

    @GetMapping("/people")
    public List<Person> getPersonList(){
        return null;
    }

    @PutMapping("/people/{id}")
    public Person updatePerson(Person p, @PathVariable Integer id){
        return null;
    }
    @DeleteMapping("/people/{id}")
    public void deletePerson(@PathVariable Integer id){

    }

}
