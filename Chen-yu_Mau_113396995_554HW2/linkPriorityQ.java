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

class PriorityQ
{
	private Link head;
// -------------------------------------------------------------
	public PriorityQ() // constructor
	{
		head = null; 
	}
	public insert(Long a)
	{
		Link newLink = new Link(a); 
		if(head == null)
		{
			head = newLink;
		}
		else
		{
			newLink.next = head;
			head.previous = newLink;
			head = newLink;

			Link pointer;
			pointer = head;
			while(pointer.next==null||pointer.next.dData>pointer.dData)
			{
				
			}
		}
	}
	public remove()
	{
		
	}
}