package elena.hw2;

public class Stack {
    private LinearList stack;

    public Stack() {
        this.stack = new LinearList();
    }

    public void push(Object element) {
        this.stack.addToEnd(element);
    }

    public Object pop() {
        if (this.stack.isEmpty()) {
            return null;
        }
        Object element = this.stack.getByIndex(this.stack.getArrSize() - 1);
        this.stack.deleteByIndex(this.stack.getArrSize() - 1);
        return element;
    }

    public Object peek() {
        if (this.stack.isEmpty()) {
            return null;
        }
        return this.stack.getByIndex(this.stack.getArrSize() - 1);
    }


    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void show() {
        if (this.stack.isEmpty()) {
            System.out.println(" elena.hw2.Stack is empty");
            return;
        }
        System.out.println(" elena.hw2.Stack:");
        for (int i = 0; i < this.stack.getArrSize(); i++) {
            System.out.print(" " + this.stack.getByIndex(i));
        }
        System.out.println();
    }
}
