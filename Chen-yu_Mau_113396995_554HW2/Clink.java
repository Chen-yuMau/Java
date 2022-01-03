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

class Circle
{
	public Link current;

	public Circle()
	{
		current = null;
	}
	public boolean isEmpty() // true if no links
	{ 
		return current==null; 
	}
	public void addafter(long t)
	{
		Link a = new Link(t); 
		if(current == null)
		{
			current = a;
			current.next = current;
			current.previous = current;
		}
		else
		{
			a.next = current.next;
			a.previous = current;
			current.next = a;
			a.next.previous = a;
		}
	}
	public void addbefore(long t)
	{
		Link a = new Link(t);
		if(current == null)
		{
			current = a;
			current.next = current;
			current.previous = current;
		}
		else
		{
			a.previous = current.previous;
			a.next = current;
			current.previous = a;
			a.previous.next = a;
		}
	}
	public void next()
	{
		current = current.next;
	}
	public void previous()
	{
		current = current.previous;
	}
	public Link deleteafter()
	{
		Link t = current.next;
		current.next = current.next.next;
		current.next.previous = current;
		return(t);
	}
	public Link deletebefore()
	{
		Link t = current.previous;
		current.previous = current.previous.previous;
		current.previous.next = current;
		return(t);
	}
	public void display()
	{
		if(current!=null)
		{
			Link pointer = new Link(0);
			pointer = current;
			System.out.print(pointer.dData+" ");
			pointer = current.next;
			while(pointer!=current)
			{
				System.out.print(pointer.dData+" ");
				pointer = pointer.next;
			}
		}
		System.out.println();
	}

}
class Circleapp
{
	public static void main(String[] args)
	{ // make a new list
		Circle theList = new Circle();
		System.out.println("Insert left 22 44 66");
		theList.addbefore(22); // insert at front
		theList.addbefore(44);
		theList.addbefore(66);
		theList.display(); // display list forward
		System.out.println("Insert right 11 33 55");
		theList.addafter(11); // insert at rear
		theList.addafter(33);
		theList.addafter(55);
		theList.display(); // display list forward
		System.out.println("Move to the next link");
		theList.next();
		theList.display(); // display list forward
		// theList.displayBackward(); // display list backward
		System.out.println("Delete left");
		theList.deletebefore(); // delete first item
		theList.display();
		System.out.println("Move to the next link");
		theList.next();
		theList.display(); // display list forward
		System.out.println("Delete right");
		theList.deleteafter(); // delete last item
		theList.display(); // display list forward
		// theList.insertafter(22, 77); // insert 77 after 22
		// theList.insertafter(33, 88); // insert 88 after 33
		// theList.displayForward(); // display list forward
	} // end main()
} // end class DoublyLinkedApp