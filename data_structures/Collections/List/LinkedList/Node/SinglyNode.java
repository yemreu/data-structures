
package data_structures.Collections.List.LinkedList.Node;

import data_structures.Collections.Data;

public class SinglyNode<E>{
    
    Data<E> data;
    SinglyNode<E> nextNode;
    
    public SinglyNode(E data){
        this.data = new Data<>(data);
        this.nextNode = null;
    }
   
    public SinglyNode<E> getNextNode(){
        return nextNode;
    }
    
    public SinglyNode<E> setNextNode(SinglyNode<E> nextNode){
        this.nextNode = nextNode;
        return this.nextNode;
    }
    
    public E getData(){
        return data.getData();
    }
}
