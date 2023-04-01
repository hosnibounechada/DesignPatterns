package com.iterator;

public class NameRepository implements Collection{
    private String[] names = {"John", "Jane", "James", "Janet"};
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
    private class NameIterator implements Iterator{
        private int index = 0;
        @Override
        public boolean hasNext() {
            return index < names.length;
        }
        @Override
        public Object next() {
            if (hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
