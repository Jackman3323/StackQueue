/**
 * Jack Hughes, Cooper Eisman, Jim Fahey
 * StackQueue.java
 * 9-30-20
 * A somewhat abstract and useless class, you can have a less efficient queue by smushing 2 stacks
 * together and crying a lot while you repeatedly copy stuff back and forth and slightly rewrite the
 * whole stack over and over again. After you cry yourself to sleep, you'll have an off-brand Queue
 * that doesn't work as well or as straight forwardly as the normal Queue did. Enjoy!
 * @param <T>
 */
public class StackQueue<T> {
    //INSTANCE-DATA
    //Stack for queueing
    private Stack<T> enqueueStack;
    //Stack for dequeueing
    private Stack<T> dequeueStack;
    //Int to keep track of size
    private int size;
    //CONSTRUCTORS
    //Default Constructor: default values
    public StackQueue(){
        enqueueStack = new Stack<T>();
        dequeueStack = new Stack<T>();
        size = 0;
    }
    //ACCESSORS
    //public int getSize(): returns this.size
    public int getSize(){
        return this.size;
    }
    //MUTATORS
    //public void enqueue(T data): queues a new stackNode containing data
    public void enqueue(T data){
        enqueueStack.push(data);
        replaceStack(dequeueStack,enqueueStack);
        size++;
    }
    //public T dequeue(): returns the data of the first-in-line stackNode from the dequeue stack (?)
    public T dequeue(){
        T data = dequeueStack.pop();
        System.out.println(data);
        replaceStack(enqueueStack,dequeueStack);
        size--;
        return data;
    }
    public T peek() {
        return dequeueStack.peek();
    }
    public boolean isEmpty() {
        if(size < 1) {
            return true;
        }
        return false;
    }
    //HELPER METHODS
    private void replaceStack(Stack<T> replaceStack, Stack<T> baseStack) {
        Stack<T> tempStack = new Stack<T>();
        while(replaceStack.peek() != null) { //Replaces the old stack
            replaceStack.pop();
        }
        T tempItem = null;
        while(baseStack.peek() != null) { //fills the temp and old stacks with updated values, mpties current stack
            tempItem = baseStack.pop();
            tempStack.push(tempItem);
            replaceStack.push(tempItem);
        }
        while(tempStack.peek() != null) { //fill current stack, empties temp stack
            tempItem = tempStack.pop();
            baseStack.push(tempItem);
        }
    }
}
