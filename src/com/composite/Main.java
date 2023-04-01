package com.composite;

public class Main {
    public static void main(String[] args){
        Folder rootFolder = new Folder("root");
        rootFolder.add(new File("file1.txt"));
        rootFolder.add(new File("file2.txt"));

        Folder subFolder = new Folder("subFolder");
        subFolder.add(new File("file3.txt"));

        rootFolder.add(subFolder);

        rootFolder.print();
    }
}
