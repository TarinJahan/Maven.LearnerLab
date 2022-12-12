package io.zipcoder.interfaces;

public class Person {
    final long id;
    String name;

    public Person(String name, long id) {
        this.name = name;
        this.id = id;
    }
    public Long getId() {
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
