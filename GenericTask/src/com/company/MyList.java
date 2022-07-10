package com.company;

import java.sql.Array;

public class MyList<T> {
    private T[] array;

    public MyList() {
        this.array = (T[]) new Object[10];
    }

    public MyList(int capacity){
        this.array = (T[]) new Object[capacity];
    }

    public int size(){
        int size = 0;
        for(T element : array){
            if(element != null){
                size++;
            }
        }
        return size;
    }

    public int getCapacity(){
        int capacity = 0;
        for(T element : array){
            capacity++;
        }
        return capacity;
    }

    public void add (T data){
        if(this.size() == this.getCapacity()){
            T[] newArray = (T[]) new Object[this.getCapacity()*2];
            for(int i=0; i<this.array.length; i++){
                newArray[i] = this.array[i];
            }
            this.array = newArray;
        }
        this.array[this.size()] = data;
    }

    public T get(int index){
        if(index >= this.size() || index < 0){
            return null;
        }
        else{
            return this.array[index];
        }
    }

    public T remove(int index){
        if(index >= this.size() || index < 0){
            return null;
        }
        else{
            T removedElement = this.array[index];
            for(int i=index;i<this.size()-1;i++){
                this.array[i] = this.array[i+1];
            }
            this.array[this.size()-1] = null;
            return removedElement;
        }
    }

    public T set(int index, T data){
        if(index >= this.size() || index < 0){
            return null;
        }
        else{
            this.array[index] = data;
            return data;
        }
    }

    @Override
    public String toString() {
        String str = "[";
        for(int i=0; i<this.size();i++){
            str+= String.valueOf(this.array[i]);
            if(i != this.size()-1){
                str+=",";
            }
        }
        str+= "]";
        return str;
    }

    public int indexOf(T data){
        for (int i = 0; i < this.size(); i++) {
            if (this.array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data){
        for(int i = this.size() - 1; i >= 0; i--){
            if(this.array[i] == data){
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty(){
        if(size() == 0){
            return true;
        }
        return false;
    }

    public T[] toArray(){
        T[] newArray = (T[]) new Object[this.size()];
        for (int i = 0; i < this.size(); i++) {
            newArray[i] = this.array[i];
        }
        return newArray;
    }

    public void clear(){
        for (int i=0; i<this.size();i++){
            this.array[i] = null;
        }
    }

    public MyList<T> subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex >= this.size() || toIndex < 0 || toIndex >= this.size() || fromIndex > toIndex) {
            return null;
        }
        MyList<T> newList = new MyList<>(toIndex - fromIndex);
        for (int i = fromIndex; i < toIndex; i++) {
            newList.add(this.array[i]);
        }
        return newList;
    }

    public boolean contains(T data) {
        for (int i = 0; i < this.size(); i++) {
            if (this.array[i].equals(data)) {
                return true;
            }
        }
        return false;
    }
}
