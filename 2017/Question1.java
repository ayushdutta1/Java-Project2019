/**
A company manufactures packing cartons in four sizes, i.e. cartons to accommodate 6 boxes, 12 boxes, 24 boxes and 48 boxes. 
Design a program to accept the number of boxes to be packed (N) by the user (maximum up to 1000 boxes) and display the break-up 
of the cartons used in descending order of capacity (i.e. preference should be given to the highest capacity available, and if boxes 
left are less than 6, an extra carton of capacity 6 should be used.)
*/

import java.util.*;
class BoxPacking_ISC2017
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter number of boxes to be packed : ");
        int N = sc.nextInt();
        if(N<1 || N > 1000)
        {
            System.out.println("INVALID INPUT");
        }
        else
        {
            int cart[] = {48, 24, 12, 6};
            int copy = N;
            int totalCart = 0,count = 0;
            System.out.println("OUTPUT :");
            for(int i=0; i<4; i++)
            {
                count = N / cart[i];
                if(count!=0)
                {
                    System.out.println("\t"+cart[i]+"\tx\t"+count+"\t= "+cart[i]*count);
                }
                totalCart = totalCart + count;
                N = N % cart[i];
            }
            if(N>0)
            {
                System.out.println("\tRemaining Boxes   "+N+" x 1 = "+N);
                totalCart = totalCart + 1;
            }
            else
            {
                System.out.println("\tRemaining Boxes\t\t= 0");
            }
            System.out.println("\tTotal number of boxes   = "+copy);
            System.out.println("\tTotal number of cartons = "+totalCart);
        }
    }
}
