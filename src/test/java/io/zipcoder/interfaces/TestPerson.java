package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void personConstructorTest() {
        //Given:
        Person person = new Person("Larry", 233);
        String expectedName = "Larry";
        long expectedId = 233;
        //When:
        String actualName = person.getName();
        long actualId = person.getId();
        //Then:
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedId, actualId);

    }

    @Test
    public void setNameTest(){
        Person person = new Person("Garry", 677);
        person.setName("Garry");
        String actual = person.getName();
        String expected = "Garry";
        Assert.assertEquals(expected, actual);

    }
}
