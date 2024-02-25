package cz.cvut.fel.pjv;


import java.util.Arrays;

/**
 * Implementation of the {@link Queue} backed by fixed size array.
 */
public class CircularArrayQueue implements Queue {

    protected int capacity;
    protected String start;
    protected String end;
    protected int index_start;
    protected int index_end;
    protected String rem_el;

    protected int size;
    String[] circular_buffer;

    /**
     * Creates the queue with capacity set to the value of 5.
     */
    public CircularArrayQueue() {
        this.capacity = 5;
        this.start = null;
        this.end = null;
        this.circular_buffer = new String[capacity];
    }


    /**
     * Creates the queue with given {@code capacity}. The capacity represents maximal number of elements that the
     * queue is able to store.
     * @param capacity of the queue
     */
    public CircularArrayQueue(int capacity) {
        this.capacity = capacity;
        this.start = null;
        this.end = null;
        this.circular_buffer = new String[capacity];
    }

    @Override
    public int size() {
        size = 0;
        if (isEmpty()){
            return 0;
        }
        for (int i = 0; i < capacity; i++) {
            if (circular_buffer[i] != null){
                size += 1;
            }
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < capacity; i++){
            if(circular_buffer[i] != null){
                return  false;
            }
        }
        return true;
    }

    @Override
    public boolean isFull() {
        for (int i = 0; i < capacity; i++) {
            if (circular_buffer[i] == null){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean enqueue(String obj) {
        if (isFull() || obj == null){
            return false;
        }
        if (isEmpty()){
            circular_buffer[0] = obj;
            start = obj;
            end = obj;
            index_start = 0;
            index_end = 0;
            return true;
        } else if (!isEmpty()){
            if (index_end == capacity - 1){
                circular_buffer[0] = obj;
                end = obj;
                index_end = 0;
                return true;
            } else {
                circular_buffer[index_end + 1] = obj;
                end = obj;
                index_end = index_end + 1;
                return true;
            }
        }
        return false;
    }

    @Override
    public String dequeue() {
        if (!isEmpty()){
            rem_el = start;
            if (index_start == capacity - 1){
                circular_buffer[index_start] = null;
                index_start = 0;
                start = circular_buffer[index_start];
                return rem_el;
            } else {
                circular_buffer[index_start] = null;
                index_start = index_start + 1;
                start = circular_buffer[index_start];
                return rem_el;
            }
        }
        return null;
    }

    @Override
    public void printAllElements() {
        for (int i = 0; i < capacity; i++) {
            if(circular_buffer[i] != null){
                System.out.println(circular_buffer[i]);
            }
        }
    }
}
