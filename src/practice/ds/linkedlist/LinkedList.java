package practice.ds.linkedlist;

// 实现链表类
public class LinkedList<E> {
    // 链表中的Node类，私有
    private class Node{
        public E e;
        public Node next;
        // Node构造函数
        public Node(E e, Node next){
            this.e = e;
            this.next = next;
        }
        public Node(E e){
            this.e = e;
            this.next = null;
        }

        // Node类的toString方法
        @Override
        public String toString(){
            return e.toString();
        }
    }
    // 链表头
    private Node head;
    // 链表中Node结点个，不能外部修改，所以设计为private
    private int size;

    // 链表构造函数
    public LinkedList(){
        head = null;
        size = 0;
    }
    public int getSize() {
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }

    // 在链表头部添加元素
    public void addFirst(E e){
        Node node = new Node(e);
        node.next = head;
        head = node;
        // 添加元素后更新链表size
        size++;
    }

}
