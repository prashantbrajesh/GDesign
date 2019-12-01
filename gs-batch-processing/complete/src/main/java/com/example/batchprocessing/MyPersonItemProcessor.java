package com.example.batchprocessing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class MyPersonItemProcessor implements ItemProcessor<Person, Person> {

    private static final Logger log = LoggerFactory.getLogger(MyPersonItemProcessor.class);

    @Override
    public Person process(final Person person) throws Exception {
        final String firstName = "KING"+person.getFirstName().toLowerCase();
        final String lastName = "KING"+person.getLastName().toLowerCase();

        final Person transformedPerson = new Person(firstName, lastName);

        log.info("Converting (" + person + ") into (" + transformedPerson + ")");

        return transformedPerson;
    }

}
