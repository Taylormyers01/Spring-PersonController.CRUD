package io.zipcoder.Controller;

import io.zipcoder.Model.Person;
import io.zipcoder.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    PersonService personService;

    @PostMapping("/people")
    public Person createPerson(Person p){
        return personService.createPerson(p);
    }

    @GetMapping("/people/{id}")
    public Person getPerson(@PathVariable Integer id){
        return personService.getPerson(id);
    }

    @GetMapping("/people")
    public List<Person> getPersonList(){
        return personService.getPersonList();
    }

    @PutMapping("/people/{id}")
    public Person updatePerson(Person p, @PathVariable Integer id){
        return personService.updatePerson(p, id);
    }
    @DeleteMapping("/people/{id}")
    public void deletePerson(@PathVariable Integer id){
        personService.deletePerson(id);
    }

}
