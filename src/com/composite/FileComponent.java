package com.composite;

public abstract class FileComponent {
    public void add(FileComponent fileComponent){
        throw new UnsupportedOperationException();
    }
    public void remove(FileComponent fileComponent){
        throw new UnsupportedOperationException();
    }
    public String getName(){
        throw new UnsupportedOperationException();
    }
    public void print(){
        throw new UnsupportedOperationException();
    }
}
