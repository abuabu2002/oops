// to find volume of cylinder with formula ( pi*r*r*h)Pi=3.14
import java.io.*;
import java.util.*;
public class AREAOFCYLINDER
{
public static void main(String args[])
{
Scanner S=new Scanner(System.in);System.out.println("enter the value of radius of cylinder r=:");
int r= S.nextInt();System.out.println("enter the value of height of cylinder h=:");
int h= S.nextInt();
float pi=3.14f;
float AREAOFCYLINDER=r*r*h*pi;
System.out.println("area of cylinder"+" "+AREAOFCYLINDER);
}
}