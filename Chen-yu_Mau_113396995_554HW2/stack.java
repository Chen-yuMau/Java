// stack.java
// demonstrates stacks
// to run this program: C>java StackApp
////////////////////////////////////////////////////////////////
class StackX
{
	private int maxSize; // size of stack array
	private long[] stackArray;
	private int top; // top of stack
	//--------------------------------------------------------------
	public StackX(int s) // constructor
	{
		maxSize = s; // set array size
		stackArray = new long[maxSize]; // create array
		top = 0; // no items yet
	}
	//--------------------------------------------------------------
	public void push(long j) // put item on top of stack
	{
		stackArray[top] = j; // increment top, insert item
		top++;
	}
	//--------------------------------------------------------------
	public long pop() // take item from top of stack
	{
		top--;
		return stackArray[top]; // access item, decrement top
	}
	//--------------------------------------------------------------
	public long peek() // peek at top of stack
	{
		return stackArray[top-1];
	}
	//--------------------------------------------------------------
	public boolean isEmpty() // true if stack is empty
	{
		return (top == 0);
	}
	//--------------------------------------------------------------
	public boolean isFull() // true if stack is full
	{
		return (top == maxSize-1);
	}
//--------------------------------------------------------------
} // end class StackX
////////////////////////////////////////////////////////////////
class StackApp
{
	public static void main(String[] args)
	{
		StackX theStack = new StackX(10); // make new stack
		System.out.println("push 20 40 60 80");
		theStack.push(20); // push items onto stack
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);
		System.out.println("Pop all items");
		while( !theStack.isEmpty() ) // until its empty,
		{ // delete item from stack
			long value = theStack.pop();
			System.out.print(value); // display it
			System.out.print(" ");
		} // end while
		System.out.println("");
	}
}