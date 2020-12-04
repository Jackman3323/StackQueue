/*
Cooper Jonathan Eisman
Date Created: 10/27/2020
Date Modified: 10/27/2020
Tester for the Stack class
*/

import java.util.Scanner;

public class StackQueueTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n\n");

        //Test initialization
        StackQueue s = new StackQueue();
        System.out.println("This file will test the StackQueue.java class\n");

        //Test methods when empty
        System.out.println("First, we will test what our file does when the queue is empty...");
        System.out.println("Test the isEmpty method. Should return true: " + s.isEmpty());
        System.out.println("Test the getSize method. Should return 0: " + s.getSize());
        System.out.println("Test the dequeue method. Should return null: " + s.dequeue());
        System.out.println("Test the peek method. Should return null: " + s.peek() + "\n");

        //Test the enqueue method when the queue is empty
        System.out.println("Second, we will test the enqueue method when the queue is empty...");
        System.out.print("Test the enqueue method. Please give a text input :");
        s.enqueue(scan.next());
        System.out.println("\nTest the isEmpty method. Should return false: " + s.isEmpty());
        System.out.println("Test the getSize method. Should return 1: " + s.getSize());
        System.out.println("Test the peek method. Should return your input: " + s.peek() + "\n");

        //Test the enqueue method when the stack has items
        System.out.println("Third, we will test the enqueue method when the stack is NOT empty...");
        System.out.print("Test the enqueue method. Please give annother text input :");
        s.enqueue(scan.next());
        System.out.println("\nTest the isEmpty method. Should return false: " + s.isEmpty());
        System.out.println("Test the getSize method. Should return 2: " + s.getSize());
        System.out.println("Test the dequeue method. Should return your most recent input: " + s.dequeue() + "\n");
        System.out.println("Test the isEmpty method after dequeue. Should return false: " + s.isEmpty());
        System.out.println("Test the getSize method after dequeue. Should return 1: " + s.getSize());
        System.out.println("Test the peek method. Should return your first input: " + s.peek() + "\n");


        //Test the enqueue method when the stack has 1 item
        System.out.println("Finally, we will test the enqueue method when the stack has 1 item empty...");
        System.out.println("Test the isEmpty method. Should return false: " + s.isEmpty());
        System.out.println("Test the getSize method. Should return 1: " + s.getSize());
        System.out.println("Test the dequeue method. Should return your first input: " + s.dequeue() + "\n");
        System.out.println("Test the isEmpty method after dequeue. Should return true: " + s.isEmpty());
        System.out.println("Test the getSize method after dequeue. Should return 0: " + s.getSize());
        System.out.println("Test the peek method after dequeue. Should return your first null: " + s.peek() + "\n");
    }
}