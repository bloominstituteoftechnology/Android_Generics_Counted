package com.lambdaschool;

public class CountedSet<GenericType> {

    private GenericType[] elementArray;

    public CountedSet() {
        this.elementArray = (GenericType[]) new Object[0];
    }

    public void insert(GenericType elementToInsert) {
        GenericType[] elementArrayCopy = (GenericType[]) new Object[this.elementArray.length + 1];

        for (int i = 0; i < this.elementArray.length; ++i) {
            elementArrayCopy[i] = this.elementArray[i];
        }
        this.elementArray = (GenericType[]) new Object[elementArrayCopy.length];
        this.elementArray = elementArrayCopy;
        this.elementArray[this.elementArray.length - 1] = elementToInsert;
    }

    public void remove(GenericType elementToRemove) {
        for (int i = 0; i < this.elementArray.length; ++i) {
            if (this.elementArray[i].equals(elementToRemove)) {
                GenericType[] elementArrayCopy = (GenericType[]) new Object[this.elementArray.length - 1];
                int index = 0;

                for (int j = 0; j < this.elementArray.length; ++j) {
                    if (i != j) {
                        elementArrayCopy[index++] = this.elementArray[j];
                    }
                }
                this.elementArray = (GenericType[]) new Object[elementArrayCopy.length];
                this.elementArray = elementArrayCopy;
                break;
            }
        }
    }

    public int count(String textToFindAndCountIterationsOf) {
        int count = 0;

        for (int i = 0; i < this.elementArray.length; ++i) {
            if (this.elementArray[i].equals(textToFindAndCountIterationsOf)) {
                count++;
            }
        }

        return count;
    }
}
