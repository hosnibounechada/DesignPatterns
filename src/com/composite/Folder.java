package com.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends FileComponent{
    private List<FileComponent> fileComponents = new ArrayList<>();
    private String name;
    public Folder(String name) {
        this.name = name;
    }
    public void add(FileComponent fileComponent){
        fileComponents.add(fileComponent);
    }
    public void remove(FileComponent fileComponent){
        fileComponents.remove(fileComponent);
    }
    @Override
    public String getName() {
        return name;
    }
    public void print(){
        System.out.println("Folder: " + name);
        for(FileComponent fileComponent: fileComponents){
            fileComponent.print();
        }
    }
}
