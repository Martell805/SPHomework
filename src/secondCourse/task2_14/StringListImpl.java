package secondCourse.task2_14;

import java.util.NoSuchElementException;

public class StringListImpl implements StringList{
    private int length;
    private int capacity;
    private String[] array;

    private void checkItem(String item){
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
        String[] new_array = new String[this.capacity];
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

    public StringListImpl(){
        this.length = 0;
        this.capacity = 1;
        this.array = new String[this.capacity];
    }

    public StringListImpl(int n){
        if(n <= 0){
            throw new IllegalArgumentException();
        }

        this.length = 0;
        this.capacity = n;
        this.array = new String[this.capacity];
    }

    @Override
    public String add(String item) {
        this.checkItem(item);
        this.expandArray();

        this.array[this.length] = item;
        this.length++;

        return item;
    }

    @Override
    public String add(int index, String item) {
        this.checkItem(item);
        this.checkIndex(index);
        this.expandArray();

        this.shiftArray(index, 1);

        this.array[index] = item;

        return item;
    }

    @Override
    public String set(int index, String item) {
        this.checkItem(item);
        this.checkIndex(index);

        this.array[index] = item;

        return item;
    }

    @Override
    public String remove(String item) {
        this.checkItem(item);

        int index = this.indexOf(item);

        if(index == -1){
            throw new NoSuchElementException();
        }

        this.shiftArray(index, -1);

        return item;
    }

    @Override
    public String remove(int index) {
        this.checkIndex(index);

        String item = this.array[index];

        this.shiftArray(index, -1);

        return item;
    }

    @Override
    public boolean contains(String item) {
        this.checkItem(item);

        for (int i = 0; i < this.length; i++) {
            if(this.array[i].equals(item)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(String item) {
        this.checkItem(item);

        for (int i = 0; i < this.length; i++) {
            if(this.array[i].equals(item)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String item) {
        this.checkItem(item);

        for (int i = this.length - 1; i >= 0; i--) {
            if(this.array[i].equals(item)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String get(int index) {
        this.checkIndex(index);

        return this.array[index];
    }

    @Override
    public boolean equals(StringList otherList) {
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
        this.array = new String[capacity];
    }

    @Override
    public String[] toArray() {
        String[] result = new String[this.length];
        System.arraycopy(this.array, 0, result, 0, this.length );
        return result;
    }
}
