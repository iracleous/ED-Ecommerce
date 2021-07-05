package eu.afse.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;


//to do

public class ProductQueue implements Queue<Product>{

    private ArrayList<Product> products = new ArrayList<>();

    @Override
    public int size() {
        return products.size();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Product> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Product product) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Product> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean offer(Product product) {
        return false;
    }

    @Override
    public Product remove() {
        return null;
    }

    @Override
    public Product poll() {
        return null;
    }

    @Override
    public Product element() {
        return null;
    }

    @Override
    public Product peek() {
        return null;
    }
}
