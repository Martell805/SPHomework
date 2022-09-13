package secondCourse.task2_15;

import java.util.NoSuchElementException;
import java.util.Objects;

public class IntegerListImpl implements IntegerList {
    private int length;
    private int capacity;
    private Integer[] array;
    private boolean sorted = false;

    private void insertionSort(){
        for(int lastUnsortedIndex = length - 1; lastUnsortedIndex > 1; lastUnsortedIndex--){
            int maxIndex = 0;
            for(int q = 1; q <= lastUnsortedIndex; q++)
                if (array[q] >= array[maxIndex])
                    maxIndex = q;

            Integer tmp = array[maxIndex];
            array[maxIndex] = array[lastUnsortedIndex];
            array[lastUnsortedIndex] = tmp;
        }
    }

    public void sort(){
        this.insertionSort();
        this.sorted = true;
    }

    private void checkItem(Integer item){
        if(item == null){
            throw new NullPointerException();
        }
    }

    private void checkIndex(int index){
        if(index >= this.length || index < 0){
            throw new IndexOutOfBoundsException();
        }
    }

    private void expandArray() {
        if(this.length + 1 <= this.capacity) {
            return;
        }

        this.capacity *= 2;
        Integer[] new_array = new Integer[this.capacity];
        System.arraycopy(this.array, 0, new_array, 0, this.length);
        this.array = new_array;
    }

    private void shiftArray(int index, int shift) {
        if(shift == 0){
            return;
        }

        if (shift > 0){
            System.arraycopy(this.array, index, this.array, index + shift, this.length - 1 + shift - index);
            length++;
            return;
        }

        System.arraycopy(this.array, index - shift, this.array, index, this.length + shift - index);
        length--;
    }

    public IntegerListImpl(){
        this.length = 0;
        this.capacity = 1;
        this.array = new Integer[this.capacity];
    }

    public IntegerListImpl(int n){
        if(n <= 0){
            throw new IllegalArgumentException();
        }

        this.length = 0;
        this.capacity = n;
        this.array = new Integer[this.capacity];
    }

    @Override
    public Integer add(Integer item) {
        this.checkItem(item);
        this.expandArray();

        this.array[this.length] = item;
        this.length++;
        this.sorted = false;

        return item;
    }

    @Override
    public Integer add(int index, Integer item) {
        this.checkItem(item);
        this.checkIndex(index);
        this.expandArray();

        this.shiftArray(index, 1);

        this.array[index] = item;
        this.sorted = false;

        return item;
    }

    @Override
    public Integer set(int index, Integer item) {
        this.checkItem(item);
        this.checkIndex(index);

        this.array[index] = item;
        this.sorted = false;

        return item;
    }

    @Override
    public Integer remove(Integer item) {
        this.checkItem(item);

        int index = this.indexOf(item);

        if(index == -1){
            throw new NoSuchElementException();
        }

        this.shiftArray(index, -1);

        return item;
    }

    @Override
    public Integer remove(int index) {
        this.checkIndex(index);

        Integer item = this.array[index];

        this.shiftArray(index, -1);

        return item;
    }

    private int binarySearch(Integer item){
        int left = 0;
        int right = length;
        int mid = -1;

        while (left < right){
            mid = (left + right) / 2;

            if(item.equals(array[mid])) return mid;
            else if(item > array[right]) right = mid;
            else if(item < array[left]) left = mid;
        }

        return mid;
    }

    @Override
    public boolean contains(Integer item) {
        this.checkItem(item);

        if (this.sorted) return binarySearch(item) != -1;

        for (int i = 0; i < this.length; i++) {
            if(this.array[i].equals(item)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(Integer item) {
        this.checkItem(item);

        if (this.sorted) return binarySearch(item);

        for (int i = 0; i < this.length; i++) {
            if(this.array[i].equals(item)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Integer item) {
        this.checkItem(item);

        for (int i = this.length - 1; i >= 0; i--) {
            if(this.array[i].equals(item)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public Integer get(int index) {
        this.checkIndex(index);

        return this.array[index];
    }

    @Override
    public boolean equals(IntegerList otherList) {
        if (this == otherList){
            return true;
        }

        if(this.length != otherList.size()){
            return false;
        }

        for (int i = 0; i < this.length; i++) {
            if(!this.array[i].equals(otherList.get(i))){
                return false;
            }
        }

        return true;
    }

    @Override
    public int size() {
        return this.length;
    }

    @Override
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override
    public void clear() {
        this.length = 0;
        this.capacity = 1;
        this.array = new Integer[capacity];
    }

    @Override
    public Integer[] toArray() {
        Integer[] result = new Integer[this.length];
        System.arraycopy(this.array, 0, result, 0, this.length );
        return result;
    }
}
