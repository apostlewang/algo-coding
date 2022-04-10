package practice.ds.tree.bst;

// BST中承载的元素应该实现Comparable接口
public class BST<E extends Comparable<E>> {
    private class Node{
        public E e;
        public Node left, right;
        // Node的构造函数
        public Node(E e){
            this.e = e;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;
    private int size;
    public BST(){
        root = null;
        size = 0;
    }
}
