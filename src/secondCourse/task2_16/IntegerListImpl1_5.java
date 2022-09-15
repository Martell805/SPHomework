package secondCourse.task2_16;

import secondCourse.task2_15.IntegerListImpl;

public class IntegerListImpl1_5 extends IntegerListImpl {
    @Override
    protected void expandArray(){
        if(this.length + 1 <= this.capacity) {
            return;
        }

        this.capacity = (int) (this.capacity * 1.5);
        Integer[] new_array = new Integer[this.capacity];
        System.arraycopy(this.array, 0, new_array, 0, this.length);
        this.array = new_array;
    }

    protected void recursiveInsertionSort(int lastUnsortedIndex){
        if(lastUnsortedIndex <= 1) return;

        int maxIndex = 0;
        for(int q = 1; q <= lastUnsortedIndex; q++)
            if (array[q] >= array[maxIndex])
                maxIndex = q;

        this.swap(maxIndex, lastUnsortedIndex);

        this.recursiveInsertionSort(lastUnsortedIndex - 1);
    }

    @Override
    public void sort() {
        this.recursiveInsertionSort(this.length - 1);
        this.sorted = true;
    }
}
