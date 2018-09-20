
package data_structures.Collections;

public interface Collections<E> {
    
    public void add(E data);
    
    public void insert(int offset, E data);
    
    public void delete(int offset);
    
    public E get(int offset);
}
