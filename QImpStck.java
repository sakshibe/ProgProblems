/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracking;
//Implement functionality of a stack using two Queues
/**
 *
 * @author sakshi
 */
public class QImpStck 
{
    Queue q1 = new Queue();
    Queue q2 = new Queue();
    
    void pushI(int num)
    {
        q1.enqueue(num);
        
    }
    void popI()
    {
        int i = q1.front;
        while(i < q1.rear)
        {
        q2.enqueue(q1.dequeue());
        i++;
        }
        q1 = q2;
    }
    void displayI()
    {
        q1.display();
    }
    public static void main(String args[])
    {
        QImpStck i = new QImpStck();
        i.pushI(10);
        i.pushI(20);
        i.pushI(30);
        i.pushI(40);
        i.popI();
        i.displayI();
    }
    
}
