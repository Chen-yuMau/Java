class deque
{
	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nItems;

	public deque(int s) // constructor
	{
		maxSize = s;
		queArray = new long[maxSize];
		front = 0;
		rear = 0; 
		nItems = 0;
	}
	public int insertRight(long j) // put item at rear of queue
	{
		if(nItems==maxSize)
		{
			return(0);
		}
		else
		{
			nItems++;
			queArray[rear] = j;
			rear++;
			if(rear==maxSize)
			{
				rear = 0;
			}
			return(1);
		}
	}
	//--------------------------------------------------------------
	public long removeRight() // take item from front of queue
	{
		if(nItems==0)
		{
			return(-1);
		}
		else
		{
			nItems--;
			int j = rear;
			rear--;
			if(rear<0)
			{
				rear = maxSize-1;
			}
			return(queArray[j]);
		}
	}
	public int insertLeft(long j) // put item at rear of queue
	{
		if(nItems==maxSize)
		{
			return(0);
		}
		else
		{
			nItems++;
			front--;
			if(front<0)
			{
				front = maxSize-1;
			}
			queArray[front] = j;
			return(1);
		}
	}
	//--------------------------------------------------------------
	public long removeLeft() // take item from front of queue
	{
		if(nItems==0)
		{
			return(-1);
		}
		else
		{
			nItems--;
			int j = front;
			front++;
			if(front==maxSize)
			{
				front = 0;
			}
			return(queArray[j]);
		}
	}
	//--------------------------------------------------------------
	public void display()
	{
		int j = front;
		for(int i=0;i<nItems;i++)
		{
			System.out.print(queArray[j]);
			j++;
			if(j==maxSize)
			{
				j=0;
			}
		}
		System.out.println();
	}
	public boolean isEmpty() // true if queue is empty
	{
		return (nItems==0);
	}
	//--------------------------------------------------------------
	public boolean isFull() // true if queue is full
	{
		return (nItems==maxSize);
	}
}
class dequeApp
{
	public static void main(String[] args)
	{
		deque deq = new deque(6);
		System.out.println("Insert right 123");
		deq.insertRight(1);
		deq.insertRight(2);
		deq.insertRight(3);
		deq.display();
		System.out.println("Insert left 123");
		deq.insertLeft(1);
		deq.insertLeft(2);
		deq.insertLeft(3);
		deq.display();
		System.out.println("Remove left");
		deq.removeLeft();
		deq.display();
		System.out.println("Remove right");
		deq.removeRight();
		deq.display();
	}
}