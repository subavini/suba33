import java.io.*;
import java.util.h*;
public class Prime
{
public static void main(String[] args)
{
int i,j;
int n;
Scanner sc=new Scanner(System.in);
i=sc.nextInt();
n=i/2;
for(j=2;j<=n;i++)
{
if(i%j==0)
{
System.out.println("not prime");
}
else
{
System.out.println("prime");
}
}
}}
