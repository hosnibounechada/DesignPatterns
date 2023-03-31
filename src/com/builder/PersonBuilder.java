package com.builder;

class PersonBuilder {
    private String name;
    private int age;
    private String gender;
    private PersonBuilder(){}
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    public static PersonBuilder builder(){
        return  new PersonBuilder();
    }
    public PersonBuilder addName(String name) {
        this.name = name;
        return this;
    }
    public PersonBuilder addAge(int age) {
        this.age = age;
        return this;
    }
    public PersonBuilder addGender(String gender) {
        this.gender = gender;
        return this;
    }
    public Person build(){
        return new Person(this);
    }
}
