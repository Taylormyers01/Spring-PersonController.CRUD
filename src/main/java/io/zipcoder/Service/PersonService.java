package io.zipcoder.Service;

import io.zipcoder.Repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonService {
    @Autowired
    PersonRepository personRepository;

}
