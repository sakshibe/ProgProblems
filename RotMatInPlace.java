/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracking;

import java.util.Scanner;
// Rotate a 2-D matrix 90 degrees anticlockwise
public class RotMatInPlace
{
    
    static void Rot(int[][] a,int n )
    {
        int temp;
        for(int x = 0;x<n/2;x++)
        {
            for(int y=x;y<n-1-x;y++)
            {
             temp = a[x][y];
             a[x][y] = a[y][n-1-x];
             a[y][n-1-x] = a[n-1-x][n-1-y];
             a[n-1-x][n-1-y] = a[n-1-y][x];
             a[n-1-y][x] = temp;
            }
        }
        System.out.println("Rotated matrix:");
        for(int i =0 ;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String args[])
    {   
        int a[][] = new int[4][4];
        Scanner in = new Scanner(System.in);
//        for(int i =0 ;i<3;i++)
//        {
//            for(int j=0;j<3;j++)
//            {
//                a[i][j] = in.nextInt();
//            }
//        }
//      
a[0][0] = 1;
a[0][1] = 2;
a[0][2] = 3;
a[0][3] = 4;

a[1][0] = 5;
a[1][1] = 6;
a[1][2] = 7;
a[1][3] = 8;

a[2][0] = 9;
a[2][1] = 10;
a[2][2] = 11;
a[2][3] = 12;

a[3][0] = 13;
a[3][1] = 14;
a[3][2] = 15;
a[3][3] = 16;

System.out.println("Original matrix");
        for(int i =0 ;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        Rot(a,4);
        
    }  
}
