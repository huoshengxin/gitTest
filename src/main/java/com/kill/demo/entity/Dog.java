package com.kill.demo.entity;

// import org.springframework.beans.factory.annotation.Required;

public class Dog {

    private Person person;
    private String name;

    public Person getPerson() {
        return person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // @Required
    // public void setPerson(Person person) {
    //     this.person = person;
    // }

    @Override
    public String toString() {
        return "Dog{" +
                "person=" + person +
                ", name='" + name + '\'' +
                '}';
    }
}
