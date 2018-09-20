
package data_structures.Collections.List.LinkedList.Node;

import data_structures.Collections.Data;

public class DoublyNode <E>{
    
    Data<E> data;
    DoublyNode<E> nextNode;
    DoublyNode<E> prevNode;
    
    public DoublyNode(E data){
        this.data = new Data<>(data);
        this.nextNode = null;
        this.prevNode = null;
    }
}
