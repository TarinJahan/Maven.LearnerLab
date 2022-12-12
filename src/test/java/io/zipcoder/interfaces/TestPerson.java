package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class TestPerson {
    final long id = 0;
    String name = "";
    @Test
    public void personConstructorTest() {
        // Given (cat data)
        String givenName = "Rin";
        long givenId = 123;

        // When (a cat is constructed)
        Person person = new Person(givenId, givenName);

        // When (we retrieve data from the cat)
        String retrievedName = person.getName();
        long retrievedId = person.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenId, retrievedId);

    }


}
