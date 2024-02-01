package junit;

public class Q4_Stack {
	private int maxSize;
    private int top;
    private int[] stackArray;

    public Q4_Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println("Pushed: " + value);
        } else {
            System.out.println("Stack Overflow. Cannot push " + value);
        }
    }

    public int pop() {
        if (top >= 0) {
            int poppedValue = stackArray[top--];
            System.out.println("Popped: " + poppedValue);
            return poppedValue;
        } else {
            System.out.println("Stack Underflow. Cannot pop");
            return -1; // Return a sentinel value or throw an exception as per your requirement
        }
    }
    
}
