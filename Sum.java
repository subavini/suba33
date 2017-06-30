import java.util.*;
import java.io.*;
public class Sum
{
public static void main(String[] args)
{
int n,i,k=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=1;i<=n;i++)
{
k=i+k;
}
System.out.println("sum of natural numbers"+k);
}
}
