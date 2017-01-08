/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracking;

/**
 *
 * @author sakshi
 */
//Implement functionality of a Queue using two stacks
public class StckImpQ {
    Stack s1 = new Stack();
    Stack s2 = new Stack();
 void enQ(char num)
 {
    s1.push(num);
 }
 void deQ()
 {
     while(s1.top != 0)
     {
         s2.push(s1.pop());
     }
     s1.pop();
     while(s2.top != -1)
     {
         s1.push(s2.pop());
     }
 }
 void display()
 {
     s1.display();
 }
 public static void main(String args[])
 {
    StckImpQ obj = new StckImpQ();
    obj.enQ('a');
    obj.enQ('b');
    obj.enQ('c');
    obj.enQ('d');
    obj.enQ('e');
    obj.enQ('f');
    obj.deQ();
    obj.deQ();
    obj.display();
 }
}
