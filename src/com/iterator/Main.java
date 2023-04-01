package com.iterator;

public class Main {
    public static void main(String[] args){
        Collection nameRepository = new NameRepository();
        Iterator iterator = nameRepository.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
