package c1array;

/**
 * 封装的Array类—2
 * @author Heroin X
 * @date 2019/8/13 9:37
 * 使用泛型
 */
public class Array2<E> {
    private E[] data;
    private int size;//数组长度，元素个数

    public Array2(int capacity){
        data= (E[]) new Object[capacity];
        size=0;//相当于是默认为0
    }

    public Array2(){
        this(12);//?
    }

    //元素个数，有效占位
    public int getSize(){
        return size;
    }

    //容量，给出了多少
    public int getCapacity(){
        return data.length;
    }

    //返回是否为空
    public boolean isEmpty(){
        return size==0;
    }

    //在所有元素最后增加一个元素
    public void addLast(E e){
        if (size==data.length){
            throw new IllegalArgumentException("AddLast failed,Array is full.");
        }
        //data[size++]=e; 相同逻辑

        add(size,e);

   /*     data[size]=e;
        size++;*/
    }


    /**
     * 在指定位置插入一个元素
     * @param index
     * @param e
     */
    //standard, 在指定位置插入一个元素——3
    public void add(int index,E e){
//        if (size==data.length){
//            throw new IllegalArgumentException("add failed.array is full");
//        }
        //之前的操作是满了不给添加，现在是扩容2倍
        if (size==data.length){
            resize(2*data.length);
        }
        if (index<0||index>size){
            throw new IllegalArgumentException("add failed.require index>=0 && index<size");
        }
        for (int i=size-1;i>=0;i--) {
            data[i+1]=data[i];
        }
        data[index]=e;
        size++;
    }

    //在第一个位置增加一个元素,通过复用的形式
    public void addFirst(E e){
        add(0,e);
    }

    //获取index 索引位置的元素
    //注意，最大索引是size-1,因为索引是从0开始的
    public E get(int index){
        if (index<0||index>=size){
            throw new IllegalArgumentException("GET FAILED.INDEX IS ILLEGAL");
        }
        return data[index];
    }

    //修改 index 索引位置的元素
    public void set(int index,E value){
        if (index<0||index>=size){
            throw new IllegalArgumentException("set failed,index is illegal") ;
        }
        data[index]=value;
    }

    /**
     * 判断数组是否包含某个元素
     * @param value
     * @return
     */
    //判断数组是否包含某个元素
    public boolean contains(E value){
        for (int i=0;i<size;i++){

            //此处的value，data[i] 都是类对象，故值比较使用equals
            if (data[i]==value){
                return true;
            }
        }
        return false;
    }

    /**
     * 查找某一个数，返回索引位置
     * @param value
     * @return
     */
    public int find(E value){
        for (int i=0;i<size;i++){
            if (data[i].equals(value)){
                return i;
            }
        }
        return -1;
    }


    /**
     * 删除某个元素
     * @param index
     */
    public void delete(int index){
        if (index<size&&index>=0){
            for (int i=index;i<size-1;i++){
                data[i]=data[i+1];
            }
            size--;
        }else {
            throw new IllegalArgumentException("超出边界了");
        }
    }

    /**
     * 删除某个索引位置的元素
     * @param index
     * @return
     */
    // 从数组中删除index位置的元素, 返回删除的元素
    public E remove(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Remove failed. Index is illegal.");

        E ret = data[index];
        for(int i = index + 1 ; i < size ; i ++)
            data[i - 1] = data[i];
        size --;
        data[size] = null; // loitering objects != memory leak

        //lazy操作，减少振荡
        if(size == data.length / 4&&data.length/2 !=0)
            resize(data.length / 2);
        return ret;
    }

    //删除第一个位置元素
    public E removeFirst(){

        return remove(0);
    }

    //删除最后一个位置元素
    public E removeLast(){
        return remove(size-1);
    }

    /**
     * 删除给定的某个元素
     * 优化后的，
     * 1.可以使得删除成功返回提示
     * 2.此处删除的是一个元素，若数组中有多个相同的元素，需重新设计
     * @param element
     * @return
     */
    public void removeElement(E element){
        int index = find(element);
        if (index!=-1){
            remove(index);
        }
    }

    public void removeAllElement(int element){

    }

    /**
     * 重写toString
     * format,
     * @return
     */
    @Override
    public String toString() {
        StringBuilder result=new StringBuilder();
        result.append(String.format("Array: size = %d , capacity = %d\n",size,data.length));
        result.append('[');
        for (int i=0;i<size;i++){
            result.append(data[i]);
            if (i!=size-1)
                result.append(", ");
        }
        result.append(']');
        return result.toString();
    }

    //数组扩容
     private void resize(int newCapacity){
        E[] newData= (E[]) new Object[newCapacity];
        for (int i=0;i<size;i++){
            newData[i]=data[i];
        }
        data=newData;
     }

    public E getFirst() {
        return get(0);
    }

    public E getLast() {
        return get(size);
    }
}
