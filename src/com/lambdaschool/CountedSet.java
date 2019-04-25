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

    public void removeAll(GenericType elementsToRemove) {
        removeAll(elementsToRemove, false);
    }

    public void remove(GenericType elementToRemove) {
        removeAll(elementToRemove, true);
    }

    private void removeAll(GenericType elementsToRemove, boolean removeOneOccurrence) {
        int[] indexesOfFoundOccurrences = new int[count(elementsToRemove)];

        if (indexesOfFoundOccurrences.length > 0 && removeOneOccurrence)
            indexesOfFoundOccurrences = new int[1];

        int foundOccurrencesCounter = 0;

        for (int i = 0; i < this.elementArray.length; ++i) {
            if (this.elementArray[i].equals(elementsToRemove)) {
                indexesOfFoundOccurrences[foundOccurrencesCounter++] = i;

                if (removeOneOccurrence)
                    break;
            }
        }

        GenericType[] elementArrayCopy = (GenericType[]) new Object[this.elementArray.length - indexesOfFoundOccurrences.length];
        foundOccurrencesCounter = 0;
        int freshCopyCounter = 0;

        for (int i = 0; i < this.elementArray.length; ++i) {
            if (indexesOfFoundOccurrences.length > 0 && i == indexesOfFoundOccurrences[foundOccurrencesCounter]) {
                if (foundOccurrencesCounter < indexesOfFoundOccurrences.length - 1)
                    foundOccurrencesCounter++;
            } else {
                elementArrayCopy[freshCopyCounter++] = this.elementArray[i];
            }
        }
        this.elementArray = (GenericType[]) new Object[elementArrayCopy.length];
        this.elementArray = elementArrayCopy;
    }

    public int count(GenericType textToFindAndCountIterationsOf) {
        int count = 0;

        for (int i = 0; i < this.elementArray.length; ++i) {
            if (this.elementArray[i].equals(textToFindAndCountIterationsOf)) {
                count++;
            }
        }

        return count;
    }
}
