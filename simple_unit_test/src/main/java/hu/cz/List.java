package hu.cz;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class List {

    private ArrayList<String> people = new ArrayList<>();

    public void add(String name){
        people.add(name);
    }

    public void remove(String p){
        if(!people.contains(p)){
            throw new NoSuchElementException();
        }
        people.remove(p);
    }

    public Boolean isEmpty(){
        return people.isEmpty();
    }

    public void removeAll(){
        people.clear();
    }

    public int getSize(){
        return people.size();
    }
}
