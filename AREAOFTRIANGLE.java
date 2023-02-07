//Getting value of length and breath and height from the user and printing area of triangle
import java.io.*;
import java.util.*;
public class AREAOFTRIANGLE
{
public static void main(String args[])
{
Scanner S=new Scanner(System.in);System.out.println("enter the value of length:");
int l= S.nextInt();System.out.println("enter the value of breath:");
int b= S.nextInt();System.out.println("enter the value of height:");
int h= S.nextInt();
int AREAOFTRIANGLE=l*b*h;
System.out.println("area of triangle:"+" "+ AREAOFTRIANGLE);
}
}
