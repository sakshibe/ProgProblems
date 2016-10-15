 //IMPLEMENTING STACK USING ONLY QUEUES
class StackQ
{
        Queue q1 = new Queue();
        Queue q2 = new Queue();
    void stQpush(int num)
    {
       q1.enqueue(num);
    }
    void stQdisplay(Queue q)
    {
        q.display();
    }
    Queue pop()
    {
        int dQElm;
        if(q2.isempty())
        {
            while(q1.front != q1.rear)
            {
                dQElm = q1.dequeue();
                q2.enqueue(dQElm);
            }
            q1.rear = -1;q1.front =0;
            return q2;
        }
        else
        {
            while(q2.front != q2.rear)
            {
                dQElm = q2.dequeue();
                q1.enqueue(dQElm);
            }
             q2.rear = -1;q2.front =0;
             return q1;
        }
        
    }
    public static void main(String args[])
    {
     StackQ stq = new StackQ();
     stq.stQpush(10);
     stq.stQpush(20);
     stq.stQpush(30);
     stq.stQpush(40);
     stq.stQpush(50);
     Queue q = new Queue();
     q= stq.pop();
     q = stq.pop();
     stq.stQdisplay(q);
    }
}