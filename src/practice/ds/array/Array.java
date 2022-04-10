package practice.ds.array;

/**
 * 自己封装的数组类，对标ArrayList
 */
public class Array {
    // 存放数据的数组（引用）
    private int data[];
    // 记录数组中的数据size
    private int size;

    /**
     * 数组的带参数构造方法
     * @param capacity 数组最大容量
     */
    public Array(int capacity){
        data = new int[capacity];
    }

    /**
     * 无参构造方法，默认capacity为10
     */
    public Array(){
        this(10);
    }

    // 返回size大小，size为private类型防止被修改
    public int getSize() {
        return size;
    }

    // 获取数组容量
    public int getCapacity(){
        return data.length;
    }
}
