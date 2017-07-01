import java.util.*;
import java.io.*;
public class Fact
{
public static void main(String[] args)
{
int n,i;
int fact=1;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("factorial is"+fact);
}
}
