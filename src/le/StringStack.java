package le;

/**
 * Created by nmenego on 9/23/16.
 */
public class StringStack {
    private String[] elements;
    private int count;
    public static final int DEFAULT_SIZE = 10;

    // constructors
    public StringStack() {
        //elements = new String[DEFAULT_SIZE];
        this(DEFAULT_SIZE); // reuse StringStack(int) constructor
    }

    public StringStack(int size) {
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
            throw new ArrayIndexOutOfBoundsException("Stack is full!");
        } else {
            elements[count++] = item;
        }
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
        StringStack stack = new StringStack(20);
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
