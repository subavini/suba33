import java.io.*;
import java.net.*;
import java.util.*;
public class Pal
{
public static void main(String[] args)
{
int n,temp,r;
int s=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
temp=n;
while(n>0)
{
r=n%10;
s=(s*10)+r;
n=n/10;
}
if(temp==s)
System.out.println("the num is palindrome");
else
System.out.println("ihe num is not palindrome");
}
}
