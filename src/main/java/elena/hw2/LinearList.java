package elena.hw2;

import java.util.*;

public class LinearList {
    private Object[] array;
    private int arrSize;

    public LinearList() {
        this.array = new Object[50];
        arrSize = 0;
    }

    public int getArrSize() {
        return arrSize;
    }

    public void addToEnd(Object element) {
        if (this.arrSize == this.array.length) {
            this.array = Arrays.copyOf(this.array, this.array.length * 2);
        }
        this.array[this.arrSize++] = element;
    }

    public void deleteByIndex(int index) {
        if (index < 0 || index > arrSize - 1) {
            System.out.println(" Error invalid index\n");
            return;
        }
        Object delElement = this.array[index];
        if (this.arrSize - index >= 0){
            System.arraycopy(this.array, index + 1, this.array, index, this.arrSize - index);
        }
        this.arrSize--;
    }

    public int checkPresence(Object element) {
        for (int i = 0; i < this.arrSize; i++) {
            if (this.array[i] == element) return 1;
        }
        return 0;
    }

    public boolean isEmpty() {
        return this.arrSize == 0;
    }

    public Object getByIndex(int index) {
        if (index < 0 || index > this.arrSize - 1) {
            System.out.println(" Error: invalid index\n ");
            return null;
        }
        return this.array[index];
    }

    public void insertAtIndex(Object element, int index) {
        if (index < 0 || index > this.arrSize) {
            System.out.println(" Error: Invalid index");
            return;
        }
        if (this.arrSize == this.array.length) {
            this.array = Arrays.copyOf(this.array, this.array.length * 2);
        }
        if (this.arrSize - index >= 0) {
            System.arraycopy(this.array, index, this.array, index + 1, this.arrSize - index);
        }
        this.array[index] = element;
        this.arrSize++;
    }
}
