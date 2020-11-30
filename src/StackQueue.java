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

    }
    //public T dequeue(): returns the data of the first-in-line stackNode from the dequeue stack (?)
    public T dequeue(){

    }
    //HELPER METHODS
    private void clear(Stack<T> theStack) {
        while(theStack.peek != null) {
            theStack.pop();
        }
    }
}
