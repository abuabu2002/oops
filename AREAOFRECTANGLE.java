//Getting value of length and breath from the user and printing area of rectangle
import java.io.*;
import java.util.*;
public class AREAOFRECTANGLE
{
public static void main(String args[])
{
Scanner S=new Scanner(System.in);System.out.println("enter the value of length:");
int l= S.nextInt();System.out.println("enter the value of breath:");
int b= S.nextInt();
int AREAOFRECTANGLE=l*b;
System.out.println("area of rectangle"+" "+AREAOFRECTANGLE);
}
}
