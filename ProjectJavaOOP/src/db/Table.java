package db;

import java.util.ArrayList;
import java.util.List;

public abstract class Table<E> {
    protected ArrayList<E> elements;

    protected Table() {
        this.elements = new ArrayList<>();
    }

    public E save (E entity){
        this.elements.add(entity);
        return entity;
    }

    public ArrayList<E> getElements() {
        return elements;
    }
}
