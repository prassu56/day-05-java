import java.util.*;
public class Setbits{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        while(n>0)
        {
            c+=n&1;
            n>>=1;
        }
        System.out.println(c);
    }

}