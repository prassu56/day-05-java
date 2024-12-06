/*
A 
A B       
A B C     
A B C D   
A B C D E 
*/
import java.util.*;
public class Pattern6{
    public static void main(String[]args){
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }

}