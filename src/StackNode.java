/**
 * Jack Hughes
 * StackNode.java
 * This is a verison of node optimized to be used in stacks. Nodes
 * store data and keep track of the node below them.
 * 10-30-20
 * JBH
 * @param <T>
 */
public class StackNode<T>{
    //Generic datatype
    private T t;
    //Child node
    protected StackNode<T> child;

    //CONSTRUCTORS
    //Constructor--default (set to null)
    public StackNode(){
        this.t = null;
        this.child = null;
    }
    //Constructor--just data
    public StackNode(T t){
        this.t = t;
        this.child = null;
    }
    //Constructor--data and parent/child nodes
    public StackNode(T t, StackNode<T> c){
        this.t = t;
        this.child = c;
    }

    //ACCESSORS
    //Accessor--Stored data
    public T get(){
        return this.t;
    }
    //Accessor--Child node
    public StackNode<T> getChild(){
        return this.child;
    }

    //MUTATORS
    //Mutator--Stored data
    public void set(T t){
        this.t = t;
    }
    //Mutator--Child node
    public void setChild(StackNode<T> c){
        this.child  = c;
    }

    //OVERRIDES OF DEFAULT METHODS
    //.toString()--returns datatype's toString
    @Override
    public String toString(){
        if(this.t == null){
            return null;
        }
        return this.t.toString();
    }
    //.equals()--returns if this data equals other node's data
    public boolean equals(StackNode n){
        return this.t.equals(n.get());
    }
}
