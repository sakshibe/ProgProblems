/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracking;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author sakshi
 */
public class RunningMed 
{
    private static void addNumber(int number, PriorityQueue<Integer> lowers, PriorityQueue<Integer> uppers)
    {
        if(lowers.size() == 0 || number < lowers.peek())
        {
            lowers.add(number);
        }
        else
        {
            uppers.add(number);                    
        }
    }
    private static double balanceAndFindMed(PriorityQueue<Integer> lowers, PriorityQueue<Integer> uppers) 
    {
        PriorityQueue<Integer> HeapBiggerInSize = lowers.size() > uppers.size() ? lowers : uppers;
        PriorityQueue<Integer> HeapSmallerInSize = lowers.size() > uppers.size() ? uppers : lowers;
        // balancing the heaps
        if(HeapBiggerInSize.size() - HeapSmallerInSize.size() >= 2)
        {
            HeapSmallerInSize.add(HeapBiggerInSize.poll());
        }
        
        //getting the median 
        if(HeapBiggerInSize.size() == HeapSmallerInSize.size())
        {
            return ((double)(HeapBiggerInSize.peek()+HeapSmallerInSize.peek()))/2;
        }
        else
        {
            return HeapBiggerInSize.peek();            
        }
    }

    
    public static void main(String[] args) 
    {
        PriorityQueue<Integer> lowers = new PriorityQueue<Integer>(100, Collections.reverseOrder());
        PriorityQueue<Integer> uppers = new PriorityQueue<>();
        int a[] = {10,14,5,2,15,19,22,16};
        int n = a.length;
        double[] median = new double[n];
        for(int i =0;i<n;i++)
        {
            addNumber(a[i],lowers,uppers);
            median[i] = balanceAndFindMed(lowers,uppers);
        }
        for(int i =0;i<n;i++)
            System.out.println(median[i]);
    }  
}
