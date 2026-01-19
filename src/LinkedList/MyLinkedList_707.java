//LeetCode 707:设计链表
//https://leetcode.cn/problems/design-linked-list/description/

package LinkedList;

import java.util.NoSuchElementException;

public class MyLinkedList_707<E> {
    //哨兵头尾节点
    final private Node<E> head,tail;
    private int size;

    private static class Node<E> {
        E val;
        Node<E> next;
        Node<E> prev;

        Node(E val){
            this.val = val;
        }
    }
    //初始化对象 
    public MyLinkedList_707(){
        this.head = new Node<>(null);
        this.tail = new Node<>(null);
        head.next = tail;
        tail.prev = head;
        this.size = 0;
    }

    //在头部添加节点
    public void addAtHead(E val){
        Node<E> x = new Node<>(val);
        Node<E> temp = head.next;
        x.next = temp;
        x.prev = head;
        temp.prev = x;
        head.next = x;
        size++;
    }

    //在尾部添加节点
    public void addAtTail(E val){
        Node<E> x = new Node<>(val);
        Node<E> temp = tail.prev;
        x.next = tail;
        x.prev = temp;
        temp.next = x;
        tail.prev = x;
        size++;
    }

    //查找索引index对应的节点的值
    public E get(int index){
        if(index >= 0 && index < size){
                Node<E> p = head.next;
                for(int i=0;i<index;i++){
                    p = p.next;
                }
                return p.val;
        }else{
            //力扣此处要求return -1需要改变泛值类型
            throw new NoSuchElementException();
        }
    }

    //在index处添加节点
    public void addAtIndex(int index,E val){
        if(index == size){
            addAtTail(val);
            return;
        }else if(index >= 0 && index < size){
                Node<E> p = head.next;
                for(int i=0;i<index;i++){
                    p = p.next;
                }
                Node<E> x = new Node<>(val);
                Node<E> temp = p.prev;
                x.next = p;
                x.prev = temp;
                temp.next = x;
                p.prev = x;
                size++;
        }else{
            return;
        }
    }

    //删除index处的节点
    public void deleteAtIndex(int index){
        if(index >=0 && index < size){
            Node<E> p = head.next;
            for(int i=0;i<index;i++){
                p = p.next;
            }
            Node<E> prev = p.prev;
            Node<E> next = p.next;
            prev.next = next;
            next.prev = prev;
            p.prev = null;
            p.next = null; 
            size--;           
        }else{
            return;
        }
    }
}