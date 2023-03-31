package com.builder;

class Person {
    private String name;
    private int age;
    private String gender;
    public Person(PersonBuilder builder) {
        this.name = builder.getName();
        this.age = builder.getAge();
        this.gender = builder.getGender();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
    public static PersonBuilder builder(){
        return PersonBuilder.builder();
    }
}
