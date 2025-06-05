import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
         String alpha = "abcdefghijklmnopqrstuvwxyz";
  
        int first1 = alpha.indexOf(A.charAt(0));
        int first2 = alpha.indexOf(B.charAt(0));
        System.out.println(A.length()+B.length());
        if(first1 > first2){
            System.out.println("Yes");    
        } else System.out.println("No");    
        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1)+" "+B.substring(0, 1).toUpperCase()+B.substring(1));
    }
}



