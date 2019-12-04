package c1array;

/**
 * 封装的Array类—1
 * @author Heroin X
 * @date 2019/8/12 13:22
 */
public class Array1 {

    public static void main(String[] args) {
        Array1 array1 = new Array1(50);
        System.out.println(array1.data);
        System.out.println(array1.size);
    }
    private int[] data;
    private int size;//数组长度，元素个数

    public  Array1(int capacity){
        data=new int[capacity];
        size=0;//相当于是默认为0
    }

    public Array1(){
        this(12);
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
    public void addLast(int e){
        if (size==data.length){
            throw new IllegalArgumentException("AddLast failed,Array is full.");
        }
        //data[size++]=e; 相同逻辑
        data[size]=e;
        size++;
    }

    /**
     * 把原本位于i位置的元素覆盖了，不可取
     * @param e
     * @param index
     */
    //在指定位置插入一个元素——1
    public void add1(int e,int index){
        if (index<=data.length){
            if (index<size&&index>=0){
                data[index]=e;
            }else {
                data[size]=e;
                size++;
            }
        }else {
            throw new ArrayIndexOutOfBoundsException("越界");
        }
    }

    /**
     * 将index及最后一个元素全体向后移动，插入
     * @param e
     * @param index
     */
    //在指定位置插入一个元素——2
    public void add2(int e,int index){
        if (size<data.length){
            if (index<data.length&&index>=0){
                if(index<size){
                    //i位置与size-1位置之间 所有的元素向后移动一位
                    for (int x=size;x>index;x--){
                        data[x]=data[x-1];
                    }
                    //i位置赋值为
                    data[index]=e;
                    size++;
                }else {
                    data[size]=e;
                    size++;
                }
            }else {
                throw new ArrayIndexOutOfBoundsException("越界");
            }
        }else
            throw new IllegalArgumentException("数组已经满了");
    }

    /**
     * 在指定位置插入一个元素
     * @param index
     * @param e
     */
    //standard, 在指定位置插入一个元素——3
    public void add(int index,int e){
        if (size==data.length){
            throw new IllegalArgumentException("add failed.array is full");
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
    public void addFirst(int e){
        add(0,e);
    }

    //获取index 索引位置的元素
    //注意，最大索引是size-1,因为索引是从0开始的
    public int get(int index){
        if (index<0||index>=size){
            throw new IllegalArgumentException("GET FAILED.INDEX IS ILLEGAL");
        }
        return data[index];
    }

    //修改 index 索引位置的元素
    public void set(int index,int value){
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
    public boolean contains(int value){
        for (int i=0;i<size;i++){
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
    public int find(int value){
        for (int i=0;i<size;i++){
            if (data[i]==value){
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
    public int remove(int index){
        int temp=data[index];
        if (index<size&&index>=0){
            for (int i=index;i<size-1;i++){
                data[i]=data[i+1];
            }
            size--;
        }else {
            throw new IllegalArgumentException("超出边界了");
        }
        return temp;
    }

    //删除第一个位置元素
    public int removeFirst(){

        return remove(0);
    }

    //删除最后一个位置元素
    public int removeLast(){
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
    public void removeElement(int element){
        int index = find(element);
        if (index!=-1){
            remove(index);
        }
    }

    //第一次写的，删除给定的某个元素
    public int removeElement1(int element){
        boolean flag = contains(element);
        if (flag=true){
            int index = find(element);
            return remove(index);
        }
        return -1;
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
}
