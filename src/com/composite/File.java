package com.composite;

public class File extends FileComponent{
    private String name;
    public File(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    public void print(){
        System.out.println("File: " + name);
    }
}
