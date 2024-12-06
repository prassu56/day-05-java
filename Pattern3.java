/*
A B C D E 
B C D E   
C D E     
D E       
E    
*/
import java.util.*;
public class Pattern3{
    public static void main(String[]args){
        for(int i=1;i<=5;i++)
        {
            for(int j=i;j<=5;j++)
            {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }

}