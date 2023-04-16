package Lab;

public interface Stack <E>{
    void push(E obj);
    E pop();
    E peek();
    int size();
    boolean isStackEmpty();
}
