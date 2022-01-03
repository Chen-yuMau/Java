class Link
{
	public long dData; // data item
	public Link next; // next link in list
	public Link previous; // previous link in list
// -------------------------------------------------------------
	public Link(long d) // constructor
	{ 
		dData = d;
	}
// -------------------------------------------------------------
	public void displayLink() // display this link
	{ 
		System.out.print(dData + " "); 
	}
	// -------------------------------------------------------------
} // end class Link
class LStack
{
	public Link head;

	public LStack() // constructor
	{
		head = null;
	}
// -------------------------------------------------------------
	public boolean isEmpty() // true if no links
	{ 
		return head==null; 
	}

	public void push(long t)
	{
		Link a = new Link(t);
		if(head==null)
		{
			head = a;
		}
		else
		{
			head.next = a;
			head.next.previous = head;
			head = head.next;
		}
	}
	public long pop()
	{
		if(head==null)
		{
			return(-1);
		}
		else
		{
			long a = head.dData;
			head = head.previous;
			return(a);
		}
	}
	public void dis(Link a)
	{
		if(a!=null)
		{
			System.out.print(a.dData+" ");
			dis(a.previous);
		}
	}
	public void displaystack()
	{
		dis(head);
		System.out.println();
	}
}
class LStackapp
{
	public static void main(String[] args)
	{
		LStack theList = new LStack();
		System.out.println("Push 22");
		theList.push(22); // insert at front
		System.out.println("Push 44");
		theList.push(44); // insert at front
		System.out.println("Push 33");
		theList.push(33); // insert at front
		theList.displaystack();
		System.out.println("Push 66");
		theList.push(66); // insert at front
		System.out.println("Push 44");
		theList.push(44); // insert at front
		System.out.println("Push 33");
		theList.push(33); // insert at front
		theList.displaystack();
		System.out.println("Pop 4 numbers");
		System.out.println(theList.pop());
		System.out.println(theList.pop());
		System.out.println(theList.pop());
		System.out.println(theList.pop());
		theList.displaystack();
		System.out.println("Push 77");
		theList.push(77); // insert at front
		System.out.println("Push 88");
		theList.push(88); // insert at front
		theList.displaystack();

	}
}