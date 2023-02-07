import java.io.*;
import java.util.*;
 class ArrayScan
 {
 public static void main(String args[])
 {
 
 
 Scanner S=new Scanner(System.in);
 int n=S.nextInt();
 int a[]=new int[n];
 for(int i=0;i<n;i++)
 {
 a[i]=S.nextInt();
 }
 for(int i=0;i<n;i++)
 {
 System.out.println(a[i]);
 }
 }
 }
