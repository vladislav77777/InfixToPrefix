package Lab;

public class MyStack<E extends Object> implements Stack<E> {
    private int stackSize;
    private int top;
    private E[] arr;

    public MyStack(int size) {
        this.stackSize = size;
        arr = (E[]) new Object[stackSize];
        top = -1;
    }
    public MyStack() {
        this.stackSize = 10;
        arr = (E[]) new Object[stackSize];
        top = -1;
    }

    @Override
    public void push(E obj) {
        if (this.isStackFull()) {
            this.increaseStackCapacity();
        }
        arr[++top] = obj;
    }

    @Override
    public E pop()  {
        if (this.isStackEmpty()) {
            System.out.println("Stack underflow.");
        }
        E entry = arr[top--];
        return entry;
    }

    @Override
    public E peek() {
        if (this.isStackEmpty()) {
            System.out.println( "Stack underflow.");
        }
        return arr[top];
    }
    @Override
    public boolean isStackEmpty() {
        return (top == -1);
    }

    @Override
    public int size() {
        return stackSize;
    }

    public boolean isStackFull() {
        return (top == stackSize - 1);
    }

    private void increaseStackCapacity() {
        E[] newStack = (E[]) new Object[stackSize * 2];
        for (int i = 0; i < stackSize; i++) {
            newStack[i] = arr[i];
        }
        arr = newStack;
        stackSize = stackSize * 2;
    }

    public void setStackSize(int maxsize) {
        this.stackSize = maxsize;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public E[] getArr() {
        return arr;
    }

    public void setArr(E[] arr) {
        this.arr = arr;
    }
}

