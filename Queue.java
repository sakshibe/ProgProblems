package cracking;
 // @author sakshi
public class Queue {
    int []a = new int[5];
    int max = 5;
    int front,rear;
    Queue()
    {
        front = -1;
        rear = -1;
    }
    void enqueue(int num)
    {
        if(front == -1 && rear == -1)
        {
            a[++front] = num;
            rear++;
        }
        else
        {
            if(rear == max)
            {
                System.out.println("Queue is full");
                return;
            }
            a[++rear] = num;
        }
    }
    int dequeue()
    {
        if(front == -1 && rear == -1)
        {
            System.out.println("Queue is empty");
            return -1;
        }
        return a[front++];
    }
    void display()
    {
        
        for(int i = front; i <= rear; i++)
            System.out.println(a[i]);
    }
    public static void main(String args[])
    {
        Queue q = new Queue();
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(9);
        q.enqueue(8);
        q.dequeue();
        q.display();
    }
}
