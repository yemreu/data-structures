
package data_structures.Collections.List.LinkedList;

import data_structures.Collections.List.LinkedList.Node.SinglyNode;
import data_structures.Collections.List.List;

public class LinkedList<E> extends List<E>{
    
    private SinglyNode<E> head;
    private SinglyNode<E> tail;
    private SinglyNode<E> currentNode;
    private int length;
    
    public LinkedList(){
        head = null;
        tail = null;
        currentNode = null;
        length = 0;
    }
    
    public int getLength(){
        return length;
    }
    
    private void selectNode(int offset){
        currentNode = head;
        int count = 0;
        loop:
        while(currentNode.getNextNode()!=null){
            if(offset == (++count-1)) break loop;
            currentNode = currentNode.getNextNode();
        }
    }
    
    private void selectLastNode(){
        selectNode(length-1);
    }

    @Override
    public void add(E data) {
        if(head == null){
            head = new SinglyNode<>(data);
            tail = head;
            length++;
        }else{
            selectLastNode();
            tail = currentNode.setNextNode(new SinglyNode<>(data));
            length++;
        }
    }
    
    @Override
    public void insert(int offset, E data) {
        if(offset>=length || offset<0) throw new IndexOutOfBoundsException();
        selectNode(offset);
        SinglyNode<E> sNode = new SinglyNode<>(data);
        sNode.setNextNode(currentNode);
        if(offset==0){
            head = sNode;
        }else{
            selectNode(offset-1);
            currentNode.setNextNode(sNode);
        }
        length++;
    }

    @Override
    public void delete(int offset) {
        if(offset>=length || offset<0) throw new IndexOutOfBoundsException();
        if(offset == 0){
            selectNode(1);
            head = currentNode;
            length--;
        }else{
            selectNode(offset+1);
            SinglyNode<E> temp = new SinglyNode<>(currentNode.getData());
            temp.setNextNode(currentNode.getNextNode());
            selectNode(offset-1);
            currentNode.setNextNode(temp);
            length--;
        }
    }

    @Override
    public E get(int offset) {
        selectNode(offset);
        return currentNode.getData();
    }
    
    @Override
    public String toString() {
        return "LinkedList{" + "head=" + head + ", tail=" + tail + ", currentNode=" + currentNode + ", count=" + length + '}';
    }
}
