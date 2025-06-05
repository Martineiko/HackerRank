import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if((x<=Byte.MAX_VALUE) && (x>=Byte.MIN_VALUE)){
                 System.out.println("* byte");   
                }
                if((x <=Short.MAX_VALUE) && (x>= Short.MIN_VALUE)){
                    System.out.println("* short");   
                }
                //Complete the code
                if((x<= Integer.MAX_VALUE) && (x>=Integer.MIN_VALUE)){
                    System.out.println("* int");
                }
                if((x<=Long.MAX_VALUE) && (x>=Long.MIN_VALUE)){
                    System.out.println("* long");
                }                 
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



