//Getting value of length[l],breath[b],height[h] from the user and printing area of cube
import java.io.*;
import java.util.*;
public class AREAOFCUBE
{
public static void main(String args[])
{
Scanner S=new Scanner(System.in);System.out.println("enter the value of length l=:");
int l= S.nextInt();System.out.println("enter the value of breadth b=:");
int b= S.nextInt();System.out.println("enter the value of height h=:");
int h= S.nextInt();

int AREAOFCUBE=l*b*h;
System.out.println("area of cube="+" "+AREAOFCUBE);
}
}
