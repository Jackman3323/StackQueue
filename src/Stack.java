/**
 * Author: Jack Hughes
 * Stack.java
 * This class queues a bunch of StackNodes in classic stack fasion
 * Date: 10-30-20
 * On My Honor: JH
 *
 * @param <T>
 */
public class Stack<T> {
    //INSTANCE-DATA
    private int size;
    private StackNode<T> stackNode;

    //CONSTRUCTORS
    //Default Constructor
    public Stack(){
        this.size = 0;
        this.stackNode = null;
    }
    //Some value Constructor
    public Stack(StackNode<T> elem){
        this.stackNode = elem;
        this.size = 1;
    }

    //ACCESSORS
    //int Size() (returns size)
    public int size(){
        return this.size;
    }
    //T Peek() (look at top data)
    public T peek(){
        if(this.isEmpty()){
            return null;
        }
        return this.stackNode.get();
    }
    //boolean isEmpty() (returns true if empty)
    public boolean isEmpty(){
        return this.size == 0;
    }

    //MUTATORS
    //E pop() (removes and returns the top element)
    public T pop(){
        if(this.isEmpty()){
            //Stops the method if stack has nothing in it
            return null;
        }
        StackNode<T> removedElem = this.stackNode;
        this.stackNode = stackNode.getChild();
        size--;
        return removedElem.get();
    }
    //void push(T data) (adds element to the top of the stack)
    public void push(T data){
        StackNode<T> newNode = new StackNode<T>(data); //Create new stackNode to store inputted data
        newNode.setChild(this.stackNode); //Set current top node to the child of new node
        this.stackNode = newNode; //Make the top node point to the new node
        size++;
    }
}
