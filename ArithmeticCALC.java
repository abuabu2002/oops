
import java.io.*;
import java.util.*;
class ArithmeticCALC {
public static void main (String[] args){
Scanner s2=new Scanner (System.in);
int a=s2.nextInt();
int b=s2.nextInt();
int c=s2.nextInt();
switch(a)
{
case 1:System.out.println(b+c);
       break;
case 2:System.out.println(b-c);
       break;
case 3:System.out.println(b*c);
       break;
case 4:System.out.println(b/c);
       break;
default:System.out.println("wrong choice");
        break;
}

}}
