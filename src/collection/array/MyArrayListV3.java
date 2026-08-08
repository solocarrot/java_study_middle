package collection.array;

import java.util.Arrays;

public class MyArrayListV3 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV3() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV3(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        //무슨일이 벌어지는지보자 2칸짜리 배열이있어 사이즈는0인데 1추가하면 1 null 사이즈는 1 / 1 2 2/
        //여기서한번더 add를하면 이제 메서드에서확인을하는거지 사이즈가 지금2에요 하면늘리기
        if(size == elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }

    public void add(Object o, int index) {
        if(index > size || elementData[elementData.length - 1] != null) {
            grow();
        }
        indexToRight(index);
    }

    public void indexToRight(int index) {
        Object temp;
        for(int i = index + 1; i < elementData.length - 1; i++) {
            temp = elementData[i];
            elementData[i] = elementData[i - 1];
            elementData[i + 1] = temp;
        }
    }

    public void grow() {
        Object[] newElementData = new Object[elementData.length * 2];
        for(int i = 0; i <size; i++) {
            newElementData[i] = elementData[i];
        }
        elementData = newElementData;
    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object element) {
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    public int indexOf(Object o) {
        for(int i = 0; i < elementData.length; i++) {
            if(elementData[i] == o) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "MyArrayListV1{" +
                "elementData=" + Arrays.toString(elementData) +
                ", size=" + size +
                ", capacity = " + elementData.length +
                '}';
    }
}
