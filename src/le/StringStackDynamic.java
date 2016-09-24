package le;

import java.util.Arrays;

/**
 * Created by nmenego on 9/23/16.
 */
public class StringStackDynamic {
    private String[] elements;
    private int count;
    public static final int DEFAULT_SIZE = 10;

    // constructors
    public StringStackDynamic() {
        //elements = new String[DEFAULT_SIZE];
        this(DEFAULT_SIZE); // reuse StringStack(int) constructor
    }

    public StringStackDynamic(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Invalid size!");
        } else {
            // initialize array
            elements = new String[size];
        }
    }

    /**
     * Returns the latest pushed item on the stack.
     */
    public String pop() {
        if (count <= 0) {
            throw new ArrayIndexOutOfBoundsException("Stack is empty.");
        } else {
            return elements[--count];
        }
    }

    /**
     * Inserts an item to the top of the stack.
     */
    public void push(String item) {
        if (count >= elements.length) {
            // resize array maximum capacity here.
            String[] temp = new String[elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                temp[i] = elements[i];
            }
            elements = temp;

            // for the pros:
            //elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[count++] = item;
    }

    /**
     * Returns the number of elements of the stack.
     */
    public int size() {
        return count;
    }

    /**
     * Returns a string representation of the stack.
     */
    public String toString() {
        if (size() == 0) {
            return "EMPTY";
        }

        String str = "";
        for (int i = 0; i < count - 1; i++) {
            str += elements[i] + ", ";
        }
        return str + elements[size() - 1];
    }

    /**
     * Returns the topmost element of the stack without removing it.
     */
    public String peek() {
        return elements[count - 1];
    }

    public static void main(String[] args) {
        StringStackDynamic stack = new StringStackDynamic(2);
        stack.push("paper");
        stack.push("plastic");
        stack.push("tissue");
        System.out.println(stack); // paper, plastic, tissue
        System.out.println(stack.size()); // 3
        String item1 = stack.pop();
        String item2 = stack.pop();
        String item3 = stack.pop();


        System.out.println(item1); // tissue
        System.out.println(item2); // plastic
        System.out.println(item3); // paper
        System.out.println(stack); // EMPTY
        System.out.println(stack.size()); // 0
    }

}
