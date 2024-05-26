public class task3{

static class  Queue
{
private int maxSize;
private long[] queArray;
private int front;
private int rear;
private int nItems;
public Queue(int s) // constructor
{
maxSize = s;
queArray = new long[maxSize];
front = 0;
rear = -1;
nItems = 0;
}
public void enqueue(long j) // put item at rear of queue
{
if(rear == maxSize-1) // deal with wraparound
rear = -1;
queArray[++rear] = j; // increment rear and insert
nItems++; // one more item
}
public long dequeue() // take item from front of queue
{
long temp = queArray[front++]; // get value and incr front
if(front == maxSize) // deal with wraparound
front = 0;
nItems--; // one less item
return temp;
}
public long front() // peek at front of queue
{

return queArray[front];
}
public boolean isEmpty() // true if queue is empty
{
return (nItems==0);
}
public boolean isFull() // true if queue is full
{
return (nItems==maxSize);
}
public int size() // number of items in queue
{
return nItems;
}
} 

public static void main(String[] args) {
    Queue q = new Queue(3);
 q.enqueue(1);
 q.enqueue(2);
 q.enqueue(3);
 q.dequeue(); // returns 1
 q.enqueue(4);
 q.front(); // returns 2
//  q.rear(); // returns 4
}



}
