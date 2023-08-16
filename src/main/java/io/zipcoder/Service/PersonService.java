package io.zipcoder.Service;

import io.zipcoder.Model.Person;
import io.zipcoder.Repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonService {
    @Autowired
    PersonRepository personRepository;


    public Person createPerson(Person p){
        return personRepository.save(p);
    }

    public Person getPerson(@PathVariable Integer id){
        return personRepository.findOne(id);
    }


    public List<Person> getPersonList(){
        List<Person> peeps = new ArrayList<>();
        personRepository.findAll().forEach(peeps::add);
        return peeps;
    }


    public Person updatePerson(Person p,Integer id){
        return personRepository.save(p);
    }

    public void deletePerson(Integer id){
        personRepository.delete(id);

    }
}
